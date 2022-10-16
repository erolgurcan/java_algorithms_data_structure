public class App {
        public static void main(String[] args) throws Exception {

                Student std = new Student(100, "Erol Gurcan", "erolgurcan90@gmail.com", "Computer Science", 3.5,
                                new String[] { "CSE 101", "CSE 102", "CSE 103" });

                Student std2 = new Student(200, "Jhon", "js@gmail.com", "Computer Science", 3.5,
                                new String[] { "CSE 101", "CSE 102", "CSE 103" });

                Student std3 = new Student(300, "Doe", "Doe@gmail.com", "Computer Science", 3.5,
                                new String[] { "CSE 101", "CSE 102", "CSE 103" });

                Student std4 = new Student(400, "Evelyn", "Eve@gmail.com", "Computer Science", 3.5,
                                new String[] { "CSE 101", "CSE 102", "CSE 103" });

                Student std5 = new Student(500, "Tom", "tom@gmail.com,    ", "Computer Science", 3.5,
                                new String[] { "CSE 101", "CSE 102", "CSE 103" });

                Student std6 = new Student(600, "Hank", "hankm@gmail.com,    ", "Computer Science", 3.5,
                                new String[] { "CSE 101", "CSE 102", "CSE 103" });
                LListApp<Student> obj1 = new LListApp<>();

                obj1.display();

                System.out.println("----------  Adding Students into list  ");
                obj1.add(std);
                obj1.add(std2);
                obj1.add(std3);
                obj1.add(std4);

                obj1.display();

                System.out.println("----------  Insert Method  ");
                obj1.add(2, std5);
                obj1.display();

                System.out.println("----------  Remove Method");

                obj1.remove(0);
                obj1.display();

                System.out.println("----------  Replace Method");

                obj1.replace(0, std6);
                obj1.display();

                System.out.println("----------  Get Entry");

                Student getStudent;

                getStudent = obj1.getEntry(2);
                getStudent.toString();

        }

}
