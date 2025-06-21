public class RealImage implements Image {
    private String fileName;
    public RealImage (String fileNmae)
    {
        this.fileName = fileNmae;
        loadFromServer();
    }
    public void loadFromServer()
    {
        System.err.println("Loading imagre from server: " + fileName);
    }
    public void display()
    {
        System.err.println("Displaying image: " + fileName);
    }
}
