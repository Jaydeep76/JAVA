public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name,int age,double salary){
        this.name =name;
        this.age = age;
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public int getage(){
        return age;
    }
    public double getsalary(){
        return salary;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setage(int age){
        this.age = age;
    }
    public void setsalary(double salary){
        this.salary = salary;
    }
    public void raiseSalary(){
        this.salary *= 1.10;
    }
    public static void main(String[] args) {
        Employee emp =new Employee("Arkaj",20,50000);
        System.out.println("NAME:"+emp.getName());
        System.out.println("AGE:"+emp.getage());
        System.out.println("Salary:"+emp.getsalary());

        emp.raiseSalary();

        System.out.println("Salary after raise:"+ emp.getsalary());

    }
}