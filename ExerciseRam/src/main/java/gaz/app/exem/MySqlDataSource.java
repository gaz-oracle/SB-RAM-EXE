package gaz.app.exem;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MySqlDataSource implements DataSource{
    @Override
    public String[] getEmails() {

        String [] emails = {"jgaz@correo.com", "fgaz@correo.com", "JohnDoe@gmail.com"};
        return emails;
    }
}
