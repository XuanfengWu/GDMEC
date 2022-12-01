import java.util.Scanner;

public class Main07 {
    public static void main(String[] args) {
//      [取出两个数]，[比大小]，[左边补定义],[加分号]，[补变量]，[i++,i--,i+=2]
//      打印1-100
//      for(int i=1;i<=100;i++){}
//      打印99-1奇数
//      for(int i=99;i>=1;i-=2){}
//      打印33-103偶数
//      for(int i=34;i<=103;i+=2){}
//      打印403-203
//      for(int i=403,i>=203,i--){}
//      打印507-482
//      for(int i=507,i>=482,i--){}
//      打印235-555奇数
//      for(int i=235,i<=555,i+=2){}

//      for(;;){}死循环
//      break;退出循环

//      练习：猜数游戏，计算机设置了一个随机数，请你来猜
//      从键盘输入1-100之间的一个整数
//      如果猜对了，就提示猜对了，然后打印猜的总次数
//      如果猜小了，就提示猜打了，然后继续猜，直到猜中为止

        int target = (1+(int)(Math.random()*100));
//      计算机设置0-100之间的随机数，math.random从0开始，所以需加一
        int count = 0;
//      计数器
        Scanner scanner = new Scanner(System.in);
        for(;;){
//          死循环
            System.out.println("请猜猜[1-100]:");
            int guess = scanner.nextInt();
            count++;
//          猜一次，计数器加1
            if (guess==target){
                System.out.println("恭喜猜对了，猜了"+count+"次");
                break;
//              退出循环
            } else if (guess<target) {
                System.out.println("猜小了");
            }else{
                System.out.println("猜大了");
            }
//
//          练习：3000米绳子，每次减去一半，多少次后少于5米？
//          全局变量，放在for的外面
//          局部变量，只能在for中使用
            int number = 0;
//          记录剪的次数
            for (float length=3000;length>=5;length/=2){
                number++;
//              计数器加一
            }
            System.out.println(number+"次后少于5米");
        }

//      练习：输出希腊字母表中从α到ω之间的所有字母
//      char 字符当整数用
        for (char i='α';i<='ω';i++){
            System.out.print(i+" ");
        }
        System.out.println();

//      练习：两重for循环，用*号打印出一个倒直角三角形
//      从第十行到第一行
//      打印一行星，个数为row
//      逆序：row=10.row>=1;row--
//      正序：row=1，row<=10;row++
        for (int row = 10;row>=1;row--){
            for(int col =1;col<=row;col++){
                System.out.print("*");
//              不换行
            }
            System.out.println();
//          换行
        }
//      练习：水仙花数，一个三位数，各数位的立方和等于这个数自己。
//      Math.pow(a,b)
        for(int i=100;i<1000;i++){
            int ge =i%10;
            int shi = i/10%10;
            int bai = i/100;
//          if(i==Math.pow(ge,3)+Math.pow(shi,3)+Math.pow(bai,3))
            if (i==ge*ge*ge+shi*shi*shi+bai*bai*bai){
                System.out.println(i);
            }
        }
//      算法二
        for (int bai=1;bai<10;bai++){
            for (int shi=0;shi<10;shi++){
                for (int ge=0;ge<10;ge++){
                    if (bai*100+shi*10+ge==Math.pow(ge,3)+Math.pow(shi,3)+Math.pow(bai,3)){
                        System.out.println(""+bai+shi+ge);
                    }
                }
            }
        }
    }
}
