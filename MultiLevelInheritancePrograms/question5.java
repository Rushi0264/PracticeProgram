package MultiLevelInheritancePrograms;

class person{
    void eat(){
        System.out.println("Person is eating..!");
    }
}

class student extends person{
    void study(){
        System.out.println("Student is studying..!");
    }
}

class engineeringStudent extends student{
    void stream(){
        System.out.println("Engineering student studying in Computer stream...!");
    }
}

class computerr extends engineeringStudent{
    void coading(){
        System.out.println("Student creates programs...!");
    }
}

public class question5 {
    public static void main(String[] args) {
        computerr obj = new computerr();
        obj.eat();
        obj.study();
        obj.stream();
        obj.coading();
    }
}
