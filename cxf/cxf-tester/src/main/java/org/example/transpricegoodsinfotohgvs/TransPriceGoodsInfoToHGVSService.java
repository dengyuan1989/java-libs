
package org.example.transpricegoodsinfotohgvs;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "TransPriceGoodsInfoToHGVS_Service", targetNamespace = "http://www.example.org/TransPriceGoodsInfoToHGVS/", wsdlLocation = "file:/Users/haolin/Working/docs/690/sap/TransPriceGoodsInfoToHGVS(3).wsdl")
public class TransPriceGoodsInfoToHGVSService
    extends Service
{

    private final static URL TRANSPRICEGOODSINFOTOHGVSSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(org.example.transpricegoodsinfotohgvs.TransPriceGoodsInfoToHGVSService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = org.example.transpricegoodsinfotohgvs.TransPriceGoodsInfoToHGVSService.class.getResource(".");
            url = new URL(baseUrl, "file:/Users/haolin/Working/docs/690/sap/TransPriceGoodsInfoToHGVS(3).wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:/Users/haolin/Working/docs/690/sap/TransPriceGoodsInfoToHGVS(3).wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        TRANSPRICEGOODSINFOTOHGVSSERVICE_WSDL_LOCATION = url;
    }

    public TransPriceGoodsInfoToHGVSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TransPriceGoodsInfoToHGVSService() {
        super(TRANSPRICEGOODSINFOTOHGVSSERVICE_WSDL_LOCATION, new QName("http://www.example.org/TransPriceGoodsInfoToHGVS/", "TransPriceGoodsInfoToHGVS_Service"));
    }

    /**
     * 
     * @return
     *     returns TransPriceGoodsInfoToHGVS
     */
    @WebEndpoint(name = "TransPriceGoodsInfoToHGVSSOAP")
    public TransPriceGoodsInfoToHGVS getTransPriceGoodsInfoToHGVSSOAP() {
        return super.getPort(new QName("http://www.example.org/TransPriceGoodsInfoToHGVS/", "TransPriceGoodsInfoToHGVSSOAP"), TransPriceGoodsInfoToHGVS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TransPriceGoodsInfoToHGVS
     */
    @WebEndpoint(name = "TransPriceGoodsInfoToHGVSSOAP")
    public TransPriceGoodsInfoToHGVS getTransPriceGoodsInfoToHGVSSOAP(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.example.org/TransPriceGoodsInfoToHGVS/", "TransPriceGoodsInfoToHGVSSOAP"), TransPriceGoodsInfoToHGVS.class, features);
    }

}
