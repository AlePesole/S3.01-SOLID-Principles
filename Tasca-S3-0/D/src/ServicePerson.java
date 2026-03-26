public class ServicePerson{
    private PersonStorage personStorage;

    public ServicePerson(PersonStorage personStorage) {
        this.personStorage = personStorage;
    }

    public void savePerson(Person person) {
        personStorage.savePerson(person);
    }
}