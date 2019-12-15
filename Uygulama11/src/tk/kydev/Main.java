package tk.kydev;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double[] dizi=new double[10];
        double toplam=0;
        for(int i=0;i<dizi.length;i++){
            double random=Math.random();
            dizi[i]=random;

        }

        for(double s:dizi) toplam+=s;

        System.out.println("Toplam :"+toplam);
    }
}
