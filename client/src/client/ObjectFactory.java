
package client;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client package. 
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
    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SendEmail }
     * 
     */
    public SendEmail createSendEmail() {
        return new SendEmail();
    }

    /**
     * Create an instance of {@link SendEmailResponse }
     * 
     */
    public SendEmailResponse createSendEmailResponse() {
        return new SendEmailResponse();
    }

    /**
     * Create an instance of {@link ValidateEmailAddressResponse }
     * 
     */
    public ValidateEmailAddressResponse createValidateEmailAddressResponse() {
        return new ValidateEmailAddressResponse();
    }

    /**
     * Create an instance of {@link ValidateEmailAddress }
     * 
     */
    public ValidateEmailAddress createValidateEmailAddress() {
        return new ValidateEmailAddress();
    }

    /**
     * Create an instance of {@link SendEmailBatchResponse }
     * 
     */
    public SendEmailBatchResponse createSendEmailBatchResponse() {
        return new SendEmailBatchResponse();
    }

    /**
     * Create an instance of {@link SendEmailBatch }
     * 
     */
    public SendEmailBatch createSendEmailBatch() {
        return new SendEmailBatch();
    }

}
