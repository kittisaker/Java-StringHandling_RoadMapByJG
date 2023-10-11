public class test {

    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Java Guides");
        int strLength = buffer.length() - 1;

        // Fetching first character
        System.out.println("Character at 0 index is: " + buffer.charAt(0));
        // The last Character is present at the string length-1 index
        System.out.println("Character at last index is: " + buffer.charAt(strLength));
    }
}