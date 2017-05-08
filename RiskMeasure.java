import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class RiskMeasure {
    public static int space[] ;     //�ռ�վ���飬���ж��Ƿ񱻷��ʣ������ʹ���Ϊ1����Ϊ0
    public static int route[][] ;   //·�������ʾ�ռ�վ֮���·����·�����ڼ�Ϊ1����Ϊ0
    public static List<Integer[]> res = new ArrayList<>();  //������з���������·������
    public static Stack<Integer> stack = new Stack<>(); //��ջ��ʾĳ��·��
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        space = new int[n] ;
        route = new int[n+1][n+1];
        for(int i = 0 ; i < m ; i++){   //����·��
            int a = scanner.nextInt() ;
            int b = scanner.nextInt() ;
            //��ʾ����·��
            route[a][b] = 1 ;       
            route[b][a] = 1 ;
        }
        int start = scanner.nextInt();
        int end = scanner.nextInt() ;
        scanner.close();
        dfs(start,end);     //����dfs�ҳ����з���������·��
        int count[] = new int[n+1] ;
        for(int i = 0 ; i < res.size() ;i++){
            for(int j = 0 ; j < res.get(i).length ; j++){
                count[res.get(i)[j]] ++ ;   //��¼�ڵ�������·���г��ֵĴ���
            }
        }
        int c = 0 ;
        for(int i = 1 ; i < count.length ; i ++){
            if(count[i] == res.size() && i != start && i != end){   //��ĳ���ڵ���ֵĴ�����·�����������ؼ��ڵ���+1
                c ++ ;
            }
        }
        System.out.println(c);
    }
    private static void dfs(int start, int end) {
        stack.push(start);  //���׽ڵ���ջ
        space[start] = 1 ;  //�����ýڵ���Ϊ�Է���״̬
        while(true){
            if(start == end){   //�������
                Integer[] oneRoute = new Integer[stack.size()] ;    //��Ÿ�·��������
                for(int i = 0 ; i < stack.size() ; i++){
                    oneRoute[i] = stack.get(i) ;    
                }
                res.add(oneRoute) ;//����·����ӽ�list��
                stack.pop();    //��ջ��Ԫ�ص���
                space[start] = 0 ;  //����Ϊδ����״̬
                break;
            }
            for(int i = 0 ; i < route.length ; i++){
                if(route[start][i] == 1 && space[i] == 0){//������һ��δ���ʵ����뵱ǰ�ڵ�����·�Ľڵ�
                    dfs(i,end);
                }
            }
            //���������Ľڵ��ˣ�������߽���
            stack.pop();
            space[start] = 0 ;
            break ;
        }
    }
}