package example.com.config;

import example.com.usecase.person.PersonUseCase;
import example.com.usecase.person.PersonUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCasesConfig {

        @Bean
        public PersonUseCase test() {
                return new PersonUseCaseImpl();
        }

}
