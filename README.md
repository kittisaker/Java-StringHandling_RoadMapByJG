# Java Array : Chapter 2 Java StringBuffer Class API Guide

## StringBuffer Constructors

### StringBuffer()
Constructs a string buffer with no characters in it and an initial capacity of 16 characters. Example:
```java
StringBuffer buffer = new StringBuffer();

System.out.println(buffer.capacity());
// Output : 
// 16
```

### StringBuffer(int capacity)
```java
StringBuffer buffer4 = new StringBuffer(20);

System.out.println(buffer4.capacity());
// Output :
// 20
```

### StringBuffer(String str)
```java
StringBuffer buffer2 = new StringBuffer("javaguides");

System.out.prinln(buffer2.capacity());
// Output :
// 26
```

### StringBuffer(CharSequence seq)
```java
CharSequence charSequence = new StringBuilder("charSequence");
StringBuffer buffer3 = new StringBuffer(charSequence);

System.out.println(buffer3);
// Output :
// charSequence
```

## StringBuffer Class APIs or Methods

### The append() Methods
* StringBuffer append(boolean b) : Appends the string representation of the boolean argument to the sequence.
* StringBuffer append(char c) : Appends the string representation of the char argument to this sequence.
* StringBuffer append(char[] str) : Appends the string representation of the char array argument to this sequence.
* StringBuffer append(char[] str, int offset, int len) : Appends the string representation of a subarray of the char array argument to this sequence.
* StringBuffer append(CharSequence s) : Appends the specified CharSequence to this sequence.
* StringBuffer append(CharSequence s, int start, int end) : Appends a subsequence of the specified CharSequence to this sequence.
* StringBuffer append(double d) - Appends the string representation of the double argument to this sequence.
* StringBuffer append(float f) - Appends the string representation of the float argument to this sequence.
* StringBuffer append(int i) - Appends the string representation of the int argument to this sequence.
* StringBuffer append(long lng) - Appends the string representation of the long argument to this sequence.
* StringBuffer append(Object obj) - Appends the string representation of the Object argument.
* StringBuffer append(String str) - Appends the specified string to this character sequence.
* StringBuffer append(StringBuffer sb) - Appends the specified StringBuffer to this sequence.
* StringBuffer appendCodePoint(int codePoint) - Appends the string representation of the codePoint argument to this sequence.
```java
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
```

<details>
<summary>Output : </summary>

```shell
Append String : guides
Append char : c
Append Object : class java.lang.Object
Append chars : java
Append charSequence : charSequence
Append Double : 10.0
Append Float : 10.5
Append int : 100
Append Boolean : true
Append Long : 1000
Append stringbuffer : stringbuffer
Appends the string representation of a subarray of the char array argument to this sequence.  : ava
Appends a subsequence of the specified CharSequence to this sequence. : jav
Appends the string representation of the codePoint argument to this sequence.  : ♣
```

</details>

### capacity() Method
```java
public class CapacityExample {
    public static void main(String[] args) {
        StringBuffer builder = new StringBuffer("javaguides");
        int capacity = builder.capacity();

        // initial capacity
        System.out.println(new StringBuffer().capacity());

        // initial capacity 16 + number of characters in string
        System.out.println("Capacity of the string :: " + capacity);
        
    }
}
```

<details>
<summary>Output : </summary>

```shell
16
Capacity of the string :: 26
```

</details>

### charAt(int index) Method
```java
public class test {

    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Welcome to string handling guide");

        char ch1 = buffer.charAt(0);
        char ch2 = buffer.charAt(5);
        char ch3 = buffer.charAt(11);
        char ch4 = buffer.charAt(20);

        System.out.println("Character at 0 index is: " + ch1);
        System.out.println("Character at 5th index is: " + ch2);
        System.out.println("Character at 11th index is: " + ch3);
        System.out.println("Character at 20th index is: " + ch4);
    }
}
```

<details>
<summary>Output : </summary>

```shell
Character at 0 index is: W
Character at 5th index is: m
Character at 11th index is: s
Character at 20th index is: n
```

</details>

```java
public class test {

    public static void main(String[] args) {
        StringBuffer builder = new StringBuffer("Java Guides");
        char ch1 = builder.charAt(builder.length());
        System.out.println("character :: " + ch1);
    }
}
```

<details>
<summary>Output : </summary>

```shell
Exception in thread "main" java.lang.StringIndexOutOfBoundsException: index 11, length 11
    at java.base/java.lang.String.checkIndex(String.java:4563)
    at java.base/java.lang.AbstractStringBuilder.charAt(AbstractStringBuilder.java:351)
    at java.base/java.lang.StringBuffer.charAt(StringBuffer.java:243)
    at test.main(test.java:5)
```

</details>

```java
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
```

<details>
<summary>Output : </summary>

```shell
Character at 0 index is: J
Character at last index is: s
```

</details>

### codePointAt(int index) Method
```java
public class CodePointAtExample {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("javaguides");
        int unicode = buffer.codePointAt(0);
        System.out.println("the character (Unicode code point) at the specified index is :: " + unicode);
    }
}
```

<details>
<summary>Output : </summary>

