/*
nama : oryza conseva
nim : 2301093022
kelas : MI1.c
tugas : produk tester 1
*/

package oryzac;

/**
 *
 * @author ORYZA CONSEVA
 */
public class ProductTester {
     public static void main(String[]args)
    {
        //TODO code application logic here
        //6 object Product
        //2 object mengacu pada default constructor
        product p1=new product();
        product p2=new product();
        //4 object mengacu pada constructor dengan parameter
        product p3= new product(1,"Rinso 1.8kg",10,48500.00);
        product p4= new product(2,"indomie ayam",15,4500.00);
        product p5= new product(3,"sarimi isi 5",54,6000.00);
        product p6= new product(4,"lifeboy 1kg",70,5500.00);
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);
        
        
    }
}