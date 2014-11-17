
package ReSystem;

import java.io.Serializable;
import java.util.Hashtable;
/**
 *
 * @author Chotikarn
 */
public class Seat implements Serializable {
        
	private Integer seatid;
	private Integer seatnum;
	private String seatrow;
	private Hashtable<Schedule, Boolean> o;
	
	public Seat(int seatnum, String seat) {
		this.seatid = -1;
		this.seatnum = seatnum;
		this.seatrow = seat;
                o = new Hashtable<Schedule, Boolean>();
	}
	
	public int getSeatID() {
		return seatid;
	}
	
	public void setSeatID(int seatid) {
		this.seatid = seatid;
	}
	
	public int getSeatNo() {
		return seatnum;
	}
	
	public void setSeatNo(int seat) {
		this.seatnum = seat;
	}
	
	public String getSeatRow() {
		return seatrow;
	}
	
	public void setSeatRow(String seat) {
		this.seatrow = seat;
	}
	
	
	public boolean isOccupiedAt(Schedule showTime) {
		return o.get(showTime);
	}
	
	public void setOccupiedAt(Schedule showTime, boolean value) {
		o.put(showTime, value);
	}
}
    