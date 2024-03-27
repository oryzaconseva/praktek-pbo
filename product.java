/*
nama : oryza conseva
nim : 2301093022
kelas : MI1.c
tugas : produk 1
*/

package oryzac;

/**
 *
 * @author ORYZA CONSEVA
 */
public class product {
    // privat
    private int ItemNumber;
    private String name;
    private int quantityinstock; 
    private double price;
    
    //default constructor untuk inisialisasi nilai awal
    //string - null    int - 0    double - 0.0
    public product(){
        
    }
    
    //constructor 2 -
    public product(int number,String name,int qty,double price){
        this.ItemNumber=number;
        this.name=name;
        this.quantityinstock=qty;
        this.price=price;
    }
    
    //method getter (accessor) untuk variabel itemnumber
    public int getItemNumber(){
        return ItemNumber;
    }
    
 
    //method setter/mutator (accessor) untuk variabel itemnumber - update nilai
    public void setItemNumber(int number){
        this.ItemNumber=number;
    }
    
    //getter dan setter untuk variabel name
    public String getName(){
        return name;
    }
    
    public void setname(String name){
        this.name= name;
    }
    
    //getter dan setter untuk variabel quantityinstock
    public int getquantityinstock(){
        return quantityinstock;
    }
    
    public void setquantityinstock(int qty){
        this.quantityinstock= qty;
    }
    
    //getter dan setter untuk variabel price
    public double getPrice(){
        return price;
    }
    
    public void setprice(double price)
    {
       this.price= price;
    } 
    
    @Override
    public String toString(){
        return "\n\n Kode Produk : "+this.ItemNumber+
               "\n Nama Produk : "+this.name+
               "\n Jumlah Produk : "+this.quantityinstock+
               "\n Harga Produk : "+this.price;
    }
}
