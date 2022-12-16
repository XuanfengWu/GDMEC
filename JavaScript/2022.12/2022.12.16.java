class A{
//  属于类，也可以认为静态变量，所有的对象共享
    static int counter = 0;

}

//  定义一个圆
class Circle{
//    静态   最终  常量
    static final float PI =3.14f;

    private int x;
    private int y;
    private int r;

//  生成，getter、setter
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

//  生成，构造函数
    public Circle() {
    }

//  生成，构造函数字段
    public Circle(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

//  自己生成业务函数
//  面积
    float area(){
        float s = PI*r*r;
        return s;
    }

    float c(){
        float len = 2*PI*r;
        return len;
    }
}


//声明普通类，学生类
class Student12_16{
//  类名的东西   static  类名.属性或方法
    static String className = "Student12_16";
//                静态成员变量
    static  void printClassName(){
//      静态函数
        System.out.println(className);
    }
//  对象的东西   对象.属性或方法
    //属性、成员变量
    String studentId;
//  [缺省]的访问类型，在同一个包中使用
    public String name;
//  公共成员变量，[任意地方]使用
    private int age;
//  自己使用，[自己]类中用
    private float height;

//  getter，setter，可访问属性 ，get属性
    public int getAge(){
        return this.age;
    }
//  修改属性 setAge()
    public void setAge(int age){
//      成员变量  属性
        this.age = age;
    }
    public float getHeight(){
        return this.height;
    }

    public void setHeight(float height){
        this.height = height;
    }

//  构造函数，左边不要加返回类型
    Student12_16(){ //缺省构造函数
        //初始化成员变量
        studentId = "22120599";
        name = "好好学习";
        age = 20;
        height = 1.70f;
    }
    Student12_16(int age,String name){
        this.age = age;
        this.name = name;
    }
    //行为、成员方法、函数。左边有返回值的类型
    void saySelf() {
        //成员函数中可以使用成员变量
        System.out.println("我名字：" + this.name +"年龄:" +this.age );
    }
}
public class Main12_16 {
    public static void main(String[] args) {
        A a = new A();
        A.counter++;
        System.out.println(a.counter);

        A b = new A();
        b.counter++;
        System.out.println(b.counter);

        A.counter++;
        System.out.println(A.counter);

        Student12_16 student = new Student12_16();
        student.saySelf();

        student.name = "换一个名字";
//      访问public类型的成员变量
        student.saySelf();;

//      student.age = 18;
//      类的外部，不能访问private的成员变量

        student.setAge(18);
//      类的外部，通过public函数间接访问属性
        student.saySelf();

//      通过类名，静态的成员函数
        Student12_16.printClassName();
    }

}
