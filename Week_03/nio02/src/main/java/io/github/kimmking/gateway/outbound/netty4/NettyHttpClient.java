package io.github.kimmking.gateway.outbound.netty4;

import java.util.Random;

import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.Unpooled;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.http.*;
import io.netty.handler.codec.http2.HttpConversionUtil;
import io.netty.util.CharsetUtil;

import java.net.URI;

import static io.netty.buffer.Unpooled.wrappedBuffer;
import static io.netty.handler.codec.http.HttpMethod.POST;
import static io.netty.handler.codec.http.HttpVersion.HTTP_1_1;

/**
 * @author mac
 */
public class NettyHttpClient {
    private static ChannelFuture future;
    private final String remoteHost;
    private final int remotePort;
    private static HttpClientInBoundHandler httpClientInBoundHandler;

    public NettyHttpClient(String remoteHost, int remotePort) {
        this.remoteHost = remoteHost;
        this.remotePort = remotePort;

        Thread thread = new Thread(() -> {
            try {
                connect(remoteHost, remotePort);
            } catch (Exception e) {
                System.out.println("------00------");
                e.printStackTrace();
            }
        });
        thread.start();
    }

    /**
     * 启动客户端
     *
     * @param host
     * @param port
     * @throws Exception
     */
    public void connect(String host, int port) throws Exception {
        EventLoopGroup workerGroup = new NioEventLoopGroup(3);
        try {
            Bootstrap b = new Bootstrap();
            b.group(workerGroup);
            b.channel(NioSocketChannel.class);
            b.option(ChannelOption.SO_KEEPALIVE, true);
            b.handler(new ChannelInitializer<SocketChannel>() {
                @Override
                public void initChannel(SocketChannel ch) throws Exception {
                    // 客户端接收到的是httpResponse响应，所以要使用HttpResponseDecoder进行解码
                    ch.pipeline().addLast(new HttpResponseDecoder());
                    //客户端发送的是httprequest，所以要使用HttpRequestEncoder进行编码
                    ch.pipeline().addLast(new HttpRequestEncoder());
                    httpClientInBoundHandler = new HttpClientInBoundHandler();
                    ch.pipeline().addLast(httpClientInBoundHandler);
                }
            });
            // Start the client.
            ChannelFuture f = b.connect(host, port).sync();
            future = f;
            f.channel().closeFuture().sync();
        } finally {
            workerGroup.shutdownGracefully();
        }

    }

    /**
     * 发送请求
     *
     * @param perRequest
     * @param parentCtx
     */
    public void forWord(FullHttpRequest perRequest, ChannelHandlerContext parentCtx) {
        URI uri = null;
        try {
            uri = new URI("/test");
            DefaultFullHttpRequest request = new DefaultFullHttpRequest(HttpVersion.HTTP_1_1, HttpMethod.GET,
                    uri.toASCIIString(), perRequest.content());
            // 构建http请求
            request.headers().set(perRequest.headers());
            request.headers().set(HttpHeaders.Names.HOST, "localhost");

            future.channel().write(request);
            httpClientInBoundHandler.bindChannel(future.channel().id(), parentCtx);
            future.channel().flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}