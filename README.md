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









---

<details>
<summary>Output : </summary>

```shell

```

</details>

---