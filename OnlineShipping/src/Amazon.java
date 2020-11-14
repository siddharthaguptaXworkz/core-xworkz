public class Amazon {
    private static String[] items = {"Mobile","Watch","Shoes","Dress","Books","Groceries","Bedding set","Kitchen Applications","Cosmetics","Jwelleries","Headphones","Electronic Items","Furniture","Suitcases","Bag Packs","Sun Glasses","Gift cards","Laptop","Home Decor"};

    public static void search(String product) {
        System.out.println("search kareyuvuudu");
        System.out.println("Total items available "+items.length);
        System.out.println("arg1: "+product);
        boolean itemFound = false;
        String item;
        for(int count=0;count<items.length;count++) {
            item = items[count];
            if (item.equals(product)) {
                itemFound = true;
                break;
            }else {
                itemFound = false;
            }
        }
        if(itemFound) {
            System.out.println("item is found");
        } else{
            System.out.println("item is not found");
        }
    }

    public static int totalItems() {
        return  items.length;
    }

}
