public class Person {
    String name ;
    int age ;
    //using the 2 paramter constrctor

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //using the getter methods and returning the string
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Person person= new Person("naresh", 31);
        person.getName();
        person.getAge();
        System.out.println(person.getName());
        System.out.println(person.getAge());
  
        
    }
}
