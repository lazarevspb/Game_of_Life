import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        for (int i = 0; i < 3 ; i++) {
            a = scanner.nextInt();
//            a = Integer.parseInt(args[i]);

            b += (a%2 == 0 )? a: a+1;
        }



        System.out.println(b / 2);


        // put your code here
    }
}
