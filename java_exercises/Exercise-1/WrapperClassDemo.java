// Ex1-c Wrapper classes usage
public class WrapperClassDemo {
    public static void main(String[] args) {
        int primitiveInt = 42;
        Integer wrappedInt = primitiveInt;

        Double wrappedDouble = Double.valueOf(73.5);
        double primitiveDouble = wrappedDouble;

        String value = "128";
        Integer parsed = Integer.valueOf(value);

        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Wrapped Integer: " + wrappedInt);
        System.out.println("Wrapped Double: " + wrappedDouble);
        System.out.println("Primitive double: " + primitiveDouble);
        System.out.println("Parsed Integer: " + parsed);
        System.out.println("Integer max value: " + Integer.MAX_VALUE);
    }
}
