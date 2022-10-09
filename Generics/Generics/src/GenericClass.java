public class GenericClass<T, V> {

    T ob;
    V ob2;

    GenericClass(T ob, V ob2) {
        this.ob = ob;
        this.ob2 = ob2;
    }

    public void ShowType() {
        System.out.println(ob.getClass().getName());
    }
}
