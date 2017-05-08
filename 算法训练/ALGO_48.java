import java.util.Scanner;
class Line{// ����·����Line
    private int head ; //·��ͷ
    private int tail ; //·��β
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
        print(line) ; //���㲢�����������
    }
    private static void print(Line[] line) {
        int matrix[][] = new int[n][m] ; //matrix[][]��ά���������������ÿһ�б�ʾһ��·��
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){//���б���
                matrix[j][i] = 0 ;//��ʼ��
                if(j+1 == line[i].getHead()){
                    matrix[j][i] = 1 ; //·��ͷ���������i��j+1����j����1
                }
                if(j+1 == line[i].getTail()){
                    matrix[j][i] = -1 ; //·��β���������i��J+1����j����-1
                }
            }
        }
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){//���б�������ù�������
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}