package pl.javastart.lekcja22springmail;

import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailSevice {

    //spring tworząc controler automatycznie podepnie mi mail sender za pomocą construktora
    //trzeba dodac dependencje
//     <dependency>
//            <groupId>org.springframework.boot</groupId>
//            <artifactId>spring-boot-starter-mail</artifactId>
//     </dependency>

    private JavaMailSender javaMailSender;

    public MailSevice(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public void sendMail(String odbiorca, String tytulWiadomosci, String trescWiadomosci) {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom("fff@gmail.com");
        mailMessage.setTo(odbiorca);
        mailMessage.setSubject(tytulWiadomosci);
        mailMessage.setText(trescWiadomosci);

        javaMailSender.send(mailMessage);
    }
}
