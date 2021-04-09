package crashCourseSoftServe.hw1;

public class Task1Brick {
    public static void main(String[] args) {
        System.out.println(putBrick(8,8,8,1,8));
    }

    public static boolean putBrick(int a, int b, int c, int x, int y){
        if((a<=y||c<=y)&&b<=x){
            return true;
        }else if((a<=y||b<=y)&&c<=x){
            return true;
        }else return (b <= y || c <= y) && a <= x;
    }
}
