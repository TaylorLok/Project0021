public class SmallBusiness implements LoanInterface
{
    private String name;
    private String RegisterNum;
    private double LoanAmount;



    public SmallBusiness(String name, String RegisterNum, double LoanAmount)
    {
        this.name = name;
        this.RegisterNum = RegisterNum;
        this.LoanAmount = LoanAmount;
    }


    @Override
    public double Interest()
    {
        return LoanAmount* 0.15;
    }

    @Override
    public String toString()
    {
        return ( "name:" + name + "\tRegisterNum: " + RegisterNum + "\tLoanAmount:" + LoanAmount);
    }
}
