package lecture03;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3_2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<String> stringInput=new ArrayList<>();
        System.out.println("何行入力しますか？");
        String number=scanner.nextLine();
        int Number=Integer.parseInt(number);
        for(int i=1;i<=Number;i++){
            System.out.println(i+"行目:");
            String input=scanner.nextLine();
            stringInput.add(input);
        }
        for(String output:stringInput){
            System.out.println(output);
        }
    }
}
