package lecture05;

public class Exercise5_7 {
    public static void main(String[] args) {
        Insect[] moving=new Insect[4];
        Insect insect=new Insect();
        Butterfly butterfly=new Butterfly();
        Locust locust=new Locust();
        SwallowtailButterfly swallowtailButterfly=new SwallowtailButterfly();
        moving[0]=insect;
        moving[1]=butterfly;
        moving[2]=locust;
        moving[3]=swallowtailButterfly;
        for(int i=0;i<moving.length;i++){
            moving[i].move();
        }

    }
}
