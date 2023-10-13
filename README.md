# Java Array : Chapter 10 String Modifying Methods with Examples

## 1. concat(String str) 
```java
String str = "Java";
String result = str.concat("Guides");
// Result: "JavaGuides"
```

## 2. replace(char oldChar, char newChar)
```java
String str = "Java";
String result = str.replace('a', 'o');
// Result: "Jovo"
```

## 3. substring(int beginIndex) and substring(int beginIndex, int endIndex)
```java
String str = "JavaGuides";
String result1 = str.substring(4);
// Result: "Guides"

String result2 = str.substring(4, 6);
// Result: "Gu"
```

## 4. toLowerCase() and toUpperCase() 
```java
String str = "Java";
String lower = str.toLowerCase();
// Result: "java"

String upper = str.toUpperCase();
// Result: "JAVA"
```

## 5. trim()
```java
String str = " JavaGuides ";
String result = str.trim();
// Result: "JavaGuides"
```

## 6. split(String regex) 
```java
String str = "Java,Guides";
String[] result = str.split(",");
// Result: ["Java", "Guides"]
```

## 7. replaceAll(String regex, String replacement)
```java
String str = "JavaGuides";
String result = str.replaceAll("a", "o");
// Result: "JovoGuides"
```

## 8. join(CharSequence delimiter, CharSequence... elements) 
```java
String result = String.join("-", "Java", "Guides");
// Result: "Java-Guides"
```

---