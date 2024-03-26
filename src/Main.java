import java.util.List;

public class Main {

    /**
     * This method caters to multiple problems on streams and lambdas
     */
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        //print numbers using sout
        numbers.stream().forEach(System.out::print);
        System.out.println();

        //print numbers using created method-M1
        numbers.stream().forEach(Main::printNum);
        System.out.println();

        //print only even numbers in list
        numbers.stream().filter(Main::isEven).forEach(System.out::print);
        System.out.println();

        //print even using formatted sout
        numbers.stream().filter((N) -> (N % 2 == 0)).forEach((P) -> System.out.print("EVEN=" + P + " "));
        System.out.println();

        //print odd using formatted string
        numbers.stream().filter((Number) -> (Number % 2 == 1)).forEach((num) -> System.out.print("Odd Number=" + num + " "));
        System.out.println();

        //print sqaures of even numbers
        numbers.stream().filter((X)->(X%2==0)).map((NUMBER)->((int)(Math.pow(NUMBER,2)))).forEach((NUM)->System.out.println("Square="+NUM));

        //print cubes of odd numbers
        numbers.stream().filter((X)->(X%2==1)).map((N)->("The cube of odd number "+N+ " is "+(int)(Math.pow(N,3)))).forEach(System.out::println);


        /*List<String>courses=List.of("Spring","Spring Boot","API","Microservices","AWS","PCP","Azure","Docker","Kubernetes");

        //print all courses sout
        courses.stream().forEach(System.out::print);
        System.out.println();

        //print all courses formatted
        courses.stream().forEach((course)->System.out.print("COURSE_NAME="+course+" "));
        System.out.println();

        //print courses containing spring in capitals
        courses.stream().filter((course)->course.toLowerCase().trim().contains("spring")).forEach((course)->System.out.print("Course="+course.trim().replaceAll("\\s+","").toUpperCase()));
        System.out.println();

        //print courses whose length>=4-both name and length
        courses.stream().filter((course)->(course.length()>=4)).forEach((course)->System.out.println("NOMEN="+course+" and LENGTH="+course.trim().length()));

        //print names and length of courses using map
        courses.stream().map((course)->("Naama**"+course+"**Length**"+course.length())).forEach(System.out::println);*/
    }

    //M1
    static void printNum(int num){System.out.print("NUM="+num+" ");}
    static boolean isEven(int num){return num%2==0;}
}