package lecture02;

import java.util.Scanner;

public class Exercise2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Human hum=new Human();
        System.out.print("name=");
        hum.name= input.next();
        System.out.print("age=");
        hum.age=input.nextInt();
        hum.print();
    }
}
