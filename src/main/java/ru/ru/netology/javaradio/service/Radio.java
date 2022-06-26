package ru.ru.netology.javaradio.service;

public class Radio {
    private int currentRadioStationNumber;
    private int currentVolume;

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {

        if (newCurrentRadioStationNumber < 0) {
            return;
        }
        if (newCurrentRadioStationNumber > 9) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public void increaseRadioStationNumber() {
        if (currentRadioStationNumber < 9) {
            currentRadioStationNumber = currentRadioStationNumber + 1;
            setCurrentRadioStationNumber(currentRadioStationNumber);

        }
    }

    public void reduceRadioStationNumber() {
        if (currentRadioStationNumber < 10) {
            currentRadioStationNumber = currentRadioStationNumber - 1;
        }
        setCurrentRadioStationNumber(currentRadioStationNumber);
    }

    public void next() {
        if (currentRadioStationNumber == 9) {
            currentRadioStationNumber = 0;
            setCurrentRadioStationNumber(currentRadioStationNumber);
        }

    }

    public void prev() {
        if (currentRadioStationNumber == 0) {
            currentRadioStationNumber = 9;
            setCurrentRadioStationNumber(currentRadioStationNumber);
        }

    }


    public void setMaxNumberStation() {
        currentRadioStationNumber = 9;
    }


    public void setCurrentVolume(int newCurrentVolume) {

        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
            setCurrentVolume(currentVolume);
        }
    }

    public void reduceVolume() {
        if (currentVolume < 11) {
            currentVolume = currentVolume - 1;
        }
        setCurrentVolume(currentVolume);
    }

    public void nextVolume() {
        if (currentVolume == 10) {
            currentVolume = 10;
            setCurrentVolume(currentVolume);
        }


    }

    public void setMaxVolume() {
        currentVolume = 10;
    }

    public void prevVolume() {
        if (currentVolume == 0) {
            currentVolume = 0;
            setCurrentVolume(currentVolume);
        }


    }

}
