package ru.netology;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;
    public boolean infoAge = false;
    private boolean infoAddress = false;


    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public boolean hasAge() {
        if( age != 0) {
             infoAge = true;
        }
        return infoAge;
    }

    public boolean hasAddress() {
        if ( address != null) {
            infoAddress = true;
        }
        return infoAddress;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        age++;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(surname)
                .setAddress(address);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", Address='" + address + '\'' +
                '}';
    }
}
