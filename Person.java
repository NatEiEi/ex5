public class Person {
    private String Name;
    private String University;
    private int Age;

    public Person(PersonBuilder personBuilder) {
        this.Name = personBuilder.Name;
        this.University = personBuilder.University;
        this.Age = personBuilder.Age;
    }

    public static class PersonBuilder {
        private String Name;
        private String University;
        private int Age;
        
        public PersonBuilder(String Name, String University) {
            this.Name = Name;
            this.University = University;
        }
        public PersonBuilder Age(int Age) {
            this.Age = Age;
            return this;
        }
    
        public Person build()
        {
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name : " + Name + "\n").append("University : " + University + "\n");
        if (this.Age != 0) sb.append("Age : " + Age);
        return sb.toString();
    }
}
