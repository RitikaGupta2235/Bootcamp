package bootcamp;
import java.util.*;

public class Frequency {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ch = (sc.nextLine().toUpperCase()).charAt(0);
		str = str.toUpperCase();
		int i, len = str.length(),ctr=0;
		for(i=0;i<len;i++)
		{
			if(str.charAt(i)==ch)
				ctr++;
		}
		System.out.println(ctr);
		sc.close();
	}

}
