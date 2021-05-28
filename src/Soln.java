import java.io.*;
import java.util.*;

public class Soln {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String stra=sc.next();
        String str1=str.toLowerCase();
        String str2=stra.toLowerCase();
        /* Enter your code here. Print output to STDOUT. */
        int ss = str1.length() + str2.length();
        char character1 = str.charAt(0);
        int asciistr = (int) character1;
        char character2 = stra.charAt(0);
        int asciistra = (int) character2;
        System.out.println(asciistra);
        
        System.out.println(ss);
        if(asciistra>asciistr) {
        	System.out.println("yes");
        }
        else {
        	System.out.println("no");
        }
        String output1 = str1.substring(0, 1).toUpperCase() + str1.substring(1);
        String output2 = str2.substring(0, 1).toUpperCase() + str2.substring(1);
        System.out.println(output1 +" "+ output2);
        //int a=1,b=2,c=3,d=4,e=5,f=6,g=7,h=8,i=9,j=10,k=11,l=12,m=13,n=14,o=15,p=16,q=17,r=18,s=19,t=20,u=21,v=22,w=23,x=24,y=25,z=26,A=1,B=2,C=3,D=4,E=5,F=6,G=7,H=8,I=9,J=10,K=11,L=12,M=13,N=14,O=15,P=16,Q=17,R=18,S=19,T=20,U=21,V=22,W=23,X=24,Y=25,Z=26;
        
        
    }
}
