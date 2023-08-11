package example.com.api;
import example.com.model.Person;
import example.com.usecase.person.PersonUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {
    
    private final PersonUseCase personUseCase;

    @GetMapping(path = "/path")
    public List<Person> commandName() {
        return personUseCase.create3People();
    }

}
