# Java Array : Chapter 7 String Comparison Methods in Java with Examples

## 1. Using equals(Object anObject) 
```java
String str1 = "Java";
String str2 = "Java";
boolean result = str1.equals(str2);
// Result: true
```

## 2. Using equalsIgnoreCase(String str) 
```java
String str1 = "Java";
String str2 = "java";
boolean result = str1.equalsIgnoreCase(str2);
// Result: true
```

## 3. Using regionMatches( ) 
```java
String str1 = "Welcome to Java";
boolean result = str1.regionMatches(11, "Java", 0, 4);
// Result: true
```

## 4. Using startsWith( ) Method
```java
String str = "Java Programming";
boolean result = str.startsWith("Java");
// Result: true
```

## 5. Using endsWith( ) Method
```java
String str = "Java Programming";
boolean result = str.endsWith("Programming");
// Result: true
```

## 6. equals( ) Versus == 
```java
String str1 = new String("Java");
String str2 = new String("Java");
boolean result1 = str1.equals(str2); // true
boolean result2 = (str1 == str2); // false
```

## 7. Using compareTo( ) 
```java
String str1 = "Apple";
String str2 = "Banana";
int result = str1.compareTo(str2);
// Result: -1
```

## 8. Using compareToIgnoreCase(String str) 
```java
String str1 = "Apple";
String str2 = "apple";
int result = str1.compareToIgnoreCase(str2);
// Result: 0
```

---