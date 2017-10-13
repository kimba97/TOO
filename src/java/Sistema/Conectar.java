package Sistema;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Conectar {
   
    public DriverManagerDataSource conectar()
    {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost/md12038");
        dataSource.setUsername("md12038");
        dataSource.setPassword("prn315MD12038");
        return dataSource;
        
    }
}
