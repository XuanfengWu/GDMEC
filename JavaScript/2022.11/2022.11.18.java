public class Main11_18 {
    void fn(int n) {
        if (n == 1 || n == 2) {
            System.out.println(1 + ",");
        }
        long f1 = 1, f2 = 1, f3;
        for (int i = 3; i <= n; i++) {
            f3 = f1 + f2;
            System.out.println(f3 + ",");
            f1 = f2;
            f2 = f3;
        }
        System.out.println();
    }


    //  递归函数，自己调用自己
//  n! = n* (n-1)!
//  写一个函数，计算n!
    long rankN(int n) {
//      首先判定知道答案，直接返回答案
        if (n == 0) {
            return 1;
        } else {
//          将复杂转换为规模更小的问题
            return n * rankN(n - 1);
//          自己调用自己,递归
        }
    }

    int Fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Main11_18 test = new Main11_18();
        test.fn(10);
//      多分支语句:if_else语句的嵌套
        int a = 33;
//      主函数中的局部变量，只能在主函数中使用
        {
            int b = 22;
//          是大括号中局部，只能在本括号中使用，在大括号中可以使用大括号前定义的变量
            System.out.println(a + b);
        }
//      System.out.println(b);
//      不使用大括号中的局部变量
    }
}
