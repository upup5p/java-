package basic05;

public class Phone {
    private String brand;
    private int price;

    public Phone() {
        //构造方法:每创建一个对象执行一次，不可手动调用。
    }

    public Phone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
        if (brand.length() == 0) {
            System.out.println("产品名不能为空");
        } else if (brand.length() > 10) {
            System.out.println("产品名过长");
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
        if (price < 0) {
            System.out.println("价格有误，请重新设置");
        }
    }
}
