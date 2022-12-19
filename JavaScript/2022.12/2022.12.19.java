//  抽象类，内部有未实现的方法，必须定义为abstract类
abstract class A1{
    final int money = 555;
    abstract int target();
//  抽象方法
}

//  儿子也未实现抽象方法，也要定义为抽象类
abstract class B extends A1{

}

class C extends A1{
//  实现父类的抽象函数
    int target() {
        return 10000;
    }
}



//  小学生是人，不用重新定义
//      新类 继承     父类
class Pupil extends Person{
//  定义自己的一些东西
    String schoolName;
    String studentNo;

    public Pupil() {
    }

    public Pupil(String name, String area, int age, int money) {

    }

    public Pupil(String schoolName, String studentNo) {
        this.schoolName = schoolName;
        this.studentNo = studentNo;
    }
    //  自定义一个构造函数


    public Pupil(String name, String area, int age, int money,String schoolName, String studentNo) {
        this.schoolName = schoolName;
        this.studentNo = studentNo;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }
}


//  类的修饰：缺省，pubilc
//  缺省的，同包用
class Person{
    static String className = "地球人";
//  类使用
    String name;
//  同包用
    public String area;
//  随便用
    private int age;
//  自己用
    protected int money;
//  子孙用

    public Person() {
//      obeject
    }

    public Person(String name, String area, int age, int money) {
        this.name = name;
        this.area = area;
        this.age = age;
        this.money = money;
    }

    public static String getClassName() {
        return className;
    }

    public static void setClassName(String className) {
        Person.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}

//  abstract 抽象的 必须继承
//  final    最终的 不可继承

//  pubilc类 异包中可以用
public class Main12_19 {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "同包用";
        System.out.println(person.name);

        Pupil pubil = new Pupil();
        pubil.className = "6666";
        pubil.name = "pubil";
        pubil.area = "中国人";
//      pubil.age = "10";
//      Person，私有的，不能继承
        pubil.money = 10000;
//      pubil是Person的子类，可以用protectd

        C c = new C();
//      c可以使用父类的final属性
        System.out.println(c.money);

//      c不可以修改父类的final(最终的，固定的)属性
//      c.money = 666;
        System.out.println(c.target());
    }
}
