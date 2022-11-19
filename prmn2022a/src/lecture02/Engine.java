package lecture02;

public class Engine {
    int rpm;
    public Engine(int rpm) {
        this.rpm = rpm;
    }
    void Start(){
        System.out.println("rpmは"+rpm);
    }
}
