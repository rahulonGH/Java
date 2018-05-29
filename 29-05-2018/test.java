/**
 * test
 */
public class test {
    int a = 45;
    static int b = 56;
public static void main(String[] args) {
    int age = 123;
    System.out.println("Hello world");
    test obj = new test();
    System.out.println("age is: " + age);
    System.out.println("a val is : " + obj.a);
    System.out.println("b val is : " + b);
    obj.printA();

}
public test() {
    int age = 9;
    System.out.println("age is: " + age);
}
public void printA() {
    System.out.println(a);
    System.out.println(b);
}
    
}