```shell
the character (Unicode code point) at the specified index is :: 106
```

</details>

### codePointBefore(int index) Method
```java
public class CodePointBeforeExample {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("javaguides");
        int unicode = buffer.codePointBefore(1);

        System.out.println("the character (Unicode code point) at the before specified index is :: " + unicode);
    }
}
```

<details>
<summary>Output : </summary>

```shell
the character (Unicode code point) at the before specified index is :: 106
```

</details>

### codePointCount(int beginIndex, int endIndex) Method
```java
public class CodePointCountExample {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("javaguides");

        System.out.println("length of the string :: " + buffer.length());

        int unicode  = buffer.codePointCount(0, buffer.length());
        System.out.println("the character (Unicode code point) at the specified index is :: " + unicode);
    }
}
```

<details>
<summary>Output : </summary>

```shell
length of the string :: 10
the character (Unicode code point) at the specified index is :: 10
```

</details>


### delete(int start, int end) Method
```java
public class DeleteExample {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("javaguides");

        // start with index and end with end -1
        StringBuffer subBuffer = buffer.delete(0, 4);
        System.out.println("Delete string 'java' from string 'javaguides' : " + subBuffer.toString());
    }
}
```

<details>
<summary>Output : </summary>

```shell
Delete string 'java' from string 'javaguides' : guides
```

</details>

### deleteCharAt(int index) Method
```java
public class DeleteCharAtExample {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("javaguides").deleteCharAt(4);
        System.out.println("Delete char 'g' from string 'javaguides' : " + buffer);
    }
}
```

<details>
<summary>Output : </summary>

```shell
Delete char 'g' from string 'javaguides' : javauides
```

</details>

### ensureCapacity(int minimumCapacity) Method
Ensures that the capacity is at least equal to the specified minimum. If the current capacity is less than the argument, then a new internal array is allocated with greater capacity. The new capacity is the larger of:
* The minimumCapacity argument.
* Twice the old capacity, plus 2.
```java
public class EnsureCapacityExample {
    public static void main(String[] args) {
        StringBuffer builder = new StringBuffer();
        builder.ensureCapacity(11);
        System.out.println(builder.capacity());

        builder.ensureCapacity(17);
        System.out.println(builder.capacity());
    }
}
```

<details>
<summary>Output : </summary>

```shell
16
34
```

</details>

### getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) Method
Characters are copied from this sequence into the destination character array dst.
```java
public class GetCharsExample {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("javaguides");
        char[] dst = new char[buffer.length()];
        buffer.getChars(0, buffer.length(), dst, 0);

        for(char c : dst){
            System.out.println(c);
        }
    }
}
```

<details>
<summary>Output : </summary>

```shell
j
a
v
a
g
u
i
d
e
s
```

</details>

### indexOf() methods
* indexOf(String str) - Returns the index within this string of the first occurrence of the specified substring.
* indexOf(String str, int fromIndex) - Returns the index within this string of the first occurrence of the specified substring, starting at the specified index.
```java
public class IndexOfExample {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("javaguides");

        // method 1
        int index = buffer.indexOf("guides");
        System.out.println(index);

        // method 2
        index = buffer.indexOf("guides", 3);
        System.out.println(index);
    }
}
```

<details>
<summary>Output : </summary>

```shell
4
4
```

</details>

### insert() methods
insert() method has 12 overloaded versions:
* StringBuffer insert(int offset, boolean b) - Inserts the string representation of the boolean argument into this sequence.
* StringBuffer insert(int offset, char c) - Inserts the string representation of the char argument into this sequence.
* StringBuffer insert(int offset, char[] str) - Inserts the string representation of the char array argument into this sequence.
* StringBuffer insert(int index, char[] str, int offset, int len) - Inserts the string representation of a subarray of the str array argument into this sequence.
* StringBuffer insert(int dstOffset, CharSequence s) - Inserts the specified CharSequence into this sequence.
* StringBuffer insert(int dstOffset, CharSequence s, int start, int end) - Inserts a subsequence of the specified CharSequence into this sequence.
* StringBuffer insert(int offset, double d) - Inserts the string representation of the double argument into this sequence.
* StringBuffer insert(int offset, float f) - Inserts the string representation of the float argument into this sequence.
* StringBuffer insert(int offset, int i) - Inserts the string representation of the second int argument into this sequence.
* StringBuffer insert(int offset, long l) - Inserts the string representation of the long argument into this sequence.
* StringBuffer insert(int offset, Object obj) - Inserts the string representation of the Object argument into this character sequence.
* StringBuffer insert(int offset, String str) - Inserts the string into this character sequence.
```java
public class InsertExample {
    public static void main(String[] args) {
        // 12 insert overloaded method
        StringBuffer builder = new StringBuffer("javaguides").insert(1,true);
        System.out.println(builder.toString());

        builder = new StringBuffer("javaguides").insert(0, 'J');
        System.out.println(builder.toString());

        char[] chars = {'d','e','v','e','l','o','p','e','r'};
        builder = new StringBuffer("javaguides").insert(4, chars);
        System.out.println(builder.toString());

        CharSequence charSequence = new StringBuilder("J2EE/");
        builder = new StringBuffer("javaguides").insert(0, charSequence);
        System.out.println(builder.toString());

        builder = new StringBuffer("javaguides").insert(0, 100.0d);
        System.out.println(builder.toString());

        builder = new StringBuffer("javaguides").insert(0, 100.0f);
        System.out.println(builder.toString());

        builder = new StringBuffer("javaguides").insert(0, 100);
        System.out.println(builder.toString());

        builder = new StringBuffer("javaguides").insert(0, 100l);
        System.out.println(builder.toString());

        builder = new StringBuffer("javaguides").insert(0, new Object());
        System.out.println(builder.toString());

        builder = new StringBuffer("javaguides").insert(0, "ultimate");
        System.out.println(builder.toString());

        builder = new StringBuffer("javaguides").insert(0, chars, 0, chars.length);
        System.out.println(builder.toString());

        builder = new StringBuffer("javaguides").insert(0, charSequence, 0, charSequence.length());
        System.out.println(builder.toString());
    }    
}
```

