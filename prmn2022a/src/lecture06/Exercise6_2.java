package lecture06;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercise6_2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        ArrayList <Intenger> array=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            array.add(new Intenger(random.nextInt(6)));
        }
        System.out.println("さいころを５つ振りました");
        try{
            System.out.println("何番目のさいころの値を確認しますか？");
            int number= input.nextInt();
            array.get(number).print();
        }catch(Exception e){
            System.out.println("ArrayListの範囲外アクセスを確認しました");
        }
        System.out.println("プログラムを終了します");
    }
}
