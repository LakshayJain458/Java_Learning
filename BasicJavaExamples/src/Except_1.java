public class Except_1 {
    public static void main(String []args){
        String s=null;
        try {
//            if(s.equals("hello")){
//                System.out.println("same");
//            }
            int a=10/0;
        }
//        catch (Exception e){
//            System.out.println("exception type is -> "+e);
//        }
        catch (ArithmeticException e){
            System.out.println("Exception type is -> "+e);
        }
    }
}
