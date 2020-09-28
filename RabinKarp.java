import java.util.*;
class RabinKarp
{
    public static void main(String[] args) {
        
        Scanner s =new Scanner(System.in);
        System.out.println("Enter text");
        String text=s.next();
        System.out.println("Enter pattern");
        String pattern=s.next();
        

        char[] text1=text.toCharArray();
        char[] pattern1=pattern.toCharArray();

        int text_length=text.length();
        int patter_length=pattern.length();
        if(patter_length>text_length)
        {
            System.out.println("Pattern cannot be found");
            return;
        }        
        else if(patter_length==text_length)
        {
            if(text.compareTo(pattern)==0)
            {
                System.out.println("Pattern found");
                 return;
            }
            System.out.println("Pattern cannot be found");
            return;
        }
        else
        {
            int prime=3;
            int sum=(int)pattern1[0];
            for(int i=1;i<patter_length;i++)
            {
                sum+=((int)pattern1[i])*prime;
                prime=prime*3;
            }
            
            System.out.println("Hash value of Pattern is:"+sum);
            int x=1;
            prime=3;
            int m=(int)text1[0];
            while(x!=patter_length)
            {
                m=m+(int)text1[x]*prime;
                prime=prime*3;       
                x++;         
            }
            if(m==sum)
            {
                System.out.println(" Pattern found @ index 0 ");
            }
            prime/=3;
            System.out.println(" Prime is "+prime);
            for(int i=1;i<text_length-patter_length;i++)
            {
                m=m-(int)text1[i-1];
                m=m/3;
                m=m+(int)text1[i+patter_length-1]*prime;
                if(m==sum)
                {
                    System.out.println(" Pattern found @ index  "+i);
                }
            }
        }

       
    }
}
