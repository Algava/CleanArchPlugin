package example.com.usecase.person;

import example.com.model.Person;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class PersonUseCaseImpl implements PersonUseCase {

    @Override
    public List<Person> create3People() {
        var persona1 = new Person("Alejandro 1", "Phone 1");

        var persona2 = new Person();
        persona2.setName("Alejandro 2");
        persona2.setPhone("Phone 2");

        var persona3 = Person.builder().name("Alejandro AAAAAAAAAAAAAAAAAAAA").phone("Phone 3").build();

        return List.of(persona1, persona2, persona3);
    }

}
