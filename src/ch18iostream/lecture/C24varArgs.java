package ch18iostream.lecture;

public class C24varArgs {
    public static void main(String[] args) {
        //when varArgs didn't exist, orverriding was mandatory for all parameters
        //... = varArgs,adding variety to argument quantities
        //
    }

    public static void method1(int a) {

    }

    public static void method1(int a, int b) {

    }

    public static void method2(int... nums) {
        //how to use varArgs
        //announce nums as array
        for(int i = 0; i < nums.length; i++) {
            System.out.println("nums[i] = " + nums[i]);
        }
    }

    public static void method3(int... nums) {
        //can only announce varArgs at the end of the parameter
        //thus String a, int... nums O
        //int... nums, String a X
    }

}
