package ObjectClass.ToStringMethod;

public class MultipleBooks {
    int id;
    String title;

    MultipleBooks(int id, String title){
        this.id=id;
        this.title=title;
    }

    public String toString(){
        return "ID : "+id+" Title : "+title;
    }

    public static void main(String[] args) {
        MultipleBooks mb1 = new MultipleBooks(101,"Java");
        MultipleBooks mb2 = new MultipleBooks(102,"Advance Data Science");
        MultipleBooks mb3 = new MultipleBooks(103,"HTML");
        System.out.println(mb1);
        System.out.println(mb2);
        System.out.println(mb3);
    }
}
