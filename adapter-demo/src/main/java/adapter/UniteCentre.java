package adapter;

public class UniteCentre {
    private Vga vga;

    public void setVga(Vga vga) {
        this.vga = vga;
    }

    public void print(String text) {
        vga.print(text);
    }
}