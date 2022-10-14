import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class Main {
  public static void main(String[] args) {
      String right = "127.0.0.1:99";
      String mistake = "999.0.0";
      String regex = "^([0-9]{1,3}\\.){3}[0-9]{1,3}:[0-9]{1,3}$";
      //Scanner io = new Scanner(System.in);
      //String hi =   io.nextLine();
      System.out.println(right.matches(regex) + " " + mistake.matches(regex) + " \n");
      //io.close();
    }
    static void exo2() {
      int year = 20182;
      String regex = "^[a-z]+,[a-z]+," + year + "$";
      String mistake = "mohamed,boulahbal,2019\nmohssen,boulahbal,2018\nsbbben,bbbal,20182\n";
      BufferedReader br = new BufferedReader(new StringReader(mistake));
      String line = null;
      try {
        while ((line = br.readLine()) != null) {
  
          if (line.matches(regex)) {
            System.out.println(line);
          }
  
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }