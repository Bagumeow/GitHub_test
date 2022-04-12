package Module2.phan03;
/**
 * Viết chương trình in ra tổng của 10 số chẵn đầu tiên
 */
public class Bai12 {
    
    public static void main(String[] args) {
        int tong=0;
        for (int i=1;i<=10;i++){
            tong+=i;
        }
        System.out.println("tong 10 so dau la :"+tong);
    }
}
