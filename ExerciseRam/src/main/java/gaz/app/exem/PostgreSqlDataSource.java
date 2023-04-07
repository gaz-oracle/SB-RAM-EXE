package gaz.app.exem;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PostgreSqlDataSource implements DataSource {
    @Override
    public String[] getEmails() {

        String [] emails = {"jgaz@correoP.com", "fgaz@correoP.com", "JohnDoe@gmail.comP"};
        return emails;
    }
}
