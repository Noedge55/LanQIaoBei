public class EnterNumber {
    public static int count = 0 ;   //记录方案数
    public static boolean isVisit[] = new boolean[10] ; //判断一个数是否被访问过 
    public static int a[][] = new int[3][4] ;   //填入方格里的数
    public static void main(String args[]){
        for(int i = 0 ; i < 3 ; i ++){  //初始化数据，（除了-1到10之间）的数都可行，这里初始化为-2
            for(int j = 0 ; j < 4 ; j++){
                a[i][j] = -2 ;
            }
        }
        for(int num = 0 ; num < 10 ; num++){//初始化所有数字均未填入
            isVisit[num] = false ;
        }
        find(0,1) ;
        System.out.println(count);
    }
    private static void find(int i, int j) {
        if(i == 2&&j==3){   //判断是否填入最后一个格子，若是的则方案数+1
            count++ ;
        }
        for(int num = 0 ; num < 10 ;num++){ //将0到9都填入该方格，看是否可行
            if(judge(num,i,j)&&!(isVisit[num])){    //若可行
                a[i][j] = num ; //将该数填入方格
                isVisit[num] = true ;   //并且将该数字设定为以访问
                if(j==3){   //若查询到达列尾
                    find(i+1,0) ;   //递归查询下一行
                }else{
                    find(i,j+1) ;   //递归查询下一列
                }
                //重置该方格的状态，以便下一个数填入
                a[i][j] = -2 ;  
                isVisit[num] = false ;
            }
        }
    }
    private static boolean judge(int num, int i, int j) {//判断相邻格子的数字是否连续
        if(i-1>=0 && (a[i-1][j] == num+1 || a[i-1][j] == num-1)){   //判断上方格子
            return false ;
        }
        if(j-1>=0 && (a[i][j-1] == num+1 || a[i][j-1] == num -1)){  //判断左方格子
            return false ;
        }
        if(i-1>=0 && j-1 >= 0 && (a[i-1][j-1] == num+1 || a[i-1][j-1] == num - 1)){ //判断左上方格子
            return false ;
        }
        if(i-1>=0 && j+1 < 4 && (a[i-1][j+1] ==num+1 || a[i-1][j+1] == num - 1)){   //判断右上方格子
            return false ;
        }
        if(j+1<4 && (a[i][j+1] == num+1 || a[i][j+1] == num-1)){    //判断右方格子
            return false ;
        }
        if(i+1<3 && (a[i+1][j] == num+1 || a[i+1][j] == num-1)){    //判断下方格子
            return false ;
        }
        if(i+1<3 && j-1>=0 && (a[i+1][j-1] == num+1 || a[i+1][j-1] == num-1)){  //判断左下方格子
            return false ;
        }
        if(i-1<0 && j+1<4 && (a[i+1][j+1] == num+1 || a[i+1][j+1] == num-1)){   //判断右下方格子
            return false ;
        }
        return true ;
    }
}