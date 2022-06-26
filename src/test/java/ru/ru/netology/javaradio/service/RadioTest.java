package ru.ru.netology.javaradio.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Queue;

public class RadioTest {

    @Test
    public void shouldSetNumberRadioStation() {
        Radio numberStation = new Radio();

        numberStation.setCurrentRadioStationNumber(7);

        int expected = 7;
        int actual = numberStation.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetNumberStationAboveMax() {
        Radio numberStation = new Radio();

        numberStation.setCurrentRadioStationNumber(10);

        int expected = 0;
        int actual = numberStation.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextRadioStationNumber(){
        Radio numberStation = new Radio();
        numberStation.setCurrentRadioStationNumber(3);

        numberStation.increaseRadioStationNumber();

        int expected = 4;
        int actual = numberStation.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceRadioStationNumber(){
        Radio numberStation = new Radio();
        numberStation.setCurrentRadioStationNumber(5);

        numberStation.reduceRadioStationNumber();

        int expected = 4;
        int actual = numberStation.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }



    @Test
    public void maxRadioStationNumber(){
        Radio numberStation = new Radio();
        numberStation.setCurrentRadioStationNumber(9);

        numberStation.next();

        int expected = 0;
        int actual = numberStation.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minRadioStationNumber(){
        Radio numberStation = new Radio();
        numberStation.setCurrentRadioStationNumber(0);

        numberStation.prev();

        int expected = 9;
        int actual = numberStation.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolume() {
        Radio soundLevel = new Radio();

        soundLevel.setCurrentVolume(7);

        int expected = 7;
        int actual = soundLevel.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio soundLevel = new Radio();

        soundLevel.setCurrentVolume(12);

        int expected = 0;
        int actual = soundLevel.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextSoundVolume() {
        Radio soundLevel = new Radio();

        soundLevel.setCurrentVolume(4);
        soundLevel.increaseVolume();

        int expected = 5;
        int actual = soundLevel.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void reduceSoundVolume() {
        Radio soundLevel = new Radio();

        soundLevel.setCurrentVolume(4);
        soundLevel.reduceVolume();

        int expected = 3;
        int actual = soundLevel.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void maxSoundVolume() {
        Radio soundLevel = new Radio();

        soundLevel.setCurrentVolume(10);
        soundLevel.nextVolume();

        int expected = 10;
        int actual = soundLevel.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void minSoundVolume() {
        Radio soundLevel = new Radio();

        soundLevel.setCurrentVolume(0);
        soundLevel.prevVolume();

        int expected = 0;
        int actual = soundLevel.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }







}