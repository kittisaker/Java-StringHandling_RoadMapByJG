# Java Array : Chapter 9 String Searching Methods in Java with Examples

## 1. Searching for a Character or Substring
### indexOf(int ch) and indexOf(int ch, int fromIndex) 
```java
String str = "JavaGuides";
int index = str.indexOf('a');
// Result: 1
```

## 2. Searching for the Last Occurrence
### lastIndexOf(int ch) and lastIndexOf(int ch, int fromIndex)
```java
String str = "JavaGuides";
int index = str.lastIndexOf('a');
// Result: 3
```

## 3. Checking If a String Contains a Sequence
### contains(CharSequence sequence)
```java
String str = "JavaGuides";
boolean result = str.contains("Guides");
// Result: true
```

## 4. Checking Prefix and Suffix
### startsWith(String prefix) and endsWith(String suffix)
```java
String str = "JavaGuides";
boolean startsWith = str.startsWith("Java");
// Result: true

boolean endsWith = str.endsWith("Guides");
// Result: true
```

## 5. Matching Regular Expressions 
### matches(String regex) 
```java
String str = "12345";
boolean result = str.matches("\\d+");
// Result: true
```

---