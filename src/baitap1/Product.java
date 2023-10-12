package baitap1;

import java.io.Serial;
import java.io.Serializable;
import java.util.Scanner;

public class Product implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private int ProductId;
    private String ProductName;

    private String manufacturer;
    private int price;
    private String describe;

    public Product() {
    }

    public Product(int productId, String productName, String manufacturer, int price, String describe) {
        ProductId = productId;
        ProductName = productName;
        this.manufacturer = manufacturer;
        this.price = price;
        this.describe = describe;
    }

    public int getProductId() {
        return ProductId;
    }

    public void setProductId(int productId) {
        ProductId = productId;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào mã sp: ");
        this.ProductId = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sp: ");
       this.ProductName = scanner.nextLine();
        System.out.println("Nhập vào hãng sản xuất: ");
        this.manufacturer = scanner.nextLine();
        System.out.println("nhập vào giá: ");
        this.price = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào mô tả: ");
        this.describe = scanner.nextLine();
    }
    public boolean disphay(){
        System.out.println("Mã sản phẩm: " + this.ProductId);
        System.out.println("Tên sản phẩm: " + this.ProductName);
        System.out.println("Hãng sản xuất: " + this.manufacturer);
        System.out.println("Gía sản phẩm: " + this.price);
        System.out.println("Mô tả: " + this.describe);
        return false;
    }

}
