public class GenericsWildCard<T extends Number> {

    T num;

    GenericsWildCard(T ob) {
        this.num = ob;
    }

    public boolean absEqual(GenericsWildCard<?> dOb) {

        if (Math.abs(num.doubleValue()) == Math.abs(dOb.num.doubleValue())) {
            return true;
        }
        return false;
    }
}
