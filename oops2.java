public class oops2 {
    // Default constructor
    public static void main(String[] args) {
        demo obj = new demo();
       obj.show();
    }
}

class demo{
    String name;
    int age;

    /*
    demo(){
System.out.println("Constructor called");
    }
*/
    void show(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}