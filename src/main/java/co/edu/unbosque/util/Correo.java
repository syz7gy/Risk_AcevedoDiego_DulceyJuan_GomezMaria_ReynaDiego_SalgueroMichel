package co.edu.unbosque.util;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Correo {

	private static String origen = "riskjuegosonline@gmail.com";
	private static String contra = "drgkohgbzonqtynk";
	private Properties p;

	public Correo() {
		p = new Properties();
	}
/*

 */
	private void configuracion() {
		p.put("mail.smtp.host", "smtp.gmail.com");
		p.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		p.setProperty("mail.smtp.starttls.enable", "true");
		p.setProperty("mail.smtp.port", "587");
		p.setProperty("mail.smtp.user", origen);
		p.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
		p.setProperty("mail.smtp.auth", "true");
	}

	public void envioDeMensajes(String destino, String asunto, String txt) {
		configuracion();
		Session s = Session.getDefaultInstance(p);
		MimeMessage messaje = new MimeMessage(s);
		try {

			messaje.setFrom(new InternetAddress(origen));

			messaje.setRecipient(Message.RecipientType.TO, new InternetAddress(destino));

			messaje.setSubject(asunto);

			messaje.setText(txt, "ISO-8859-1", "html");
		} catch (AddressException e) {
			Logger.getLogger(Correo.class.getName()).log(Level.SEVERE, null, e);
		} catch (MessagingException e) {
			Logger.getLogger(Correo.class.getName()).log(Level.SEVERE, null, e);
		}
		try {

			Transport t = s.getTransport("smtp");
			t.connect(origen, contra);
			t.sendMessage(messaje, messaje.getRecipients(Message.RecipientType.TO));
			t.close();
		} catch (NoSuchProviderException e) {
			Logger.getLogger(Correo.class.getName()).log(Level.SEVERE, null, e);
		} catch (MessagingException e) {
			Logger.getLogger(Correo.class.getName()).log(Level.SEVERE, null, e);
		}
	}
}