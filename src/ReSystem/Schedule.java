

package ReSystem;
import java.io.Serializable;
import java.util.Date;
/**
 *
 * @author Chotikarn
 */
public class Schedule implements Serializable {
	
	private Integer showTime;
	private Date time;
	private Movie movie;
	
	
	public Schedule(Movie movie, Date time) {
		this.showTime = -1;
		this.movie = movie;
		this.time = time;
	
	}
	
	public void setShowTimeID(int showTime) {
		this.showTime = showTime;
	}
	
	public int getShowTimeID() {
		return showTime;
	}
	
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	
	public Movie getMovie() {
		return movie;
	}
		
 	public void setTime(Date time) {
 		this.time = time;
 	}
 	
 	public Date getTime() {
 		return time;
 	}

}