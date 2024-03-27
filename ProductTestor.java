/*
nama : oryza conseva
nim : 2301093022
kelas : MI1.c
tugas : produk tester 2
*/

package oryzac2;

import java.util.Scanner;

/**
 *
 * @author ORYZA CONSEVA
 */
public class ProductTestor {
    public static void main (String[]args)
    {
        Scanner in=new Scanner(System.in);
        int tempnumber;
        String tempname;
        int tempqty;
        double tempprice;
        
        
        System.out.print("\n enter product code=");
        tempnumber=in.nextInt();
        in.nextLine();
        System.out.print("\n enter product name=");
        tempname=in.nextLine();
        System.out.print("\n enter product stock=");
        tempqty=in.nextInt();
        System.out.print("\n enter product price=");
        tempprice=in.nextDouble();
        
        Product p1=new Product(tempnumber,tempname,tempqty,tempprice);
        
        System.out.print("\n enter product code=");
        tempnumber=in.nextInt();
        in.nextLine();
        System.out.print("\n enter product name=");
        tempname=in.nextLine();
        System.out.print("\n enter product stock=");
        tempqty=in.nextInt();
        System.out.print("\n enter product price=");
        tempprice=in.nextDouble();
        
        
        Product p2=new Product(tempnumber,tempname,tempqty,tempprice);
         
        Product p3= new Product(3,"Rinso 1.8kg",10,48500.00);
        Product p4= new Product(4,"indomie ayam",15,4500.00);
        Product p5= new Product(5,"sarimi isi 5",54,6000.00);
        Product p6= new Product(6,"lifeboy 1kg",70,5500.00); 
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);
    }
}