package Package;

public class myRunner {
    public static void main(String[] args) {
        DemoClass demo = new DemoClass();
        demo.genericsMethod(10);
        demo.genericsMethod("Hello");
        GenericClass<Integer,String>mobj = new GenericClass(12,"kavi");
        System.out.println(mobj.getNumber());
        System.out.println(mobj.getName());


    }
}
