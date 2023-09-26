//Calling parameterized constructor from default constructor:
class C{
    C(){
        this(5);
        System.out.println("Constructor");
    }
    C(int x){

        System.out.println(x);
    }
}
public class TestThis2 {
    public static void main(String[] args) {
        C a1=new C();
    }
}
