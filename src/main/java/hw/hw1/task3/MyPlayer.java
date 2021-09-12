package hw.hw1.task3;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MyPlayer implements Recordable, Playable {
    FileInputStream fileInputStream = new FileInputStream("song.mp3");
//    FileInputStream fileInputStream = new FileInputStream("record.wav");
    Player player = new Player((fileInputStream));
    Recorder recorder = new Recorder();

    public MyPlayer() throws JavaLayerException, FileNotFoundException {
    }

    @Override
    public void play() {
        try {

            player.play();
            System.out.println("Song is playing");

        } catch (Exception e){
            System.out.println(e);
        }

    }

    @Override
    public void record() {
        recorder.record();
    }

    @Override
    public void pause() {
        try {
            player.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    @Override
    public void stop() {
        System.exit(0);
    }
}
