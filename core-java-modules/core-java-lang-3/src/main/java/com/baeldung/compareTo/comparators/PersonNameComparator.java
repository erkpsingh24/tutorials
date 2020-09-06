package com.baeldung.compareTo.comparators;

import java.util.Comparator;

import com.baeldung.compareTo.model.Person;

public class PersonNameComparator implements Comparator<Person> {
    public int compare(Person one, Person two) {
        return one.getName().compareTo(two.getName());
    }
}