package lambda;

@FunctionalInterface
interface MyFunction2{
    void myMethod();
}
public class LambdaEx2 {
    public static void main(String[] args) {
        MyFunction f = () -> {};
        Object obj = (MyFunction2)(()->{});
        String str = ((Object)(MyFunction2)(()->{})).toString();

        System.out.println(f);
        System.out.println(obj);
        System.out.println(str);

        System.out.println((MyFunction2)()->{});
        System.out.println(((Object)(MyFunction2)()->{}).toString());
    }
}
