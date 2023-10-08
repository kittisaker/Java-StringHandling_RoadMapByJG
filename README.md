# Java Array : Chapter 1 Java String Class API Guide (Updated Java 21)

## The String Constructors
* String() : Initializes a newly created String object so that it represents an empty character sequence.
* String(byte[] bytes) : Constructs a new String by decoding the specified array of bytes using the platform's default charset.
* String(byte[] bytes, Charset charset) :  Constructs a new String by decoding the specified array of bytes using the specified charset.
* String(byte[] bytes, int offset, int length) : Constructs a new String by decoding the specified subarray of bytes using the platform's default charset.
* String(byte[] bytes, int offset, int length, Charset charset) :  Constructs a new String by decoding the specified subarray of bytes using the specified charset.
* String(byte[] bytes, int offset, int length, String charsetName) : Constructs a new String by decoding the specified subarray of bytes using the specified charset.
* String(byte[] bytes, String charsetName) : Constructs a new String by decoding the specified array of bytes using the specified charset.
* String(char[] value) : Allocates a new String so that it represents the sequence of characters currently contained in the character array argument.
* String(char[] value, int offset, int count) : Allocates a new String that contains characters from a subarray of the character array argument.
* String(int[] codePoints, int offset, int count) : Allocates a new String that contains characters from a subarray of the Unicode code point array argument.
* String(String original) : Initializes a newly created String object so that it represents the same sequence of characters as the argument; in other words, the newly created string is a copy of the argument string.
* String(StringBuffer buffer) : Allocates a new string that contains the sequence of characters currently contained in the string buffer argument.
* String(StringBuilder builder) : Allocates a new string that contains the sequence of characters currently contained in the string builder argument

### 1. To create an empty String, call the default constructor.
```java
String s = new String();
```

### 2. To create a String initialized by an array of characters
```java
char chars[] = {
    'a',
    'b',
    'c'
};

String s = new String(chars);
```

### 3. We can specify a subrange of a character array as an initializer using the following constructor:
```java
String(char chars[], int startIndex, int numChars)
```

```java
char chars[] = {
    'a',
    'b',
    'c',
    'd',
    'e',
    'f'
};

String s = new String(chars, 2, 3); // This initializes s with the character's cde .
```

### 4. We can construct a String object that contains the same character sequence as another String object using this constructor:
```java
String(String strObj)
```

```java
// Construct one String from another.
class MakeString{
    public static void main(String args[]){
        char c[] = {
            'J',
            'a',
            'v',
            'a'
        };

        String s1 = new String(c);
        String s2 = new String(s1);

        System.out.println(s1);
        System.out.println(s2);
    }
}
```

<details>
<summary>Output : </summary>

```shell
Java Java
```

</details>

### 5. String class provides constructors that initialize a string when given a byte array.
```java
String(byte chars[])
String(byte chars[], int starIndex, int numChars)
```

```java
public class SubStringCons {

    public static void main(String[] args) {
        byte ascii[] = {
            65,
            66,
            67,
            68,
            69,
            70
        };

        String s1 = new String(ascii);
        System.out.println(s1);
        String s2 = new String(ascii, 2, 3);
        System.out.println(s2);
    }
}
```

<details>
<summary>Output : </summary>

```shell
ABCDEF
CDE
```

</details>

### 6. We can construct a  String  from a  StringBuffer  and StringBuilder using String constructors
```java
String(StringBuffer strBufObj)
String(StringBuilder strBuildObj)
```

```java
String string = new String(new StringBuffer("JavaGuides"));
System.out.pringln(string);

String string2 = new String(new StirngBuilder("JavaGuides"));
System.out.println(string2);
```

<details>
<summary>Output : </summary>

```shell
JavaGuides JavaGuides 
```

</details>

## All String APIs/ Methods with Examples

### charAt(int index)
```java
public class test {
    public static void main(String[] args) {
        String str = "Welcom to sring handling guide";
        char ch1 = str.charAt(0);
        char ch2 = str.charAt(5);
        char ch3 = str.charAt(11);
        char ch4 = str.charAt(20);

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
Character at 11th index is: r
Character at 20th index is: l
```

