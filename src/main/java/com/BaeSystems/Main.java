package com.BaeSystems;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /*List<String> stringList = new ArrayList<>();
        stringList.add("jeden");
        stringList.add("dwa");
        stringList.add("trzy");

        stringList.size();
        stringList.isEmpty();
        stringList.remove(2);
        stringList.get(1);
*/
        Person person = new Person("Jan","Kowalski",1);
        Person person2 = new Person("Piotr","Piechocki",2);

        List<Person> personList = new ArrayList<Person>();
        personList.add(person);
        personList.add(person2);

        for(Person p: personList){
            System.out.println(p.getName()+ " " + p.getLastName());
        }

    }
}