<details>
<summary>Output : </summary>

```shell
jtrueavaguides
Jjavaguides
javadeveloperguides
J2EE/javaguides
100.0javaguides
100.0javaguides
100javaguides
100javaguides
java.lang.Object@372f7a8djavaguides
ultimatejavaguides
developerjavaguides
J2EE/javaguides
```

</details>

### lastIndexOf() methods
* int lastIndexOf(String str) - Returns the index within this string of the rightmost occurrence of the specified substring.
* int lastIndexOf(String str, int fromIndex) - Returns the index within this string of the last occurrence of the specified substring.
```java
public class LastIndexOfExample {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("javaguides");

        // Method 1
        int lastIndexOf = buffer.lastIndexOf("guides");
        System.out.println(" last index of given string 'guides' in' " + buffer.toString()+"' ::  " + lastIndexOf);

        // method 2
        lastIndexOf = buffer.lastIndexOf("java", 3);
        System.out.println(" last index of given string 'java' in' " + buffer.toString()+"' ::  " + lastIndexOf);
    }
}
```

<details>
<summary>Output : </summary>

```shell
 last index of given string 'guides' in' javaguides' ::  4
 last index of given string 'java' in' javaguides' ::  0
```

</details>

### length() Method
```java
public class LengthExample {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("javaguides");
        int length = buffer.length();
        
        System.out.println(" length of the string '" + buffer + "' is :: " + length);
    }
}
```

<details>
<summary>Output : </summary>

```shell
 length of the string 'javaguides' is :: 10
```

</details>

### replace(int start, int end, String str) Method
```java
public class ReplaceExample {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("jaguides");

         // replace ja with java- start index 0 and end index -1
         StringBuffer subBuffer = buffer.replace(0, 2, "java");

         System.out.println(subBuffer);
    }
}
```

<details>
<summary>Output : </summary>

```shell
javaguides
```

</details>

### reverse() Method
```java
public class ReverseExample {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("javaguides");

        StringBuffer reverse = buffer.reverse();

        System.out.println("Reversed string :" + reverse);
    }
}
```

<details>
<summary>Output : </summary>

```shell
Reversed string :sediugavaj
```

</details>

### setCharAt(int index, char ch) Method
```java
public class SetCharExample {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("javaguides");

        buffer.setCharAt(0, 'J');

        System.out.println(buffer.toString());
    }
}
```

<details>
<summary>Output : </summary>

```shell
Javaguides
```

</details>

### setLength(int newLength) Method
```java
public class SetLengthExample {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("javaguides");
        System.out.println("Before set length to 0 : " + buffer.length() + ", value :" + buffer);

        buffer.setLength(0);
        System.out.println("After set length to 0 : " + buffer.length() + ", value :" + buffer);
    }
}
```

<details>
<summary>Output : </summary>

```shell
Before set length to 0 : 10, value :javaguides
After set length to 0 : 0, value :
```

</details>

### substring() methods
* String substring(int start) - Returns a new String that contains a subsequence of characters currently contained in this character sequence.
* String substring(int start, int end) - Returns a new String that contains a subsequence of characters currently contained in this sequence.
```java
public class SubStringExample {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("javaguides");

        // substring from start to end
        String subStr = buffer.substring(0, buffer.length());
        System.out.println("substring from 0 to length of the string : " + subStr);

        // print java
        System.out.println(buffer.substring(0, 4));

        // print guides
        System.out.println(buffer.substring(4, buffer.length()));
    }
}
```

<details>
<summary>Output : </summary>

```shell
substring from 0 to length of the string : javaguides
java
guides
```

</details>

### toString() Method
```java
public class ToStringExample {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("javaguides");
        System.out.println(buffer.toString());
    }
}
```

<details>
<summary>Output : </summary>

```shell
javaguides
```

</details>

### trimToSize() Method
```java
public class TrimToSizeExample {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("javaguides ");
        System.out.println(buffer.capacity());
        
        buffer.trimToSize();
        System.out.println(buffer.capacity());
    }
}
```

<details>
<summary>Output : </summary>

```shell
27
11
```

</details>

---