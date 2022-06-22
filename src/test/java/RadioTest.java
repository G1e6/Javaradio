import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void radioStationSelection(){
        Radio nextButton = new Radio();

        nextButton.next(9);

        int expected = 0;
        int actual = nextButton.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void radioStationSelection2() {
        Radio nextButton = new Radio();

        nextButton.next(0);

        int expected = 1;
        int actual = nextButton.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationSelection3() {
        Radio nextButton = new Radio();

        nextButton.next(1);

        int expected = 2;
        int actual = nextButton.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationSelection4() {
        Radio prevButton = new Radio();

        prevButton.prev(5);

        int expected = 4;
        int actual = prevButton.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationSelection5() {
        Radio prevButton = new Radio();

        prevButton.prev(0);

        int expected = 9;
        int actual = prevButton.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioIncreaseVolume() {
        Radio buttonIncreaseVolume = new Radio();

        buttonIncreaseVolume.increaseVolume(6);

        int expected = 7;
        int actual = buttonIncreaseVolume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioIncreaseVolume2() {
        Radio buttonIncreaseVolume = new Radio();

        buttonIncreaseVolume.increaseVolume(11);

        int expected = 0;
        int actual = buttonIncreaseVolume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioReduceVolume() {
        Radio buttonReduceVolume = new Radio();

        buttonReduceVolume.reduceVolume(9);

        int expected = 8;
        int actual = buttonReduceVolume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioReduceVolume2() {
        Radio buttonReduceVolume = new Radio();

        buttonReduceVolume.reduceVolume(0);

        int expected = 0;
        int actual = buttonReduceVolume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioReduceVolume3() {
        Radio buttonReduceVolume = new Radio();

        buttonReduceVolume.reduceVolume(10);

        int expected = 9;
        int actual = buttonReduceVolume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioReduceVolume4() {
        Radio buttonReduceVolume = new Radio();

        buttonReduceVolume.reduceVolume(11);

        int expected = 10;
        int actual = buttonReduceVolume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

}
