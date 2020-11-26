public class MobileTester {
    public static void main(String[] args) {
        Mobile samsungGalaxy = new Mobile("Samsung","Galaxy","purple", Mobile.OPERATING_SYSTEM.ANDROID);
        samsungGalaxy.displayInfo();
        Mobile iPhone12 = new Mobile("Apple", "iPhone ", "orange", Mobile.OPERATING_SYSTEM.IPHONE);
        iPhone12.displayInfo();
        Mobile onePlus8 = new Mobile("OneMobile", "8 Pro", "pink ", Mobile.OPERATING_SYSTEM.ANDROID);
        onePlus8.displayInfo();
        Mobile huawei  = new Mobile("Huawei", "P30 Pro", "white", Mobile.OPERATING_SYSTEM.ANDROID);
        huawei.displayInfo();
        Mobile xiomei = new Mobile("Xiaomi", "MI 10", "red", Mobile.OPERATING_SYSTEM.ANDROID);
        xiomei.displayInfo();
        Mobile vivo = new Mobile("Vivo", "IQOO 3 5G", "black", Mobile.OPERATING_SYSTEM.ANDROID);
        vivo.displayInfo();
        Mobile asus = new Mobile("ASUS","ROG PHONE III","violet", Mobile.OPERATING_SYSTEM.ANDROID);
        asus.displayInfo();
        Mobile lg = new Mobile("LG", "G8X ThingQ","Black", Mobile.OPERATING_SYSTEM.ANDROID);
        lg.displayInfo();
        Mobile nokia = new Mobile("Nokia","7.2","Charcoal", Mobile.OPERATING_SYSTEM.ANDROID);
        nokia.displayInfo();
        Mobile htc = new Mobile("HTC", "Desire 12","Cool Black", Mobile.OPERATING_SYSTEM.ANDROID);
        htc.displayInfo();
    }
}
