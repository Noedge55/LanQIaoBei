import java.util.Scanner;
class Line{// 定义路径类Line
    private int head ; //路径头
    private int tail ; //路径尾
    public int getHead() {
        return head;
    }
    public void setHead(int head) {
        this.head = head;
    }
    public int getTail() {
        return tail;
    }
    public void setTail(int tail) {
        this.tail = tail;
    }
}
public class ALGO_48 {
    public static int m = 0,n = 0 ;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        if(scanner.hasNext()){
            n = scanner.nextInt() ;
            m = scanner.nextInt() ;
        }
        Line line [] = new Line[m] ;
        for(int i = 0 ; i < m ; i++){
            line[i] = new Line() ;
            if(scanner.hasNext()){
                line[i].setHead(scanner.nextInt());
                line[i].setTail(scanner.nextInt());
            }
        }
        print(line) ; //计算并输出关联矩阵
    }
    private static void print(Line[] line) {
        int matrix[][] = new int[n][m] ; //matrix[][]二维数组用来保存矩阵，每一列表示一个路径
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){//按列遍历
                matrix[j][i] = 0 ;//初始化
                if(j+1 == line[i].getHead()){
                    matrix[j][i] = 1 ; //路径头等于数组的i列j+1行则j行置1
                }
                if(j+1 == line[i].getTail()){
                    matrix[j][i] = -1 ; //路径尾等于数组的i列J+1行则j行置-1
                }
            }
        }
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){//按行遍历输出该关联矩阵
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}