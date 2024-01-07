public class App {
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder("Cat", "KMITL")
            .Age(100)
            .build();
        System.out.println(person);
    }
    
}
