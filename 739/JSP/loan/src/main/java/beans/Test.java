package beans;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static int strStr(String haystack, String needle) {

        int n1=haystack.length()-1, n2=needle.length()-1;
        if(n1 < 0 || n2 <0 || n2>n1) return -1;
        for(int i=0; i<=n1-n2; i++)
        {
            if(haystack.substring(i,i+n2+1).equals(needle)) return i;
        }
        return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		System.out.print(strStr("a", "a"));
	}

}
