/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2018，所有权利保留。
 * 文件名：	DiscardServerHandler
 * 模块说明：
 * 修改历史：
 * 2018-03-31 - RenDong- 创建。
 */
package com.rendong.netty.w3cshool.discard;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.ReferenceCountUtil;

/**
 * @author RenDong
 *
 *         处理服务端
 *
 */
public class DiscardServerHandler extends ChannelInboundHandlerAdapter {
  @Override
  public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
      ByteBuf in = (ByteBuf) msg;
      try {
          while (in.isReadable()) { // (1)
              System.out.print((char) in.readByte());
              System.out.flush();
          }
      } finally {
          ReferenceCountUtil.release(msg); // (2)
      }
  }

  @Override
  public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
    cause.printStackTrace();
    ctx.close();
  }
}
