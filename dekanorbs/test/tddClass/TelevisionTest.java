package tddClass;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {

    private Television tv;
    @Test
    @BeforeEach
    public void tv(){
        tv = new Television();
    }

    @Test
    public void powerOnTvTest(){
        //given
        boolean mode = tv.isOn();
        assertFalse(mode);
        //when
        tv.power();
        mode = tv.isOn();
        //assert
        assertTrue(mode);

    }
    @Test
    public void powerOffTvTest(){
        //given
        tv.power();
        boolean mode = tv.isOn();
        assertTrue(mode);
        //when
        tv.power();
        mode = tv.isOn();
        //assert
        assertFalse(mode);

    }
    @Test
    public void  volumeUpTest(){
        //given
        tv.power();
        //when
        tv.increaseVolume();
        int sound = tv.getVolume();
        //assert
        assertEquals(1,sound);
    }
    @Test
    public void  volumeDownTest(){
        //given
        tv.power();
        tv.increaseVolume();
        tv.increaseVolume();
        tv.increaseVolume();
        //when
        tv.decreaseVolume();
        int sound = tv.getVolume();
        //assert
        assertEquals(2,sound);
    }
    @Test
    public void  volumeIsNotBelowZeroTest(){
        //given
        tv.power();
        int increaseNumber = 0;
        while (increaseNumber < 10) {
            increaseNumber++;
            tv.increaseVolume();
        }
        //when
        int decreaseNumber = 0;
        while (decreaseNumber < 20) {
            decreaseNumber++;
            tv.decreaseVolume();
        }
        int sound = tv.getVolume();
        //assert
        assertEquals(0,sound);
    }
    @Test
    public void  volumeUpNotAboveTwentyTest(){
        //given

        //when
        tv.power();
        int increaseNumber = 0;
        while (increaseNumber < 30) {
            increaseNumber++;
            tv.increaseVolume();
        }

        int sound = tv.getVolume();
        //assert
        assertEquals(20,sound);
    }

    @Test
    public void muteTest(){
        //given
        tv.power();

        int increaseNumber = 0;
        while (increaseNumber < 10) {
            increaseNumber++;
            tv.increaseVolume();
        }
        //when
        tv.mute();
        int sound = tv.getVolume();
        //assert
        assertEquals(0,sound);
    }

    @Test
    public void unMuteTest(){
        //given
        tv.power();

        int increaseNumber = 0;
        while (increaseNumber < 10) {
            increaseNumber++;
            tv.increaseVolume();
        }
        tv.mute();
        int sound = tv.getVolume();
        assertEquals(0,sound);
        //when
        tv.mute();
        sound = tv.getVolume();
        //assert
        assertEquals(10,sound);
    }

    @Test
    public void  volumeUpMuteVolumeUpTest(){
        //given
        tv.power();

        int increaseNumber = 0;
        while (increaseNumber < 10) {
            increaseNumber++;
            tv.increaseVolume();
        }
        tv.mute();
        assertEquals(0,tv.getVolume());
        //when
        tv.increaseVolume();
        //assert
        assertEquals(11,tv.getVolume());
    }
    @Test
    public void  volumeDownMuteVolumeDownTest(){
        //given
        tv.power();

        int increaseNumber = 0;
        while (increaseNumber < 20) {
            increaseNumber++;
            tv.increaseVolume();
        }

        tv.decreaseVolume();
        tv.mute();
        assertEquals(0,tv.getVolume());
        //when
        tv.decreaseVolume();
        //assert
        assertEquals(18,tv.getVolume());
    }
    @Test
    public void increaseChannelTest(){
        //given
        tv.power();
        //when
        tv.increaseChannel();
        //assert
        assertEquals(1,tv.getChannel());
    }
    @Test
    public void increaseChannelNotAboveTwentyTest(){
        //given
        tv.power();
        int increaseNumber = 0;
        while (increaseNumber < 20) {
            increaseNumber++;
            tv.increaseChannel();
        }
        //when
        tv.increaseChannel();
        //assert
        assertEquals(20,tv.getChannel());
    }

    @Test
    public void decreaseChannelTest(){
        //given
        tv.power();
        tv.increaseChannel();
        tv.increaseChannel();
        //when
        tv.decreaseChannel();
        //assert
        assertEquals(1,tv.getChannel());
    }

    @Test
    public void decreaseChannelNotBelowZeroTest(){
        //given
        tv.power();
        tv.increaseChannel();
        tv.increaseChannel();
        //when
        tv.decreaseChannel();
        tv.decreaseChannel();
        tv.decreaseChannel();
        tv.decreaseChannel();
        //assert
        assertEquals(0,tv.getChannel());
    }
}
