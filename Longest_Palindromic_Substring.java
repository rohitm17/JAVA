//Longest  Palindromic  substring
import java.util.*;
class LPStr
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int length=str.length();
		int l=length;
    
    //Return if length is less than 1.
		if(l<=1){
			System.out.println(l);
			return;
		}
    
		int array[][]=new int[l][l];
  
		for(int i=0;i<l;i++)
		{
			
				array[i][i]=1;		

		}
		for(int i=0;i<l-1;i++)
		{
			
			if(str.charAt(i)==str.charAt(i+1))
			{
				array[i][i+1]=1;
			}
			else{
				array[i][i+1]=0;
			}	

		}
		int step=1;
		int initial_pos=0,final_pos=0;
		int diff=final_pos-initial_pos;
		while(step!=length+1)
		{
			step++;
			for(int i=0;i<length-step;i++)
			{
				if(str.charAt(i)!=str.charAt(i+step))
				{
					array[i][i+step]=0;
				}
				else
				{
					if(array[i+1][i+step-1]==1)
					{
						array[i][i+step]=1;
						if(step>diff)
						{
							final_pos=i+step;
							initial_pos=i;
						}

					}
					else
					{
						array[i][i+step]=0;
					}
				}
			}
		}
		for(int i=0;i<l;i++)
		{
			
			for(int i1=0;i1<l;i1++)
			{
			
				System.out.print(array[i][i1]+"\t");		

			}	
			System.out.println();
		}

		System.out.println(str.substring(initial_pos,final_pos+1));
	}
	static int max(int a,int b)
	{
		if(a>=b){return a;}
		return b;
	}
}
