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
 * <p>Java class for RevisionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RevisionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="parentid" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="contributor" type="{http://www.mediawiki.org/xml/export-0.8/}ContributorType"/&gt;
 *         &lt;element name="minor" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="comment" type="{http://www.mediawiki.org/xml/export-0.8/}CommentType" minOccurs="0"/&gt;
 *         &lt;element name="text" type="{http://www.mediawiki.org/xml/export-0.8/}TextType"/&gt;
 *         &lt;element name="sha1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="model" type="{http://www.mediawiki.org/xml/export-0.8/}ContentModelType"/&gt;
 *         &lt;element name="format" type="{http://www.mediawiki.org/xml/export-0.8/}ContentFormatType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RevisionType", propOrder = {
    "id",
    "parentid",
    "timestamp",
    "contributor",
    "minor",
    "comment",
    "text",
    "sha1",
    "model",
    "format"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
public class RevisionType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    protected BigInteger id;
    @XmlSchemaType(name = "positiveInteger")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    protected BigInteger parentid;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    protected XMLGregorianCalendar timestamp;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    protected ContributorType contributor;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    protected Object minor;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    protected CommentType comment;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    protected TextType text;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    protected String sha1;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    protected String model;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    protected String format;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    public void setId(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the parentid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    public BigInteger getParentid() {
        return parentid;
    }

    /**
     * Sets the value of the parentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    public void setParentid(BigInteger value) {
        this.parentid = value;
    }

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
     * Gets the value of the minor property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    public Object getMinor() {
        return minor;
    }

    /**
     * Sets the value of the minor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    public void setMinor(Object value) {
        this.minor = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link CommentType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    public CommentType getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommentType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    public void setComment(CommentType value) {
        this.comment = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    public TextType getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    public void setText(TextType value) {
        this.text = value;
    }

    /**
     * Gets the value of the sha1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    public String getSha1() {
        return sha1;
    }

    /**
     * Sets the value of the sha1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    public void setSha1(String value) {
        this.sha1 = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    public String getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    public void setFormat(String value) {
        this.format = value;
    }

}
