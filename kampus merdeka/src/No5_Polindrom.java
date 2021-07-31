import java.util.Scanner;

public class No5_Polindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukan String :");
        String str = sc.nextLine();
        StringBuilder strbld = new StringBuilder();
        strbld.append(str);
        strbld.reverse();
        if (str.contentEquals(strbld)){
            System.out.println("Polindrom");
        }else{
            System.out.println("Tidak Polindrom");
        }
    }
}
