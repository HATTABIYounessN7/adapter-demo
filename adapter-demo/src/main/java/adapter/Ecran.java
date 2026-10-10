package adapter;

public class Ecran implements Vga {
    @Override
    public void print(String text) {
        System.out.println("Ecran (VGA): " + text);
    }
}