class Student{
    String name;
    int no;
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Roll NO:"+no);
    }
}
public class ClassAndObjectExample{
    public static void main(String[] args){
        Student s1=new Student();
        s1.name="Meghana";
        s1.no=12;
        s1.display();
    }
}