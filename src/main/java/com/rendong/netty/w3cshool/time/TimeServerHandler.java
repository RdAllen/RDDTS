/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2018，所有权利保留。
 * 文件名：	DiscardServerHandler
 * 模块说明：
 * 修改历史：
 * 2018-03-31 - RenDong- 创建。
 */
package com.rendong.netty.w3cshool.time;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * @author RenDong
 *
 *         处理服务端
 *
 */
public class TimeServerHandler extends ChannelInboundHandlerAdapter {
  @Override
  public void channelActive(final ChannelHandlerContext ctx) throws Exception {// (1)

    final ByteBuf time = ctx.alloc().buffer(4); // (2)
    time.writeInt((int) (System.currentTimeMillis() / 1000L + 2208988800L));

    final ChannelFuture f = ctx.writeAndFlush(time); // (3)
    f.addListener(new ChannelFutureListener() {
      public void operationComplete(ChannelFuture future) {
        assert f == future;
        ctx.close();
      }
    }); // (4)
  }

  @Override
  public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
    cause.printStackTrace();
    ctx.close();
  }
}
