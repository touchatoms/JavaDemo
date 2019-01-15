import java.io.UnsupportedEncodingException;

public class TestEncode {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "测试ABC";
        byte[] bts1 = s.getBytes();
        for (byte b : bts1) {
            // 字节转换为 16进制的方式显示
            System.out.print(Integer.toHexString(b & 0xff) + " ");
        }
        System.out.println();

        /// utf-8 中文 三个字节 英文 一个字节
        byte[] bts2 = s.getBytes("utf-8");
        for (byte b : bts2) {
            // 字节转换为 16进制的方式显示
            System.out.print(Integer.toHexString(b & 0xff) + " ");
        }
        System.out.println();

        /// GBK 中文 两个字节 英文 一个字节
        byte[] bts3 = s.getBytes("GBK");
        for (byte b : bts3) {
            // 字节转换为 16进制的方式显示
            System.out.print(Integer.toHexString(b & 0xff) + " ");
        }

        System.out.println();

        /// GBK 中文 两个字节 英文 一个字节
        byte[] bts4 = s.getBytes("utf-16be");
        for (byte b : bts4) {
            // 字节转换为 16进制的方式显示
            System.out.print(Integer.toHexString(b & 0xff) + " ");
        }
    }
}
