//
//	Scratch.java - extra program
//
// Try your Java experiments here!
//

public class Scratch
{

	public static void main(String[] args)
	{
		String s = "foo";
		
		char[] ca = s.toCharArray();
		
		ca[0] = 'z';
		
		String s2 = ca.toString();
		
		System.out.println (s2==s);
		
		
		char[] cat = s2.toCharArray();
		cat[0] = 'f';
		String s3 = cat.toString();
		System.out.println (s3==s);
		System.out.println (s+"  "+s2+"  "+s3);
		
	}

}
