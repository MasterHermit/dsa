//it can be done in a singlle line of code using substring method .this is without substring method.
//System.out.print(str1.substring(0,1).toUpperCase+""+str1.substring(1)+"  "+same code for the othe string)



import java.util.*;
public class FirstLetterCapital {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        String mstr1="";
        String mstr2="";
        char ch;
        for(int i=0;i<str1.length();i++){
            if(i==0){
                ch=str1.charAt(i);
                mstr1=mstr1+ch;
                mstr1=mstr1.toUpperCase();
            }else{
                mstr1=mstr1+str1.charAt(i);
                mstr1=mstr1.toLowerCase();
            }
        }
    System.out.println(mstr1);
    }
    
}
