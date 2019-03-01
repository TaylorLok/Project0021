public class PostGrad extends Student
{
    public PostGrad(String name, String StudNum, double LoanAmount) {
        super(name, StudNum, LoanAmount);

    }



    public double Interest()
    {
        return super.getLoanAmount()*0.10;
    }
}
