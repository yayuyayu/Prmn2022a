package lecture04;

public class Exercise4_1 {
    public static void main(String[] args) {
        Fighter Fighter1=new Fighter();
        Fighter Fighter2=new Fighter();
        Fighter1=new Fighter(Fighter1.getHitPoint(),100,Fighter1.getName());
        Fighter2=new Fighter(Fighter2.getHitPoint(),150,Fighter2.getName());
        while(true){
            Fighter1.attack(Fighter2);
            if(Fighter2.isAlive()==false){
                break;
            }
            Fighter2.attack(Fighter1);
            if(Fighter1.isAlive()==false){
                break;
            }
        }
    }
}
