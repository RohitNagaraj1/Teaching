public class DataTypes {
    public static void main(String[] args) 
    {
        // 8 bit
        /* System.out.println("Byte Max" + Byte.MAX_VALUE);
        System.out.println("Byte Min" + Byte.MIN_VALUE);

        System.out.println("Int Max " + Integer.MAX_VALUE);
        System.out.println("Int Min " + Integer.MIN_VALUE);

        String temp = Integer.toBinaryString(Integer.MIN_VALUE);
        System.out.println(temp);  */

        //byte - 1 BYTE -- 8 bit
        //char - 2 BYTE -- 16 bit -- UNICORN
        //int  - 4 BYTE -- 32 bit
        //long - 8 BYTE -- 64 bit
        // char - 1 BYTE -- 8 bit -- ASCII

        System.out.println("Byte Min = " + Integer.toBinaryString(-3));

        Byte a = 50;
        Byte b = (byte) (a + 10);
        System.out.println(a);
        System.out.println(b);

        // 01111111
        // 00001010
        // 10001001

        System.out.println("Byte Min = " + Integer.toBinaryString(Byte.MAX_VALUE));
        System.out.println("Byte Min = " + Integer.toBinaryString(Byte.MIN_VALUE));

        String temp = Integer.toBinaryString(Character.MAX_VALUE);
        System.out.println(Integer.parseInt(temp, 2)); 

        // 00000000
        // 01111111
        // 10000000
        // 01111111111111111111111111111111 --- 31 --- 2147483647
        // 10000000000000000000000000000000 --- 32
        
    }
}
