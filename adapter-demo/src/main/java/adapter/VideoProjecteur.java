package adapter;

public class VideoProjecteur implements Vga {
    @Override
    public void print(String text) {
        System.out.println("Projecteur (VGA): " + text);
    }
}