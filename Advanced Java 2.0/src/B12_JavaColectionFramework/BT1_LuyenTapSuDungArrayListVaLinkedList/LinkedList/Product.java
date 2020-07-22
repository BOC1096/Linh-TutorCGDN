package B12_JavaColectionFramework.BT1_LuyenTapSuDungArrayListVaLinkedList.LinkedList;

public class Product implements Comparable<Product> {
    private int id;
    private String productName;
    private double cost;

    public Product(int id, String productName, double cost) {
        this.id = id;
        this.productName = productName;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", cost=" + cost +
                '}';
    }


    @Override
    public int compareTo(Product o) {
        return this.productName.compareTo(o.productName);
    }
}
