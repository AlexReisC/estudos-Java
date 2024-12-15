package implementacoes.Testes.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import implementacoes.Testes.dominio.Person;
import implementacoes.Testes.service.PersonService;

public class PersonServiceTest01 {
    private static final Logger log = LogManager.getLogger(PersonServiceTest01.class);
    public static void main(String[] args) {
        Person person = new Person(15);
        PersonService personService = new PersonService();
        log.info("Is Adult ? {}", personService.isAdult(person));
    }
}
