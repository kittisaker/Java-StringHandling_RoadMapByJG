public class TrimToSizeExample {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("javaguides ");
        System.out.println(buffer.capacity());
        
        buffer.trimToSize();
        System.out.println(buffer.capacity());
    }
}