import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		�Զ���������ת��
//		��װ��-����������  byte->short->int->long->float->double
//		int <-> char
		
//		'B'='a' 
//		= 66 - 65
//		= 1
//		ASCII���� 'B'Ϊ66 'A'Ϊ65
		
//		Ϊʲô�����������룿
//		ǿ��ת��Ҫ����Ա�Լ���֤�������ȷ��
		int x = (int)35.9;
		
//		ǿ��ת����Ŀ�����ͣ�ԭʼ���ݣ�ֱ��ȥ��С������
		System.out.println(x);
		System.out.println((int)3.14e33);
		
//		�������������int�����ֵ���϶��Ǵ��
		System.out.println(Integer.MAX_VALUE);
		
//		��������
		System.out.println(Math.rint(35.9f));
//		����double 36.0
		int y = (int)Math.rint(35.9f);
//		36.0->36
		System.out.println(y);
		
//		����()=��Ϊ()=����()
//		ceil�컨��
		System.out.println(Math.ceil(4.777));
//		5.0
		
//		floor
		System.out.println(Math.floor(4.777));
//		4.0
		
		char b = 'a';
		System.out.println((int)b);
//		תΪ'a'��ASCIIֵ
		
		System.out.println((char)48);
//		��ӡASCII����Ϊ48���ַ�
		
//		�����š��ȳ˳���Ӽ����������Ͳ�ͬ��������
		System.out.println(2+3/5+(int)6.3/3.0);
//		����/����=����
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
		
//		parseInt��valueOf��decode��"�����ֵ��ַ���"תΪ����
		String aa = "250";
		int bb = Integer.parseInt(aa);
//		System.out.println((Integer.parseInt("xxx111")));
//		System.out.println((Integer.parseInt("11xxx")));
		Integer dd = Integer.valueOf("55");
		Integer ee = Integer.decode(aa);
		System.out.println(aa+" "+bb+" "+dd+" "+ee);
		
//		ѧ��:07180701
//		�ɼ�1��98.5
//		�ɼ�2��94.0
//		�ɼ���78.5
//		�Ա�f
//		�Ƿ���ƣ�tre
//		�༶������5
		
		String studentId = "07180701";
		double grade1 = 98.5;
		double grade2 = 94.0;
		double grade3 = 78.5;
		char sex = 'f';
		boolean isScience = true;
		int order = 5;
		
		Scanner scanner = new Scanner(System.in);
//		Scanner.next() �ַ���
//		Scanner.nextDouble()
//		�ַ��������0��ʼ
//		sex = scanner.next().charAt(0);
//		��ȡ�ַ����ĵ�һ���ַ�
		
//		�ٶȣ�Java+����
//		һ�³������������ʲô��
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
