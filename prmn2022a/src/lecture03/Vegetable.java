package lecture03;

public class Vegetable {
    String name;
    int value;

    public Vegetable(String name,int value){
        this.name=name;
        this.value=value;
    }

    void print(){
        System.out.println(name+"の価格は"+value+"円です");
    }

}
