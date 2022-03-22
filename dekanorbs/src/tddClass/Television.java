package tddClass;

public class Television {
    private boolean active;
    private int volume;
    private  int tempVolume;
    private int channel;

    public void power() {
        active = !active;
    }

    public boolean isOn() {
        return active;
    }

    public void increaseVolume() {
        volume = tempVolume;
        if(active) {
            if (volume <20) {
                volume++;
                tempVolume++;
            }
        }
    }

    public int getVolume() {
        return volume;
    }

    public void decreaseVolume() {
        volume = tempVolume;
        if(active) {
            if(volume > 0) {
                volume--;
                tempVolume--;
            }
        }
    }

    public void mute() {

        if(volume == tempVolume)volume = 0;
        else {
            volume = tempVolume;
        }
    }

    public void increaseChannel() {
        if(active) {
            if (channel < 20)
            ++channel;
        }
    }

    public int getChannel() {
        return channel;
    }

    public void decreaseChannel() {
        if (active) {
            if (channel > 0)
                channel--;
        }
    }
}
