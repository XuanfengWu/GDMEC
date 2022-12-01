import java.text.DecimalFormat;
import java.util.Scanner;

public class Main28 {
    public static void main(String[] args) {
//      求：1+2+...+10的结果
        int sum =0;
//      声明一个变量，存储结果。求和，初始化为0
        sum += 1;
        sum += 2;
        sum += 3;
        sum += 4;
        sum += 5;
        sum += 6;
        sum += 7;
        sum += 8;
        sum += 9;
        sum += 10;
        System.out.println("1+2+...+10的结果:"+sum);
//      sum = 1+2+3+...+10; 表达不好

//      对象.方法()
//      对象.属性
//      类名.静态方法()
//      类型.静态属性

//      构造函数 搭配new 新建一个对象
        Scanner scanner = new Scanner(System.in);

        int [] a = {1,2,3,4,5};
//      在计算机中,序号从0开始,0,1,2,3,4
        System.out.println(a[0]);
//      []放元素序号,下标

//      单目运算a++ --b 只有一个操作数
//      双目运算 2 + 3, 两个操作数
//      三名运算 3>2?"hhh":"nnn"
//      *->>>=&|&&|| 想象力
//      先乘除后加减 右移 条件运算 逻辑与 逻辑或

//      ++ -- 运算符有限与左边的变量结合
        int i = 2,j=3;
        int k = i+++i---j;
//      i++ + i-- -j
//      2 + 3 - 3
        System.out.println(k);//2

        int k1 = i+ ++j- --j;
        System.out.println("k1"+k1);
//      3

//      运算符优先级一样时,要看结合性:从左到右依次算
        int h = 2+3+4-7;
//      2+3,5+4,9-7
//      2
        System.out.println(h);
        int b,c,d;
        b = c = d = 100;
//      结合性,从右到左依次算
//      d =100,c=d,b=c
        System.out.println(b+","+c+","+d);

        int e =444;
//      ++ 优先级一样
//      "2+e=2"+ 2 -> "2+e=2"
//      //"2+e=2"+ e -> "2+e=2444"
        System.out.println("2+e="+ 2+e);

//      2+e = 446
        System.out.println("2+e="+ (2+e));

        float grade1=98.5f;
//      权重:1.2
        float grade2=94;
//      权重:0.8
        float grade3=78.5f;
//      权重:1.0

//      计算加权总分
        float sum1 = (grade1*1.2f+grade2*0.8f+grade3*1.0f);
        System.out.println("加权总分:"+sum1);

//      计算平均分
        float average=(grade1+grade2+grade3)/3;
        System.out.println("平均分"+average);

//      计算班内编号
        long no = 2022120545;
//      2022入学年份,12系别,05班号,45序号
        long order = no %100;
//      45,序号
        no /= 100;
//      20221205
        long classNo = no %100;
//      05,班号
        no /= 100;
//      202212
        long shoolNo = no %100;
//      12,人工智能学院
        long year = no/100;
//      2022,入学年份
        System.out.println("入学年份:"+year);
        System.out.println("系别:"+shoolNo);
        System.out.println("班号:"+classNo);
        System.out.println("序号:"+order);

//      四舍五入,保留小数点后一位
        float score = 88.56245f;
        System.out.println(Math.rint(score*10)/10);
        System.out.println((int)(score*10+0.5)/10.0);

//      DecimalFormat小数格式化类
        DecimalFormat decimalFormat = new DecimalFormat("0000.00");
        System.out.println(decimalFormat.format(3.1415926));

        DecimalFormat decimalFormat1 = new DecimalFormat("####.###");
        System.out.println(decimalFormat1.format(3.1415926));

    }
}