</details>

```java
public class test {
    public static void main(String[] args) {
        String str = "Java Fuides";
        char ch1 = str.charAt(str.length() + 1);
        System.out.println("character :: " + ch1);
    }
}
```

<details>
<summary>Output : </summary>

```shell
Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 12
        at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
        at java.base/java.lang.String.charAt(String.java:1515)
        at test.main(test.java:4)
```

</details>

```java
public class test {
    public static void main(String[] args) {
        String str = "Java Guides";
        int strLength = str.length();

        // Fetching first character
        System.out.println("Character at 0 index is : " + str.charAt(0));

        // The last Character is present at the string length-1 index
        System.out.println("Character at last index is : " + str.charAt(strLength - 1));
    }
}
```

<details>
<summary>Output : </summary>

```shell
Character at 0 index is : J
Character at last index is : s
```

</details>

### codePointAt(int index)
This method returns the character (Unicode code point) at the specified index. The index refers to char values (Unicode code units) and ranges from 0 to length()- 1.
This method throws the  IndexOutOfBoundsException  - if the index argument is negative or not less than the length of this string.
```java
public class CodePointAtExample {
    public static void main(String[] args) {
        String str = "javaguids";
        int unicode = str.codePointAt(0);
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

### codePoinBefore(int index)
This method returns the character (Unicode code point) before the specified index. The index refers to char values (Unicode code units) and ranges from 1 to length.
This method throws the  IndexOutOfBoundsException  - if the index argument is negative or not less than the length of this string.
```java
public class CodePointBeforeExample {
    public static void main(String[] args) {
        String str = "javaguides";
        int unicode = str.codePointBefore(1);
        System.out.println("the character (Unicode code point)" + "  at the before specified index is :: " + unicode);
    }
}
```

<details>
<summary>Output : </summary>

```shell
the character (Unicode code point)  at the before specified index is :: 106
```

</details>

```java
public class CodePointCountExample {
    public static void main(String[] args) {
        String str = "javaguides";
        System.out.println("length of the string :: " + str.length());

        int unicode = str.codePointCount(0, str.length());
        System.out.println("the character (Unicode code point) " + " at the specified index is :: " + unicode);
    }
}
```

<details>
<summary>Output : </summary>

```shell
length of the string :: 10
the character (Unicode code point)  at the specified index is :: 10
```

</details>

### compareTo(String anotherString)
```java
public class CompareToSecondExample {
    static String arr[] = {
        "Now",
        "is",
        "the",
        "time",
        "for",
        "all",
        "good",
        "men",
        "to",
        "come",
        "to",
        "the",
        "aid",
        "of",
        "their",
        "country"
    };
    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j].compareTo(arr[i]) < 0){
                    String t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
            System.out.println(arr[i]);
        }
    }
}
```

<details>
<summary>Output : </summary>

```shell
Now
aid
all
come
country
for
good
is
men
of
the
the
their
time
to
to
```

</details>

```java
public class CompareToSecondExample {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "Hello World";
        String s3 = "Java";
        String s4 = "Guides";

        System.out.println(s1.compareTo(s2));   // 0 : Because both are equal
        System.out.println(s1.compareTo(s3));   // -2 : Because "H" is 2 times lower than "J"
        System.out.println(s1.compareTo(s4));   // 1 : Because "G" is 1 times greater than "H"
    }
}
```

<details>
<summary>Output : </summary>

```shell
0
-2
1
```

</details>

```java
public class CompareToSecondExample {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "";
        String s3 = "me";

