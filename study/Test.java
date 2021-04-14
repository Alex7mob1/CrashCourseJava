package crashCourseSoftServe.study;

public class Test{

    public static void main(String s [] ){
        try{
            throw new CustomException("Custom exception");
        }catch (CustomException e){
            System.err.println(e.getMessage());
        }finally {
            System.out.println("the end");
        }
    }

}
class CustomException extends Exception{
    private static final long serialVersionUID = 1L;
    public CustomException(String message){
        super(message);
    }
}