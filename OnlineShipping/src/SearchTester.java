public class SearchTester {
    public static void main(String[] args) {
        System.out.println("jvm jkareyuvudu main");
        System.out.println("Total iteams to search "+Amazon.totalItems());
        Amazon.search("Glass");
        Amazon.search("Mobile");
        System.out.println("main nirgamana");

    }
}
