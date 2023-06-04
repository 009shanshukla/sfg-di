package guru.springframework.sfgdi.repositories;

/**
 * create by shuklash on 04/06/23
 */
public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
