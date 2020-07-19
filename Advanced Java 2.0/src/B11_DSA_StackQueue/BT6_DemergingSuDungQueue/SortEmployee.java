package B11_DSA_StackQueue.BT6_DemergingSuDungQueue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.Queue;

public class SortEmployee {

    public static void main(String[] args) throws ParseException {
        Employee[] employees = {
                new Employee(1, new SimpleDateFormat("dd/MM/yyyy").parse("15/09/1988")),
                new Employee(0, new SimpleDateFormat("dd/MM/yyyy").parse("01/01/1991")),
                new Employee(1, new SimpleDateFormat("dd/MM/yyyy").parse("24/01/1993")),
                new Employee(1, new SimpleDateFormat("dd/MM/yyyy").parse("30/01/1993")),
                new Employee(0, new SimpleDateFormat("dd/MM/yyyy").parse("23/04/1996")),
                new Employee(0, new SimpleDateFormat("dd/MM/yyyy").parse("25/02/2000")),
        };

        Queue<Employee> queueWoman = new LinkedList<Employee>();
        Queue<Employee> queueMan = new LinkedList<Employee>();

        for (Employee e : employees) {
            if (e.getGender() == 0) {
                queueWoman.offer(e);
            } else {
                queueMan.offer(e);
            }
        }

        int employeeIndex = 0;

        while (!queueWoman.isEmpty()) {
            employees[employeeIndex++] = queueWoman.poll();
        }

        while (!queueMan.isEmpty()) {
            employees[employeeIndex++] = queueMan.poll();
        }

        System.out.println("Result: ");
        for (Employee e : employees) {
            System.out.println(e.toString());
        }
    }
}
