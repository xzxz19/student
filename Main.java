import java.util.*;

public class Main {

    public static void main(String[] args) {
        Employee emp1 = new Employee("John", "Lennon", "Manager", 27045.78);
        Employee emp2 = new Employee("George", "Harrison", "Developer", 50000.00);

        Student stu1 = new Student("Ringo", "Starr", 2.5);
        Student stu2 = new Student("Paul", "McCartney", 3.5);

        List<Person> people = new ArrayList<>();
        people.add(emp1);
        people.add(emp2);
        people.add(stu1);
        people.add(stu2);

        Collections.sort(people);

        printData(people);
    }

    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.printf("%s earns %.2f tenge\n", person.toString(), person.getPaymentAmount());
        }
    }
}