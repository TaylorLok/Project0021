import java.util.ArrayList;

public class RunStudent
{
    public static void main(String[] args)
    {
        ArrayList<LoanInterface> loan = new ArrayList<>(10);

        loan.add(new UnderGrad("taylor","2B",12.00));
        loan.add(new UnderGrad("lor","2B",10.00));
        loan.add(new SmallBusiness("taylor","2B",12.00));
        loan.add(new PostGrad("taylor","2B",12.00));


        double undergrad=0;
        double postgrad=0;
        double smallbusiness=0;



        double under=0.0, post=0.0,small=0.0;


        double m=0;
        double k=0;
        double l=0;



        for (int i = 0; i < loan.size(); i++)
        {

            if(  loan.get(i)instanceof UnderGrad){
                under += loan.get(i).Interest();
                m++;
            }

            else if (loan.get(i)instanceof PostGrad){

                post += loan.get(i).Interest();
                k++;

            }
            else if (loan.get(i)instanceof SmallBusiness){

                small += loan.get(i).Interest();
                l++;
            }


        }

        double average = under/m;
        double average1 = post/k;
        double average2 = small/l;

        double totalLoanAmount=0.0;
        totalLoanAmount= under+post+small;


        

        loan.set(0, new PostGrad("taylor", "2B", 12.00));
        loan.set(1, new UnderGrad("Lokombe", "214291324", 12.00));
        loan.set(2, new SmallBusiness("taylor", "21455ca", 12.00));

        for(int i=0; i<loan.size(); i++){

            System.out.println(loan.get(i).toString() +String.format("\tAmount Due: R%.2f" , loan.get(i).Interest()));
        }





    }

}

