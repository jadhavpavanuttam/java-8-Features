import java.util.Comparator;

public class Student {
public int id;
public String name;

Student(int id,String  name)
{
    this.id=id;
    this.name=name;
}
public String toString()
{
    return this.id+":"+this.name;
}
}