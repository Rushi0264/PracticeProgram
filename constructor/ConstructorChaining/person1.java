package constructor.ConstructorChaining;

class person{
    String name;
    int age;

    person(String name, int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}


public class person1 {

    public static void main(String[] args) {
        person p = new person("Rushikesh", 21);
        p.display();
    }
}
