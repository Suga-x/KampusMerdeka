import java.util.Scanner;

public class No1_HelloWolrd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan Bilangan :");
        int input = sc.nextInt();
        if (input %3==0){
            if (input %5==0){
                System.out.println("Hello Wolrd");
            }else {
                System.out.println("Hello");
            }
        }else if (input %5==0){
            if (input %3==0){
                System.out.println("Hello Wolrd");
            }else{
                System.out.println("Wolrd");
            }

        }
    }
}
