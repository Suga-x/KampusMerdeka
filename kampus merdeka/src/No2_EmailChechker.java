import java.util.Scanner;

public class No2_EmailChechker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan Email :");
        String email = sc.nextLine();
        String[] arrOfEmail = email.split("@");
        String[] domSplit = arrOfEmail[1].split("\\.",3);
        if (arrOfEmail[0].length()<=20){
            if (domSplit[2].equals("co.id") || domSplit[2].equals("id")){
                System.out.println("Email Valid");
            }else {
                System.out.println("harus menggunakan domail .co.id atau .id");
            }
        }else{
            System.out.println("max lenght 20");
        }
    }
}
