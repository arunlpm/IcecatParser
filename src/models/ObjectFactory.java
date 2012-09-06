//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.05 at 02:39:17 PM IST 
//


package models;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ICECATInterface_QNAME = new QName("", "ICECAT-interface");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CountryMarkets }
     * 
     */
    public CountryMarkets createCountryMarkets() {
        return new CountryMarkets();
    }

    /**
     * Create an instance of {@link File }
     * 
     */
    public File createFile() {
        return new File();
    }

    /**
     * Create an instance of {@link EANUPCS }
     * 
     */
    public EANUPCS createEANUPCS() {
        return new EANUPCS();
    }

    /**
     * Create an instance of {@link Body }
     * 
     */
    public Body createBody() {
        return new Body();
    }

    /**
     * Create an instance of {@link Distributor }
     * 
     */
    public Distributor createDistributor() {
        return new Distributor();
    }

    /**
     * Create an instance of {@link FilesIndex }
     * 
     */
    public FilesIndex createFilesIndex() {
        return new FilesIndex();
    }

    /**
     * Create an instance of {@link Distributors }
     * 
     */
    public Distributors createDistributors() {
        return new Distributors();
    }

    /**
     * Create an instance of {@link CountryMarkets.CountryMarket }
     * 
     */
    public CountryMarkets.CountryMarket createCountryMarketsCountryMarket() {
        return new CountryMarkets.CountryMarket();
    }

    /**
     * Create an instance of {@link File.MProdID }
     * 
     */
    public File.MProdID createFileMProdID() {
        return new File.MProdID();
    }

    /**
     * Create an instance of {@link EANUPCS.EANUPC }
     * 
     */
    public EANUPCS.EANUPC createEANUPCSEANUPC() {
        return new EANUPCS.EANUPC();
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link Body }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ICECAT-interface")
    public JAXBElement<Body> createICECATInterface(Body value) {
        return new JAXBElement<Body>(_ICECATInterface_QNAME, Body.class, null, value);
    }

}
