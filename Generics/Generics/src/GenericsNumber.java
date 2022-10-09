public class GenericsNumber<T extends Number> {

    T ob;

    GenericsNumber(T ob) {
        this.ob = ob;
    }

    public double square() {
        return ob.intValue() * ob.doubleValue();
    }

}
