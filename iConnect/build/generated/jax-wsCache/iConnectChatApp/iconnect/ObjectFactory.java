
package iconnect;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the iconnect package. 
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

    private final static QName _Hello_QNAME = new QName("http://iConnect.com/", "hello");
    private final static QName _LoginUI_QNAME = new QName("http://iConnect.com/", "loginUI");
    private final static QName _SignUp_QNAME = new QName("http://iConnect.com/", "signUp");
    private final static QName _ThreadCreate_QNAME = new QName("http://iConnect.com/", "threadCreate");
    private final static QName _ThreadEdit_QNAME = new QName("http://iConnect.com/", "threadEdit");
    private final static QName _LoginUIResponse_QNAME = new QName("http://iConnect.com/", "loginUIResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://iConnect.com/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: iconnect
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ThreadCreate }
     * 
     */
    public ThreadCreate createThreadCreate() {
        return new ThreadCreate();
    }

    /**
     * Create an instance of {@link LoginUIResponse }
     * 
     */
    public LoginUIResponse createLoginUIResponse() {
        return new LoginUIResponse();
    }

    /**
     * Create an instance of {@link ThreadEdit }
     * 
     */
    public ThreadEdit createThreadEdit() {
        return new ThreadEdit();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link LoginUI }
     * 
     */
    public LoginUI createLoginUI() {
        return new LoginUI();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link SignUp }
     * 
     */
    public SignUp createSignUp() {
        return new SignUp();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iConnect.com/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginUI }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iConnect.com/", name = "loginUI")
    public JAXBElement<LoginUI> createLoginUI(LoginUI value) {
        return new JAXBElement<LoginUI>(_LoginUI_QNAME, LoginUI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignUp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iConnect.com/", name = "signUp")
    public JAXBElement<SignUp> createSignUp(SignUp value) {
        return new JAXBElement<SignUp>(_SignUp_QNAME, SignUp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThreadCreate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iConnect.com/", name = "threadCreate")
    public JAXBElement<ThreadCreate> createThreadCreate(ThreadCreate value) {
        return new JAXBElement<ThreadCreate>(_ThreadCreate_QNAME, ThreadCreate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThreadEdit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iConnect.com/", name = "threadEdit")
    public JAXBElement<ThreadEdit> createThreadEdit(ThreadEdit value) {
        return new JAXBElement<ThreadEdit>(_ThreadEdit_QNAME, ThreadEdit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginUIResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iConnect.com/", name = "loginUIResponse")
    public JAXBElement<LoginUIResponse> createLoginUIResponse(LoginUIResponse value) {
        return new JAXBElement<LoginUIResponse>(_LoginUIResponse_QNAME, LoginUIResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iConnect.com/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}
