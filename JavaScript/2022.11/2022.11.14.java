public class Main11_14 {
//  定义sum，加法运算
    int add(int a,int b ) {
        int sum = a + b;
        return sum;
    }
//  定义mul，乘法运算
    double mul(double c,double d){
        double result = c * d;
        return result;
    }

//      静态函数 static
    static double circleArea(double r){
        double result = 0;
        result = 3.14 * r * r;
        return result;
//      输出产品
    }

    public static void main(String[] args) {
//      主函数
//      形参，加工厂有两个容器，
//      函数定义和调用
//      产品类型 工厂名 (原料1，原料2){
//          加工过程
//          return 产品;
//      }


//      函数的定义必须在主函数外面
//      定义函数时，不会运行，调用时再运行

//      函数调用
//      1.普通函数调用 对象.函数()
        Main11_14 test = new Main11_14();
        int x = test.add(4,6);
//                       实参
        System.out.println(x);

        double y = test.mul(10,6);
        System.out.println(y);

//      2.静态函数调用 类名.静态函数()
        double area = Main11_14.circleArea(100.0);
        System.out.println("圆面积是:"+area);



    }
    }
