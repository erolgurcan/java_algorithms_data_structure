public class App {
    public static void main(String[] args) throws Exception {

        // GenericClass<Integer, Double> obj1 = new GenericClass<>(10, 1.1);
        // GenericClass<Double, Integer> obj2 = new GenericClass<>(20.1, 2);

        // obj1.ShowType();
        // ;
        // obj2.ShowType();

        // Generics extending to Number Class
        // GenericsNumber<Integer> ob3 = new GenericsNumber<Integer>(4);
        // System.out.println(ob3.square());

        // Wild Card
        GenericsWildCard<Integer> iOb = new GenericsWildCard<Integer>(6);
        GenericsWildCard<Double> dOb = new GenericsWildCard<Double>(-6.0);
        iOb.absEqual(dOb);

    }
}
