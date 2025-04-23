class Employee {
    String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }
}
class FullTimeEmployee extends Employee{
    public FullTimeEmployee(String name,int id, double salary){
        super(name,id,salary);
    }

    public double calculateAnnualSalary(){
        return salary*12;
    }
    public void displayDetails(){
       super.displayDetails();
        System.out.println("Employee Annual Salary: "+calculateAnnualSalary());
    }
}

class PartTimeEmployee extends Employee{
    public PartTimeEmployee(String name,int id,double hourlyRate){
        super(name,id,hourlyRate);
    }
    public double calculateHourlyRate(int hoursWorked){
        return salary*hoursWorked;
    }

    @java.lang.Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Total Salary according to the hourly rate:  "+calculateHourlyRate(5));
    }
}
class Intern extends Employee {
    public Intern(String name, int id, double stipend) {
        super(name, id, stipend);
    }

    public double calculateStipend(int months) {
        return salary * months;
    }

    @java.lang.Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Total Internship Stipend: " + calculateStipend(6));
    }
}

    public class EmployeeManagementSystem {

    public static void main(String[] args) {
            FullTimeEmployee fte = new FullTimeEmployee("Amal", 100, 5000);
            PartTimeEmployee pte = new PartTimeEmployee("Saman", 101, 20);
            Intern ie = new Intern("Kamal", 102, 1000);
            System.out.println("Full Time Employee Details: ");
            fte.displayDetails();

            System.out.println("Part Time Employee Details: ");
            pte.displayDetails();

            System.out.println("Intern  Employee Details: ");
            ie.displayDetails();
    }
}


