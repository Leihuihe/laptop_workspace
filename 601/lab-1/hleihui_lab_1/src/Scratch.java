//
//	Scratch.java - extra program
//
// Try your Java experiments here!
//

public class Scratch
{

	public static void main(String[] args)
	{
		String s = "123";
		
		char[] ca = s.toCharArray();
		
		ca[0] = 'z';
		System.out.println(ca);
		String s2 = new String(ca);
		System.out.println(s2);
		System.out.println (s2==null);
		
		
		char[] cat = s2.toCharArray();
		//cat[0] = 'H';
		String s3 = new String(ca);
		System.out.println (s3==s);
		System.out.println(ca);
		System.out.println(cat);
		System.out.println (s+"  "+s2+"  "+s3);
		
	}

}
