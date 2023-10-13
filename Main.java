public class Main {
    public static void main(String[] args) {
        String str1 = new String("JavaGuides"); // creates a new string object in heap and 
                                                // the literal "JavaGuides" in the string constant pool
        String str2 = "JavaGuides"; // refers to the instance in the string constant pool
        String str3 = str1.intern(); // str1 content is added to the string constant pool 
                                     // and its reference is returned

        System.out.println(str1 == str2); // Outputs "false"
        System.out.println(str2 == str3); // Outputs "true"
    }
}
