//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.05 at 02:39:17 PM IST 
//


package models;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for body complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="body">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="files.index" type="{}files.index"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "body", propOrder = {

})
public class Body {

    @XmlElement(name = "files.index", required = true)
    protected FilesIndex filesIndex;

    /**
     * Gets the value of the filesIndex property.
     * 
     * @return
     *     possible object is
     *     {@link FilesIndex }
     *     
     */
    public FilesIndex getFilesIndex() {
        return filesIndex;
    }

    /**
     * Sets the value of the filesIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilesIndex }
     *     
     */
    public void setFilesIndex(FilesIndex value) {
        this.filesIndex = value;
    }

}