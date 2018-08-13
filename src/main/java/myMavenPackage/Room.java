package myMavenPackage;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private List<Person> persons = new ArrayList<Person>();

    public boolean settlePerson(Person person) {
        if (persons.size() == 4) {
            return false;
        }
        persons.add(person);
        return true;
    }

    public List<Person> getPersons() {
        return persons;
    }
    @Override
    public String toString(){
        String result = " ";
        for (Person person : persons){
            result += " "+ person.getName();
        }
        return result;
    }

    public Person removePerson(String name) {
        //...
        return null;
    }

    public Person removePerson(Person person) {
        //...
        return null;
    }

    public void increaseRoomSize(int newSize) {
        //...
    }

}
