package HomeWork_1;

public class Main {
    public static void main(String[] args) {
//        Employee employee = new Employee();
//        Employee.outToConsole(employee);
//        employee.printToConsole();

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Артуров Артур", "Босс", "AA@mail.org", "87897897878", 100000, 20);
        employees[1] = new Employee("Борисов Борис", "Зам. Директора", "BB@mail.org", "865151565165", 70000, 45);
        employees[2] = new Employee("Валентинов Валентин", "Бухгалтер", "VV@mail.org", "89898244924", 50000, 41);
        employees[3] = new Employee("Георгиев Георгий", "Бригадир", "GG@mail.org", "849829828298", 30000, 37);
        employees[4] = new Employee("Дмитров Дмитрий", "Работяга", "DD@mail.org", "845782822828", 13567.26, 26);
        employeesOverIsAge(40,employees);
    }

    private static void employeesOverIsAge(int age, Employee[] employees) {
        for (Employee employee : employees) {
            if (employee.getAge() > 40) employee.printToConsole();
        }
    }
}
