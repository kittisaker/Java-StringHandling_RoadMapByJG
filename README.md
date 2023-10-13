# Java Array : Chapter 8 String Methods for Character Extraction

## 1. Extracting a Single Character

### charAt(int index) 
```java
String str = "JavaGuides";
char ch = str.charAt(3);
// Result: 'a'
```

## 2. Extracting a Substring

### substring(int beginIndex) and substring(int beginIndex, int endIndex) 

```java
String str = "JavaGuides";
String subStr = str.substring(4, 10);
// Result: "Guides"
```

## 3. Extracting Characters into an Array

### toCharArray() and getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
The toCharArray method returns a newly allocated character array whose length is the length of the string and whose contents are initialized to contain the character sequence represented by the string.

The getChars method copies characters from a string into the destination character array.
```java
String str = "JavaGuides";
char[] charArray = str.toCharArray();
// Result: ['J', 'a', 'v', 'a', 'G', 'u', 'i', 'd', 'e', 's']

char[] dst = new char[5];
str.getChars(4, 9, dst, 0);
// Result: ['G', 'u', 'i', 'd', 'e']
```

---