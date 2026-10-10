package adapter;

public class HdmiVgaAdapterH extends TV implements Vga {
    @Override
    public void print(String text) {
        view(text.getBytes());
    }
}