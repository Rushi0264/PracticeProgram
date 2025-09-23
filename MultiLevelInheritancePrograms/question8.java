package MultiLevelInheritancePrograms;

class Apartment{
    void aPartNo(){
        System.out.println("Apartment number..!");
    }
}

class building extends Apartment{
    void buildingNo(){
        System.out.println("Building number..!");
    }
}

class floor extends building{
    void floorNo(){
        System.out.println("Floor number..!");
    }
}

class house extends floor{
    void houseNo(){
        System.out.println("House number..!");
    }
}

public class question8 {
    public static void main(String[] args) {
        house obj = new house();
        obj.aPartNo();
        obj.buildingNo();
        obj.floorNo();
        obj.houseNo();
    }
}
