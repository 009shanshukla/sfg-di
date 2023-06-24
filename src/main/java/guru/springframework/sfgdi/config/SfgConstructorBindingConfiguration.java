package guru.springframework.sfgdi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

/**
 * create by shuklash on 19/06/23
 */
@ConstructorBinding
@ConfigurationProperties("shukla")
public class SfgConstructorBindingConfiguration {
    private String user;
    private String password;
    private String jdbcurl;

    public SfgConstructorBindingConfiguration(String user, String password, String jdbcurl) {
        this.user = user;
        this.password = password;
        this.jdbcurl = jdbcurl;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getJdbcurl() {
        return jdbcurl;
    }
}
