class Employee{
    int id;
    int salary;
    String name;

    public String getName(){
        return name;
    }

    public void PrintDetail(){
        System.out.println("The id of the Employee is : "+id);
        System.out.println("The salary of the employee is "+ salary );
        System.out.println();
    }
}

public class ClassInJava {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee Adarsh = new Employee();
        Adarsh.id = 21;
        Adarsh.salary = 400000;
        Adarsh.PrintDetail();

        Employee Mahesh = new Employee();
        Mahesh.id = 55;
        Mahesh.salary = 20000;
        Mahesh.PrintDetail();
        Mahesh.name = "Sameer";
        System.out.println(Mahesh.name);
    }
}
