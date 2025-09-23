package HierarchicalInheritancePrograms;

class product{
    void display(){
        System.out.println("Displaying product...!");
    }
}

class electronic extends product{
    void warranty(){
        System.out.println("Electronic has warranty..!");
    }
}

class clothing extends product{
    void sizeChart(){
        System.out.println("Size chat of clothes...!");
    }
}

public class question7 {
    public static void main(String[] args) {
        electronic obj = new electronic();
        obj.display();
        obj.warranty();

        clothing obj1 = new clothing();
        obj1.display();
        obj1.sizeChart();
    }
}