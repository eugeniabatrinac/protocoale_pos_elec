package com.tutorialspoint;
import java.util.Properties;  
import javax.mail.*;  
import javax.mail.internet.*;  
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;

public class Main {  
	public static void main(String[] args) {

		//completeaza cu detaliile reale de pe gmail-u tau
		final String username = "batrinace@mail.ru";
		final String password = "zubnoi";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.mail.ru");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });

		try {

			// Create a default MimeMessage object.
	         Message message = new MimeMessage(session);

	         // Set From: header field of the header.
	         message.setFrom(new InternetAddress("batrinace@mail.ru"));

	         // Set To: header field of the header.
	         message.setRecipients(Message.RecipientType.TO,
	            InternetAddress.parse("batrinace@mail.ru"));

	         // Set Subject: header field
	         message.setSubject("Laboratorul 4");

	         // Create the message part
	         BodyPart messageBodyPart = new MimeBodyPart();

	         // Now set the actual message
	       
	         messageBodyPart.setText("<html><body><h1 style =\"color:blue;\">Atasez imaginea<h1></body></html>");

	         // Create a multipar message
	         Multipart multipart = new MimeMultipart();

	         // Set text message part
	         multipart.addBodyPart(messageBodyPart);

	         // Part two is attachment
	         messageBodyPart = new MimeBodyPart();
	         String filename = System.getProperty("user.dir") + "\\src\\test1\\img.jpg";
	         DataSource source = new FileDataSource(filename);
	         messageBodyPart.setDataHandler(new DataHandler(source));
	         messageBodyPart.setFileName(filename);
	         multipart.addBodyPart(messageBodyPart);

	         // Send the complete message parts
	         message.setContent(multipart);

	         // Send message
	         Transport.send(message);

	         System.out.println("Mesajul trimis cu succes....");
	  

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
}