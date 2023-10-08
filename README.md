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
```java
void getChars(int sourceStart, int sourceEnd, char target[], int targetStart)
```

```java
public class getCharsDemo {
    public static void main(String[] args) {
        String s = "This is a demo of the getChars method.";
        int start = 10;
        int end = 14;

        char buf[] = new char[end - start];

        s.getChars(start, end, buf, 0);
        System.out.println(buf);
    }    
}
```

<details>
<summary>Output : </summary>

```shell
demo
```

</details>

### hashCode()
```java
s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
```

```java
public class HashcodeExample {
    public static void main(String[] args) {
        String str = "javaguides";
        int hashcode = str.hashCode();
        System.out.println("hashcode of " + str + " is :: " + hashcode);
    }
}
```

<details>
<summary>Output : </summary>

```shell
hashcode of javaguides is :: -138203751
```

</details>

### indexOf()
* indexOf(int ch) :  Returns the index within this string of the first occurrence of the specified character.
* indexOf(int ch, int fromIndex) : Returns the index within this string of the first occurrence of the specified character, starting the search at the specified index.
* indexOf(String str) : Returns the index within this string of the first occurrence of the specified substring.
* indexOf(String str, int fromIndex) : Returns the index within this string of the first occurrence of the specified substring, starting at the specified index.

```java
public class IndexOfExample {
    public static void main(String[] args) {
        String str = "javaguides";

        // Method 1
        int index = str.indexOf("java");
        System.out.println(index);
        // Remember index starts with 0 so count from 0
        System.out.println("index of guides :: " + str.indexOf("guides"));
        System.out.println("index of des :: " + str.indexOf("des"));

         // method 2
         System.out.println(str.indexOf('s'));

         // method 3
        System.out.println(str.indexOf('g', 0));

         // method 4
        System.out.println(str.indexOf("guides", 3));
    }
}
```

<details>
<summary>Output : </summary>

```shell
0
index of guides :: 4
index of des :: 7
9
4
4
```

</details>

### intern()
Returns a canonical representation for the string object.
A pool of strings, initially empty, is maintained privately by the class String.
```java
public class InternExample {
    public static void main(String[] args) {
        String str = "javaguides";
        String newStr = new String("javaguides");
        System.out.println(newStr.intern().equals(str));
        System.out.println(newStr.equals(str));
        
        newStr.intern();
        str.intern();
    }
}
```

<details>
<summary>Output : </summary>

```shell
true
true
javaguides
javaguides
```

</details>

### lastIndexOf() methods
* lastIndexOf(int ch) : Returns the index within this string of the last occurrence of the specified character.
* lastIndexOf(int ch, int fromIndex) : Returns the index within this string of the last occurrence of the specified character, searching backward starting at the specified index.
* lastIndexOf(String str) : Returns the index within this string of the last occurrence of the specified substring.
* lastIndexOf(String str, int fromIndex) : Returns the index within this string of the last occurrence of the specified substring, searching backward starting at the specified index.

```java
public class LastIndexOfExample {
    public static void main(String[] args) {
        String str = "javaguides";

         // method1
        int lastIndexOf = str.lastIndexOf('s');
        System.out.println(" last index of given character 's' in' " + " "+ str+"' ::  " + lastIndexOf);
        
        // method 2
        lastIndexOf = str.lastIndexOf("guides");
        System.out.println(" last index of given string 'guides' in' " + " "+ str+"' ::  " + lastIndexOf);
        
        // method 3
        lastIndexOf = str.lastIndexOf("guides", 4);
        System.out.println(" last index of guides in given  string " + " "+ str+" and from index  " + lastIndexOf);
        
        // method 4
        lastIndexOf = str.lastIndexOf('g', str.length());
        System.out.println(" last index of given char ::  " + lastIndexOf);
    }
}
```

<details>
<summary>Output : </summary>

```shell
 last index of given character 's' in'  javaguides' ::  9
 last index of given string 'guides' in'  javaguides' ::  4
 last index of guides in given  string  javaguides and from index  4
 last index of given char ::  4
```

</details>

### length()
```java
int length()
```

```jaa
public class LengthExample {
    public static void main(String[] args) {
        String str = new String("Java Guides");
        int length = str.length();
        System.out.println(" length of the string '" + str + "' is :: " + length);
    }
}
```

<details>
<summary>Output : </summary>

```shell
 length of the string 'Java Guides' is :: 11
```

</details>

### regionMatches()  methods
* regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len) : Tests if two string regions are equal.
* regionMatches(int toffset, String other, int ooffset, int len) : Tests if two string regions are equal.
```java
public class RegionMatchesExample {
    public static void main(String[] args) {
        String str = "javaguides";
        String subStr = "guides";
        boolean b = str.regionMatches(0, subStr, str.length(), str.length());
        boolean b1 = str.regionMatches(true, 0, str, 0, str.length());
        System.out.println(b);
        System.out.println(b1);
    }
}
```

