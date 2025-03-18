import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class practiceQuestions {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,3,4,6,8,10,12,13,14,16,18);
        //filter even numbers
        //limit count filter
        List<Integer> evenlist = list.stream().filter(n->n%2==0).limit(4).collect(Collectors.toList());
        System.out.println(evenlist);

        //max
        Optional<Integer> findmax=evenlist.stream().max(Integer::compare);
        //particularly for int values use comparingInt
        //int findamx=evenlist.stream().max(Comparator.comparingInt(Integer::intValue)).get();
        System.out.println(findmax);


        //sum
        int sumofelements=list.stream().reduce(0, Integer::sum);
        System.out.println(sumofelements);

        //touppercase
        List<Employee> emp=employeeAndProductDB.getAllEmployees();
        List<String> convertoUppercase=emp.stream().map(Employee::getName).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(convertoUppercase);

        //sort
        List<Integer> list1=Arrays.asList(9,5,3,5,7,2,2);
        Set<Integer> sortarray=list1.stream().sorted().collect(Collectors.toSet());
        System.out.println(sortarray);

        //count
       //int count=list.stream().filter(n->n>5).reduce(0,Integer::sum);
        long count=list.stream().filter(n->n>5).count();
        System.out.println(count);

        //distinct
        List<Integer> distinctelements=list1.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctelements);

        //findAny
        Optional<Integer> findantele=list1.stream().findAny();
        System.out.println(findantele);

        //first names
        List<String> findfirstname=emp.stream().map(Employee::getName).map(e->e.split(" ")[0]).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(findfirstname);

        //allmatch
        boolean checkeven=list.stream().allMatch(n->n>0);
        System.out.println(checkeven);

        //none match
        boolean checkmatcher=list.stream().noneMatch(n->n==3);
        System.out.println(checkmatcher);

        //findfirst
        Optional<Integer> o=list.stream().findAny();
        System.out.println(o);
        int a=list.stream().findFirst().get();
        System.out.println(a);

        //flatMap
        List<List<String>> stringLists=Arrays.asList(
                Arrays.asList("lalitha","Nali"),
                Arrays.asList("rohith","nali"),
                Arrays.asList("lalli","nali")
        );
        List<String> useflatmap=stringLists.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(useflatmap);

        //grouping element
        Map<String,List<String>> empgendnernames=emp.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.mapping(Employee::getName,Collectors.toList())));
        System.out.println(empgendnernames);

        //summary statistics
        //skipelements  //skip discards the first n elements of the stream.
    }
}
