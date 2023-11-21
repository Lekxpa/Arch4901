package transport_tickets;


import java.util.Date;
import java.text.DecimalFormat;

public class Ticket {
    private long id;
    private int departure_zone;
    private int arrival_zone;
    private int route_number;
    private Date departure_time;
    private Date arrival_time;
    private long buyer_id;
    private boolean is_used;
    private DecimalFormat price;
    private String place;


    public Ticket(long id, int departure_zone, int arrival_zone, int route_number, Date departure_time, 
                Date arrival_time, long buyer_id, boolean is_used, DecimalFormat price, String place){
        
        this.id = id;
        this.departure_zone = departure_zone; 
        this.arrival_zone = arrival_zone;
        this.route_number = route_number;
        this.departure_time = departure_time;
        this.arrival_time = arrival_time;
        this.buyer_id = buyer_id;
        this.is_used = is_used;
        this.price = price;
        this.place = place;
    }
   

    public long getId(){
        return id;
    }


    public int getDeparture_zone(){
        return departure_zone;
    }

    // public void setDeparture_zone(int departure_zone){
    //     this.departure_zone = departure_zone;
    // }

    public int getArrival_zone(){
        return arrival_zone;
    }

    // public void setArrival_zone(int arrival_zone){
    //     this.arrival_zone = arrival_zone;
    // }

    public int getRoute_number(){
        return route_number;
    }

    public Date getDeparture_time(){
        return departure_time;
    }

    public Date getArrival_time(){
        return arrival_time;
    }

    public long getBuyer_id(){
        return buyer_id;
    }

    public boolean getIs_used(){
        return is_used;
    }

    // public void setIs_used(boolean is_used){
    //     this.is_used = is_used;
    // }

    public DecimalFormat getPrice(){
        return price;
    }

    //  public void setPrice(DecimalFormat price){
    //     this.price = price;
    // }

    public String getPlace(){
        return place;
    }
    
}
