public class Radio {
    public int currentRadioStationNumber;
    public int soundVolume;

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void next(int newNext) {
        if (newNext < 9) {
            currentRadioStationNumber = newNext + 1;
        }
        if (newNext == 9) {
            newNext = 0;
        }
    }

    public void prev(int newPrev) {
        if (newPrev > 0) {
            currentRadioStationNumber = newPrev - 1;
        }
        if (newPrev == 0) {
            currentRadioStationNumber = newPrev + 9;
        }


    }

    public void increaseVolume(int newCurrentVolume) {
        if (newCurrentVolume <= 10) {
            soundVolume = newCurrentVolume + 1;
        }
        if (newCurrentVolume > 10) {
            return;
        }


    }

    public void reduceVolume(int newCurrentVolume) {
        if (newCurrentVolume <= 10) {
            soundVolume = newCurrentVolume - 1;
        }
        if (newCurrentVolume > 10) {
            soundVolume = 10;
        }

        if (newCurrentVolume <= 0) {
            soundVolume = 0;
        }

    }


}
