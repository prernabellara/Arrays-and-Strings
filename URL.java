import java.io.*;
import java.util.*;

//class contains code to replace all spaces with the character %20 without using java's string replace function
//current value has been hard coded it can be modified based on the requirements
public class URL
{
	public static void main(String []args)
	{
		String url="Mr John Smith";
		int len=url.length();
		StringBuilder res=new StringBuilder();
		for(int i=0;i<len;i++)
		{
			if((url.charAt(i))==' ')
			{
				res.append("%20");
			}
			else
			{
				res.append(url.charAt(i));
			}
		}
		System.out.println(res);
	}
}
