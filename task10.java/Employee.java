public class Employee {
    public static void main(String[] args) {

        Employee obj =new Employee(327, "naresh", "gadi", 5000);
        //before incrmenting thesalary
        System.out.println(obj.getSalary());

        System.out.println(obj.getAnnualSalary());
        System.out.println(obj.raiseSalary(2));
        obj.setSalary(5500);
//after setting the salary
        System.out.println(obj.getSalary());

        System.out.println(obj.toString());

    }


    int id;
    String firstName;
    String lastName;
    int salary;

    public Employee(int id, String firstName, String lastname, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastname;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }
    public int getAnnualSalary() {
        return salary*12;
    }
    public void setSalary(int newsalary){
        this.salary=newsalary;

    }
    public int raiseSalary(int percent) {
        return (salary*percent/100)+salary;
    }
    public String toString(){
        return "Employee"+"[Id="+id+","+"name=" +firstName+" "+lastName+","+ "salary="+salary+"]";

        
    }
    

}
