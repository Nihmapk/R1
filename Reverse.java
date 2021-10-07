
public class Reverse {

	public static void main(String[] args) 
	{
	    String s1;
	    s1="life";
	    String s2="";
	    int length=s1.length();
	    for(int i=length-1;i>=0;i--)
	    {
	    	s2=s2+s1.charAt(i);
	    	//System.out.println(s2);
	    
	    }
		System.out.println(s2);
	    

	}

}
