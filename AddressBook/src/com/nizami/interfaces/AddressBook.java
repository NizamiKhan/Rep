package com.nizami.interfaces;

import com.nizami.objects.Person;

public interface AddressBook {
    void add(Person person);
    void update(Person person);
    void delete(Person person);
}
