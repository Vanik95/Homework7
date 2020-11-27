package com.company.Homework721;

import java.util.Random;

public class TV {

    Random random = new Random();

    //region Properties

    private int channel;
    private int volumeLevel;
    private boolean on;

    //endregion

    //region Constructors

    public TV() {
    }

    public TV(int channel, int volumeLevel, boolean on) {
        this.channel = channel;
        this.volumeLevel = volumeLevel;
        this.on = on;
    }

    //endregion

    //region Public Methods

    public int increaseVolume(int volumeUp) {
        if ((getVolumeLevel() + volumeUp) <= 100) {
            return getVolumeLevel() + volumeUp;
        } else {
            return 100;
        }
    }

    public int decreaseVolume(int volumeDown) {
        if ((getVolumeLevel() - volumeDown) >= 0) {
            return getVolumeLevel() - volumeDown;
        } else {
            return 0;
        }
    }

    public int changeChannel(int newChannel) {
        if (newChannel >= 0 && newChannel <= 50) {
            setChannel(newChannel);
            return getChannel();
        } else {
            return getChannel();
        }
    }

    //endregion

    //region Getters and Setters

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    //endregion
}
