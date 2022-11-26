package lecture04;

import java.util.ArrayList;
import java.util.Scanner;

public class ATM {
    private ArrayList<Account> accounts;
    public  ATM(){
        this.accounts =new ArrayList<Account>();
    }

    void deposit(String number,long money){
        int i=0;
        for(int j=0;j<accounts.size();j++) {
            Account newAccount = accounts.get(i);
            if (newAccount.number == number) {
                newAccount.balance += money;
                System.out.println("口座番号:"+number+" に "+money+" 円入金しました。");
                break;
            }
            i++;
        }
    }

    void whitdraw(String number,long money){
        int i=0;
        for(int j=0;j<accounts.size();j++) {
            Account newAccount = accounts.get(i);
            if (newAccount.number == number ) {
                if(newAccount.balance>money) {
                    newAccount.balance -= money;
                    System.out.println("口座番号:"+number+" から "+money+" 円引き出ししました。"+"残高"+newAccount.balance+"円です。");
                    break;
                }
                System.out.println("口座番号:"+number+" から "+money+" 円ひきだせませんました。残高:"+newAccount.balance+"円です。");
                break;
            }
            i++;
        }
    }

    boolean existAccount(String name,String number){
        int i=0;
        if(accounts!=null) {
            for (int j = 0; j < accounts.size(); j++) {
                Account newAccount = accounts.get(i);
                if (newAccount.name == name) {
                    if (newAccount.number == number) {
                        System.out.println("名前:" + name + " 口座番号:" + number + " は存在します。");
                        return true;
                    }
                }
                i++;
            }
        }
        System.out.println("名前:"+name+" 口座番号:"+number+" は存在しません。");
        return false;
    }
    void registerAccount(String name,String number){
        accounts.add(new Account(name,number));
        System.out.println(name+" さんのアカウントを口座番号:"+number+" で登録しました。");
    }
}
