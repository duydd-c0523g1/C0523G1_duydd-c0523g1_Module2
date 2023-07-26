package ss17_binary_file_serialization.repository;

import ss17_binary_file_serialization.common.Stream;
import ss17_binary_file_serialization.model.Product;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {
    private final String FILE_PATH = "D:\\CodeGym\\Git\\C0523G1-duydd-co523g1_Module2\\duy\\src\\ss17_binary_file_serialization\\common\\file.csv";

    @Override
    public ArrayList<Product> displayAll() {
        ArrayList<Product> productList = new ArrayList<>();
        List<String> stringList = Stream.read(FILE_PATH);
        String[] array = null;
        for (String string : stringList) {
            array = string.split(",");
            Product product = new Product(Integer.parseInt(array[0]), array[1], Integer.parseInt(array[2]), array[3], array[4]);
            productList.add(product);
        }
        System.out.println(productList);
        return productList;
    }

    @Override
    public void addProduct(Product product) {
        ArrayList<Product> productList = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();
        productList.add(product);
        for (int i = 0; i < productList.size(); i++) {
            strings.add(String.valueOf(productList.get(i)));
        }
        Stream.write(FILE_PATH, strings, true);
    }

    @Override
    public void searchProduct(int id) {
        ArrayList<Product> productsList = this.displayAll();
        for (int i = 0; i <productsList.size() ; i++) {
            if (productsList.get(i).getId() == id) {
                System.out.println(productsList.get(i));
            }
        }
    }
}
