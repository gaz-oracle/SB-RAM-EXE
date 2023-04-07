package gaz.app.exem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmailService {

    private DataSource dataSource;

    @Autowired
    public EmailService(DataSource dataSoure) {
        this.dataSource = dataSoure;
    }

    void sendEmail(){
        String [] emails = dataSource.getEmails();
        for (String i:emails) {
            System.out.println(i);
        }
    }

}
