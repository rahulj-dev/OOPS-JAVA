import java.util.*;
import converter.*;
class convertion{
	public static void main(String args[]){
	int a,c,d,t;
	double ci1,ci2,ci3,di1,di2,di3,ti1,ti2,ti3;
	Scanner s=new Scanner(System.in);
	System.out.println("Choose anyone option\n\t1.Currency convertion\n\t2.Distance convertion\n\t3.Time convertion\n\t4.Exit");
	a=s.nextInt();
	while(a<4){
	switch(a){
		case 1:
			currency cc=new currency();
			System.out.println("\t1.DOLLAR to INR\n\t2.EURO to INR\n\t3.YEN to INR");
			c=s.nextInt();
			switch(c){
				case 1:
					System.out.println("Enter Dollar value : ");
					ci1=s.nextDouble();
					System.out.println(cc.dollarinr(ci1));
					break;
				case 2:
					System.out.println("Enter Euro value : ");
					ci2=s.nextDouble();
					System.out.println(cc.euroinr(ci2));
					break;
				case 3:
					System.out.println("Enter Yen value : ");
					ci3=s.nextDouble();
					System.out.println(cc.yeninr(ci3));
					break;
			}
			break;
		case 2:
			distance dc=new distance();
			System.out.println("\t1.Meter to Kilometer\n\t2.Miles to Kilometer\n\t3.Kilometer to Meter");
			d=s.nextInt();
			switch(d){
				case 1:
					System.out.println("Enter Meter value : ");
					di1=s.nextDouble();
					System.out.println(dc.meterkm(di1));
					break;
				case 2:
					System.out.println("Enter Mile value : ");
					di2=s.nextDouble();
					System.out.println(dc.mileskm(di2));
					break;
				case 3:
					System.out.println("Enter Kilometer value : ");
					di3=s.nextDouble();
					System.out.println(dc.kmmeter(di3));
					break;
			}
			break;
		case 3:
			time tc=new time();
			System.out.println("1.Hours to Minutes\n2.Hours to Seconds");
			t=s.nextInt();
			switch(t){
				case 1:
					System.out.println("Enter Hour value : ");
					ti1=s.nextDouble();
					System.out.println(tc.hm(ti1));
					break;
				case 2:
					System.out.println("Enter Hour value : ");
					ti2=s.nextDouble();
					System.out.println(tc.hs(ti2));
					break;
			}
			break;
}
	System.out.println("Choose anyone option\n\t1.Currency convertion\n\t2.Distance convertion\n\t3.Time convertion\n\t4.Exit");
	a=s.nextInt();
}
}
}