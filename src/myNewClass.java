import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class myNewClass {
    public static void main(String[] args) {
        Student s1=new Student(2,"pavan");
        Student s2=new Student(3,"Amol");
        Student s3=new Student(1,"vaibhav");
        Student s4=new Student(4,"karan");
       Map<Integer,Student > map1=new TreeMap<>();
        map1.put(3,s1);
        map1.put(2,s2);
        map1.put(1,s3);
        map1.put(4,s4);
        System.out.println("Before Sorting :"+map1);

        Map<Integer,Student> map=new TreeMap<>((a,b)->(b-a));
        map.put(3,s1);
        map.put(2,s2);
        map.put(1,s3);
        map.put(4,s4);
//        Collections.sort(map);
//        Collections.sort(map,(a,b)->b.id-a.id);
        System.out.println("After Sorting : "+map);
    }
}
