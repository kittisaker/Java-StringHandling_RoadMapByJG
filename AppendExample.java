public class AppendExample {
    public static void main(String[] args) {
        // 14 append overloaded methods

        StringBuffer buffer;

        // 1. Append String
        buffer = new StringBuffer().append("guides");
        System.out.println("Append String : " + buffer);

        // 2. Append char
        buffer = new StringBuffer().append('c');
        System.out.println("Append char : " + buffer);

        // 3. Append Object
        buffer = new StringBuffer().append(new Object().getClass());
        System.out.println("Append Object : " + buffer);

        // 4. Append chars
        char[] chars = { 'j', 'a', 'v', 'a' };
        buffer = new StringBuffer().append(chars);
        System.out.println("Append chars : " + buffer);

        // 5. Append charSequence
        CharSequence charSequence = new String("charSequence");
        buffer = new StringBuffer().append(charSequence);
        System.out.println("Append charSequence : " + buffer);

        // 6. Append Double
        buffer = new StringBuffer().append(10.0d);
        System.out.println("Append Double : " + buffer);

        // 7.Append Float
        buffer = new StringBuffer().append(10.5f);
        System.out.println("Append Float : " + buffer);

        // 8. Append int
        buffer = new StringBuffer().append(100);
        System.out.println("Append int : " + buffer);

        // 9. Append Boolean
        buffer = new StringBuffer().append(true);
        System.out.println("Append Boolean : " + buffer);

        // 10. Append Long
        buffer = new StringBuffer().append(1000);
        System.out.println("Append Long : " + buffer);

        // 11. Append stringbuffer
        buffer = new StringBuffer().append(new StringBuffer("stringbuffer"));
        System.out.println("Append stringbuffer : " + buffer);

        // 12. Appends the string representation of a subarray of the char array argument to this sequence.
        buffer = new StringBuffer().append(chars, 1, 3);
        System.out.println("Appends the string representation of a subarray of the char array argument to this sequence.  : " + buffer);

        // 13. Appends a subsequence of the specified CharSequence to this sequence
        buffer = new StringBuffer().append("javaguide", 0, 3);
        System.out.println("Appends a subsequence of the specified CharSequence to this sequence. : " + buffer);

        // 14. Appends the string representation of the codePoint argument to this sequence.
        buffer = new StringBuffer().appendCodePoint(5);
        System.out.println("Appends the string representation of the codePoint argument to this sequence.  : " + buffer);
    }
}