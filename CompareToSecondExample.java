public class CompareToSecondExample {
    public static void main(String[] args) {
        String s1="Hello World";
        String s2="hello world";
        String s3="Java";
        String s4="java";

        System.out.println(s1.compareToIgnoreCase(s2));
        System.out.println(s3.compareToIgnoreCase(s4));
    }
}
