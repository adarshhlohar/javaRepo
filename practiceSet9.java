class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public void setName(String n ){
        name  = n;
    }

    public String getName(){
        return name;
    }
}


public class practiceSet9 {
    public static void main(String[] args) {
        // problem1
        Employee Adarsh = new Employee();
        Adarsh.salary = 2000000;
        Adarsh.setName("Adarsh Lohar");
        System.out.println(Adarsh.getSalary());
        System.out.println(Adarsh.getName());
    }
}
