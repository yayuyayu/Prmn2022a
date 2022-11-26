package lecture04;

public class Exercise4_2 {
    public static void main(String[] args) {
        ATM atm=new ATM();

        atm.existAccount("藤田　智子","12345");
        atm.registerAccount("藤田　智子","12345");
        atm.existAccount("藤田　智子","12345");
        atm.deposit("12345",1000);
        atm.whitdraw("12345",2000);
        atm.whitdraw("12345",500);
    }
}
