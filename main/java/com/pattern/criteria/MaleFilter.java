package main.java.com.pattern.criteria;

import java.util.ArrayList;
import java.util.List;

public class MaleFilter implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> males = new ArrayList<>();
        for (Person item : persons) {
            if (item.getGender().equals("male"))
                males.add(item);
        }
        return males;
    }
}
