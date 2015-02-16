//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.16 at 08:30:51 PM EET 
//


package fi.eonwe.wikilinks.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MediaWikiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MediaWikiType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="siteinfo" type="{http://www.mediawiki.org/xml/export-0.8/}SiteInfoType" minOccurs="0"/&gt;
 *         &lt;element name="page" type="{http://www.mediawiki.org/xml/export-0.8/}PageType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="logitem" type="{http://www.mediawiki.org/xml/export-0.8/}LogItemType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang use="required""/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MediaWikiType", propOrder = {
    "siteinfo",
    "page",
    "logitem"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
public class MediaWikiType {

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    protected SiteInfoType siteinfo;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    protected List<PageType> page;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    protected List<LogItemType> logitem;
    @XmlAttribute(name = "version", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    protected String version;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    protected String lang;

    /**
     * Gets the value of the siteinfo property.
     * 
     * @return
     *     possible object is
     *     {@link SiteInfoType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    public SiteInfoType getSiteinfo() {
        return siteinfo;
    }

    /**
     * Sets the value of the siteinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteInfoType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    public void setSiteinfo(SiteInfoType value) {
        this.siteinfo = value;
    }

    /**
     * Gets the value of the page property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the page property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PageType }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    public List<PageType> getPage() {
        if (page == null) {
            page = new ArrayList<PageType>();
        }
        return this.page;
    }

    /**
     * Gets the value of the logitem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the logitem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLogitem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LogItemType }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    public List<LogItemType> getLogitem() {
        if (logitem == null) {
            logitem = new ArrayList<LogItemType>();
        }
        return this.logitem;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-02-16T08:30:51+02:00", comments = "JAXB RI v2.2.11")
    public void setLang(String value) {
        this.lang = value;
    }

}
