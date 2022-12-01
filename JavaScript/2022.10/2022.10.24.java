public class Main24 {
    public static void main(String[] args) {
        int s = 1;
//                     T
        boolean t = 3 > 2 || s++ > 5;
//      s++不运算
        System.out.println(s);
//      1

        t = 3 > 2 | s++ > 5;
//      s++有运算，2
        System.out.println(s);

        t = 3 < 2 | s++ > 5;
//      简洁与，右边不运算
        System.out.println(s);

        int a = 8;
//      奇数，最低位是1
        a = a&1;
//      一个数同，与运算，可以取出最低位
        System.out.println(a);
//      判定一个数的奇偶

        a = 123;
        String str = (a&1)==1?"奇":"偶";
        System.out.println(str);

//      方式二
        str = (a%2==1)?"奇":"偶";
        System.out.println(str);

//      ^异（不同）1^0=1 0^1=1 1^1=0 0^0=0
        byte b = 3;
//      00000011,特点：最高位为0
        byte c = -3;

//      负数，补码表示：正数的反码+1
//      3 -> 11，3的反码：11111100 +1
//      -3 -> 11111101,特点最高位为1
//      符号位保持不变，正数最高位补0，负数最高位补1
//      3>>1， 00000011 -> 00000001
//      -3>>1，11111101 -> 11111110
//      >>带符号右移，相当于除以2

        int d = 3;
        d = d >> 1;
        System.out.println(d);

        int e = -3;
        e = e >> 1;
        System.out.println(e);

//      逻辑右移，左边补0，出来的数，会出人意料
        int f = -3;
        f = f >>> 1;
        System.out.println(f);
//      2147483646
//      1111,1111,1111,1111,1111,1111,1111,1101  =-1
//      01111,1111,1111,1111,1111,1111,1111,110
//      原来是负数->正数

//      将学号1~8的8位同学的性别加密存储在一个byte中，
//      规则是某位同学的性别为男，则将对应数位置为1，
//      否则置为0。已知这个数为120，请破译他们的性别。

        int sex = 120;
//      取出最后8位来判断
//      与1进行，与运算，取出最低位
        int j = sex&1;
        char ss = j==1?'男':'女';
        System.out.println(ss);

        sex  = sex>>1;
//      消掉最低位
        j = sex&1;
        ss = j==1?'男':'女';
        System.out.println(ss);

        sex  = sex>>1;
//      消掉最低位
        j = sex&1;
        ss = j==1?'男':'女';
        System.out.println(ss);

        sex  = sex>>1;
//      消掉最低位
        j = sex&1;
        ss = j==1?'男':'女';
        System.out.println(ss);

        sex  = sex>>1;
//      消掉最低位
        j = sex&1;
        ss = j==1?'男':'女';
        System.out.println(ss);

        sex  = sex>>1;
//      消掉最低位
        j = sex&1;
        ss = j==1?'男':'女';
        System.out.println(ss);

        sex  = sex>>1;
//      消掉最低位
        j = sex&1;
        ss = j==1?'男':'女';
        System.out.println(ss);

//      ftp://betgod.cn 里面download

    }
}
