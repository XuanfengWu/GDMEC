import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
//      求三个数中的最小数，使用擂台赛算法
        int x = 300, y = 200, z = 100;
        int min = x;
//      假设最小值为x
        if (y < min) {
            min = y;
        }
        if (z < min) {
            min = z;
        }
        System.out.println("三个数中的最小值:" + min);

        int a = 5;
        int b = -4;
        if (a > 0) {
            if (b > 0) {
                System.out.println("a=" + a);
            }
        } else {
            System.out.println("b=" + b);
        }

//      键盘输入0-100的整数，转换为五级记分
        String str = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入成绩:");
        int score = scanner.nextInt();
        if (score > 90) {
            str = "优";
        } else {
            if (score >= 80) {
                str = "良";
            } else {
                if (score > 70) {
                    str = "中";
                } else {
                    if (score >= 60) {
                        str = "及格";
                    } else {
                        str = "不及格";
                    }
                }
            }
        }
        System.out.println("你输入的成绩:" + str);
//      else后面紧跟if情况，可以省略中间的大括号

//      break:遇到它，退出switch，转到后面
//      switch(钥匙){
//      case 锁1：语句一；break；
//      case 锁2：语句一；break；
//      case 锁3：语句一；break；
//      case 锁4：语句一；break；
//      default:缺省语句，break；
//      }
        char key = 'A';
        switch (key) {
            case 'A':
                System.out.println('A');
                break;
            case 'B':
                System.out.println('B');
                break;
            case 'C':
                System.out.println('C');
                break;
            default:
                System.out.println("default");
                break;
        }

        score = 78;
        switch (score / 10) {
            case 100:

            case 9:
                System.out.println("考试成绩:" + 'A');
                break;
            case 8:
                System.out.println("考试成绩:" + 'B');
                break;
            case 7:
                System.out.println("考试成绩:" + 'C');
                break;
            case 6:
                System.out.println("考试成绩:" + 'D');
                break;
            default:
                System.out.println("考试成绩:" + 'E');
                break;
        }

//      循环四大要素
//      for(1.初始化变量;2.循环条件;4.修改变量){
//          3.循环体
//      }
//      执行过程:1234、234、234、234...
        for(int i=1;i<=10;i++){
            System.out.println(i +" ");
        }
        System.out.println();
//      换行

//      计算1到00之间奇数的和
//      算法一
        int sum = 0;
        for (int i=1;i<=100;i=i+2){
            sum = sum+i;
        }
        System.out.println("1到100之间奇数的和:"+sum);

//      算法二
        sum = 0;
        for (int i=1;i<=100;i++){
            if (i%2==1){
                sum+= i;
            }
        }
        System.out.println("1到100之间奇数的和:"+sum);
    }
}
