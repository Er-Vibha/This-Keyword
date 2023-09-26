// this: to invoke current class method
class A {
    void b(int x) {
        System.out.println(x);
        this.a();
    }
    void a() {
        System.out.println("this is a");
    }
}
public class TestThis {
    public static void main(String[] args) {
        A a1 = new A();
        a1.b(12);
    }
}
