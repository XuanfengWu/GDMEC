package Main2205;

import java.util.Scanner;

//  接口的定义
//  接口  接口名
interface A3{
//  默认:public static final
    float PI = 3.14f;
//  声明抽象函数，不需要加abstract
//  默认:public abstract
    float area();
}

//  实现接口  实现  接口名
class B3 implements A3{
    int a;
//  长度
    int b;
//  宽度

    public B3(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
//  重载
    public float area() {
        float s = a*b;
        return s;
    }
}

public class Main12_26 {
    public static void main(String[] args) {
//      接口 接口名  类
        A3 a = new B3(100, 200);
        System.out.println("面积：" + a.area());

//      在屏幕上显示一棵树
        System.out.println("        $");
        System.out.println("       $$$");
        System.out.println("      $$$$$");
        System.out.println("     $$$$$$");
        System.out.println("    $$$$$$$$");
        System.out.println("        $");
        System.out.println("        $");
        System.out.println("        $");
        System.out.println("        $");

//      if switch
//      猜数[1-100]，猜中了退出，猜打了就提示猜打了，猜小了就提示猜小了
//      打印一下猜了多少次
        int target = 1 + (int) (Math.random() * 100);
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while (true) {
            System.out.println("请输入1-100的整数：");
            int guess = scanner.nextInt();
            counter++;
//          计数器+1
            if (guess == target) {
                System.out.println("猜中了，猜的次数：" + counter);
                break;
            } else if (guess > target) {
                System.out.println("猜大了，请重试");
            } else {
                System.out.println("猜小了，请重试");
            }
        }

//      判断年份是否未闰年
//      1.普通年被4整除且不能被100整除
//      2.世纪年能被400整除
//      3.对于数值很大的年份，这年如果能整除3200，并且能整除172800
        int year = 2020;
        boolean ok = false;
        if (year % 4 == 0 && year % 100 != 0) {
            ok = true;
        } else if (year % 400 == 0) {
            ok = true;
        } else if (year % 3200 == 0 && year % 172800 == 0) {
            ok = true;
        }
        if (ok) {
            System.out.println(year + "年是闰年");
        } else {
            System.out.println(year + "年不是闰年");
        }

//      打印201-678中3或者4的倍数
        for (int i = 201; i < 678; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                System.out.println(i);
            }
        }

//      数组，跳水运动员记分，去掉最高和最低，计算平均分
//      求比赛成绩{67，75，90，38，100}；
        float[] grade = {67, 75, 90, 38, 100};
        float max = grade[0];
        float min = grade[0];
        float total = 0;
        for (int i = 0; i < grade.length; i++) {
            total += grade[i];
            if (max < grade[i]) max = grade[i];
            if (min > grade[i]) min = grade[i];
        }
        float lastDeFen = (total - max - min) / (grade.length - 2);
        System.out.println("最后得分:" + lastDeFen);
    }
}
