package person;

public class Person {
    final long id;
    private String name;


    public Person(long id, String name) {
        this.id = id;
        this.name = name;
    }

    //GETTERS & SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    //tO String

    @Override
    public String toString() {
        return "person.Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
