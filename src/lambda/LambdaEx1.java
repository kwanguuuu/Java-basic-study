package lambda;
@FunctionalInterface
interface MyFunction{
    void run();
}

class LambdaEx1 {
    static void excution(MyFunction f){
        f.run();
    }

    static MyFunction getMyFunction(){
//        MyFunction f = () -> System.out.println("f3.run()");
//        return f;
        return ()-> System.out.println("f3.run()");
    }
    public static void main(String[] args) {
        MyFunction f1 = () -> System.out.println("f1.run()");

        MyFunction f2 = new MyFunction() {
            @Override
            public void run() {
                System.out.println("f2.run()");
            }
        };

        MyFunction f3 = getMyFunction();

        f1.run();
        f2.run();
        f3.run();

        excution(f1);
    }
}
