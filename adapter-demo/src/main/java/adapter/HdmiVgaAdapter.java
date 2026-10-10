package adapter;

public class HdmiVgaAdapter implements Vga {
    private Hdmi hdmi;

    public HdmiVgaAdapter(Hdmi hdmi) {
        this.hdmi = hdmi;
    }

    @Override
    public void print(String text) {
        hdmi.view(text.getBytes());
    }
}