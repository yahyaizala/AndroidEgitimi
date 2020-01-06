package tk.kydev.Jenerik;

public class Test<T,V> {
    T obj1;
    V obj2;
    public Test(T t,V v)
    {
        obj1=t;
        obj2=v;
    }
    public void print()
    {
        System.out.println(obj1);
        System.out.println(obj2.getClass().getName());
    }



}
