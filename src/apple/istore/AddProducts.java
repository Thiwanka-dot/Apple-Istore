package apple.istore;

public class AddProducts {
    private String ProductCode;
    private String ProductName;
    private String ProductType;
    private double ProductPrice;
    private int ProductQuantity;
    
    public String getProductCode(){
        return ProductCode;        
    }
    public void setProductCode(String productcode) {
        this.ProductCode = productcode;
    }
    public String getProductName(){
        return ProductName;
    }
    public void setProductName(String productname) {
        this.ProductName = productname;
    }
    public String getProductType(){
        return ProductType;
    }
    public void setProductType(String producttype) {
        this.ProductType = producttype;
    }
    public double getProductPrice(){
        return ProductPrice;
    }
    public void setProductPrice(double productprice) {
        this.ProductPrice = productprice;
    }
    public int getProductQuantity(){
        return ProductQuantity;
    }
    public void setProductQuantity(int productquantity) {
        this.ProductQuantity = productquantity;
    }
    public void Add(AddProducts obj)
    {
        String itemString = obj.getProductCode() + "          " + obj.getProductName() + "          " + obj.getProductType() 
        + "          " + String.valueOf(obj.getProductPrice())+ "        " + String.valueOf(obj.getProductQuantity());
        SmartPhoneLab con = new SmartPhoneLab ();
        con.makeconnection(itemString, "Products.txt");
    }
}
