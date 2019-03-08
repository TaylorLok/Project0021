
public abstract class Student implements LoanInterface
{
    private String name;
    private String StudNum;
    private double LoanAmount;
   // private Object map;

    public Student(String name, String StudNum, double LoanAmount)
    {
        this.name = name;
        this.StudNum = StudNum;
        this.LoanAmount = LoanAmount;
    }

    public Student() {
        super();
    }


    public double getLoanAmount()
    {
        return LoanAmount;
    }

    @Override
   public String toString()
    {
        return ("name: " + name + "\tLoanAmount: " + LoanAmount );
    }


}


