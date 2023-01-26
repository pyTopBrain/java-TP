public class TypeConversion {
    public static void main(String[] args) {

        byte b=127;
        byte c=127;
        double a=200.76;
        b= (byte) (b+a);
        c+=3;
        // byte implicitement convertis en int
        a=b-a;
        System.out.println(b);
        System.out.println(c);
        System.out.println(a);
        float x= 2.5F;
    }
}