        System.out.println(s1.compareTo(s2));   // Compare with empty string, returns length of the string
        System.out.println(s2.compareTo(s3));
    }
}
```

<details>
<summary>Output : </summary>

```shell
5
-2
```

</details>

### compareToIgnoreCase(String str)
```java
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
```

<details>
<summary>Output : </summary>

```shell
0
0
```

</details>

### concat(String str)
```java
public class ConcatExmaple {
    public static void main(String[] args) {
        String str = "solokope";
        str = str.concat(".org");

        System.out.println();
        System.out.println("Concatenates the specified string to the end of this string : " + str);
        System.out.println("cares".concat("s"));
        System.out.println("to".concat("get"));
    }
}
```

<details>
<summary>Output : </summary>

```shell
caress
toget
```

</details>

### contains(CharSequence s)
```java
public class ContainsExample {
    public static void main(String[] args) {
        String str = "solokope";
        boolean contains = str.contains("kope");

        System.out.println("Contains : " + contains);
    }
}
```

<details>
<summary>Output : </summary>

```shell
Contains : true
```

</details>

### contentEquals()
There are two versions of contentEquals methods;
* contentEquals(CharSequence cs)  - Compares this string to the specified  CharSequence.
* contentEquals(StringBuffer sb)  - Compares this string to the specified  StringBuffer

```java
public class ContentEqualsExample {
    public static void main(String[] args) {
        String str = "javaguides";
        String subStr = "javaguides";

        boolean isContentEquals = str.contentEquals(subStr);
        System.out.println("isContentEquals :: " + isContentEquals);

        isContentEquals = str.contentEquals(new StringBuffer(subStr));
        System.out.println("isContentEquals :: " + isContentEquals);
    }
}
```

<details>
<summary>Output : </summary>

```shell
isContentEquals :: true
isContentEquals :: true
```

</details>

### endsWith(String suffix)
```java
public class EndsWithExample {
    public static void main(String[] args) {
        String str = "javaguides";
        String subStr = "guides";

        boolean endsWith = str.endsWith(subStr);
        System.out.println(str + " endsWith " + subStr +"  :: " + endsWith);
    }
}
```

<details>
<summary>Output : </summary>

```shell
javaguides endsWith guides  :: true
```

</details>

### equals(Object anObject) and equalsIgnoreCase(String anotherString)
```java
public class equalsDemo {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Good-bye";
        String s4 = "HELLO";
        
        System.out.println(s1 + " equals " + s2 + " -> " + s1.equals(s2));
        System.out.println(s1 + " equals " + s3 + " -> " + s1.equals(s3));
        System.out.println(s1 + " equals " + s4 + " -> " + s1.equals(s4));
        System.out.println(s1 + " equalsIgnoreCase " + s4 + " -> " + s1.equalsIgnoreCase(s4));
    }
}
```

<details>
<summary>Output : </summary>

```shell
Hello equals Hello -> true
Hello equals Good-bye -> false
Hello equals HELLO -> false
Hello equalsIgnoreCase HELLO -> true
```

</details>

### getBytes()
```java
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class GetBytesExamples {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "javaguides";

         // Encodes this String into a sequence of bytes using the platform's
         // default charset, storing the result into a new byte array.
        byte[] bs = str.getBytes();
        for (byte b :  bs) {
            System.out.println(b);
        }

         // Encodes this String into a sequence of bytes using the given charset,
         // storing the result into a new byte array.
        byte[] bs1 = str.getBytes(Charset.forName("UTF-8"));
        for (byte b : bs1) {
            System.out.println(b);
        }

         // Encodes this String into a sequence of bytes using the given charset,
         // storing the result into a new byte array.
        byte[] bs2 = str.getBytes("UTF-8");
        for (byte b : bs2) {
            System.out.println(b);
        }
        byte[] dest = new byte[str.length()];
        str.getBytes(0, str.length(), dest, 0);
        for (byte b : dest) {
            System.out.println(b);
        }
    }
}
```

<details>
<summary>Output : </summary>

```shell
Note: GetBytesExamples.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.
106
97
118
97
103
117
105
100
101
115
106
97
118
97
103
117
105
100
101
115
106
97
118
97
103
117
105
100
101
115
106
97
118
97
103
117
105
100
101
115
```

</details>

### getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)








---

<details>
<summary>Output : </summary>

```shell

```

</details>
