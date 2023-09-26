//this: to refer current class instance variable

//with This Keyword
class Student{
int id;
String name;
Student(int id,String name){
  this.id=id;
  this.name=name;
}
void display(){
    System.out.println("This is :"+id+","+name);
}
}
public class Test {
    public static void main(String[] args) {
       Student s=new Student(1,"Vibha");
       Student s1=new Student(2,"Sita");
       s.display();
       s1.display();
    }
}

//without This Keyword
//class Student{
//    int id;
//    String name;
//    Student(int id,String name){
//        id=id;
//        name=name;
//    }
//    void display(){
//        System.out.println("This is :"+id+","+name);
//    }
//}
//public class Test{
//    public static void main(String[] args) {
//        Student s=new Student(1,"Vibha");
//        Student s1=new Student(2,"Sita");
//        s.display();
//        s1.display();
//    }
//}