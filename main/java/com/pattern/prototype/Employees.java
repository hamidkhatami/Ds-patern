package main.java.com.pattern.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hamid Khatami (khatami@caspco.ir)
 * @version 1.0 2024.0505
 * @since 1.0
 */
public final class Employees implements  Cloneable{
    private List<String> emps;
    public Employees(){
        emps=new ArrayList<String>();
    }
    public Employees(List<String> emps){
        this.emps=emps;

    }

    public void loadData(){
        emps.add("Pankaj");
        emps.add("Raj");
        emps.add("David");
        emps.add("Lisa");
    }

    public List<String> getEmps(){
        return emps;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> temps=new ArrayList<String>();
        for(String s :this.getEmps()){
            temps.add(s);
        }
        return new Employees(temps);
    }
}
