//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.16 at 08:30:51 PM EET 
//


package fi.eonwe.wikilinks.jaxb;

import java.math.BigInteger;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for UploadType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UploadType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="contributor" type="{http://www.mediawiki.org/xml/export-0.8/}ContributorType"/&gt;
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="filename" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="src" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UploadType", propOrder = {
    "timestamp",
    "contributor",
    "comment",
    "filename",
    "src",
    "size"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
public class UploadType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    protected XMLGregorianCalendar timestamp;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    protected ContributorType contributor;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    protected String comment;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    protected String filename;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    protected String src;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    protected BigInteger size;

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the contributor property.
     * 
     * @return
     *     possible object is
     *     {@link ContributorType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    public ContributorType getContributor() {
        return contributor;
    }

    /**
     * Sets the value of the contributor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContributorType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    public void setContributor(ContributorType value) {
        this.contributor = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the filename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    public String getFilename() {
        return filename;
    }

    /**
     * Sets the value of the filename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    public void setFilename(String value) {
        this.filename = value;
    }

    /**
     * Gets the value of the src property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    public String getSrc() {
        return src;
    }

    /**
     * Sets the value of the src property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    public void setSrc(String value) {
        this.src = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    public BigInteger getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    public void setSize(BigInteger value) {
        this.size = value;
    }

}
