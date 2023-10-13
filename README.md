# Java Array : Chapter 4 Java String Constant Pool

## String Constant Pool with new Keyword
If we create a string using the new keyword, it will always create a new object in the heap space, but it also checks the string constant pool. If a string with the same value is found in the pool, the newly created string object in the heap will have the same value. However, if a string with the same value is not found in the pool, a new string will also be created in the pool.
```java
String str1 = new String("JavaGuides"); // creates one string object in the heap,
                                        // and one string in the string constant pool
String str2 = new String("JavaGuides"); // creates a second string object in the heap,
                                        // but reuses the string in the constant pool
```

## Why use the String Constant Pool
The string constant pool helps save memory when your program creates many strings. Because strings are immutable in Java, the JVM can safely reuse them without worrying about the value being changed. 

It's also important to note that the == operator checks for reference equality. Two string references are equal if and only if they point to the exact same object, which can only happen through string interning.

## The intern() Method
In Java, the intern() method of the String class can be used to find or create an equivalent String in the String Constant Pool. When the intern() method is called on a String object, it checks if a String with the same value is already present in the pool. If there is, it returns the reference to the pooled instance. If not, it adds the String to the pool and returns its reference. 

<details>
<summary>Output : </summary>

```java
public class Main {
    public static void main(String[] args) {
        String str1 = new String("JavaGuides"); // creates a new string object in heap and 
                                                // the literal "JavaGuides" in the string constant pool
        String str2 = "JavaGuides"; // refers to the instance in the string constant pool
        String str3 = str1.intern(); // str1 content is added to the string constant pool 
                                     // and its reference is returned

        System.out.println(str1 == str2); // Outputs "false"
        System.out.println(str2 == str3); // Outputs "true"
    }
}
```

</details>

---