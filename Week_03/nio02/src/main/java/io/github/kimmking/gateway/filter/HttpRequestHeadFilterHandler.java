package io.github.kimmking.gateway.filter;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.codec.http.FullHttpRequest;

/**
 * @author mac
 */
public class HttpRequestHeadFilterHandler extends ChannelInboundHandlerAdapter implements HttpRequestFilter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        super.channelRead(ctx, msg);
        if (msg instanceof FullHttpRequest) {
            filter((FullHttpRequest) msg, ctx);
        }
    }

    @Override
    public void filter(FullHttpRequest fullRequest, ChannelHandlerContext ctx) {
        fullRequest.headers().add("SetCookie", "aaabbcccc");
    }
}
