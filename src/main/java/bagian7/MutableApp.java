package bagian7;

import bagian7.data.Person;

import java.util.List;

public class MutableApp {
    public static void main(String[] args) {

        Person person = new Person("Aera");

        person.addHobby("Writing");
        person.addHobby("Healing");

        for (var hobby : person.getHobbies()) {
            System.out.println(hobby);
        }
    }

    public static void doSomethingWithHobbies(List<String> hobbies) {
        // hobbies.add("Bukan Hobby");
    }
}
