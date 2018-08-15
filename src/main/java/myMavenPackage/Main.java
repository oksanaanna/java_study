package myMavenPackage;

public class Main {
    public static void main(String[] args) {

        TestClass testClass = new TestClass();
        MyAnnotation annotation = testClass.getClass().getAnnotation(MyAnnotation.class);
        System.out.println(annotation.color());
        LuxuryLevel annotation1 = testClass.getClass().getAnnotation(LuxuryLevel.class);
        //System.out.println(annotation1.boat());
    }
}

class City {
    private static void Y(boolean y, double q, char w) {

    }public static int TT (char w, short e, long ff, boolean ww){
        return -1;
    } public static void Tom (int e){

    }
}
