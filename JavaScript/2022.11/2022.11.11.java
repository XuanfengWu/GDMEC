public class Main11_11 {
    public static void main(String[] args) {
//      break 退出循环
//      continue 跳转[4]修改变量，提前进入下一轮循环
//      break是跳出循环不再执行
//      continue是跳过本次循环进入下次循环
        for(int i=1;i<10;i++){
            if (i<5)continue;
//          跳转[4]修改变量
            System.out.print(i+" ");
            System.out.println();
        }
//      不同的汉字代表不同的数字
//      中国钓鱼岛=中国*钓鱼*鱼岛
        for(int 中=1;中<=9;中++){
            for(int 国=0;国<=9;国++){
                for(int 钓=1;钓<=9;钓++){
                    for(int 鱼=1;鱼<=9;鱼++){
                        for(int 岛=0;岛<=9;岛++){
                            if(中==国||中==钓||中==鱼||中==岛||国==钓||国==鱼||国==岛||钓==鱼||钓==岛||鱼==岛){
                                continue;
//                              肯定不是答案，继续执行下一轮循环
                            }
                            if(中*10000+国*1000+钓*100+鱼*10+岛==(中*10+国)*(钓*10+鱼)*(鱼*10+岛)){
                                System.out.println("中国钓鱼岛："+中+国+钓+鱼+岛);
                            }
                        }

                    }
                }
            }
        }
//      1.初始化
//      while(2.条件成立){}
//      循环体、执行的内容
//      修改循环变量，如果没有死循环

//      求某个长整型中数字0的次数
//      算法思路：取出个位数，判定，删除个位数
        long num=10404506045704807L;
        int counter = 0;
        while(num>0){
            long ge = num%10;
//          取出个位
            if(ge==0){
                counter++;
            }
            num /=10;
//          删除个位
        }
        System.out.println("长整型中数字0的次数:"+counter);

        int n = 1;
        int i = 1;
//      乘积初始化不能为0
        while(i <= 8){
            n = (n*i);
//          [3]
            i++;
//          [4]
        }
        System.out.println("8的阶乘为："+n);

//      do while
//      1.初始化变量
//      do {
//          3.循环体
//          4.修改变量
//      }while(2.条件)；

//      do while 执行顺序
//      1、3、4、2 342 342

//      1-10偶数和 do while
        int u=1;
        int sum = 0;
        do {
//          偶数
            if((u&1)==0){
//              n%2==0
                sum += u;
            }
            u++;
        }while(u<=10);
        System.out.println("1-10偶数和:"+sum);
    }
}
