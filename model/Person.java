package model;
import java.util.List;

public abstract class Person {
    protected String id;
    protected String name;
    protected String address;
    protected List<String> phones;

    public Person(String id, String name, String address, List<String> phones) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phones = phones;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getAddress() { return address; }
    public List<String> getPhones() { return phones; }
}
