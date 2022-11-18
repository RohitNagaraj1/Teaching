public class Problems {
    // 127
    // 65535
    // 65535
    // integer 
    public static void main(String[] args) 
    {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        //int c = a+b;
        // String s = "11111111111111111111111111111110";
        // System.out.println(s.length());
        // System.out.println(a + "    " + Integer.toBinaryString(a));
        // System.out.println();
        // System.out.println(b + "     " + Integer.toBinaryString(b));
        // System.out.println();
        // System.out.println(c + "    " + Integer.toBinaryString(c));
        // String s = "11111111111111111111111111111110";
        // System.out.println(s.length());

        long d = (long)a + b;
        System.out.println(d); // 4294967294
        System.out.println(d + "    " + Long.toBinaryString(d));
        String s = "11111111111111111111111111111110";
        System.out.println(s.length());
    }
}
