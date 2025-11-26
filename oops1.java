class oops1{
 // class & objects...
    public static void main(String[] args) {
       
        A obj1=new A();
        obj1.prit();
    }   
}
class A{
    String name="John";
    int age=20;
    void prit(){
        System.out.println("name: "+name);
        System.out.println("age: "+age);
    }
}