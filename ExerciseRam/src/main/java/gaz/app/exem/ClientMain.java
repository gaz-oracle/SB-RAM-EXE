package gaz.app.exem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientMain {
    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppCongif.class);

        EmailService emailService = applicationContext.getBean(EmailService.class);
        emailService.sendEmail();
        /** 2º Commit test 11:30 am */
    }
}