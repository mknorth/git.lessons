package lesson21;

import homework3.BrowserLogin;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

import java.net.MalformedURLException;
import java.net.URL;
import org.apache.commons.mail.HtmlEmail;
import org.testng.annotations.Test;

public class SendEmailExample extends BrowserLogin{


    @Test
    public void setPorn() throws EmailException, MalformedURLException {

            driver.get("https://pornhub.com");


        // Create the email message
        HtmlEmail email = new HtmlEmail();
        email.setHostName("mail.myserver.com");
        email.addTo("kmaukr@gmail.com", "John Doe");
        email.setFrom("PornForYou@apache.org", "Me");
        email.setSubject("Test email with inline image");



            // set the html message
        email.setHtmlMsg(driver.getPageSource());



        // send the email
        email.send();
    }
}
