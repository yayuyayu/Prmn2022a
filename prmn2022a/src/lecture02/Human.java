package lecture02;

public class Human {
    String name;
    int age;

    void print(){
        if(age<19){
            System.out.println("生徒:"+name+" "+age+"歳です。");
        }else if(age<23){
            System.out.println("学生:"+name+" "+age+"歳です。");
        }
    }
}
