import java.util.Arrays;

public class Main11_28 {
    static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    //  打印字符，函数名相同，形参不同：数据类型不同、个数不同
//  重载
    static void printArray(char[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
//      课后作业：单元测试八、九
        int a[] = {72, 83, 45, 70, 81, 91, 63};
        Arrays.sort(a);
//      对数组升序排序
        Main11_28.printArray(a);
//      顺序查找：
//      对数组没有要求
//      折半查找：
//      先决条件：数组已经排好序
//      首先比较最中间元素，如果发现目标元素更大，下一步找右边[m+1.R]
//      如果发现目标元素更小，下一步找左边内容[L,m-1]
        int target = 91;
        int found = -1;
//      没有找到
        int left = 0;
//      左边界
        int right = a.length - 1;
//      右边界
        while (left <= right) {
//          找不到的时候，right<left
            int middle = (left + right) / 2;
            if (a[middle] == target) {
                found = middle;
//              找到
                break;
//              找到了，退出循环
            } else if (a[middle] < target) {
//              目标值更大
                left = middle + 1;
//              在左边找
            } else {
                right = middle - 1;
//              在右边找
            }
        }
        if (found == -1) {
            System.out.println("未找到");
        } else {
            System.out.println("找到了,在第" + found + "位");
        }

        char c1[] = {'a', 'b', 'c'};
        char c2[] = {'a', 'b', 'c'};
//      char[][] c = {c1, c2};
//      二维数组中的元素是一维数组
        char[][] c = {
                {'a', 'b', 'c'},
                {'e', 'f', 'g'}
        };
        for (int i = 0; i < c.length; i++) {
//          c.length指二维数组中包括的一维数组个数
            Main11_28.printArray(c[i]);
        }
//      c.length表示行数
//      c[0].length表示 c[0]行的元素个数

//      期末考
//      1.二维数组的声明
        int[][] d;
//      2.二维数组空间分配
        d = new int[3][4];
//      分配三行四列的空间，最大下标元素d[2][3]
//      3.二位数组初始化
        for (int i = 0; i < d.length; i++) {
//          遍历每一行
//          当前行：d[i]，看成一个整体，变量
            for (int j = 0; j < d[i].length; j++) {
                d[i][j] = i + j;
            }
        }

//      输出每一行的内容
        for (int i = 0; i < d.length; i++) {
            Main11_28.printArray(d[i]);
        }

//      创建一个二维数组，存储你的课表
//      String[][] classTable = new String[5][4];
        String[][] classTable = {
                {"JAVA", "数学", "物理", "数据库"},
                {"数学", "JAVA", "数据库", "语言"},
                {"JAVA", "数据库", "语言", "数字"},
                {"JAVA", "语言", "数学"},
                {"", "语言", "数学", "JAVA"}
        };
        System.out.println(classTable[0][0]);
    }

}
