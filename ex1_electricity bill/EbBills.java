import java.io.*;
import java.util.*;
class ElectricityBill
{
	double bill;
	double domesticbillcalc (int units)
	{
		if(units<100) bill = units * 1 ;
		else if(units <= 200) bill = 100 * 1 + (units -100) * 2.50 ;
		else if(units <= 500) bill = 100 * 1 + 200 * 2.50 + (units -200) * 4 ;
		else bill = 100 * 1 + 200 * 2.50 + 500 * 4 + (units -500) * 6 ;
		return bill;
	}
	double commercialbillcalc (int units)
	{
		if(units<100) bill = units * 2 ;
		else if(units <= 200) bill = 100 * 1 + (units -100) * 4.50 ;
		else if(units <= 500) bill = 100 * 1 + 200 * 4.50 + (units -200) * 6 ;
		else bill = 100 * 1 + 200 * 4.50 + 500 * 6 + (units -500) * 7 ;
		return bill;
	}
	void show(String ptype,String consno,String consname,int pmr,int cmr,int units)
	{
		System.out.println("Type of Connection : " +ptype);
		System.out.println("Consumer Number : " + consno);
		System.out.println("Customer Name : " + consname);
		System.out.println("Previous Month Reading  : " + pmr);
		System.out.println("Current Month Reading  : " + cmr);
		System.out.println("Units Consumed  : " + units);
	}
}
class Ebbill
{
	public static void main(String[] args)
	{
		Scanner c = new Scanner(System.in);
		System.out.println("Enter the Type of Connection :");
		String ptype=c.next();
		System.out.println("Enter the Consumer Number :");
		String consno=c.next();
		System.out.println("Enter the Consumer Name :");
		String consname=c.next();
		System.out.println("Enter the Previous Month Reading :");
		int pmr=c.nextInt();
		System.out.println("Enter the Current Month Reading :");
		int cmr=c.nextInt();
		int units =  cmr-pmr;
		ElectricityBill b = new ElectricityBill();
		if(ptype.equalsIgnoreCase("DOMESTIC"))
		{
			b.show(ptype,consno,consname,pmr,cmr,units);
			b.domesticbillcalc(units);System.out.println("Bill to pay : " + b.bill);
		}
		else if(ptype.equalsIgnoreCase("COMMERCIAL"))
		{
			b.show(ptype,consno,consname,pmr,cmr,units);
			b.commercialbillcalc(units);
			System.out.println("Bill to pay : " + b.bill);
		}
	}
} 
