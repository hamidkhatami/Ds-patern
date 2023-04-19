package main.java.com.pattern.criteria;

import java.util.ArrayList;
import java.util.List;

public class FemaleFilter implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> females = new ArrayList<>();
        for (Person item : persons) {
            if (item.getGender().equals("female"))
            females.add(item);
        }
        return females;
    }
}
