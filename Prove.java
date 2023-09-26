//Proving this keyword
class T{
void m(){
    System.out.println(this);//prints same reference ID
}
}
public class Prove {
    public static void main(String[] args) {
        T obj=new T();
        System.out.println(obj);//prints the reference ID
        obj.m();
    }
}
