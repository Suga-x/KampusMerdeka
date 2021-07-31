import java.util.Scanner;

public class No4_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukan String :");
        String awal = sc.nextLine();
        System.out.println("String awal :"+awal);
        StringBuilder strbld = new StringBuilder();
        strbld.append(awal);
        strbld.reverse();
        System.out.println("String hasil :"+strbld);

    }
}
