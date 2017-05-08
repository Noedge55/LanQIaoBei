import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class RiskMeasure {
    public static int space[] ;     //空间站数组，并判断是否被访问，若访问过则为1否则为0
    public static int route[][] ;   //路径数组表示空间站之间的路径，路径存在即为1否则为0
    public static List<Integer[]> res = new ArrayList<>();  //存放所有符合条件的路径数组
    public static Stack<Integer> stack = new Stack<>(); //用栈表示某条路径
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        space = new int[n] ;
        route = new int[n+1][n+1];
        for(int i = 0 ; i < m ; i++){   //输入路径
            int a = scanner.nextInt() ;
            int b = scanner.nextInt() ;
            //表示无向路径
            route[a][b] = 1 ;       
            route[b][a] = 1 ;
        }
        int start = scanner.nextInt();
        int end = scanner.nextInt() ;
        scanner.close();
        dfs(start,end);     //利用dfs找出所有符合条件的路径
        int count[] = new int[n+1] ;
        for(int i = 0 ; i < res.size() ;i++){
            for(int j = 0 ; j < res.get(i).length ; j++){
                count[res.get(i)[j]] ++ ;   //记录节点在所有路径中出现的次数
            }
        }
        int c = 0 ;
        for(int i = 1 ; i < count.length ; i ++){
            if(count[i] == res.size() && i != start && i != end){   //若某个节点出现的次数与路径条数相等则关键节点数+1
                c ++ ;
            }
        }
        System.out.println(c);
    }
    private static void dfs(int start, int end) {
        stack.push(start);  //将首节点入栈
        space[start] = 1 ;  //并将该节点设为以访问状态
        while(true){
            if(start == end){   //搜索完毕
                Integer[] oneRoute = new Integer[stack.size()] ;    //存放该路径的数组
                for(int i = 0 ; i < stack.size() ; i++){
                    oneRoute[i] = stack.get(i) ;    
                }
                res.add(oneRoute) ;//将该路径添加进list中
                stack.pop();    //将栈顶元素弹出
                space[start] = 0 ;  //并设为未访问状态
                break;
            }
            for(int i = 0 ; i < route.length ; i++){
                if(route[start][i] == 1 && space[i] == 0){//搜索下一个未访问的且与当前节点有链路的节点
                    dfs(i,end);
                }
            }
            //搜索完最后的节点了，即到达边界了
            stack.pop();
            space[start] = 0 ;
            break ;
        }
    }
}