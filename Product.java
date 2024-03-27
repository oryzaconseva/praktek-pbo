/*
nama : oryza conseva
nim : 2301093022
kelas : MI1.c
tugas : produk 2
*/

package oryzac2;

/**
 *
 * @author ORYZA CONSEVA
 */
public class Product {
     //private 
    private int itemnumber;
    private String name;
    private int quantityinstock;
    private double price;
    private boolean active=true;
          

public Product()
{

}
public Product (int number,String name,int qty,double price)
{
    this.itemnumber=number;
    this.name=name;
    this.quantityinstock=qty;
    this.price=price;
}
public int getitemNumber (){
    return itemnumber;
}
public void setitemNumber(int number){
    this.itemnumber=number;
}
public String getName(){
    return name;
}
public void setname(String name)
{
    this.name=name;
}
public int quantitystinstock()
{
     return quantityinstock;
}
public void setquantityinstock (int qty){
    this.quantityinstock=qty;
}
public double price()
{
    return price;
}
public void setprice(double price)
{
     this.price=price;
}
public boolean active()
{
     return active;
}
public void setactive(boolean active)
{
     this.active=active;
}
public double getinventoryvalue()
{
    return quantityinstock * price;
}
    @Override
    public String toString(){
    return "\n product code     ="+this.itemnumber+
           "\n product name     ="+this.name+
           "\n product stock    ="+this.quantityinstock+
           "\n product price    ="+this.price+
           "\n product active   ="+(this.active?"active":"discontinued")+
           "\n total harga      ="+getinventoryvalue();
    }
}