public class Task {
    public static void main(String[] args) {
        Product product_1 = new Product();
        product_1.setPrice(100);
        Product product_2 = new Product();
        product_2.setPrice(105);

        Phone phone_1 = new Phone();
        phone_1.setMemory(64);
        phone_1.setPrice(400);

        Phone phone_2 = new Phone();
        phone_2.setMemory(32);
        phone_2.setPrice(350);

        Camera camera_1 = new Camera();
        camera_1.setMegaPixels(16);
        camera_1.setPrice(500);

        Camera camera_2 = new Camera();
        camera_2.setMegaPixels(18);
        camera_2.setPrice(550);

        System.out.println(new Util<Camera>().min(camera_1, camera_2));
        System.out.println(new Util<Phone>().min(phone_1, phone_2));
        System.out.println(new Util<Product>().min(product_1, product_2));

        System.out.println(new Util<Phone>().min(product_1, phone_1));  // compile error should be here!
        System.out.println(new Util<Camera>().min(camera_1, phone_1));   // compile error should be here!
    }
}




