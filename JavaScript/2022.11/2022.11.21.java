public class Main11_21 {
//  编写一个方法，输出1 - 1/2 + 1/3 - 1/4 +... - 1/10的值
     static double fun(int n){
        double result = 0;
        for (int i=1;i<=n;i++){
            if (i%2==1){
                result +=1.0/i;
//              注意1.0/n 不能写出1/n
            }else {
                result -=1.0/i;
            }
        }
        return  result;
    }

    public static void main(String[] args) {
//      打印九九乘法表，二重循环代码
//      从第一行到第九行 1-9
        for(int row =1;row<=9;row++){
//          输出row这么多列，第几行就输出几列，第9行输出9列
//          1 - row
            for(int col=1;col<=row;col++){
                System.out.print(col+"*"+row+"="+col*row+"\t");
            }
            System.out.println();
        }


        System.out.println();
        double ret = Main11_21.fun(10);
        System.out.println("1 - 1/2 + 1/3 - 1/4 +... - 1/10 \n="+ret
        );

//      定义一个数组
        int a =10;
//      a.length是一个基本数据类型，没有方法和属性
//      b.length是数组的大小/长度
        int[]b={2,3,4,5,6,7};
//      特别注意，下标从0开始，最大下标比个数少1 b[0]-b[6]
        System.out.println(b[5]);
//      b[5]当成一个变量
        for (int i=0;i< b.length;i++){
            System.out.println(b[i]);
        }

//      1.声明一个数组，便于动态修改
        int[]c;
//      c={1,2,3,4,5,6,7}; 声明数组，不能与初始化分开
        c = new int[3];
//      2.在堆空间分配3个整数空间
//      3.初始化数据
        c[0] = 10;
        c[1] = 20;
        c[2] = 30;

//      与考试比较0接近
//      小明同学成绩为67 75 90 38 100，求平均分
        int[] score ={67,75,90,38,100};
        int sum = 0;
        for (int i=0;i<score.length;i++){
            sum += score[i];
        }
        float average = sum/score.length;
        System.out.println("平均分:"+average);

//      倒数遍历
        sum = 0;
        for (int i= score.length-1;i>=0;i--){
            sum +=score[i];
        }
        average = sum/score.length;
        System.out.println("平均分:"+average);

//      交换两个变量的内容
        int x = 100;
        int y = 200;
        int temp = x;
//      腾空x
        x = y;
        y = temp;
        System.out.println(x+","+y);

//      求比赛成绩{67，75，90，38，100}；
        float[] grade = {67,75,90,38,100};
        float max = grade[0];
        float min = grade[0];
        float total =0;
        for (int i=0;i< grade.length;i++){
            total += grade[i];
            if (max<grade[i]) max = grade[i];
            if (min>grade[i]) min = grade[i];
        }
        float lastDeFen = (total-max-min)/(grade.length-2);
        System.out.println("最后得分:"+lastDeFen);
    }
}
