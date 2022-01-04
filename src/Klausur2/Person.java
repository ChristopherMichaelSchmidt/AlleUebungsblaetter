package Klausur2;

import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private char gender;
    private int age;
    private String country;
    private double salary;
    private String eyeColor;
    private int weight;
    private int size;


    public Person(String firstName, String lastName, char gender, int age, String country, double salary, String eyeColor, int weight, int size) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.country = country;
        this.salary = salary;
        switch(eyeColor){
            case "braun": this.eyeColor = "braun";
            break;
            case "blaue": this.eyeColor = "blau";
            break;
            case "grün": this.eyeColor = "grün";
            break;
            default: this.eyeColor = "undefiniert";

        }
        this.weight = weight;
        this.size = size;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", salary=" + salary +
                ", eyeColor='" + eyeColor + '\'' +
                ", weight=" + weight +
                ", size=" + size +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return gender == person.gender && age == person.age && Double.compare(person.salary, salary) == 0 && weight == person.weight && size == person.size && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(country, person.country) && Objects.equals(eyeColor, person.eyeColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, gender, age, country, salary, eyeColor, weight, size);
    }
}
