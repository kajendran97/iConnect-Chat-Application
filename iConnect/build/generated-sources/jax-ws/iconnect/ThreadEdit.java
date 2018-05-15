
package iconnect;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for threadEdit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="threadEdit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="thread" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="editedTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="editedUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "threadEdit", propOrder = {
    "thread",
    "message",
    "editedTime",
    "editedUser"
})
public class ThreadEdit {

    protected int thread;
    protected String message;
    protected String editedTime;
    protected String editedUser;

    /**
     * Gets the value of the thread property.
     * 
     */
    public int getThread() {
        return thread;
    }

    /**
     * Sets the value of the thread property.
     * 
     */
    public void setThread(int value) {
        this.thread = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the editedTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditedTime() {
        return editedTime;
    }

    /**
     * Sets the value of the editedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditedTime(String value) {
        this.editedTime = value;
    }

    /**
     * Gets the value of the editedUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditedUser() {
        return editedUser;
    }

    /**
     * Sets the value of the editedUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditedUser(String value) {
        this.editedUser = value;
    }

}
