package VideoRecorderPlayer;

interface VideoRecorder {
    void play(String fileName);
}

class MP4Player implements VideoRecorder {

    public void play(String fileName) {
        System.out.println("Play mp4 extention: " + fileName);
    }
}

class AVIPlayer implements VideoRecorder {

    public void play(String fileName) {
        System.out.println("Play avi extention: " + fileName);
    }
}

class PlayerFactory {
    public VideoRecorder player(String filepath) {
        if (filepath.endsWith(".avi")) {
            return new AVIPlayer();
        } else if (filepath.endsWith(".mp4")) {
            return new MP4Player();
        } else {
            return null;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        String fileName = "sample.mp4";

        PlayerFactory factory = new PlayerFactory();

        VideoRecorder player = factory.player(fileName);

        player.play(fileName);
    }
}


















