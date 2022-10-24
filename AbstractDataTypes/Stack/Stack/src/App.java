public class App {
    public static void main(String[] args) throws Exception {

        LinkedStack stcLink = new LinkedStack<>();

        stcLink.push("erol");
        stcLink.push("eve");
        stcLink.push("tim");

        String out = (String) stcLink.peek();

        System.out.println(out);

        stcLink.pop();

        System.out.println(stcLink.peek());

        stcLink.pop();

        System.out.println(stcLink.peek());

        ArrayStack stcArr = new ArrayStack<>();

        stcArr.push("erol");
        stcArr.push("eve");
        stcArr.push("tim");
        stcArr.push("tim");
        stcArr.push("tim");
        stcArr.push("tim");

        out = (String) stcArr.peek();

        System.out.println(out);

        stcArr.pop();

        out = (String) stcArr.peek();

        System.out.println(out);
    }
}