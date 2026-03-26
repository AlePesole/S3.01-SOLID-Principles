public class MainExample {
    public static void main(String[] args) {

        Person person = new Person();
        person.setName("John");

        MySql personStorage = new MySql();
        ServicePerson service = new ServicePerson(personStorage);

        service.savePerson(person);
    }
}
