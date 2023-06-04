package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * create by shuklash on 04/06/23
 */
@Component
public class SingletonBean {

    public SingletonBean() {
        System.out.println("Creating Singleton Bean");
    }

    public String getMyScope(){
        return "I'm SingletonBean";
    }
}
