
package ReSystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Chotikarn
 */
public class ReSystem {

    public static void main(String[] args) throws IOException {
        ArrayList<Movie> movie = new ArrayList<Movie>();
        ArrayList<Theatre> theatre = new ArrayList<Theatre>();
        Scanner scan = new Scanner(System.in);
        FileReader reader = new FileReader("t.txt");
        BufferedReader in = new BufferedReader(reader);
        String inputLine;
        
        while (true) {
            inputLine = in.readLine();
            if (inputLine == null) {
                break;
            }
            String[] data = inputLine.split(":");
            movie.add(new Movie(data[0],Integer.parseInt(data[1]),data[2]));
            System.out.print("Continue YES or NO  : ");
            String check = scan.next();
            if ("no".equals(check) || "No".equals(check)) {
                break;
            }
        }

        
        while (true) {
            System.out.print("Insert theatre name : ");
            String name = scan.next();
            System.out.print("Enter ID : ");
            int id = scan.nextInt();
            theatre.add(new Theatre(name,id));
            System.out.print("Continue YES or NO  : ");
            String check = scan.next();
            if ("no".equals(check) || "No".equals(check)) {
                break;
            }
        }

    }
}