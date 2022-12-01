import java.util.Scanner;

public class Main31 {
    public static void main(String[] args) {
//      二单元，总结
//      看懂、记住、默写、反复

        byte a = 22;
//      byte [-128,127]
        byte b = 1;
        a = (byte)(a+b);
//      + int运算，运算结果是int

        int f1 = 100,f2 = 100, f3 = 150,f4 = 150;
        System.out.println(f1 == f2);
        System.out.println(f3 == f4);

        Integer f11 = 100, f22 = 100, f33 = 150, f44 = 150;
        System.out.println(f11 == f22);
//      Java中存在127整数常量对象（字节范围的数据【-128.127】）
//      超过这个范围，Integer是单独的对象
        System.out.println(f33 == f44);
//      不是同一对象

//      Integer Byte Math String不需要导入
        System.out.println(Math.round(11.5));
//      12
        System.out.println(Math.round(-11.5));
//      -11

        String str ="123456789";
        System.out.println(str.length());

//      难点：二进制运算、二进制数

//      == 基本数据类型，比较值是否相同
//      == 比较两个对象，比较是否是同一对象
        String c ="afdaf";
        String d ="afdaf";
//      常量字符串，栈中
        System.out.println(c == d);
//      true

        String cc ="afdaf";
        String dd ="afdaf";
//      new生成在栈中
        System.out.println(cc == dd);
//      false

//      空语句，什么都不做
//      表达式语句：一个表达式加上一个分号
        int e;
        e = 6;
//      赋值表达式，加上分号
        e++;
//      自加自减
        dd.length();
//      函数调用
        new String("1111");
//      构造函数

        boolean f = 7>3;
//      赋值语句
//      顺序结构，从上往下运算
//      if(条件){
//            条件成立的内容
//      }else{
//            条件不成立的内容
//      }

        if (100<5){
            System.out.println("成立");
        }else{
            System.out.println("不成立");
        }

        boolean dayFine = true;
        if (dayFine){
            System.out.println("一起去爬山");
        }else{
            System.out.println("在寝室隔离吧");
        }

//      求三个数中的最大值
//      方法一：if-else
        int x,y,z,result;
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();
        System.out.println("请输入三个数:");
        if (x>z){
            if (x>z){
                result = x;
            }else{
                result = z;
            }
        }else{
            if (y>z){
                result = y;
            }else{
                result = z;
            }
        }
        System.out.println("三个数中的最大值:"+result);

//      方法二：擂台赛
        int max = x;
//      假设最大值为x
        if (y>max){max = y;}
        if (z>max){max = z;}
        System.out.println("三个数中的最大数:"+max);




    }
}
