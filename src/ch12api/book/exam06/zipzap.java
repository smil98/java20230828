package ch12api.book.exam06;

public class zipzap {
    public static void main(String[] args) {
        zipzap zp = new zipzap();
        String str = "zipXzap";

        System.out.println(zp.zipZap(str));

    }

    public String zipZap(String str) {
        String zipzap = ".*z.p.*";
        if(str.matches("(zipzap)")) {
            str = str.replaceAll("(.*z.p.*)", "zp");
        }

        return str;
    }

}
