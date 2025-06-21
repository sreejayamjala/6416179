public class ImageViewerTest {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("sree_photo.jpg");

        image1.display(); 
        System.out.println("---");
        image1.display(); 
    }
}
