# Java Array : Chapter 5 String Best Practices in Java

## 1. Use String Literals Where Possible
Using string literals allows Java to make use of the String Pool, leading to better performance.
```java
String str = "JavaGuides"; // Uses String Pool 
```

## 2. Use StringBuilder or StringBuffer for string concatenations instead of the + operator
Concatenating strings using the + operator in a loop can be highly inefficient. Use StringBuilder, or StringBuffer instead.

StringBuffer acts like StringBuilder, as it has the same methods except they are synchronized. That means StringBuffer should be used in a multi-threading context.
```java
public class PerformanceTest {
    public static void main(String[] args) {
        String str = "";
        long startTime = System.nanoTime();
        for(int i=0; i<10; i++){
            str = str + i;
        }
        long endTime = System.nanoTime();
        System.out.println(String.format("String opetation with operator took [%d] nano seconds",(endTime-startTime)));

        StringBuilder builder = new StringBuilder();
        startTime = System.nanoTime();
        for(int i=0;i<10;i++) {
            builder.append(i);
        }
        endTime = System.nanoTime();
        System.out.println(String.format("String opetation with StringBuilder took [%d] nano seconds",(endTime-startTime)));

        StringBuffer strBuffer = new StringBuffer();
        startTime = System.nanoTime();
        for(int i=0;i<10;i++) {
            strBuffer.append(i);
        }
        endTime = System.nanoTime();
        System.out.println(String.format("String opetation with StringBuffer took [%d] nano seconds",(endTime-startTime)));
    }
}
```

<details>
<summary>Output : </summary>

```shell
String opetation with operator took [16264600] nano seconds
String opetation with StringBuilder took [9100] nano seconds
String opetation with StringBuffer took [18400] nano seconds
```

</details>

## 3. Use equals() Method for String Comparison Instead == Operator
To compare the content of strings, always use the equals() method instead of the == operator.

Refer below points while comparing string contents and string references.
* use == to compare primitives e.g. boolean, int, char, etc, while use equals() to compare objects in Java.
* == return true if two references are pointing to the same object. The result of the equals() method depends on overridden implementation.
* For comparing the content of two Strings use equals() instead of == equality operator. 

```java
public class StringEqualsTest {
    public static void main(String[] args) {
        String s1 = "string";
        String s2 = "string";
        String s3 = new String("string");

        System.out.println(" == opearator result for s1 and s2 : " + (s1 == s2));
        System.out.println(" == opearator result for s1 and s3 : " + (s1 == s3));

        System.out.println(" equals() method result for s1 and s2 : " + s1.equals(s2));
        System.out.println(" equals() method result for s1 and s3 : " + s1.equals(s3));
    }
}
```

<details>
<summary>Output : </summary>

```shell
 == opearator result for s1 and s2 : true
 == opearator result for s1 and s3 : false
 equals() method result for s1 and s2 : true
 equals() method result for s1 and s3 : true
```

</details>

## 4. Call equals() Method on Known String Constants Rather Than Unknown Variable
If you know some constants are fixed then use the equals method on known constants rather than unknown variables. Sometimes variable may contain null and if you are calling the equals method on null contains variable leads to a null pointer exception.
```java
public class ConstantEqualsTest{
    private static final String CONSTANT = "constant value";

     public static void main(String []args){
           processString("constant value");
 
     }
     private static void processString(String str){
         if(CONSTANT.equals(str)){
            System.out.println("CONSTANT.equals(string): " + CONSTANT.equals(str));
         }
     }
}
```

<details>
<summary>Output : </summary>

```shell
CONSTANT.equals(string): true
```

</details>

