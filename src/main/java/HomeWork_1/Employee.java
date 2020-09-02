package HomeWork_1;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phoneNum;
    private double salary;
    private int age;

    public Employee(String name, String position, String email, String phoneNum, double salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNum = phoneNum;
        this.salary = salary;
        this.age = age;
    }

    public Employee() {
        //по заданию не совсем понял как должны заполняться поля экземпляра класса
        //поэтому добавил, конструктор со всеми полями и пользователь явно их записывает
        //и вот это вот если значения полей не указаны
        this.name = "EmtyName";
        this.position = "EmptyPosition";
        this.email = "EmtyEmail";
        this.phoneNum = "EmtyPhoneNum";
        this.salary = 0;
        this.age = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    static public void outToConsole(Employee staff) {
        //это метод для вывода в консоль содержимого полей объекта
        //Думаю в таком виде можно сделать статик, общий метод для всех экземпляров класса
        //имеет ли смысл в таком ключе использовать статик методы???
        staff.printToConsole();
    }

    public void printToConsole() {
        //это метод для вывода в консоль содержимого полей объекта
        System.out.printf("ФИО: %s; Должность: %s; email: %s; Телефон: %s; Зарплата: %.2f; Возраст: %d.\n", name, position, email, phoneNum, salary, age);
    }
}
