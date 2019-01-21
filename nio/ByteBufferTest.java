import java.nio.ByteBuffer;

public class ByteBufferTest {
    public static void main(String[] args) {

        ByteBuffer b = ByteBuffer.allocate(4);
        b.put((byte)1);
        b.put((byte)2);
        b.put((byte)3);
        b.put((byte)4);
        b.put((byte)5);

        System.out.println("limit  " + b.limit());
        System.out.println("capacity  " + b.capacity());
        System.out.println("position  " + b.position());
        b.flip();

        int a1 = b.get(0);

        System.out.println("a1========  " + a1);
        System.out.println("limit  " + b.limit());
        System.out.println("capacity  " + b.capacity());
        System.out.println("position  " + b.position());

        int b1 = b.get(1);

        System.out.println("b1========  " + b1);
        System.out.println("limit  " + b.limit());
        System.out.println("capacity  " + b.capacity());
        System.out.println("position  " + b.position());


        int c2 = b.get(2);
        int d1 = b.get(3);
        int e1 = b.get(4);

        System.out.println("e1========  " + e1);
        System.out.println("limit  " + b.limit());
        System.out.println("capacity  " + b.capacity());
        System.out.println("position  " + b.position());



    }
}
