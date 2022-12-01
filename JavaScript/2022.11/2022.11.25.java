import java.util.Arrays;
import java.util.LinkedHashMap;

public class Main11_25 {
    public static void main(String[] args) {
        int a = 100, b = 200;
//      交换数据
        int c = a;
//      a腾出空间
        a = b;
//      b腾出空间
        b = c;
        System.out.println("交换后:" + a + "," + b);

//      颠倒数组的顺序
        int d[] = {44, 66, 77, 22, 88, 99};
        Main11_25.printArray(d);
//      类名调用static函数
//      o <--> [d.length-1] - 0
//      1 <--> [d.length-1] - 1
//      i <--> [d.length-1] - i
        for (int i = 0; i < d.length / 2; i++) {
            int temp = d[i];
//          存储左边的元素
            d[i] = d[d.length - 1 - i];
            d[d.length - 1 - i] = temp;
        }
        Main11_25.printArray(d);
//      类名调用static函数

//      复制数组，实现数组颠倒
        int e[] = {44, 66, 77, 22, 88, 99};
        int f[] = new int[e.length];
//      f数组与原数组一样大/长度一样
//      i是下标，不是元素
        for (int i = e.length - 1, j = 0; i >= 0; i--, j++) {
            System.out.print(e[i] + " ");
            f[j] = e[i];
        }
        System.out.println();
        Main11_25.printArray(f);
//      输出

//      Java 二进制数据，二进制运算，排序，类定义

//      擂台赛，数组排序
        int h[] = {44, 66, 77, 22, 88, 99};
//      升序排序
//      确认最左边n-1个是谁，[0 - h.length-2]
        for (int i = 0;i<=h.length-2;i++){
//          1.在范围[i,h.length-1]找最小值
//          假设最左边元素是最小值
            int minI = i;
//          记录最小值的下标，最小值表示h[minI]
            for (int j=i;j<h.length;j++){
                if (h[minI]>h[j]){
//                  找到了更小的值，把下标记录
                    minI = j;
//                  记录最小值的下标
                }
            }
//          找到最小值的下标minI，最小值h[minI]
//          2.把找到的最小值，交换到i的位置
            int temp = h[i];
//          腾空h[i]
            h[i] = h[minI];
//          把最小值h[minI]赋值给最小值下标h[i]
            h[minI] = temp;
//          把最小值h[minI]赋值给腾空的temp
        }
//      排好序，进行输出
        Main11_25.printArray(h);

//      sort()数组排序
        int k[] = {47,61,73,29,82,94};
        System.out.println("原始数组:");
        Main11_25.printArray(k);
        Arrays.sort(k);
//      排序
        System.out.println("排序后的数组:");
        Main11_25.printArray(k);

//      快速排序、冒泡排序、快速排序、堆排序

        int m[]= {29,47,61,73,82,94};
//      顺序查找，57
//      如果没有找到结果-1，找到结果，返回下标
        int ret = -1;
        int target = 47;
        for (int i=0;i< m.length;i++){
            if (target == m[i]){
                ret = i;
                break;
            }
        }
        if (ret == -1){
            System.out.println("没有找到数据");
        }else {
            System.out.println("找到数据在位置:"+ret);
        }

    }

    //打印数组,在主函数外面定义的函数
    static void printArray(int[] d) {
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i] + " ");
        }
        System.out.println();
    }
}
