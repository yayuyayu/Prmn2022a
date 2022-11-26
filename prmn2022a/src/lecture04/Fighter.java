package lecture04;

import java.util.Scanner;

public class Fighter {
    private int hitPoint;
    private int power;
    private String name;

    public Fighter(){
    }

    public Fighter(int hitPoint, int power,String name){
        this.hitPoint = hitPoint;
        this.name=name;
        this.power=power;
    }

    public void attack(Fighter enemy){
        enemy.hitPoint-=this.power;
        System.out.println(this.name+" は　"+enemy.name+" に　"+this.power+"　ダメージ与えた");
        System.out.println(enemy.name+" の残り hitPoint : "+enemy.hitPoint);
    }

    public boolean isAlive(){
        if(this.hitPoint<0){
            System.out.println(this.name+" は倒れた");
            return false;
        }else{
            return true;
        }
    }

    public int getHitPoint(){
        Scanner input=new Scanner(System.in);
        return input.nextInt();
    }

    public void setHitPoint(int hitPoint){
        this.hitPoint=hitPoint;
    }

    public String getName(){
        Scanner input=new Scanner(System.in);
        return input.nextLine();
    }
}