# Java Array : Chapter 6 String Special Operations with Examples

## 1. String Literals
```java
String s1="Welcome";  
String s2="Welcome";//will not create new instance
```

## 2. String Concatenation
In general, Java does not allow operators to be applied to String objects. The one exception to this rule is the + operator, which concatenates two strings, producing a String object as the result. This allows you to chain together a series of + operations. 
```java
String age = "9";
String s = "He is " + age + " years old.";
System.out.println(s);      // He is 9 years old.
```

```java
// Using concatenation to prevent long lines.
class ConCat {
    public static void main(String args[]) {
         String longStr = "This could have been " + "a very long line that would have "
         + "wrapped around. But string concatenation " + "prevents this.";
         System.out.println(longStr);
    }
}
```

### String java.lang.String.concat(String str)
This method returns a string that represents the concatenation of this object's characters followed by the string argument's characters.
```java
public class ConcatExmaple {
    public static void main(String[] args) {
        String str = "javaguides";
        str = str.concat(".net");
        System.out.println("Concatenates the specified string to the end of this string : " + str);

        System.out.println("cares".concat("s"));
        System.out.println("to".concat("get"));
    }
}
```

<details>
<summary>Output : </summary>

```shell
Concatenates the specified string to the end of this string : javaguides.net
caress
toget
```

</details>

## 3. String Concatenation with Other Data Types
```java
String s = "four: " + 2 + 2;
System.out.println(s); // four: 22

```

rather than the
```shell
four: 4
```

```java
String s = "four: " + (2 + 2);  // four: 4
```

## 4. String Conversion and toString( )
### valueOf( ) Method
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
        char chr[]={'j','a','v','a'};  
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
StringValueOfExample5@372f7a8d
```

</details>

### toString() Method
```java
class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
         width = w;
         height = h;
         depth = d;
    }

    public String toString() {
         return "Dimensions are " + width + " by " + depth + " by " + height + ".";
    }
}

class toStringDemo {
    public static void main(String args[]) {
         Box b = new Box(10, 12, 14);
         String s = "Box b: " + b; // concatenate Box object
         System.out.println(b); // convert Box to string
         System.out.println(s);
    }
}
```

<details>
<summary>Output : </summary>

```shell
Dimensions are 10.0 by 14.0 by 12.0
Box b: Dimensions are 10.0 by 14.0 by 12.0
```

</details>

---