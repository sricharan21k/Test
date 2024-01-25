import java.io.OutputStream;

public class Outer {
    public static void show(){
        int outerValue = 5;
        System.out.println(outerValue + Inner.innerValue);
    }
    public static class Inner{
        private static int innerValue;
        public Inner(int setInnerValue) {
            innerValue = setInnerValue;
        }
        void method(){
            show();
        }
    }

}
