package mode.instance.structuuralmodel.adapterpattern;

public class VlcPalyer implements AdvanceMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file.Name:" + fileName);
    }

    @Override
    public void playMp4(String fileName) {


    }
}
