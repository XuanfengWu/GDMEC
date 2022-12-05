import javax.swing.*;
import java.util.Arrays;

public class Main12_05 {
    public static void main(String[] args) {
//      课后作业：在线练习十二、十三、十四

        int[] f = {6, 9, 3};
        for (int aa : f) {
//          依次取出数组的元素，存放在变量a中
            System.out.println(aa);
        }

//      src source源 srcPos source position源位置
//      dest destination目标 destPos destination position
//      void System.arraycopy(Object src,int srcPos,Object dest,int destPos,int length)

        int a = 100;
        int b = a;
//      将a的值复制到b中
        int[] h = f;
//      f是引用类型,h引用了f的内容 h是f,f就是h

//      算法一
        int[] g = new int[f.length];
//      声明一个数组
        System.arraycopy(f, 0, g, 0, f.length);
        f[0] = 66;
//      f和g完全独立
        for (int aa : g) {
            System.out.println(aa);
        }

//      算法二
        int[] c = new int[f.length];
//      声明一个数组
        for (int i = 0; i < f.length; i++) {
            c[i] = f[i];
//          f[i]是基本数据类型
        }

//      算法三
        int index = 0;
        for (int x : f) {
            c[index++] = x;
        }

        int d[] = {1, 2, 3};
        int e[] = {2, 3, 4};
        Main12_05.addArray(d, e);
        for (int t : e) {
            System.out.print(t + " ");
        }
        System.out.println();

//      随机产生含有10个元素的随机数组
//      利用Arrays类提供的方法对它进行排序、查找操作
        System.out.println(Math.random());
//      0-1之间随机数
        System.out.println(Math.rint(55.6));
//      四舍五入
        int[] k = new int[10];
        for (int i = 0; i < k.length; i++) {
//          强制转换(四舍五入(放大百倍))
            k[i] = (int) (Math.rint(Math.random() * 100));
        }
        Arrays.sort(k);
        for (int x : k) {
            System.out.print(x + " ");
        }
        System.out.println();

        //      案例跳水运动员评分方案

//      计算并打印五个学生的总成绩,每位同学有三科,竖向排列
//
        int score[][] = {
                {22120501, 22120502, 22120503, 22120504, 22120505},
                {90, 78, 89, 76, 88},
                {90, 68, 69, 96, 78},
                {80, 98, 89, 76, 68}
        };
//      有多少列，就有多少个同学
        int[] sum = new int[score[0].length];
//      为每一位同学计算总分
        for (int i = 0; i < score[0].length; i++) {
//          列举每一位同学的列号
            sum[i] = 0;
            for (int j = 1; j < score.length; j++) {
                sum[i] += score[j][i];
            }
        }
//      输出学号
        for (int id : score[0]) {
            System.out.print(id + "\t");
        }
        System.out.println();
//      输出总分
        for (int s : sum) {
            System.out.print(s + "\t\t\t");
        }
        System.out.println();
    }

    //      编程实现两个数组的相加,将结果存入第二个数组当中
//      引用类型作参数,函数影响内容,影响原始实参
    static void addArray(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i] + b[i];
        }
    }
}

