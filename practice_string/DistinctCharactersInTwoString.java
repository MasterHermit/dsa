
//code chef challege to find distinct characters in a string b from strinf a.
import java.util.*;
import java.util.Arrays;

public class DistinctCharactersInTwoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();
        int n = ch1.length;
        char[] ch3=new char[n];
        int k=0;
        int count=0;
        for (int i = 0; i < ch1.length; i++) {
            for(int j=0;j<ch2.length;j++){
                if(ch2[j]==ch1[i]){
                
                  count++;
                }
                

            }
            if(count==0){
                ch3[k]=ch1[i];
                k++;
            }
            count=0;

        }
        Arrays.sort(ch3);
        
        char[] temp=new char[ch3.length];
        int z=0;
        for(int i=0;i<ch3.length-1;i++){
            if(ch3[i]!=ch3[i+1]){
                temp[z++]=ch3[i];
                
            }

        }
        temp[z++]=ch3[ch3.length-1];
        for(char ch:temp){
            System.out.println(ch);
        }
       
    }

}
