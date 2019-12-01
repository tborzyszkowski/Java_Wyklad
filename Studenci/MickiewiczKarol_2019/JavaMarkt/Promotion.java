import java.util.ArrayList;
import java.util.Arrays;

public class Promotion {

    private Order order;

    public Promotion(Order order) {
        this.order = order;
    }

    public void fivePercentDiscount() {

        if (order.getOrderPrice() > 300) {
            order.setOrderPrice( order.getOrderPrice() * 0.95 );
        }

    }

    public void thirdGratis() {

        double minPrice = order.getProducts().stream().map( e -> e.getPrice()).min(Double::compare).orElse(null);

        if (order.getProducts().size() == 3) {
            order.setOrderPrice(order.getOrderPrice() - minPrice);
        }

    }

    public void freeCup() {

        if (order.getOrderPrice() > 200) {
            ArrayList<Product> products = ProductWarehouse.getInstance().getProductArray();

            order.getProducts().add(products.get(products.size()-1));
        }

    }

    public void ifDiscountCoupon() {

        for ( Product product : order.getProducts()) {
            if (product.getCoupon() != null) {
                order.setOrderPrice( order.getOrderPrice() * 0.7 );
            }
        }

    }

}
