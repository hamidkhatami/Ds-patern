package main.java.com;

import main.java.com.pattern.composite.Circle;
import main.java.com.pattern.composite.Drawing;
import main.java.com.pattern.composite.Shape;
import main.java.com.pattern.composite.Triangle;
import main.java.com.pattern.criteria.Criteria;
import main.java.com.pattern.criteria.FemaleFilter;
import main.java.com.pattern.criteria.Person;
import main.java.com.pattern.facade.HelperFacade;
import main.java.com.pattern.facade.MySqlHelper;
import main.java.com.pattern.facade.OracleHelper;
import main.java.com.pattern.prototype.Employees;
import main.java.com.pattern.singletone.*;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main3(String[] args) {
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

        System.out.println();
        System.out.println("--------------Inner class helper------------------");
        System.out.println();

        InnerClassHelperSingleton innerClassHelperSingleton = InnerClassHelperSingleton.instance();
        innerClassHelperSingleton.hello();

        System.out.println();
        System.out.println("--------------Enum------------------");
        System.out.println();

        EnumSingleton.INSTANCE.hello();
    }

    public static void main2(String[] args) {
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

    public static void main21(String[] args) {
        String tableName = "Employee";

        //generating MySql HTML report and Oracle PDF report without using Facade
        Connection con = MySqlHelper.getMySqlDBConnection();
        MySqlHelper mySqlHelper = new MySqlHelper();
        mySqlHelper.generateMySqlHTMLReport(tableName, con);

        Connection con1 = OracleHelper.getOracleDBConnection();
        OracleHelper oracleHelper = new OracleHelper();
        oracleHelper.generateOraclePDFReport(tableName, con1);

        //generating MySql HTML report and Oracle PDF report using Facade
        HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.HTML, tableName);
        HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE, HelperFacade.ReportTypes.PDF, tableName);

    }

    public static void main32(String[] args) throws CloneNotSupportedException {
        Employees emps = new Employees();
        emps.loadData();

        //Use the clone method to get the Employee object
        Employees empsNew = (Employees) emps.clone();
        Employees empsNew1 = (Employees) emps.clone();

        List<String> empsCloneAdd = empsNew.getEmps();
        empsCloneAdd.add("john");


        List<String> empsCloneRem = empsNew1.getEmps();
        empsCloneRem.remove("Pankaj");

        System.out.println("emps List: " + emps.getEmps());
        System.out.println("empsNew List: " + empsCloneAdd);
        System.out.println("empsNew1 List: " + empsCloneRem);

    }

    public static void main(String[] args) {
        Shape tri = new Triangle();
                Shape tri1 = new Triangle();
                Shape cir = new Circle();

                Drawing drawing = new Drawing();
                drawing.add(tri1);
                drawing.add(tri1);
                drawing.add(cir);

                drawing.draw("Red");

                drawing.clear();
                drawing.add(tri);
                drawing.add(cir);
                drawing.draw("Green");

    }
}
