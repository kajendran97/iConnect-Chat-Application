
package iconnect;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for threadCreate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="threadCreate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="titleThread" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastEditedTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="editedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "threadCreate", propOrder = {
    "titleThread",
    "lastEditedTime",
    "editedBy"
})
public class ThreadCreate {

    protected String titleThread;
    protected String lastEditedTime;
    protected String editedBy;

    /**
     * Gets the value of the titleThread property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleThread() {
        return titleThread;
    }

    /**
     * Sets the value of the titleThread property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleThread(String value) {
        this.titleThread = value;
    }

    /**
     * Gets the value of the lastEditedTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastEditedTime() {
        return lastEditedTime;
    }

    /**
     * Sets the value of the lastEditedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastEditedTime(String value) {
        this.lastEditedTime = value;
    }

    /**
     * Gets the value of the editedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditedBy() {
        return editedBy;
    }

    /**
     * Sets the value of the editedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditedBy(String value) {
        this.editedBy = value;
    }

}
