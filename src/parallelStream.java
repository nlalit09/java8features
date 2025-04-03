import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class parallelStream {


    public static void main(String[] args) {

       List<Integer> list= new ArrayList<>();
       for(int i=1;i<=10;i++){
           list.add(i);
       }
       long start = System.currentTimeMillis();
        list.stream().filter(n->n%2==0).forEach(System.out::println);
        long end= System.currentTimeMillis();
        System.out.println("Time taken using streams "+(int)(end-start)+" ms");
        //using parallel
        IntStream range1 = IntStream.rangeClosed(1, 10);
        long beforetime=System.currentTimeMillis();
        range1.parallel().filter(x->x%2==0).forEachOrdered(System.out::println);
        long afteretime=System.currentTimeMillis();
        System.out.println("Time taken to completer the process "+(int) (afteretime- beforetime)+" ms");

        //using pjarallel stream
        long starttime=System.currentTimeMillis();
        list.parallelStream().filter(x->x%2==0).forEachOrdered(System.out::println);
        long endtime=System.currentTimeMillis();
        System.out.println("using parallel stream "+(int)(endtime-starttime)+" ms");
    }
}
