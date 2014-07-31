
package application;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BestBuyService", targetNamespace = "http://service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BestBuyService {


    /**
     * 
     * @param search
     * @param manufacturer
     * @param maxPrice
     * @param minPrice
     * @return
     *     returns java.lang.String
     * @throws SAXException_Exception
     * @throws IOException_Exception
     * @throws ParserConfigurationException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchProduct", targetNamespace = "http://service/", className = "application.SearchProduct")
    @ResponseWrapper(localName = "searchProductResponse", targetNamespace = "http://service/", className = "application.SearchProductResponse")
    @Action(input = "http://service/BestBuyService/searchProductRequest", output = "http://service/BestBuyService/searchProductResponse", fault = {
        @FaultAction(className = SAXException_Exception.class, value = "http://service/BestBuyService/searchProduct/Fault/SAXException"),
        @FaultAction(className = IOException_Exception.class, value = "http://service/BestBuyService/searchProduct/Fault/IOException"),
        @FaultAction(className = ParserConfigurationException_Exception.class, value = "http://service/BestBuyService/searchProduct/Fault/ParserConfigurationException")
    })
    public String searchProduct(
        @WebParam(name = "search", targetNamespace = "")
        String search,
        @WebParam(name = "manufacturer", targetNamespace = "")
        String manufacturer,
        @WebParam(name = "minPrice", targetNamespace = "")
        String minPrice,
        @WebParam(name = "maxPrice", targetNamespace = "")
        String maxPrice)
        throws IOException_Exception, ParserConfigurationException_Exception, SAXException_Exception
    ;

}