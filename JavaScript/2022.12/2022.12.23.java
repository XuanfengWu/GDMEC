//  缺省类，同包用
class A2{
//  固定的
    final String name = "final特性";
//  常量
    public void print(){
//      name = "新值"
//      不能修改final修改变量
        System.out.println(name);
    }
    public final void printHello(){
        System.out.println("hello");
    }
}

class A22 extends A2{
//  父类的final函数，不能进行[重写]
//  public void printHello() {
//      System.out.println("在子类中打印:hello");
//  }

//  在子类中，定义一个与父类相同的函数，子类函数覆盖父类的函数
//  重写
    public void print() {
        System.out.println("在子类中打印:"+name);
    }
}

//  抽象类，表示类中未实现方法
abstract class B2{
//  抽象         抽象函数
    abstract void print();
//  声明一个函数
}

//  子类没有实现抽象烦方法，只能是一个抽象
abstract class B22 extends B2{

}

class B33 extends B2{
    @Override
//  重载
    void print() {
        System.out.println("儿子实现小目标");
    }
}

class D{
//  系统自动添加一个public D(){}
}

class E{
    int age;
//  如果存在带参的构造函数，不会自动添加无参构造函数
    public E(int age){
        this.age = age;
    }
}

class F extends E{
//  没有调用父类的构造方法，会访问父类的缺省构造方法，它没有定义
//  至少调用一次父类的构造方法
    public F(){
        super(15);
//      访问父类带参构造函数
    }
}

class G{
    void print(){
        System.out.println("aaaa");
    }
    void print(String str){
        System.out.println(str);
    }
}

class G1 extends G{
    void print(){
        System.out.println("在子类G1中打印:aaaa");
    }
}

class G2 extends G{
    void print(){
        System.out.println("在子类G2中打印:nnnn");
    }
}

public class Main12_23 {
    public static void main(String[] args) {
        G g = new G();
//      访问同名函数，表现不一致
//      静态多态
        g.print();
        g.print("qwert");

//      运行时多态
//      父类的变量   子类
        g = new G1();
//      自动将子类转为父类
        g.print();
//      本质上，g是G1，所以调用的方法G1中print
        g = new G2();
//      本质上，g是G1，所以调用的方法G1中print

        g.print();

        D d = new D();

//      E e = new E();
//      不存在无参构造函数

        E e1 = new E(100);
//      访问存在的构造函数

//
//      不能实例化一个抽象类
//      B2 B = new B2();

        B33 b33 = new B33();
        b33.print();

        A2 a = new A2();
        a.print();
    }
}
