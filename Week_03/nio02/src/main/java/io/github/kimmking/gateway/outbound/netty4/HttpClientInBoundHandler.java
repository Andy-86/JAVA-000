package io.github.kimmking.gateway.outbound.netty4;

import java.util.HashMap;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.*;
import io.netty.handler.codec.http.*;
import io.netty.handler.codec.http2.HttpConversionUtil;
import io.netty.util.CharsetUtil;
import io.netty.util.internal.PlatformDependent;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static io.netty.handler.codec.http.HttpResponseStatus.OK;
import static io.netty.handler.codec.http.HttpVersion.HTTP_1_1;
import static java.nio.charset.StandardCharsets.UTF_8;


/**
 * @author mac
 */
public class HttpClientInBoundHandler extends ChannelInboundHandlerAdapter {
    public static String result;
    private Map<ChannelId, ChannelHandlerContext> parentCtxs = new HashMap<>();
    private HttpResponse preResponse;

    public void bindChannel(ChannelId id, ChannelHandlerContext ctx) {
        parentCtxs.put(id, ctx);
    }

    /**
     * 将请求响应写回原来channel
     *
     * @param ctx
     * @param msg
     * @throws Exception
     */
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        if (msg instanceof HttpResponse) {
            this.preResponse = (HttpResponse) msg;
        }
        if (msg instanceof HttpContent) {
            HttpContent content = (HttpContent) msg;
            ChannelHandlerContext parentCxt = parentCtxs.get(ctx.channel().id());
            final String byteBuf = content.content().toString(UTF_8);

            FullHttpResponse response = new DefaultFullHttpResponse(HTTP_1_1, OK, Unpooled.wrappedBuffer(byteBuf.getBytes()));
            response.headers().add(preResponse.headers());
            parentCxt.write(response).addListener(ChannelFutureListener.CLOSE);
            parentCxt.flush();
        }
    }
}