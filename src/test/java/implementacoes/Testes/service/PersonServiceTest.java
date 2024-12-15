package implementacoes.Testes.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import implementacoes.Testes.dominio.Person;

public class PersonServiceTest {
    private Person adult;
    private Person notAdult;
    private PersonService personService;
    @BeforeEach
    public void setUp(){
        adult = new Person(18);
        notAdult = new Person(15);
        personService = new PersonService();
    }
    @Test
    @DisplayName("A person should be not adult when age is lower than 18")
    void IsAdult_ReturnFalse_WhenAgeIsLowerThan18() {
        //Assertions.assertEquals(false, perpersonsonService.isAdult(person));
        //assertEquals(false, personService.isAdult(person));
        assertFalse(personService.isAdult(notAdult));
    }
    
    @Test
    @DisplayName("A person should be not adult when age is greater or equal than 18")
    void IsAdult_ReturnTrue_WhenAgeIsgreaterOrEqualsThan18() {
        assertTrue(personService.isAdult(adult));
    } 
    
    @Test
    @DisplayName("Should throw NullPointerException with message when person is null")
    void IsAdult_ShouldThrowException_WhenPersonIsNull() {
        Assertions.assertThrows(IllegalArgumentException.class, 
            () -> personService.isAdult(null), "Person can't be null");
    }
    
    @Test
    @DisplayName("Should throw NullPointerException with message when person is null")
    void filtRemovingNotAdult_ReturnListWithAdultOnly_WhenListOfPersonWithAdultIsPassed() {
        Person person1 = new Person(17);
        Person person2 = new Person(18);
        Person person3 = new Person(21);
        List<Person> personList = List.of(person1, person2, person3);
        Assertions.assertEquals(2, personService.filtRemovingNotAdult(personList).size());
    }
}
