package adapter;

public class TV implements Hdmi {
    @Override
    public void view(byte[] data) {
        System.out.println("TV (HDMI): " + new String(data));
    }
}