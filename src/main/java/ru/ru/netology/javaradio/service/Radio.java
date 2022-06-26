package ru.ru.netology.javaradio.service;

public class Radio {
    private int maxNumberOfRadioStations = 9;
    private int minNumberOfRadioStations = 0;
    private int currentRadioStationNumber = minNumberOfRadioStations;

    private int maxCurrentVolume = 100;
    private int minCurrentVolume = 0;
    private int currentVolume = minCurrentVolume;

    public Radio(int minNumberOfRadioStations, int maxNumberOfRadioStations, int minCurrentVolume, int maxCurrentVolume) {
        this.minNumberOfRadioStations = minNumberOfRadioStations;
        this.maxNumberOfRadioStations = maxNumberOfRadioStations;
        this.currentRadioStationNumber = minNumberOfRadioStations;
        this.minCurrentVolume = minCurrentVolume;
        this.maxCurrentVolume = maxCurrentVolume;
        this.currentVolume = minCurrentVolume;
    }

    public Radio(int size) {
        maxNumberOfRadioStations = minNumberOfRadioStations + size;
        maxCurrentVolume = minCurrentVolume + size;
    }
    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public int getMaxNumberOfRadioStations(){
        return maxNumberOfRadioStations;
    }

    public int getMinNumberOfRadioStations(){
        return minNumberOfRadioStations;
    }




    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxCurrentVolume() {
        return maxCurrentVolume;
    }
    public int getMinCurrentVolume() {
        return minCurrentVolume;
    }


    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {

        if (newCurrentRadioStationNumber < minNumberOfRadioStations) {
            return;
        }
        if (newCurrentRadioStationNumber > maxNumberOfRadioStations) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public void increaseRadioStationNumber() {
        if (currentRadioStationNumber < maxNumberOfRadioStations) {
            currentRadioStationNumber = currentRadioStationNumber + 1;
            setCurrentRadioStationNumber(currentRadioStationNumber);

        }
    }

    public void reduceRadioStationNumber() {
        if (currentRadioStationNumber < maxNumberOfRadioStations) {
            currentRadioStationNumber = currentRadioStationNumber - 1;
        }
        setCurrentRadioStationNumber(currentRadioStationNumber);
    }

    public void next() {
        if (currentRadioStationNumber == maxNumberOfRadioStations) {
            currentRadioStationNumber = 0;
            setCurrentRadioStationNumber(currentRadioStationNumber);
        }

    }

    public void prev() {
        if (currentRadioStationNumber == 0) {
            currentRadioStationNumber = maxNumberOfRadioStations;
            setCurrentRadioStationNumber(currentRadioStationNumber);
        }

    }


    public void setMaxNumberStation() {
        currentRadioStationNumber = maxNumberOfRadioStations;
    }


    public void setCurrentVolume(int newCurrentVolume) {

        if (newCurrentVolume < minCurrentVolume) {
            return;
        }
        if (newCurrentVolume > maxCurrentVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxCurrentVolume) {
            currentVolume = currentVolume + 1;
            setCurrentVolume(currentVolume);
        }
    }

    public void reduceVolume() {
        if (currentVolume < maxCurrentVolume) {
            currentVolume = currentVolume - 1;
        }
        setCurrentVolume(currentVolume);
    }

    public void nextVolume() {
        if (currentVolume == maxCurrentVolume) {
            currentVolume = maxCurrentVolume;
            setCurrentVolume(currentVolume);
        }


    }

    public void setMaxVolume() {
        currentVolume = maxCurrentVolume;
    }

    public void prevVolume() {
        if (currentVolume == minCurrentVolume) {
            currentVolume = minCurrentVolume;
            setCurrentVolume(currentVolume);
        }


    }

}
