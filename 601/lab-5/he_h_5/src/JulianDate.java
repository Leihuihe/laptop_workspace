/*
 * 
 * JulianDate.java -> H5-1
 *
 */

public class JulianDate
{
	public static boolean Isleap(int year)
	{
		if(year >= 0 && year < 1582)
		{
			StdOut.println("year should > 1582)");
		}
		if(year % 400 == 0)
		{
			return true;
		}
		else if(year % 100 == 0)
		{
			return false;
		}
		else if(year % 4 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public static boolean Isvalid(int day, int month, int year)
	{
		if(year < 0)
			return false;		
		else if(month>12 || month<1)
	        return false;
	    else if(day<1)
	        return false;
	    else if((month==2 && day>28 && !Isleap(year)) || (month==2 && day>29 && Isleap(year)))
	        return false;
	    else if((month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) && day>31)
	        return false;
	    else if((month!=1 && month!=3 && month!=5 && month!=7 && month!=8 && month!=10 && month!=12)&&day>30)
	        return false;
	    else
	        return true;
	}

	public static int julian(int day, int month, int year)
	{
		// finish this
		if (!Isvalid(day, month, year))
		{
			StdOut.print("Error, invalid date ");
			return 0;
		}
		int daynum = 31*(month-1)+day;
		if(month > 2)
		{
			daynum -= (4*month + 23)/10;
		}
		if(Isleap(year) && month > 2) 
		{
			StdOut.println(year+" is a leap year");
			daynum++;
		}
		return daynum;
	}

	public static void main(String[] args)
	{
		int m = 0, d = 0, y = 0;

		// read three ints m,d,y from user as a date
		StdOut.print("Pls. enter day:");
		d = StdIn.readInt();
		StdOut.print("Pls. enter month:");
		m = StdIn.readInt();
		StdOut.print("Pls. enter year:");
		y = StdIn.readInt();
		StdOut.println(julian(d, m, y));

	}

}
