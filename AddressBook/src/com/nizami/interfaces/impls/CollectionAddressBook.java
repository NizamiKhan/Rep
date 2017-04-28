package com.nizami.interfaces.impls;

import com.nizami.interfaces.AddressBook;
import com.nizami.objects.Person;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class CollectionAddressBook implements AddressBook {
    private ObservableList<Person> personList = FXCollections.observableArrayList();

    @Override
    public void add(Person person) {
        personList.add(person);
    }

    @Override
    public void update(Person person) {

    }

    @Override
    public void delete(Person person) {
        personList.remove(person);
    }

    public ObservableList<Person> getPersonList() {
        return personList;
    }

    public void print(){
        int number=0;
        System.out.println();
        for (Person person: personList)
        {
            number++;
            System.out.println(number+") fio = "+person.getFio()+"; phone = "+person.getPhone());
        }
    }

    public void fillTestData() {
        personList.add(new Person("Хангусейнов Низами Махир оглы","89812314113"));
        personList.add(new Person("Паршихин Андрей Алексеевич",   "88005553535"));
        personList.add(new Person("Какой то хер",                 "88915135181"));
        personList.add(new Person("Голубь Автозаводский",         "89113441123"));
        personList.add(new Person("Андрей aka Тихонов",           "88111214623"));
        personList.add(new Person("Препод уебок",                 "88918888534"));
        personList.add(new Person("Обама Барака",                 "88911111222"));
        personList.add(new Person("Папин Бродяга",                "88945223333"));
        personList.add(new Person("Мамин Симпотяга",              "88999924559"));
    }
}
