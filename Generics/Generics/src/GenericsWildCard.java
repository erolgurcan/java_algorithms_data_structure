public class GenericsWildCard<T extends Number> {

    T num;

    GenericsWildCard(T ob) {
        this.num = ob;
    }

    public boolean absEqual(GenericsWildCard<T> ob) {

        if (Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue())) {
            return true;
        }
        return false;
    }
}
