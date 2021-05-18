package mode.instance.adapterpattern;

public class AdaoterPatternDemo {
    public static void main(String[] args) {
        Audioplayer audioplayer = new Audioplayer();

        audioplayer.play("mp3", "beyund the horizon.mp3");
        audioplayer.play("mp4", "alone.mp4");
        audioplayer.play("vlc","far far away.vlc");
        audioplayer.play("avi", "mind me.avi");
        }
    }

