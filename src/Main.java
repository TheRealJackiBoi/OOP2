import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();

        Student jack = new Student("Jack", new ArrayList<String>(Arrays.asList("Java 1.0", "Danish")));
        Student sander = new Student("Sander", new ArrayList<String>(Collections.singleton("Java 1.0")));
        Student julius = new Student("Julius", new ArrayList<String>(Collections.singleton("Math")));

        persons.add(jack);
        persons.add(sander);
        persons.add(julius);

        Teacher claus = new Teacher("Claus", new ArrayList<String>(Arrays.asList("Java 1.0", "Music")));
        Teacher sine = new Teacher("Sine", new ArrayList<String>(Collections.singleton("Danish")));
        Teacher kurt = new Teacher("Kurt", new ArrayList<String>(Arrays.asList("Java 1.0", "Danish")));

        persons.add(claus);
        persons.add(sine);
        persons.add(kurt);

        for (Person p :
                persons) {
            boolean isPos = p.addCourse("Java 1.0");
            if (!isPos) {
                if(p instanceof Student) {
                    System.out.println(p.getName() + " har allerede bestået dette kursus");
                } else {
                    System.out.println(p.getName() + " kan ikke undervise i dette fag");
                }
            }
        }
    }
}