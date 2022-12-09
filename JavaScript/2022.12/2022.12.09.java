public class Main12_09 {
    public static void main(String[] args) {
        for (String x:args){
            System.out.println(x);
        };
//      计算二维数组的最小值及所在的行号和列号
        int[][] arr = {
                {45, 67, 34, 34},
                {1, 23, 0, 90},
                {34, 56, 67, 34}
        };
//      假设最小值所在下标是，arr[0][0]
        int minI = 0;
//      最小值的行标签
        int minJ = 0;
//      最小值的列标签
//      遍历行
        for (int i = 0; i < arr.length; i++) {
//          arr[i],遍历列
//          当前的最小值，arr[minI][minJ]
            for (int j = 0; j < arr[i].length; j++) {
//              找到更小值
                if (arr[minI][minJ] > arr[i][j]) {
//                  更小的下标
                    minI = i;
                    minJ = j;
                }
            }
        }
        System.out.println("(" + minI + "," + minJ + "):" + arr[minI][minJ]);
        char[] a = {'a', 'b', 'c', 'd'};
//      四个变量
        String b = "abcd";
//      一个变量
        System.out.println(a[1]);
//      'b'
        System.out.println(b.charAt(1));
//      'b'

        a[0] = 'A';
        b = "ABCD";
//      字符串不能修改单个字符，可以对整个变量重新赋值

//      栈中的局部变量，"abcd"字符串常量
        String a1 = "abcd";
        String b1 = "abcd";
//      a1、b1共享一个存储空间
//      a1、b1是同一个对象，有两个名字

//      ==是否是同一个对象
        System.out.println(a1 == b1);
//      true
//      equals. 判定是否内容相同
        System.out.println(a1.equals(b1));
//      true

//      new在堆中分配存储空间
//      a2、b2有单独的存储空间
        String a2 = new String("abcd");
        String b2 = new String("abcd");
        System.out.println(a2 == b2);
//      false
//      equals. 判定是否内容相同
        System.out.println(a2.equals(b2));
//      true

        String c = new String();
//      构造一个空字符串
        String d = new String("12345678");
//      构造字符串
        char[] e = {'示', '范', '院', '校', '验', '收'};
        String f = new String(e);
//      "示范院校验收"
        System.out.println(f);

//      遍历字符串 f.length()是一个函数
        char target = '校';
        for (int i = 0; i < f.length(); i++) {
            char c1 = f.charAt(i);
//          取出i位置的字符
            if (c1 == target) {
                System.out.println(i);
                break;
            }
        }
//      统计某字符串str中元音字母出现的次数
        String g = "wyeWREiTYEWRTyewqpuiwy34962wiutyoi";
        int counter = 0;
        for (int i = 0; i < g.length(); i++) {
            char c1 = g.charAt(i);
            switch (c1) {
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'O':
                case 'o':
                case 'u':
                case 'U':
                    counter++;
                    break;
            }
        }
        System.out.println("元音字母出现的次数:" + counter);

        counter = 0;
//      计数器
        g = g.toLowerCase();
//      转小写
        for (int i = 0; i < g.length(); i++) {
            char c1 = g.charAt(i);
//          取出i位置的字符
            if (c1 == 'a' | c1 == 'e' | c1 == 'i' | c1 == 'o' | c1 == 'u') {
                counter++;
            }
        }
        System.out.println("元音字母出现的次数:" + counter);

//      StringBuffer类，带缓冲的字符串
//      可以修改内容

//      颠掉字符串str的内容
        String str = "987654321";
//      思路一，将字符串转字符数组toCharArray(),利用数组来颠倒

//      思路二:依次读取字符，插入到StringBuffer0号位置
        StringBuffer str1 = new StringBuffer();
        for (int i=0;i<str.length();i++){
            char c1 = str.charAt(i);
//          插入到时SrtingBuffer0号位置
            str1.insert(0,c1);
        }
        System.out.println(str1);

//      思路三:利用reverse()
        StringBuffer str2 = new StringBuffer(str);
        str2.reverse();
        System.out.println(str2);
    }
}
