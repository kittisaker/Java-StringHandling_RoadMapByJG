public class DeleteCharAtExample {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("javaguides").deleteCharAt(4);
        System.out.println("Delete char 'g' from string 'javaguides' : " + buffer);
    }
}
