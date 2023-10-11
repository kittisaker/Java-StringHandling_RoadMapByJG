public class DeleteExample {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("javaguides");

        // start with index and end with end -1
        StringBuffer subBuffer = buffer.delete(0, 4);
        System.out.println("Delete string 'java' from string 'javaguides' : " + subBuffer.toString());
    }
}
