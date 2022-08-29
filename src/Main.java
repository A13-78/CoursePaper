public class Main {
    /*
    1. Создать класс Employee, который содержит информацию о Ф. И. О., отделе и зарплате сотрудника. Отделы для простоты должны быть названы от 1 до 5.
    2. Добавить статическую переменную-счетчик, которая будет отвечать за id.
    3. Добавить в класс Employee поле id, которое проставляется из счетчика, а затем счетчик увеличивает свое значение.
    4. Добавить возможность получать значения полей из Employee (геттеры) для всех полей.
    5. Добавить возможность устанавливать значения полей отдела и зарплаты (сеттеры).
    6. По умолчанию все поля должны передавать через конструктор (кроме id) и заполняться в нем (включая id, который нужно получить из счетчика).
    7. Создать внутри класса с методом main поле типа Employee[10], которое будет выполнять роль «хранилища» для записей о сотрудниках.
    8. Создать статические методы, которые будут взаимодействовать с массивом и предоставлять результат:
        1. Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
        2. Посчитать сумму затрат на зарплаты в месяц.
        3. Найти сотрудника с минимальной зарплатой.
        4. Найти сотрудника с максимальной зарплатой.
        5. Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).
        6. Получить Ф. И. О. всех сотрудников (вывести в консоль).
     */

    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        System.out.println("Курсовая работа");
        employees[0] = new Employee("Достоевский Фёдор Михайлович", 150000, 1);
        employees[1] = new Employee("Толстой Лев Николаевич", 155000, 2);
        employees[2] = new Employee("Гоголь Николай Васильевич", 145000, 3);
        employees[3] = new Employee("Лермонтов Михаил Юрьевич", 135000, 4);
        employees[4] = new Employee("Пушкин Александр Сергеевич", 130000, 5);
        employees[5] = new Employee("Некрасов Николай Алексеевич", 140000, 1);
        employees[6] = new Employee("Тургенев Иван Сергеевич", 120000, 2);
        employees[7] = new Employee("Тютчев Фёдор Иванович", 115000, 3);
        employees[8] = new Employee("Чехов Антов Павлович", 140000, 4);
        employees[9] = new Employee("Крылов Иван Андреевич", 125000, 5);

        printAllEmployee();
        System.out.println();
        costAmountSalary();
        System.out.println();
        minSalaryStaff();
        System.out.println();
        maxSalaryStaff();
        System.out.println();
        averageSalary();
        System.out.println();
        listStaffFIO();


    }

    public static void printAllEmployee() {
        for (int i = 0; i < employees.length ; i++) {
            System.out.println(employees[i]);
        }
    }

    public static double costAmountSalary() {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalaryStaff();
        }
        System.out.println("Сумма затрат на заработную плату сотрудников в месяц: " + sum + " рублей");
        return sum;
    }

    public static Employee minSalaryStaff() {
        Employee min = null;
        for (int i = 0; i < employees.length; i++) {
            if (min == null || employees[i].getSalaryStaff() < min.getSalaryStaff()) {
                min = employees[i];
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + min.getSalaryStaff() + " - " + min.getStaff());
        return min;
    }

    public static Employee maxSalaryStaff() {
        Employee max = null;
        for (int i = 0; i < employees.length; i++) {
            if (max == null || employees[i].getSalaryStaff() > max.getSalaryStaff()) {
                max = employees[i];
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + max.getSalaryStaff() + " - " + max.getStaff());
        return max;
    }


     public static void averageSalary() {
         double average = costAmountSalary() / employees.length;
         System.out.println("Средняя заработная плата: " + average + " рублей");
     }

    public static void listStaffFIO() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getStaff());
        }
    }
}