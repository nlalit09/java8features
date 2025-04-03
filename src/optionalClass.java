import java.util.Optional;

public class optionalClass {
    public static void main(String[] args) {
        Project p1=new Project("em01","lalitha","SP","Nali");
        Project p2=new Project(null,"lalitha","SP","lll");

        //Optional<String> opt=Optional.empty();
        //Optional<String> opt=Optional.of(p2.getCode());
        String opt=Optional.ofNullable(p2.getCode()).map(n->n+"hkhjhk").orElse("hjghjgjh");
        String opt1=Optional.ofNullable(p1.getCode()).map(n->n+"hkhjhk").orElse("hjghjgjh");
        System.out.println(opt);
        System.out.println(opt1);
    }
}
