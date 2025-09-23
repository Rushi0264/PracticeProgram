package TypeCasting.Upcasting;

class TwoParam{
    int a;
    int b;

    void add(int a, int b){
        this.a=a;
        this.b=b;
    }
}

class TwoParamNew extends TwoParam{
    @Override
    void add(int a, int b){
        int c = a+b;
        System.out.println(c);
    }
}

public class Addition {
    public static void main(String[] args) {
        TwoParam obj = new TwoParamNew();
        obj.add(3,6);
    }
}
