public class UnderGrad extends Student
{
    public UnderGrad(String name, String StudNum, double LoanAmount)
    {
        super(name, StudNum, LoanAmount);

    }



    public double Interest()
    {
        return super.getLoanAmount() * 0.12;
    }

}
