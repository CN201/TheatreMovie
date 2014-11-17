
package ReSystem;
/**
 *
 * @author Chotikarn
 */
import java.util.ArrayList;


public class Theatre  {
    
    
    public Theatre(String name,int id){
        this.name = name;
        this.id = id;
    }
    
    private String name;
    private int id;
    private ArrayList<Seat> seatList;
    private ArrayList<Schedule> scheduleList;
    
    
    
    public String getDetailTable(){
       
        return seatList.toString()+scheduleList.toString() ; 
    }
    @Override
    public String toString(){
        return name+id+getDetailTable();
    }
}
