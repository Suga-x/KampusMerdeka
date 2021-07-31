import java.util.Scanner;

public class No3_TimeConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan Waktu : \nContoh=(12:00:00 AM)");
        String time = sc.nextLine();
        String[] tmpSplitTime = time.split(" ");
        String[] tmpSplitter = time.split(":", 3);
        int x = Integer.parseInt(tmpSplitter[0]);
        if (x <= 23) {
            if (tmpSplitTime[1].equals("AM")) {
                String strBuild = tmpSplitter[0] + ":" + tmpSplitter[1];
                System.out.println(strBuild);
            } else if (tmpSplitTime[1].equals("PM")) {
                int y = x + 12;
                String tmpString = String.valueOf(y);
                String strBuild1 = tmpString + ":" + tmpSplitter[1];
                System.out.println(strBuild1);
            }
        }
    }
}
