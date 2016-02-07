/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proccesnumbers;

/**
 *
 * @author TrungNT
 */
public class ProccesNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a = {5, 9, 4, 12, 32, 1, 189, 155};   
       
        System.out.println("So phan tu trong mang a la: " + a.length);        
        
        int temp;
        
        for(int j=0; j<a.length; j++)
            for(int i=a.length-1;i>j; i--)
                if(a[i]<a[i-1])
                {                 
                    temp = a[i];
                    a[i]=a[i-1];
                    a[i-1]=temp;
                }
                
        for(int i=0; i<a.length;i++)         
            System.out.print(a[i] + " ");            
        System.out.print("\n");
        
        //tim gia tri max trong mang
        int max = a[0];
        for(int i=0; i<a.length; i++)        
            if(max<a[i])
                max=a[i];
            
        System.out.print("\nSo lon nhat trong mang a la: " + max);
        System.out.print("\n");
        
        //tim gia tri nho nhat trong mang
        int min = a[0];
        for(int i=0; i<a.length; i++)
            if(min>a[i])
                min = a[i];
        System.out.print("\nSo nho nhat trong mang a la: " + min);
        System.out.print("\n");
        
        //tim so chan trong mang
        for(int i=0; i<a.length; i++)
            if(a[i]%2==0)
                System.out.print(a[i] + " ");
        System.out.print("\n");
    }
    
}
