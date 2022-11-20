package lecture03;

import java.util.Scanner;

public class Exercise3_3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("一つ目の数字を入力してください");
        String first=scanner.nextLine();
        System.out.println("二つ目の数字を入力してください");
        String second=scanner.nextLine();
        int First=Integer.parseInt(first);
        int Second=Integer.parseInt(second);
        int Third=First+Second;
        System.out.println(First+"+"+second+"="+Third);
    }
}
