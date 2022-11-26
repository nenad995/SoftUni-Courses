package solid.output;

import solid.products.Product;

import java.util.List;

public interface Output {

    void outputSum(List<Product> products);
    void outputAverage(List<Product> products);

}
