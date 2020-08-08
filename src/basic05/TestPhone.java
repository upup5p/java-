package basic05;

public class TestPhone {
    public static void main(String[] args) {
        Phone mi10 = new Phone();
        mi10.setBrand("xiaomi");
        mi10.setPrice(3799);
        String brand = mi10.getBrand();
        int price = mi10.getPrice();
        System.out.println("品牌为：" + brand + " 价格为：" + price);

    }
}
