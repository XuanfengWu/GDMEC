import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //n位二进制 2^n -1
        //b 二进制 bit
        //1  2  3           进率为10
        //百 十 个
        //（1  1  1）2 = 7   进率为2
        //  4  2  1   4+2+1=7

        //byte字节 1B = 8b , 有符号数 ，最高位符号
        //只剩下7位表示数, 最大数2^7-1

        //各种数据类型占多少字节要背
        byte a = 55;     //最大值只能存储127
        short b = 55;    //16b, 2B, 2^15-1
        int c =55;       //32b, 4B, 2^31-1
        long d = 55;     //64b, 8B, 2^63-1

        //首字母大写是类，类的首字母大写
        //byte的包装类，类中有属性有方法
        //类是集合的，张三是个体，人类是集合。每一个体是对象

        Byte aa = a;     //给字节数，添加上属性和方法，变成对象，赋值aa 自动装箱
        byte aaa = aa;   //对象转简单数据类型，去掉属性和方法, 自动拆箱

        //简单数据类型与包装类可以相互换
        Integer cc = c;
        Short bb = b;
        Long dd = d;

        //转为包装类的对象是为了使用对象的方法与属性
        int e  = 1234;
        Integer ee = e;
        System.out.println(ee.toBinaryString(ee));

        int x = 025 ;     //0开头，八进制数
        int y = 0x25;     //0x开头，十六进制数
        int z = 25;      //十进制数
        long zz = 25L;   //十进制数，一个数末尾加L长整数，一个变量不能重复声明
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(zz);

        // (025)   8 = 2*8  + 5*1  =21
        // (0x25) 16 = 2*16 + 5*1  =37
        int xx = 0b111;
        System.out.println(xx);    //7

        //访问字节类的常量属性
        System.out.println(Byte.MAX_VALUE); //最大值127
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);

        //单精度浮点数，32位，末尾加f
        //双精度浮点数，64位，末尾加d  3.14是双精度浮点数

        float f = 3.14f;
        double g = 3.14d;
        //期末会考
        //float h = 3.14; 将双精度浮点数赋值给单精度浮点数的变量，装不下
        double i = 3.14f;

        // 选用合适的数据类型存储数据
        //已知半径为50米，求圆的面积
        double radius = 50.0d;
        double area = 3.14 * radius * radius;
        //               +左右有字符串，+表示字符串连接
        System.out.println("圆的面积：" + area);

        //如果用float存储数据
        float radius1 =50.0f;
        float area1 = 3.14f * radius1 * radius1;
        //               +左右有字符串，+表示字符串连接
        System.out.println("圆的面积：" + area1);

        //有难度
        //类   首字母小写    新      构造函数与类名相同

        //      用于输入的               键盘
        Scanner scanner = new Scanner(System.in);

        //必须提示用户输入数据
        System.out.println("请输入圆的半径:");

        //获取数据，表示从键盘取出一个float浮点数
        radius1 = scanner.nextFloat();
        //变量名可以反复用，新数据会覆盖旧数据
        area1 = 3.14f * radius1 * radius1;
        System.out.println("圆的面积:"+ area1);

        //测试字符串
        System.out.println("请输入字符串");
        System.out.println("你输入的是"+ scanner.next());

        //测试整数
        System.out.println("请输入整数:");
        System.out.println("你输入的是:" + scanner.nextInt());

    }
}