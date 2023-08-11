class Employee{
    private int id;
    private String name;

    public void setId(int i){
        id = i;
    }

    public void setName(String newName){
        name = newName;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}

public class settersAndGetters {
    public static void main(String[] args) {
        Employee Adarsh = new Employee();
        Adarsh.setId(21);
        Adarsh.setName("Addi");
        System.out.println(Adarsh.getId());
        System.out.println(Adarsh.getName());

        Employee Sameer = new Employee();
        Sameer.setId(32); 
        Sameer.setName("Sami");
        System.out.println("The id of sameer is : "+Sameer.getId());
        System.out.println("The name of sameer is : "+Sameer.getName());
    }
}
