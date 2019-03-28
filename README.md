# Protocoale postei electronic

Serverul utilizat `SMTP`-este un protocol de rețea utilizat pe scară largă, conceput pentru trimiterea de e-mail prin rețelele TCP / IP.

Rezulatul obtinu:
<p> <img src="rezultat.png" align="center" width="500"></p>

La instalarea a doua librarii am putut pe lar utiliza diferite functii care au permis indeplinirea sarcinii propuse
```// Now set the actual message
	       
	         messageBodyPart.setText("Atasez imaginea aici");

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
	         multipart.addBodyPart(messageBodyPart);```


			
	
		
		
		
			
			
    
 
      
