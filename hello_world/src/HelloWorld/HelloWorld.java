package HelloWorld;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Esto es un webservice que utiliza el protocolo SOAP y que a traves de JAX-WS
 * se convierte en un xml que es lo que se manda como mensaje en el WSDL.
 * Para poder correr esto lo que se hace es:
 * click derecho en el projecto -> run as -> run on server y se lo corre
 * sobre el servidor glassfish.
 * despues podemos acceder al servidor a traves de la direccion http://localhost:4848/
 * y alli en el boton que dice applications, deberia encontrarse muestro webservice.
 */
@WebService(name = "newname")
public class HelloWorld {

  public void Constructor() {
    
  }
  
  @WebMethod(action = "sample", operationName = "name")
  public String Hello(String s) {
    return "Hello " + s;
  }
  
}
