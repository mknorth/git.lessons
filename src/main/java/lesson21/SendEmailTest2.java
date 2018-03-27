package lesson21;
import homework3.BrowserLogin;
import org.apache.commons.mail.*;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class SendEmailTest2 extends BrowserLogin{

        @Test
        public void emailTest() throws EmailException, MalformedURLException {

            //driver.get("https://pornhub.com");

            URL url = new URL("https://pornhub.com");
            //Email email = new SimpleEmail(); // Create Object
            HtmlEmail email = new HtmlEmail();
            email.setHostName("smtp.googlemail.com"); // Set SMTP hostname
            email.setSmtpPort(465); // Set port
            email.setAuthenticator(new DefaultAuthenticator("kmaukr@gmail.com", "4587393t")); // Set email/password
            email.setSSLOnConnect(true); // SSL true
            email.setFrom("user@gmail.com"); // set FROM
            email.setSubject("TestMail"); // set Subject
            //email.setMsg("This is a test mail ... :-)"); // Set message
           // email.setHtmlMsg(driver.getPageSource());
            String cid = email.embed(url, "Apache logo");
            email.setHtmlMsg(cid);
            email.addTo("trello@onthe.io"); // Set recipients
            email.send(); // Send Email
        }
    }

