public class SetLengthExample {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("javaguides");
        System.out.println("Before set length to 0 : " + buffer.length() + ", value :" + buffer);

        buffer.setLength(0);
        System.out.println("After set length to 0 : " + buffer.length() + ", value :" + buffer);
    }
}
