package email_rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
	
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.commons.net.smtp.SMTPClient;
import org.apache.commons.net.smtp.SMTPReply;
import org.xbill.DNS.Lookup;
import org.xbill.DNS.Record;
import org.xbill.DNS.Type;

@Path("/email_restService")
public class email_rest {
	@GET
    @Path("/sendEmail")
    @Produces(MediaType.TEXT_PLAIN)
	public void sendEmail(@QueryParam("url") String _url,@QueryParam("payload") String _payload) 
    {
    	String ALIDM_SMTP_HOST = "smtpdm.aliyun.com";
        String ALIDM_SMTP_PORT = "25";
        final Properties props= new Properties();
    	props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.host", ALIDM_SMTP_HOST);
        props.put("mail.smtp.port", ALIDM_SMTP_PORT);
        props.put("mail.user", "zca@zhouca.work");

      
        props.put("mail.password", "544219ZCAzca");
        Authenticator authenticator = new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                String userName = props.getProperty("mail.user");
                String password = props.getProperty("mail.password");
                return new PasswordAuthentication(userName, password);
            }
        };
        Session mailSession = Session.getInstance(props, authenticator);
        
        MimeMessage message = new MimeMessage(mailSession){
        };
    	
        try 
        {
            InternetAddress from = new InternetAddress("zca@zhouca.work", "zca");
            message.setFrom(from);
     
            InternetAddress to = new InternetAddress(_url);
            message.setRecipient(MimeMessage.RecipientType.TO, to);
            message.setSubject("≤‚ ‘” º˛");

            message.setContent(_payload, "text/html;charset=UTF-8");
            Transport.send(message);
        }
        catch (MessagingException | UnsupportedEncodingException e) 
        {
            String err = e.getMessage();
            System.out.println(err);
        }
    }
	@GET
    @Path("/sendEmailBatch")
    @Produces(MediaType.TEXT_PLAIN)
    public void sendEmailBatch(@QueryParam("url") String url,@QueryParam("payload") String _payload) 
    {
    	String ALIDM_SMTP_HOST = "smtpdm.aliyun.com";
        String ALIDM_SMTP_PORT = "25";
        Properties props= new Properties();
    	props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.host", ALIDM_SMTP_HOST);
        props.put("mail.smtp.port", ALIDM_SMTP_PORT);
        props.put("mail.user", "zca@zhouca.work");


        props.put("mail.password", "544219ZCAzca");
        Authenticator authenticator = new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                String userName = props.getProperty("mail.user");
                String password = props.getProperty("mail.password");
                return new PasswordAuthentication(userName, password);
            }
        };
        Session mailSession = Session.getInstance(props, authenticator);

        MimeMessage message = new MimeMessage(mailSession){
        };
    	
        try 
        {
        	InternetAddress from = new InternetAddress("zca@zhouca.work", "zca");
            message.setFrom(from);
            String[] url1= url.split(",");
            int s=url1.length;
            InternetAddress[] adds = new InternetAddress[url1.length];
            for(int i=0;i<url1.length;i++)
            {
            	adds[i] = new InternetAddress(url1[i]);
            }
            message.setRecipients(Message.RecipientType.TO, adds);
            
            message.setSubject("≤‚ ‘” º˛");

            message.setContent(_payload, "text/html;charset=UTF-8");
            Transport.send(message);
        }
        catch (MessagingException | UnsupportedEncodingException e) 
        {
            String err = e.getMessage();
            System.out.println(err);
        }
    }
	@GET
    @Path("/validateEmailAddress")
    @Produces(MediaType.TEXT_PLAIN)
    public String validateEmailAddress(@QueryParam("url")String _url)
    {
    	if (!_url.matches("[\\w\\.\\-]+@([\\w\\-]+\\.)+[\\w\\-]+")) {
            return "N";
        }
        String host = "";
        String hostName = _url.split("@")[1];
        Record[] result = null;
        SMTPClient client = new SMTPClient();
        try {
 
            Lookup lookup = new Lookup(hostName, Type.MX);
            lookup.run();
            if (lookup.getResult() != Lookup.SUCCESSFUL) {
                return "N";
            } else {
                result = lookup.getAnswers();
            }
 
            for (int i = 0; i < result.length; i++) {
                host = result[i].getAdditionalName().toString();
                client.connect(host);
                if (!SMTPReply.isPositiveCompletion(client.getReplyCode())) {
                    client.disconnect();
                    continue;
                } else {
                    break;
                }
            }
            
            client.login("qq.com");
            client.setSender("1940245929@qq.com");
            client.addRecipient(_url);
            if (250 == client.getReplyCode()) {
                return "Y";
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                client.disconnect();
            } catch (IOException e) {
            }
        }
        return "N";
    }
}
