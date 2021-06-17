package com.ironhack.classes;

import com.ironhack.interfaces.Playable;

public class ApplePlayer implements Playable {

    private final int MAX_VOLUME = 1;
    private double volume;

    public ApplePlayer(double volume) {
        this.volume = volume;
    }

    public void play() {
        System.out.println("Playing on Apple");
    }

    public void pause() {
        System.out.println("Pausing on Apple");
    }

    public void mute() {
        System.out.println("Muting on Apple");
    }

    public void increaseVolume(double volume) {
        // 0.1  => 0.5 = 0.5
        if (volume > MAX_VOLUME) {
            this.volume = MAX_VOLUME;
        } else {
            this.volume = volume;
        }

        System.out.println("Current volume: " + this.volume);
    }

    public int getMAX_VOLUME() {
        return MAX_VOLUME;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
