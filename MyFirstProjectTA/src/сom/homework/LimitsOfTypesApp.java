package сom.homework;

public class LimitsOfTypesApp {
    public static void main (String[] args ){
        boolean boolMin = Boolean.FALSE , boolMax = Boolean.TRUE;
        byte byteMin = Byte.MIN_VALUE, byteMax = Byte.MAX_VALUE;
        short shotMin = Short.MIN_VALUE, shortMax = Short.MAX_VALUE;
        char charMin = Character.MIN_VALUE, charMax = Character.MAX_VALUE;
        int intMin = Integer.MIN_VALUE, intMax = Integer.MAX_VALUE;
        long longMin = Long.MIN_VALUE, longMax = Long.MAX_VALUE;
        float floatMin = Float.MIN_VALUE, floatMax = Float.MAX_VALUE;
        double doubleMin = Double.MIN_VALUE, doubleMax = Double.MAX_VALUE;

        System.out.println("Type \t\t MIN \t\t MAX");
        System.out.println("boolean " + '\t'+ boolMin + "\t\t" + boolMax);
        System.out.println("short \t\t" + shotMin + "\t\t" + shortMax);
        System.out.println("char \t\t" + charMin + "\t\t" + charMax);
        System.out.println("int \t\t" + intMin + "\t\t" + intMax);
        System.out.println("long \t\t" + longMin + "\t" + longMax);
        System.out.println("float \t\t" + floatMin + "\t\t" + floatMax);
        System.out.println("double \t\t" + doubleMin + "\t" + doubleMax);


    }
}
