public class Employee {
    private String staff;
    private  double salaryStaff;
    private int department;
    private int id;
    private static int counter;


    public Employee(String staff, double salaryStaff, int department) {
        this.staff = staff;
        this.salaryStaff = salaryStaff;
        this.department = department;
        id = counter++;
    }

    @Override
    public String toString() {
        return "Employee{" + " " +
                "Ф.И.О сотрудника: " + staff + "; //  " +
                "Заработная плата сотрудника: " + salaryStaff + "; //  " +
                "Отдел: " + department + "; //  " +
                "Индентификационный номер: " + id +
                '}';
    }


    public static void printAllEmployee() {
        return;
    }


    public String getStaff() {
        return staff;
    }

    public double getSalaryStaff() {
        return salaryStaff;
    }

    public void setSalaryStaff(double salaryStaff) {
        this.salaryStaff = salaryStaff;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public static int getCounter() {
        return counter;
    }
}