<details>
<summary>Output : </summary>

```shell
false
true
```

</details>

### replace()  methods
```java
public class ReplaceExample {
    public static void main(String[] args) {
        String str = "javaguides";
        String subStr = str.replace('a', 'b');
        System.out.println("replace char 'a' with char 'b' from given string : " + subStr);
        
        subStr = str.replace("guides", "tutorials");
        System.out.println("replace guides with tutorials from given string : " + subStr);
        
        subStr = str.replaceAll("[a-z]", "java");
        System.out.println(subStr);
        
        subStr = str.replaceFirst("[a-z]", "java");
        System.out.println(subStr);
    }
}
```

<details>
<summary>Output : </summary>

```shell
replace char 'a' with char 'b' from given string : jbvbguides
replace guides with tutorials from given string : javatutorials
javajavajavajavajavajavajavajavajavajava
javaavaguides
```

</details>

### replaceAll(String regex, String replacement)
```java
public class ReplaceExample {
    public static void main(String[] args) {
        String str = "javaguides";
        String subStr = str.replaceAll("[a-z]", "java");
        System.out.println(subStr);
    }
}
```

<details>
<summary>Output : </summary>

```shell
javajavajavajavajavajavajavajavajavajava
```

</details>

### replaceFirst(String regex, String replacement)
```java
public class ReplaceExample {
    public static void main(String[] args) {
        String str = "javaguides";
        String subStr = str.replaceFirst("[a-z]", "java");
        System.out.println(subStr);
    }
}
```

<details>
<summary>Output : </summary>

```shell
javaavaguides
```

</details>

### split() methods
* split(String regex) : Splits this string around matches of the given regular expression.
* split(String regex, int limit) : Splits this string around matches of the given regular expression.
```java
public class SplitExample {
    public static void main(String[] args) {
        String str = "java,guides.net";
        String[] strArray = str.split(",");
        
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }

        strArray = str.split(",", 0);
        
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
    }
}
```

<details>
<summary>Output : </summary>

```shell
java
guides.net
java
guides.net
```

</details>

### startsWith() methods
* startsWith(String prefix) : Tests if this string starts with the specified prefix.
* boolean startsWith(String prefix, int toffset) : Tests if the substring of this string beginning at the specified index starts with the specified prefix.
```java
public class StartsWithExample {
    public static void main(String[] args) {
        String str = "javaguides";
        boolean startWith = str.startsWith("ja");
        System.out.println("startWith :: " +startWith);
        
        boolean startWithOffset = str.startsWith("guides", 4);
        System.out.println("startWithOffset :: " + startWithOffset);
    }
}
```

<details>
<summary>Output : </summary>

```shell
startWith :: true
startWithOffset :: true
```

</details>

### subSequence(int beginIndex, int endIndex)
Returns a character sequence that is a subsequence of this sequence.
```java
public class SubSequenceExample {
    public static void main(String[] args) {
        String str = "javaguides";
        CharSequence subStr = str.subSequence(0, str.length());
        System.out.println("Returns a character sequence that " + " is a subsequence of this sequence : " + subStr);
    }
}
```

<details>
<summary>Output : </summary>

```shell
Returns a character sequence that  is a subsequence of this sequence : javaguides
```

</details>

### substring()  methods
* String substring(int beginIndex) : Returns a string that is a substring of this string. 
* String substring(int beginIndex, int endIndex)  - Returns a string that is a substring of this string.
```java
public class SubStringExample {
    public static void main(String[] args) {
        String str = "javaguides";
         // substring from start to end
        String subStr = str.substring(0, str.length());
        System.out.println("substring from 0 to length of the string : " + subStr);

        subStr = str.substring(4);
        System.out.println("Sub string starts from index 4 : " + subStr);
        System.out.println(str.substring(1));
        System.out.println("unhappy".substring(2));
        System.out.println("Harbison".substring(3));
        System.out.println("emptiness".substring(8));
    }
}
```

<details>
<summary>Output : </summary>

```shell
substring from 0 to length of the string : javaguides
Sub string starts from index 4 : guides
avaguides
happy
bison
s
```

</details>

### char[] java.lang.String.toCharArray()
Converts this string to a new character array.
```java
public class ToCharArrayExample {
    public static void main(String[] args) {
        String str = "javaguides";
        char[] characters = str.toCharArray();
        for (char c :  characters) {
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

### toLowerCase()  methods
* toLowerCase() :  Converts all of the characters in this String to lowercase using the rules of the default locale.
* String toLowerCase(Locale locale) : Converts all of the characters in this String to lowercase using the rules of the given Locale.
```java
import java.util.Locale;

