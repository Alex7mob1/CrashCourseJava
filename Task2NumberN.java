package crashCourseSoftServe;

public class Task2NumberN {
    public static void main(String[] args) {
        choosing(456,8);
    }

    public static void choosing(int n, int menu) {
        switch (menu) {
            case 1:
                String three = "3";
                String num = String.valueOf(n*n);
                System.out.println(num.contains(three));
                break;


            case 2:
                String number = String.valueOf(n);
                char[] charNumber = number.toCharArray();
                StringBuilder reversN = new StringBuilder();
                for (int i = charNumber.length - 1; i >= 0; i--) {
                    reversN.append(charNumber[i]);
                }
                System.out.println(Integer.parseInt(reversN.toString()));
                break;


            case 3:
                char buffer;
                String numbers = String.valueOf(n);
                char[] charNumbers = numbers.toCharArray();
                buffer=charNumbers[0];
                charNumbers[0]=charNumbers[charNumbers.length-1];
                charNumbers[charNumbers.length-1] = buffer;
                System.out.println(Integer.parseInt(new String(charNumbers)));
                break;


            case 4:
                String one = "1";
                System.out.println(Integer.parseInt(one+n+one));
                break;


            default:
                System.out.println("You enter is not correct MENU number");
                break;

        }
    }
}
