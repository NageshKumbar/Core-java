
public class AnonymousRunner {
    public static void main(String[] args) {
        MegaInterface obj = new MegaInterface() {
            public void method1() { System.out.println("Anonymous method1"); }
            public void method2() { System.out.println("Anonymous method2"); }
            public void method3() { System.out.println("Anonymous method3"); }
            public void method4() { System.out.println("Anonymous method4"); }
            public void method5() { System.out.println("Anonymous method5"); }
            public void method6() { System.out.println("Anonymous method6"); }
            public void method7() { System.out.println("Anonymous method7"); }
            public void method8() { System.out.println("Anonymous method8"); }
            public void method9() { System.out.println("Anonymous method9"); }
            public void method10() { System.out.println("Anonymous method10"); }
        };
        obj.method1(); obj.method2(); obj.method3(); obj.method4(); obj.method5();
        obj.method6(); obj.method7(); obj.method8(); obj.method9(); obj.method10();
        obj.defaultMethod1(); obj.defaultMethod2(); obj.defaultMethod3(); obj.defaultMethod4(); obj.defaultMethod5();
        obj.defaultMethod6(); obj.defaultMethod7(); obj.defaultMethod8(); obj.defaultMethod9(); obj.defaultMethod10();
        MegaInterface.staticMethod1(); MegaInterface.staticMethod2(); MegaInterface.staticMethod3(); MegaInterface.staticMethod4(); MegaInterface.staticMethod5();
        MegaInterface.staticMethod6(); MegaInterface.staticMethod7(); MegaInterface.staticMethod8(); MegaInterface.staticMethod9(); MegaInterface.staticMethod10();
    }
}
