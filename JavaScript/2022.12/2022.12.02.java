public class Main12_02 {
    static void printArray(String[][] d) {
//      列举每一个行下标，注意最大行号比行数少1
        for (int i = 0; i < d.length; i++) {
//          当前行:d[i]
//          遍历每一个列号
            for (int j = 0; j < d[i].length; j++) {
                System.out.print(d[i][j] + "\t");
            }
            System.out.println();
//          打印完每一行，换行
        }
    }

    //  函数名相同，只是参数不同：重载
    static void printArray(boolean[][] d) {
//      列举每一个行下标，注意最大行号比行数少1
        for (int i = 0; i < d.length; i++) {
//          当前行:d[i]
//          遍历每一个列号
            for (int j = 0; j < d[i].length; j++) {
                System.out.print(d[i][j] + "\t");
            }
            System.out.println();
//          打印完每一行，换行
        }
    }


    static void add(int a) {
        a = a + 1;
    }

    //  引用类型，引用
//  a数组引用 原来的实参
    static void add(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] *= 2;
//          会修改到原始数据
        }
    }

    public static void main(String[] args) {
        int x = 100;
        Main12_02.add(x);
//      将x复制给形参
        System.out.println(x);
//      测试参数引用

        int y[] = {11, 22, 33};
        Main12_02.add(y);
//      形参会引用y
        System.out.println(y[0]);


        String[][] classTable = {
                {"JAVA", "数学  ", "物理  ", "数据库 "},
//              classTable[0]
                {"数学 ", "JAVA", "数据库  ", "语言  "},
//              classTable[1]
                {"JAVA", "数据库 ", "语言  ", "数字  "},
//              classTable[2]
                {"JAVA", "    ", "语言  ", "数学  "},
//              classTable[3]
                {"    ", "语言  ", "数学  ", "JAVA"}
//              classTable[4]
        };
        System.out.println("行数:" + classTable.length);
//      5行
        System.out.println("0行元素个数:" + classTable[0].length);
//      4列
        Main12_02.printArray(classTable);

//      复制
        int a = 1000;
        int b = a;
//      把a的内容复制到b中
        b = 2000;
        System.out.println(a);

//      引用
        int[] c = {10, 20, 30};
//      d引用c,d没有分配空间，d是c，c就是d
        int[] d = c;
//      d是一个数组，不是简单数据类型，引用类型
        d[0] = 1111;
//      修改d[0],修改了c[0]
        System.out.println(c[0]);

        boolean holidays[][] = {
                {true, false, true},
                {false, true},
                {true, false, true, true},
        };
        Main12_02.printArray(holidays);

//      用二维数组存储九九乘法表中的所有数，然后输出
        String[][] mulTable = new String[9][];
//      分配9行
//      遍历每一行
        for (int i = 0; i < mulTable.length; i++) {
            mulTable[i] = new String[i + 1];
//          列元素个数比行号大1
//          遍历每一列
            for (int j = 0; j < mulTable[i].length; j++) {
                String str = (j + 1) + "*" + (i + 1) + "=" + j * i;
//                  写入数组
                mulTable[i][j] = str;
            }
        }
        Main12_02.printArray(mulTable);

//      for(类型为数组中元素的类型 变量名:数组){}
        int[] f = {6, 9, 3};
        for (int aa : f) {
//          依次取出数组的元素，存放变量a中
            System.out.println(aa);
        }
        char[] ff = {'r', 'c', 'p'};
        for (char a1 : ff) {
//      依次取出数组的元素，存放变量a中
            System.out.println(a1);
        }
        int[][] f3 = {
                {1, 3, 5},
                {2, 3, 6},
                {3, 6, 9}
        };
        for (int[] a3 : f3) {
//            二维数组取出每一行，类型为一维数组
//            取出每一行
//            a3中存储一行，一维数组:{1,3,5}
            for (int b3 : a3) {
                System.out.print(b3 + " ");
            }
            ;
            System.out.println();
//          换行
        }
//      期末考试：学习通
//      机改：选择题、填空题
//      人改：编程题
    }
}
