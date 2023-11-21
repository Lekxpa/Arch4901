package transport_tickets;

import java.util.List;

public class User {
    private long id;
    private String name;
    private List<Ticket> tickets;
    private String login;
    private long password_hash_code;
    private long user_account_id;


    public User(long id, String name, String login, long password_hash_code, long user_account_id){
        this.id = id;
        this.name = name;
        this. login = login;
        this.password_hash_code = password_hash_code;
        this.user_account_id = user_account_id;
    }


    public long getId(){
        return id;
    }

    public String getname(){
        return name;
    }


    public List<Ticket> getTickets(){
        return tickets;
    }


    public String getLogin(){
        return login;
    }


    public long getPassword_hash_code(){
        return password_hash_code;
    }


    public long getUser_account_id(){
        return user_account_id;
    }

}
