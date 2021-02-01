package pl.javastart.lekcja22springmail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Lekcja22SpringMailApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(Lekcja22SpringMailApplication.class, args);
        //przypisujemy run do zmiennej context

        MailSevice mailService = context.getBean(MailSevice.class); //pobieramy beana mail services, do zarządzania mailem

        mailService.sendMail("jakisemojmail@byom.de", "Tytuł Ważna wiadomość", "treść wiadomosci");
        //ustawiamy też aplication.properties w resources lub w prop.yml
        //potrzebna jest też skrzynka testowa z której będziemy wysyłać
    }

}
