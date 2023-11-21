package transport_tickets;

import java.text.DecimalFormat;

public class Account {
    private long user_account_id;
    private DecimalFormat balance;


    public Account(long user_account_id, DecimalFormat balance){
        this.user_account_id = user_account_id;
        this.balance = balance;
    }


    public long getUser_account_id(){
        return user_account_id;
    }


    public DecimalFormat getBalance(){
        return balance;
    }


    public void setBalance(DecimalFormat balance){
        this.balance = balance;
    }
    
}
