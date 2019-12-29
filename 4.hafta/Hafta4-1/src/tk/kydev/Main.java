package tk.kydev;

public class Main {

    static int factor(int sayi)
    {
        if(sayi==0) return 1;
        return sayi*factor(sayi-1);
    }

    static int topla(int x){
        if (x==0)return 0;
        return x + topla(x-1);
    }
    static boolean asalMi(int sayi)
    {
        int hedef= (int) Math.sqrt(sayi);
        for(int i=2;i<=hedef;i++)
        {
            if(sayi%i==0) return false;
        }
        return true;
    }
    //1 1 2 3 5 8
    static int fibonacci(int sayi)
    {
        if(sayi==1 || sayi ==2) return 1;

        return  fibonacci(sayi-1)+fibonacci(sayi-2);

    }
    public static void main(String[] args) {
	// write your code here
        /*System.out.println(asalMi(18));
        System.out.println(asalMi(13));
        System.out.println(asalMi(169));
        System.out.println(topla(100));
        System.out.println(factor(0));
        System.out.println(factor(10));
        System.out.println(factor(5));
        System.out.println(factor(2));*/
        //Fibonacci
      /*  System.out.println(fibonacci(1));
        System.out.println(fibonacci(2));
        System.out.println(fibonacci(3));
        System.out.println(fibonacci(4));
        System.out.println(fibonacci(5));
        System.out.println(fibonacci(6));
        System.out.println(fibonacci(7));
        System.out.println(fibonacci(8));*/
      for(int i=1;i<50;i++)
          System.out.print(fibonacci(i)+"-");
    }
}
