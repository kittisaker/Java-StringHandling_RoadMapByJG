public class CodePointAtExample {
    public static void main(String[] args) {
        String str = "javaguids";
        int unicode = str.codePointAt(0);
        System.out.println("the character (Unicode code point) at the specified index is :: " + unicode);
    }
}
