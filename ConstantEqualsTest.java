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