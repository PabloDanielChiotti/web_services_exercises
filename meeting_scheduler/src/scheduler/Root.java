package scheduler;

import java.io.IOException;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * La anotacion @Path sirve para identificar que se trata de un web service.
 */
@Path(value = "root")
public class Root {

  public Root() {
    
  }

  @POST
  @Consumes("text/plain")
  @Produces("video/mp4")
  public String post(String s) throws IOException {
    if (ScheduleFunction.updateTime(s) == true) {
      return "Success!";
    }
    return "Failure!";
  }
  
  
}
