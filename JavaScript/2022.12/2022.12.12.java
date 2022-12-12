//  普通类,学生类
class Main2205_1212 {
    String studentId;
    String name;
    int age;
    float height;

    //  构造函数，左边不要加返回类型
    Main2205_1212() {
//      缺省构造函数
//      初始化成员变量
//      属性、成员变量
        studentId = "22120537";
        name = "吴炫枫";
        age = 19;
        height = 1.85f;
    }
    Main2205_1212(int age,String name) {
        this.age = age;
        this.name = name;
    }


    //  行为、成员方法、函数 左边有返回值的类型
    void saySelf() {
        System.out.println("我的名字:" + name);
//      成语函数中可以使用成员变量
    }
}

//  公共类
public class Main12_12 {
    public static void main(String[] args) {
        Main2205_1212 test = new Main2205_1212();
//      使用缺省构造函数
        test.saySelf();
        Main2205_1212 test1 = new Main2205_1212(19,"hello");
        test1.saySelf();
        for (String x : args) {
            System.out.println(x);
        }
        ;
//      传参数:   命令   class文件名    参数
//      命令窗口: java Main12_12 one two three

//      equals. 判定是否内容相同
//      ==是否是同一个对象

//      String.valueOf(基本数据类型)
        String a = String.valueOf(true);
        String b = String.valueOf(1111);
        String c = String.valueOf(33.3333);
        String d = String.valueOf("h");
//      其他数据转字符串
        System.out.println(12345 + "");

//      字符串转其他数据类型
//      目标类.parse目标类(字符串)
        boolean e = Boolean.parseBoolean("true");
        int f = Integer.parseInt("444");
        char g = "abcd".charAt(0);
        char[] h = "abcd".toCharArray();
        boolean i = Boolean.getBoolean("false");

        if (Main12_12.checkBankCard("5432123456788881")) {
            System.out.println("卡号正确");
        } else {
            System.out.println("卡号不正确");
        }
    }
//      银行卡验证
//      当你输入信用卡号码的时候，有没有担心输错了而造成损失呢？其实可以不必这么担心，因为并不是一个随便的信用卡号码都是合法的，它必须通过Luhn算法来验证通过。该校验的过程：
//      1、从卡号最后一位数字开始，逆向将奇数位(1、3、5等等)相加。
//      2、从卡号最后一位数字开始，逆向将偶数位数字，先乘以2（如果乘积为两位数，则将其减去9），再求和。
//      3、将奇数位总和加上偶数位总和，结果应该可以被10整除。
//      例如，卡号是：5432123456788881
//      则奇数、偶数位（用红色标出）分布：5432123456788881。奇数位和=35。偶数位乘以2（有些要减去9）的结果：1 6 2 6 1 5 7 7，求和=35。最后35+35=70 可以被10整除，认定校验通过。
//      请编写一个程序，从标准输入获得卡号，然后判断是否校验通过。通过显示：“成功”，否则显示“失败”。
//      比如，用户输入：356827027232780，程序输出：成功

//      卡号:594321
//      倒数的奇数位直接相加: 5 3 1  sum=5+3+1
//      倒数的偶数位2倍，大于9要减9: 9 2    sum=(9*2)+(2*2)

    static boolean checkBankCard(String cardNo) {
        StringBuffer str = new StringBuffer(cardNo);
//          字符串转StringBuffer
        str.reverse();
        char[] cardNumber = str.toString().toCharArray();
//          StringBuffer转字符数组
        int i = 1;
        int sum = 0;
//          和值
        for (char c : cardNumber) {
            if (i % 2 == 1) {
                sum += c - '0';
//                  字符转对应的数字，原来是ASCII码
            } else {
                int temp = 2 * (c - '0');
                if (temp > 9)
                    temp -= 9;
                sum += temp;
            }
            i++;
//              数数位
        }
        if (sum % 10 == 0) {
//          和是10的整数倍
            return true;
        } else {
            return false;
        }
    }
}
