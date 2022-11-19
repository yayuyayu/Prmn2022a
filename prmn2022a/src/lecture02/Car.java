package lecture02;

public class Car {
    int fuel;

    void run(){
        if(fuel>0) {
            fuel--;
            System.out.println("燃料を１消費して走りました");
        }else{
            System.out.println("燃料が不足しています");
        }
    }

    void StartEngine(){
        Engine engine =new Engine(400);
        engine.Start();
    }
}
