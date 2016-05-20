package scheduler;

import java.io.IOException;

public class RestTest {

  public static void main(String[] args) throws IOException {
    Root testRoot = new Root();
    ScheduleFunction.clear();
    System.out.println(testRoot.post("1"));
    System.out.println(testRoot.post("1"));
    System.out.println(testRoot.post("5"));
    System.out.println(testRoot.post("3"));
    System.out.println(testRoot.post("5"));
  }
 
  
  
}
