package com.study.juc.map;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class HashMapDemo {
    public static void main(String[] args) throws IOException {
        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.connect(new InetSocketAddress("www.baidu.com", 80));
        String request = "GET / HTTP/1.1\r\n" +
                "Cache-Control: max-age=0\r\n" +
                "Accept: text/html\r\n" +
                "Accept-Language: zh-Hans-CN,zh-Hans;q=0.5\r\n" +
                "Upgrade-Insecure-Requests: 1\r\n" +
                "User-Agent: Chrome/64.0.3282.140\r\n" +
                "Accept-Encoding: gzip, deflate\r\n" +
                "Host: www.baidu.com \r\n\r\n";
        ByteBuffer requestBuffer = ByteBuffer.wrap(request.getBytes());
        socketChannel.write(requestBuffer);

        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        int read = socketChannel.read(byteBuffer);

        String response = new String(byteBuffer.array(), "UTF-8");
        // 换行解析，Server:
        String[] strings = response.split("\r\n");
        for (String string : strings) {
            if (string.indexOf("Server:") != -1) {
                System.out.println("我的QQ号：12323，我的解析到百度服务器server类型是：" + string);
            }
        }
    }
}