//Calling default constructor from parameterized constructor:
class B{
    B(){
        System.out.println("Constructor");
            }
    B(int x){
        this();
        System.out.println(x);
    }
}
public class TestThis1 {
    public static void main(String[] args) {
    B a1=new B(10);
    }
}

