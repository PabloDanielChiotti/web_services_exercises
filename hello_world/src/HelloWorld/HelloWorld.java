package HelloWorld;

import javax.activation.DataHandler;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.ws.soap.MTOM;

//Explicado en el video nro. 23
@MTOM
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
  
  @XmlMimeType("[name]") DataHandler data;
  @WebMethod(action = "sample", operationName = "name")
  public String Hello(String s) {
    return "Hello " + s;
  }
  
}
