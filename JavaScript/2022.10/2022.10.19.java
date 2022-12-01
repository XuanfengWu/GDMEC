import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		自动数据类型转换
//		包装类-简单数据类型  byte->short->int->long->float->double
//		int <-> char
		
//		'B'='a' 
//		= 66 - 65
//		= 1
//		ASCII编码 'B'为66 'A'为65
		
//		为什么不是四舍五入？
//		强制转，要程序员自己保证运算的正确性
		int x = (int)35.9;
		
//		强制转：（目标类型）原始数据，直接去掉小数部分
		System.out.println(x);
		System.out.println((int)3.14e33);
		
//		如果浮点数大于int的最大值，肯定是错的
		System.out.println(Integer.MAX_VALUE);
		
//		四舍五入
		System.out.println(Math.rint(35.9f));
//		返回double 36.0
		int y = (int)Math.rint(35.9f);
//		36.0->36
		System.out.println(y);
		
//		方法()=行为()=函数()
//		ceil天花板
		System.out.println(Math.ceil(4.777));
//		5.0
		
//		floor
		System.out.println(Math.floor(4.777));
//		4.0
		
		char b = 'a';
		System.out.println((int)b);
//		转为'a'的ASCII值
		
		System.out.println((char)48);
//		打印ASCII编码为48的字符
		
//		先括号、先乘除后加减，数据类型不同向大方向的算
		System.out.println(2+3/5+(int)6.3/3.0);
//		整数/整数=整数
//		= 2 + 0 + 6 / 3.0
//		= 2 + 2.0
//		= 4.0
//		double 4.0
		
		System.out.println(2+3/5+(int)(6.3/3.0));
//		= 2 + 0 +2
//		= 4
//		int 4
		
		System.out.println(2+3/5+6.3/3.0);
//		= 2 + 0 + 2.1
//		= 4.1
//		double 4.1
		
		System.out.println(2.0+3/5+6.3/3.0);
//		= 2.0 + 0 + 2.1
//		= 4.1
//		double 4.1
		
		System.out.println(2+3/5.0+6.3/3.0);
//		= 2 + 2.6 + 2.1
//		= 4.7
		
		System.out.println("test="+8888);
//		test=8888
		System.out.println(8888+"test");
//		8888test
		
//		parseInt、valueOf、decode将"纯数字的字符串"转为数字
		String aa = "250";
		int bb = Integer.parseInt(aa);
//		System.out.println((Integer.parseInt("xxx111")));
//		System.out.println((Integer.parseInt("11xxx")));
		Integer dd = Integer.valueOf("55");
		Integer ee = Integer.decode(aa);
		System.out.println(aa+" "+bb+" "+dd+" "+ee);
		
//		学号:07180701
//		成绩1：98.5
//		成绩2：94.0
//		成绩：78.5
//		性别：f
//		是否理科：tre
//		班级排名：5
		
		String studentId = "07180701";
		double grade1 = 98.5;
		double grade2 = 94.0;
		double grade3 = 78.5;
		char sex = 'f';
		boolean isScience = true;
		int order = 5;
		
		Scanner scanner = new Scanner(System.in);
//		Scanner.next() 字符串
//		Scanner.nextDouble()
//		字符串编码从0开始
//		sex = scanner.next().charAt(0);
//		获取字符串的第一个字符
		
//		百度：Java+内容
//		一下程序输出内容是什么？
		byte a1 = 1;
		short b1 = 2;
		int c = 3 ;
		long d = 4L;
		float e = 5.0f;
		
//		1 + 2 - 1 *5.0f
//		= 3 - 5.0f 
//		= -2.0f
		System.out.println(a1+b1-d/c*e);
	}

}
