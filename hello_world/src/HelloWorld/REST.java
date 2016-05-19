package HelloWorld;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path(value = "restful path")
public class REST {

  public void REST() {
    
  }
  
  @GET
  /**
   * No podemos notificar al solicitante que este metodo va a producir un archivo xml
   * a traves del return type porque java no soporta decir que vamos a devolver un
   * archivo xml. Debido a esto es que se agrega la notacion de abajo.
   * El archivo que nosotros para que esto funcione contiene toda la informacion
   * necesaria para que vaya del metodo java a la respuesta en xml.
   */
  @Produces("text/xml")
  public Object get() {
    return "Hello World";
  }
  
  @PUT
  @Consumes("text/xml")
  public void put(String content) {
    
  }
  
}
