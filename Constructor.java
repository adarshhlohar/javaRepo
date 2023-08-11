class Employee{
    private int id;
    private String name;

    public Employee(){
        id = 221;
        name = "Addi1";
    }

    public Employee(int i , String newName){
        id = i;
        name = newName;
    }

    public Employee(String new1){
        name = new1;
        id = 5;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

}

public class Constructor {
    public static void main(String[] args) {
        Employee adarsh = new Employee();
        System.out.println(adarsh.getId());
        System.out.println(adarsh.getName());

        Employee Mahesh = new Employee(12,"Mahi");
        System.out.println(Mahesh.getId());
        System.out.println(Mahesh.getName());

        Employee adarsh2 = new Employee("Addiking");
        System.out.println(adarsh2.getId());
        System.out.println(adarsh2.getName());
    }
}
