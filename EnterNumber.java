public class EnterNumber {
    public static int count = 0 ;   //��¼������
    public static boolean isVisit[] = new boolean[10] ; //�ж�һ�����Ƿ񱻷��ʹ� 
    public static int a[][] = new int[3][4] ;   //���뷽�������
    public static void main(String args[]){
        for(int i = 0 ; i < 3 ; i ++){  //��ʼ�����ݣ�������-1��10֮�䣩���������У������ʼ��Ϊ-2
            for(int j = 0 ; j < 4 ; j++){
                a[i][j] = -2 ;
            }
        }
        for(int num = 0 ; num < 10 ; num++){//��ʼ���������־�δ����
            isVisit[num] = false ;
        }
        find(0,1) ;
        System.out.println(count);
    }
    private static void find(int i, int j) {
        if(i == 2&&j==3){   //�ж��Ƿ��������һ�����ӣ����ǵ��򷽰���+1
            count++ ;
        }
        for(int num = 0 ; num < 10 ;num++){ //��0��9������÷��񣬿��Ƿ����
            if(judge(num,i,j)&&!(isVisit[num])){    //������
                a[i][j] = num ; //���������뷽��
                isVisit[num] = true ;   //���ҽ��������趨Ϊ�Է���
                if(j==3){   //����ѯ������β
                    find(i+1,0) ;   //�ݹ��ѯ��һ��
                }else{
                    find(i,j+1) ;   //�ݹ��ѯ��һ��
                }
                //���ø÷����״̬���Ա���һ��������
                a[i][j] = -2 ;  
                isVisit[num] = false ;
            }
        }
    }
    private static boolean judge(int num, int i, int j) {//�ж����ڸ��ӵ������Ƿ�����
        if(i-1>=0 && (a[i-1][j] == num+1 || a[i-1][j] == num-1)){   //�ж��Ϸ�����
            return false ;
        }
        if(j-1>=0 && (a[i][j-1] == num+1 || a[i][j-1] == num -1)){  //�ж��󷽸���
            return false ;
        }
        if(i-1>=0 && j-1 >= 0 && (a[i-1][j-1] == num+1 || a[i-1][j-1] == num - 1)){ //�ж����Ϸ�����
            return false ;
        }
        if(i-1>=0 && j+1 < 4 && (a[i-1][j+1] ==num+1 || a[i-1][j+1] == num - 1)){   //�ж����Ϸ�����
            return false ;
        }
        if(j+1<4 && (a[i][j+1] == num+1 || a[i][j+1] == num-1)){    //�ж��ҷ�����
            return false ;
        }
        if(i+1<3 && (a[i+1][j] == num+1 || a[i+1][j] == num-1)){    //�ж��·�����
            return false ;
        }
        if(i+1<3 && j-1>=0 && (a[i+1][j-1] == num+1 || a[i+1][j-1] == num-1)){  //�ж����·�����
            return false ;
        }
        if(i-1<0 && j+1<4 && (a[i+1][j+1] == num+1 || a[i+1][j+1] == num-1)){   //�ж����·�����
            return false ;
        }
        return true ;
    }
}