package HierarchicalInheritancePrograms;

class country{
    void india(){
        System.out.println("We are the INDIANS...");
    }
}

class state extends country{
    void Maharashtra(){
        System.out.println("I am Maharashtrian..");
    }

    void Bihar(){
        System.out.println("I am Bihari..");
    }

    void UttarPradesh(){
        System.out.println("I am from UP...!");
    }
}

class Maharashtra extends country{
    void districtOfMH(){
        System.out.println("Maharashtra has 36 district...");
    }
}

class Bihar extends country{
    void districtOfBihar(){
        System.out.println("Bihar has 38 district...");
    }
}

class UP extends country{
    void districtOfUP(){
        System.out.println("Uttar pradesh has 75 district...");
    }
}

public class question4 {
    public static void main(String[] args) {
        country obj = new country();
        obj.india();

        state obj1 = new state();
        obj1.Maharashtra();
        obj1.Bihar();
        obj1.UttarPradesh();
        obj1.india();

        Maharashtra obj2 = new Maharashtra();
        obj2.districtOfMH();
        obj2.india();

        Bihar obj3 = new Bihar();
        obj3.districtOfBihar();
        obj3.india();

        UP obj4 = new UP();
        obj4.districtOfUP();
        obj4.india();

    }
}
