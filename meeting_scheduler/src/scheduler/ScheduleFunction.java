package scheduler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Para que funcionen los metodos de la siguiente clase, es necesario crear un
 * archivo que lleve por nombre database.txt en el disco C:/
 * Ahora lo que hay que hacer es correr la clase RestTest, click derecho
 * run as -> java application.
 */
public class ScheduleFunction {

  public static void save(String filename, List<String> x) throws IOException {
    BufferedWriter outputWritter = null;
    outputWritter =  new BufferedWriter(new FileWriter(filename));
    for (String s : x) {
      outputWritter.write(s);
      outputWritter.newLine();
    }
    outputWritter.flush();
    outputWritter.close();
  }
  
  public static void clear() throws IOException {
    List<String> blank = new ArrayList<String>();
    save("C:/Users/pablochiotti/Desktop/Training/web_services_exercises/meeting_scheduler/database.txt", blank);
  }
  
  public static List<String> load (String filename) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
    List<String> lines = new ArrayList<String>();
    String line = null;
    while ((line = bufferedReader.readLine()) != null) {
      lines.add(line);
    }
    bufferedReader.close();
    return lines;
  }
  
  public static Boolean updateTime(String date) throws IOException {
    Integer i = Integer.parseInt(date);
    List<String> schedule = load("C:/Users/pablochiotti/Desktop/Training/web_services_exercises/meeting_scheduler/database.txt");
    while (schedule.size() <= i) {
      schedule.add("0");
    }
    if(schedule.get(i).equals("0")) {
      schedule.set(i,"1");
      save("C:/Users/pablochiotti/Desktop/Training/web_services_exercises/meeting_scheduler/database.txt",schedule);
      return true;
    }
    return false;
  }
  
  

  
  
}