public class ToLowerCaseExample {
    public static void main(String[] args) {
        String str = "JAVAGUIDES";
        String subStr = str.toLowerCase();
        System.out.println(subStr);
        
        subStr = str.toLowerCase(Locale.ENGLISH);
        System.out.println(subStr);
    }
}
```

<details>
<summary>Output : </summary>

```shell
javaguides
javaguides
```

</details>

### toString()
```java
public class ToStringExample {
    public static void main(String[] args) {
        String str = "javaguides";
        System.out.println(str.toString());
    }
}
```

<details>
<summary>Output : </summary>

```shell
javaguides
```

</details>

### toUpperCase() methods
* toUpperCase() : Converts all of the characters in this String to upper case using the rules of the default locale.
* String toUpperCase(Locale locale) : Converts all of the characters in this String to upper case using the rules of the given Locale.
```java
public class ToUpperCaseExample {
    public static void main(String[] args) {
        String str = "javaguides";
        String subStr = str.toUpperCase();
        System.out.println(subStr);

        subStr = str.toUpperCase(Locale.ENGLISH);
        System.out.println(subStr);
    }
}
```

<details>
<summary>Output : </summary>

```shell
JAVAGUIDES JAVAGUIDES 
```

</details>

### trim()
```java
public class TrimExample {
    public static void main(String[] args) {
        String str = "javaguides ";
        String subStr = str.trim();
        System.out.println("trim the space from given string : " + subStr);
    }
}
```

<details>
<summary>Output : </summary>

```shell
trim the space from given string: javaguides 
```

</details>

### valueOf()
```java
public static String valueOf(boolean b) 
public static String valueOf(char c) 
public static String valueOf(char[] c) 
public static String valueOf(int i) 
public static String valueOf(long l) 
public static String valueOf(float f) 
public static String valueOf(double d) 
public static String valueOf(Object o) 
```

```java
public class StringValueOfExample5 {
    public static void main(String[] args) {
        boolean b1=true;
        byte b2=11;
        short sh = 12;
        int i = 13;
        long l = 14L;
        float f = 15.5f;
        double d = 16.5d;
        char chr[]= { 'j', 'a', 'v', 'a' };

        StringValueOfExample5 obj=new StringValueOfExample5();
        String s1 = String.valueOf(b1);
        String s2 = String.valueOf(b2);
        String s3 = String.valueOf(sh);
        String s4 = String.valueOf(i);
        String s5 = String.valueOf(l);
        String s6 = String.valueOf(f);
        String s7 = String.valueOf(d);
        String s8 = String.valueOf(chr);
        String s9 = String.valueOf(obj);
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println(s7);
        System.out.println(s8);
        System.out.println(s9);
    }
}
```

<details>
<summary>Output : </summary>

```shell
true
11
12
13
14
15.5
16.5
java
StringValueOfExample5@19dc67c2
```

</details>

## New string methods introduced in Java 11

### strip(): 
```java
String str = "  javaguides  ";
String result = str.strip();
System.out.println(result); // Output: javaguides
```

### stripLeading(): 
```java
String str = "  javaguides";
String result = str.stripLeading();
System.out.println(result); // Output: javaguides
```

### stripTrailing(): 
```java
String str = "javaguides  ";
String result = str.stripTrailing();
System.out.println(result); // Output: javaguides
```

### isBlank():
```java
String str = "  ";
boolean result = str.isBlank();
System.out.println(result); // Output: true
```

### lines():
```java
String str = "javaguides\nJava 11";
str.lines().forEach(System.out::println);
// Output:
// javaguides
// Java 11
```

### repeat(int count): 
```java
String str = "javaguides ";
String result = str.repeat(3);
System.out.println(result); // Output: javaguides javaguides javaguides
```

## New methods introduced in Java 12

### indent(int n):
```java
String str = "Java\n12";
String indented = str.indent(4);
System.out.println(indented); // Output will have 4 spaces at the beginning of each line
```

### transform(Function<? super String, ? extends R> f): 
```java
String original = "  java 12  ";
String transformed = original
        .transform(String::strip)
        .transform(s -> s.concat(" is awesome"))
        .transform(String::toUpperCase);
System.out.println(transformed); // Output: JAVA 12 IS AWESOME
```

### describeConstable(): 
```java
String str = "Java";
Optional<String> opt = str.describeConstable();
opt.ifPresent(System.out::println); // Output: Java
```

### resolveConstantDesc(MethodHandles.Lookup lookup):
```java
String str = "Java";
String resolved = str.resolveConstantDesc(MethodHandles.lookup());
System.out.println(resolved); // Output: Java
```

## Java 15 New String Methods

### formatted(Object... args): 
```java
String template = "Welcome to %s!";
String result = template.formatted("javaguides");
System.out.println(result); // Output: Welcome to javaguides!
```

### stripIndent(): 
```java
String textBlock = """
           javaguides
           Java 15
        """;
String result = textBlock.stripIndent();
System.out.println(result);
// Output:
// javaguides
// Java 15
```

### translateEscapes(): 
```java
String str = "javaguides\\nJava 15";
String result = str.translateEscapes();
System.out.println(result);
// Output:
// javaguides
// Java 15
```

---