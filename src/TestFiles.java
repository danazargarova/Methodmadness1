public class TestFiles {
    public static void main(String[] args) {
        DZargarovaLib.test();

        DZargarovaLib.isPalindrome("tacocat");
        System.out.println(DZargarovaLib.isPalindrome("qwertyuiopoiuytrewq"));

        DZargarovaLib.dateStr("10/07/2018");
        System.out.println(DZargarovaLib.dateStr("10/07/2018"));

        DZargarovaLib.cutOut("catatonic cat", "cat");
        System.out.println(DZargarovaLib.cutOut("funky cat","cat"));

        DZargarovaLib.isFibbnacci(9);
        System.out.println(DZargarovaLib.isFibbnacci(9));

        DZargarovaLib.sumUpTo(4);
        System.out.println(DZargarovaLib.sumUpTo(5));
    }
}
