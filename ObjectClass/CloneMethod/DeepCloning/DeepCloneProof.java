package ObjectClass.CloneMethod.DeepCloning;

class Address implements Cloneable {
    String city;

    Address(String city) {
        this.city = city;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // still shallow for Address, but we'll deep copy in Employee
    }
}

class Employee implements Cloneable {
    int id;
    String name;
    Address address;

    Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Object clone() throws CloneNotSupportedException {
        // First do shallow copy
        Employee cloned = (Employee) super.clone();
        // Then deep copy of nested object
        cloned.address = (Address) address.clone();
        return cloned;
    }
}

public class DeepCloneProof {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address addr1 = new Address("Pune");
        Employee e1 = new Employee(101, "Rushi", addr1);

        Employee e2 = (Employee) e1.clone(); // deep clone

        // Change city in cloned object
        e2.address.city = "Mumbai";

        System.out.println("Original Employee City: " + e1.address.city);
        System.out.println("Cloned Employee City:   " + e2.address.city);
    }
}
