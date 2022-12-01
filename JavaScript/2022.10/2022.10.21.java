import java.util.Scanner;

public class Main21 {
    public static void main(String[] args) {
        String studentId = "07180701";
        float grade1 = 98.5f;
        float grade2 = 94;
        float grade3 = 78.5f;
        char sex ='f';
        boolean isScience = true;
        int no = 5;

        System.out.println(Math.abs(-66));
//      类          对象              构造函数

        Scanner scanner = new Scanner(System.in);
        System.out.println("学号");
        studentId = scanner.next();

//      对象，一般函数()
//      类，静态函数()

        System.out.println("请输入成绩1:");
        grade1 = scanner.nextFloat();
        System.out.println("请输入成绩2:");
        grade2 = scanner.nextFloat();
        System.out.println("请输入成绩3:");
        grade3 =scanner.nextFloat();
        System.out.println("性别:");
        String temp = scanner.next();
        sex = temp.charAt(0);
//      机器记数是从0，1，2，3，4

//      百度Java String

        System.out.println("是否理科生？");
        isScience = scanner.nextBoolean();
        System.out.println("名次：");
        no = scanner.nextInt();

        System.out.println("学号：" + studentId);
        System.out.println("成绩1：" + grade1);
        System.out.println("成绩2：" + grade2);
        System.out.println("成绩3：" + grade3);
        System.out.println("性别：" + sex);
        System.out.println("是否理科：" + isScience);
        System.out.println("班级排名：" + no);

//      二、请编程显示一个三位数789的百位、十位和各位
        int i = 789;
        int units = i % 10;
//      9
        int tens = i / 10 % 10;
//      78 % 10 = 8  考：789%10/10=0
        int hundreds = i / 100;
//      7
        System.out.println(units);
        System.out.println(tens);
        System.out.println(hundreds);

        int x = 5;
        int y = x++;
//      int y = x; x = x+1; 后递加 y:5 x:6
        int z = ++x;
//      x = x+1; int z = x;
        System.out.println(z);
//      7

        int a = 5;
        int b = 3*a--;
        System.out.println(b);
        System.out.println(a);

//      A & B : T & T 其他都为F
//      A | B : F | F = F
//      ^异或，重点是不同： T ^ T = F  F ^ F = F
//      !T -> F !F -> T

//      一个学生成绩为75，请编程判断是否及格
        int score = 75;
        System.out.println(score>=60?"及格":"不及格");

//      将百分制的成绩转换为五级记分制
        String str = score>=90?"优":(score>=80?"良":(score>=70?"中":(score>=60?"及格":"不及格")));
        System.out.println(str);

//      简洁与，&&当左边为F，右边不运算
//      简洁或，||当左边为F，右边不运算

        int s = 1;
        boolean t = 3>2 && s++>5;
        System.out.println(s);

        int s1 = 1;
        boolean t1 = 3>2 && s1++>5;
        System.out.println(s1);

//      慕课 零基础学Java语言 2.3.1级联和嵌套的判断语句 83行
        System.out.println("请输入成绩:");
        int score1 = scanner.nextInt();
        if(score1>=90 && score1<100) {
            System.out.println("优");
        } else if (score1>=80 && score1<90) {
            System.out.println("良");
        } else if (score1>=70 && score1<80) {
            System.out.println("中");
        } else if (score1>=60 && score1<70) {
            System.out.println("及格");
        }else if (score1<60){
            System.out.println("不及格");
        }


//      慕课 零基础学Java语言 3.2.4整数分解 上面第二题，49行
        int number;
            number = scanner.nextInt();
            int result = 0;
            while (number > 0) {
                int dight = number % 10;
                result = result * 10 + dight;
                System.out.println(dight);
                number = number / 10;
            }
            System.out.println(number);

    }
}
