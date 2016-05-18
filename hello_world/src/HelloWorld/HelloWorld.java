package HelloWorld;

import javax.jws.WebService;

@WebService
public class HelloWorld {

  public void Constructor() {
    
  }
  
  public String Hello(String s) {
    return "Hello " + s;
  }
  
}
