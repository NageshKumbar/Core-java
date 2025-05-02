public class MegaAnonymous {
    public static void main(String[] args) {
        MegaInterface obj = new MegaInterface() {
            public void abstractMethod1() { System.out.println("Abstract1"); }
            public void abstractMethod2() { System.out.println("Abstract2"); }
            public void abstractMethod3() { System.out.println("Abstract3"); }
            public void abstractMethod4() { System.out.println("Abstract4"); }
            public void abstractMethod5() { System.out.println("Abstract5"); }
            public void abstractMethod6() { System.out.println("Abstract6"); }
            public void abstractMethod7() { System.out.println("Abstract7"); }
            public void abstractMethod8() { System.out.println("Abstract8"); }
            public void abstractMethod9() { System.out.println("Abstract9"); }
            public void abstractMethod10() { System.out.println("Abstract10"); }
        };
        obj.abstractMethod1();
        obj.abstractMethod2();
        obj.abstractMethod3();
        obj.abstractMethod4();
        obj.abstractMethod5();
        obj.abstractMethod6();
        obj.abstractMethod7();
        obj.abstractMethod8();
        obj.abstractMethod9();
        obj.abstractMethod10();
        obj.defaultMethod1();
        obj.defaultMethod2();
        obj.defaultMethod3();
        obj.defaultMethod4();
        obj.defaultMethod5();
        obj.defaultMethod6();
        obj.defaultMethod7();
        obj.defaultMethod8();
        obj.defaultMethod9();
        obj.defaultMethod10();
        MegaInterface.staticMethod1();
        MegaInterface.staticMethod2();
        MegaInterface.staticMethod3();
        MegaInterface.staticMethod4();
        MegaInterface.staticMethod5();
        MegaInterface.staticMethod6();
        MegaInterface.staticMethod7();
        MegaInterface.staticMethod8();
        MegaInterface.staticMethod9();
        MegaInterface.staticMethod10();
    }
}