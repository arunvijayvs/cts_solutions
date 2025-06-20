public class SearchTest {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shirt", "Clothing"),
            new Product(3, "Mobile", "Electronics"),
            new Product(4, "Notebook", "Stationery"),
            new Product(5, "Pen", "Stationery")
        };

        System.out.println("🔍 Linear Search:");
        Product result1 = SearchEngine.linearSearch(products, "Notebook");
        System.out.println(result1 != null ? result1 : "Product not found");

        System.out.println("\n🔍 Binary Search:");
        Product result2 = SearchEngine.binarySearch(products, "Notebook");
        System.out.println(result2 != null ? result2 : "Product not found");
    }
}
