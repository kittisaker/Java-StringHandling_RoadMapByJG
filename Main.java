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