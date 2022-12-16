package lecture06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise6_1 {
    public static void main(String[] args) {
        System.out.println("小数値を入力しください");
        try{
            Scanner input=new Scanner(System.in);
            float number=input.nextFloat();
            System.out.println(number);
        }catch (InputMismatchException e) {
            System.out.println("エラー");
        }

    }
}
