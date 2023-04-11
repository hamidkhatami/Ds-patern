package main.java.com;

import main.java.com.pattern.Criteria;
import main.java.com.pattern.FemaleFilter;
import main.java.com.pattern.Person;
import main.java.com.singletone.LazySingletonInstance;
import main.java.com.singletone.MemoryUseSingletonInstance;
import main.java.com.singletone.SerializeSingleton;
import main.java.com.singletone.SingletonInstance;
import main.java.com.singletone.StaticBlockInstance;
import main.java.com.singletone.ThreadSafeSingletonInstance;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void SingletonMain(String[] args) {
        SingletonInstance singletonInstance = SingletonInstance.mySingleton();
        singletonInstance.hello();

        System.out.println("-------------Simple -------------------");
        System.out.println("              ");

        StaticBlockInstance staticBlockInstance = StaticBlockInstance.instance();
        staticBlockInstance.hello();

        System.out.println("--------------Lazy ------------------");
        System.out.println("              ");

        LazySingletonInstance lazySingletonInstance = LazySingletonInstance.instance();
        lazySingletonInstance.hello();

        System.out.println("---------------Thread Safe-----------------");
        System.out.println("              ");

        ThreadSafeSingletonInstance threadSafeSingletonInstance = ThreadSafeSingletonInstance.instance();
        threadSafeSingletonInstance.hello();

        System.out.println("---------------Best Memory Usage-----------------");
        System.out.println("              ");

        MemoryUseSingletonInstance memoryUseSingletonInstance = MemoryUseSingletonInstance.myInstance();
        memoryUseSingletonInstance.hello();

        System.out.println();
        System.out.println("--------------Serials------------------");
        System.out.println();

        SerializeSingleton serializeSingleton = SerializeSingleton.myInstance();
        serializeSingleton.hello();


    }

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        Person p1 = new Person("hamid", "khatami", "male");
        Person p2 = new Person("soheil", "jahangiri", "male");
        Person p3 = new Person("tabtasom", "safari", "female");
        Person p4 = new Person("shirin", "iback", "female");
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);

        Criteria femaleFilter = new FemaleFilter();
        List<Person> selectedFemales = femaleFilter.meetCriteria(persons);

        selectedFemales.forEach(x -> {
                    System.out.println("-Name: " + x.getName() + "- Family : " + x.getFamily() + "- Gender : " + x.getGender());
                }
        );

    }
}