## 5. Prefer switch( ) Statement Instead of Multiple if-else-if
Java 1.7 introduces the switch statement for Strings. If there is a scenario to compare multiple strings then use switch over multiple if-else-if statements. Here is a comparison of the performance of these two approaches.
```java
public class Main {
 public static final String CONSTANT = "someConstant";
 
 public static void main(String[] args) {
     Main test = new Main();
     long startTime = System.nanoTime();
     test.convertStringToIntegerWithSwitch("FOUR");
     long endTime = System.nanoTime();
     System.out.println(String.format("String comparison with Switch took [%d] nano seconds.",(endTime-startTime)));
  
     startTime = System.nanoTime();
     test.convertStringToIntegerWithIf("FOUR");
     endTime = System.nanoTime();
     System.out.println(String.format("String comparison with If took [%d] nano seconds.",(endTime-startTime)));
 }
 
 private int convertStringToIntegerWithSwitch(String stringNumber) {
     switch(stringNumber) {
     case "ZERO" :
     return 0;
     case "ONE":
     return 1;
     case "TWO":
     return 2;
     case "THREE":
     return 3;
     default :
     return -1;
   }
 }
 
 private int convertStringToIntegerWithIf(String stringNumber) {
     if("ZERO".equals(stringNumber)) {
        return 0;
     } else if("ONE".equals(stringNumber)) {
        return 1;
     } else if("TWO".equals(stringNumber)) {
       return 2;
     } else if("THREE".equals(stringNumber)) {
       return 3;
     } else {
       return -1;
     } 
  }
}
```

<details>
<summary>Output : </summary>

```shell
String comparison with Switch took [2900] nano seconds.
String comparison with If took [8200] nano seconds.
```

</details>

## 6. Be Careful with Case Sensitivity 
```java
if(str1.equalsIgnoreCase(str2)) {
    // Strings are equal, ignoring case
}
```

## 7. Prefer isEmpty to Check for Empty Strings
```java
if(str.isEmpty()) {
    // String is empty
}
```

## 8. Use String.valueOf() Instead of toString()
If an object needs to be converted to a string then the result of <b>obj.toString()</b> and String.valueOf(obj) will be the same but <b>String.valueOf()</b> is null safe, which means it will never throw <b>NullPointerException</b>.
```java
Test test = null;
// Below statement will not throw NPE
System.out.println(String.valueOf(test));
// Next statement will throw NPE
System.out.println(test.toString())
```

## 9. Use String Utility Classes
Prefer StringUtility classes from different popular libraries because these Utility classes are tested and well-known libraries.

## 10. Avoid Duplicate Literals
```java
private void bar() {
     String howdy= "Howdy"
     buz(howdy);
     buz(howdy);
 }

 private void buz(String x) {}

// Better
private static final String HOWDY = "Howdy";
private void bar() {
     buz(HOWDY);
     buz(HOWDY);
 }
 private void buz(String x) {}
```

## 11. Other Basic String Best Practices
### Unnecessary Case Change
Using <b>equalsIgnoreCase()</b> is faster than using <b>toUpperCase()</b> or <b>toLowerCase()</b>

### Append Character With Char
Avoid concatenating characters as strings in <b>StringBuffer/StringBuilder.append</b> methods.
```java
StringBuffer sb = new StringBuffer(); 
sb.append("a");                         // avoid this
StringBuffer sb = new StringBuffer();
sb.append('a');                         // use this instead
```

### Consecutive Appends Should Reuse
Consecutive calls to StringBuffer/StringBuilder.append should be chained, reusing the target object. This can improve the performance by producing a smaller bytecode, reducing overhead, and improving inlining. A complete analysis can be found here
```java
String foo = " "; 
StringBuffer buf = new StringBuffer();
buf.append("Hello"); // poor
buf.append(foo);
buf.append("World");

StringBuffer buf = new StringBuffer();
buf.append("Hello").append(foo).append("World"); // good
```

### Avoid StringBuffer Field
<b>StringBuffers/StringBuilders</b> can grow considerably, and so may become a source of memory leaks if held within objects with long lifetimes.

```java
public class Foo {
    private StringBuffer buffer;    
    // potential memory leak as an instance variable;
}
```

### Unnecessary Conversion Temporary
Avoid unnecessary temporaries when converting primitives to Strings
```java
public String convert(int x) { 
    // this wastes an object
    String foo = new Integer(x).toString();
    // this is better
    return Integer.toString(x);
}
```

---