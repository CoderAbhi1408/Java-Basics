import java.util.Scanner;
class CensusPop
{
	public static void main(String [] args)
	{
	Scanner sc = new Scanner(System.in);
	 long currpop = 312032486;
	 long seconds = (365*24*60*60)*5;
	 long birth = seconds/7;
	 long death = seconds/13;
	 long imm = seconds/45;
	 long nextpop = currpop + birth - death + imm;
	 System.out.println("The current population is : "+currpop);
	 System.out.println("The population after 5 years is : "+nextpop);
	}
}
