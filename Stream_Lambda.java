import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream_Lambda {

    public static void main(String[] args) {

        // INTSTREAM 
        IntStream.range(1, 11).forEach(System.out::print);
        System.out.println();
        IntStream.range(2, 10).forEach(x->System.out.print(x+" "));
        System.out.println();
        IntStream.range(2,17).skip(5).forEach(x->System.out.print(x+" ")); //skip first 5 [ 2,3,4,5,6]
        System.out.println("\n"+ IntStream.range(1, 5).sum() );
        // Stream.OF
        Stream.of("values","decision","opinion").
                    sorted().
                    findFirst().
                    ifPresent(System.out::printf);
        System.out.println();
        String[] names = {"Robin","Ronak","Albert","Lucifer","Cloe","Sarah","Rachel","Monica"};
        // Arrays.streams
        Arrays.stream(names).filter(x->x.startsWith("R")).sorted()
                    .forEach(System.out::println);  
                    
        Arrays.stream(new int[]{1,4,7,5,6,2,4,5,6})
                    .map(x->x*x)
                    .average()
                    .ifPresent(System.out::println);    
        // Stream from List
        List<String> persons =  Arrays.asList("Abhay","Anshu","Ankit","Bhuvan","Sweta","Harshit","Mohit","Aryan");
        persons.stream()
                .filter(x->x.startsWith("A"))
                .sorted()
                .map(String::toLowerCase)
                .forEach(System.out::println); 
        // Reduce        
        double sum = Stream.of(7.1,2.4,3.7)
                .reduce(0.0, (Double A, Double B)->A+B);//A = running total, B = value to add
        System.out.println("Sum :"+sum);        

        //Reduction - Summary Staticistics
        IntSummaryStatistics summary = IntStream.of(1,5,7,3,5,2,8,0,22)
                .summaryStatistics();
        System.out.println(summary);        
    }
}

//Tutorial : https://youtu.be/t1-YZ6bF-g0?list=PLVIqiYkH7nTlj4f1vGIUEkds1gx28ScXP
//<iframe width="853" height="480" src="https://www.youtube.com/embed/t1-YZ6bF-g0?list=PLVIqiYkH7nTlj4f1vGIUEkds1gx28ScXP" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
