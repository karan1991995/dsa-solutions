
import java.io.File;
import java.util.ArrayList;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class EmailUtil{

    
    public static void sentemailWithreport(String filename, String fromUsername, String fromPwd, String[] listofIDS, String ccUser, String mailSubText, String mailBodyText) throws Exception {
        final String username = fromUsername;
        final String password = fromPwd;
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.debug", "true");
        props.put("mail.smtp.ssl.enable", "false");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "outlook.office365.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.user", username);
        props.put("mail.smtp.password", password);

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromUsername));
            for(String toUser:listofIDS) {
                message.addRecipients(Message.RecipientType.TO,InternetAddress.parse(toUser));
            }
            String subject = "";
            message.setSubject(mailSubText + "_" + subject);
            Multipart multipart = new MimeMultipart();
            MimeBodyPart textBodyPart = new MimeBodyPart();
            MimeBodyPart attachmentPart = new MimeBodyPart();
            textBodyPart.setText(mailBodyText);
             DataSource datasource = new FileDataSource(filename);
             attachmentPart.setDataHandler(new DataHandler(datasource));
            attachmentPart.setFileName("results.json");
            multipart.addBodyPart(textBodyPart);
            multipart.addBodyPart(attachmentPart);
            message.setContent(multipart);
            Transport.send(message);

            System.out.println("Done");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String str[]) throws Exception {
        String[] listofIDS={"Karan.Raju@dfd.com","nishant.bejroi@sdfs.com"};
        sentemailWithreport(System.getProperty("user.dir") + "\\results.json", "myfatesters@outlook.com", "$Testing1", listofIDS, "", "Results of CIS User Execution", "No Email Body for now");
    }

}
