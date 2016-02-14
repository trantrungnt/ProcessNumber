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
        int[] a = {5, 9, 4, 12, 32, 1, 160, 155};   
       
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
        
        //tinh tong cac so chan trong mang
        int tmp=0;
        for(int i=0; i<a.length; i++)        
            if(a[i]%2==0)
                tmp = a[i] + tmp;                
        System.out.print("\nTong cac so chan trong mang la: " + tmp);
        System.out.print("\n");
        
        //tinh binh phuong cac so le trong mang                
        for(int i=0; i<a.length; i++)
            if(a[i]%2!=0)                        
                System.out.print(a[i]*a[i] + " ");
       System.out.print("\n");
       
       
       //tinh tong binh phuong cac so le trong mang
       int sum=0;
       for(int i=0; i<a.length; i++)
           if(a[i]%2!=0)
               sum = a[i]*a[i] + sum;
       System.out.print("\nTong binh phuong cac so le trong mang la: " + sum);
       System.out.println();
       
       //tinh giai thua cua cac so co trong mang
      System.out.print("\nGiai thua cua moi phan tu co trong mang la: ");
      for(int i=0; i<a.length; i++)
          System.out.print(GiaiThua(a[i]) + "  || ");
      System.out.println();
    }
    
    static double GiaiThua(double x)
    {
        if(x==0)
            return 1;
        
        return x*GiaiThua(x-1);
    }
}
