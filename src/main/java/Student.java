import java.util.HashMap;
import java.util.Map;

public abstract class Student implements LoanInterface
{
    private String name;
    private String StudNum;
    private double LoanAmount;
    private Object map;

    public Student(String name, String StudNum, double LoanAmount)
    {
        this.name = name;
        this.StudNum = StudNum;
        this.LoanAmount = LoanAmount;
    }


    public double getLoanAmount()
    {
        return LoanAmount;
    }

    public void setMap()
    {
        Map<Integer,String> map = new HashMap<>();

        map.put(1,"SA");
        map.put(5,"USA");
        map.put(6,"ZAR");
        map.put(2,"Kenya");
        map.put(3,"CONGO");
        map.put(4,"Egypt");
        this.map = map;
    }
    public  void getMap() {
        return ;
    }

    @Override
   public String toString()
    {
        return ("name: " + name + "\tLoanAmount: " + LoanAmount );
    }


}


