package com.tutorialspoint;
import java.util.Properties;  
import javax.mail.*;  
import javax.mail.internet.*;  
  
public class Main {  
	public static void main(String[] args) {

		//completeaza cu detaliile reale de pe gmail-u tau
		final String username = "batrinace@mail.ru";
		final String password = "******";

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

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("batrinace@mail.ru"));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse("batrinace@mail.ru"));
			message.setSubject("Laboratorul 4");
			message.setText("Primul meu mesaj,"
				+ "\n\n Fara spam!");

			Transport.send(message);

			System.out.println("Done");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
}
