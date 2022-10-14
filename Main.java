import java.util.*;


public class Main {
  public static void main(String[] args) {
    System.out.println("happy birtday")  ; 
   


    }
    static void exo1()
    {
            
      String right = "127.0.0.1:99";
      String mistake = "999.0.0";
      String regex = "^([0-9]{1,3}\\.){3}[0-9]{1,3}:[0-9]{1,4}$";
      Scanner io = new Scanner(System.in);
      String hi =   io.nextLine();
      System.out.println(right.matches(regex) + " " + mistake.matches(regex) + " \n");
      io.close();
    }
  }