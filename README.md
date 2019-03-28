# Protocoale postei electronic

Serverul utilizat `SMTP`-este un protocol de rețea utilizat pe scară largă, conceput pentru trimiterea de e-mail prin rețelele TCP / IP.

Rezulatul obtinu:
<p> <img src="Screenshot_2.png" align="center" width="500"></p>

La instalarea a doua librarii am putut pe lar utiliza diferite functii care au permis indeplinirea sarcinii propuse
```Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("batrinace@mail.ru"));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse("batrinace@mail.ru"));
			message.setSubject("Laboratorul 4");
			message.setText("Primul meu mesaj,"
				+ "\n\n Fara spam!");

			Transport.send(message);```
			
			Rezultatul obtinut :


			
	
		
		
		
			
			
    
 
      
