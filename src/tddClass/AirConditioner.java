package tddClass;

public class AirConditioner {
    private String power;
    private int temperature;


    public AirConditioner() {
        temperature = 16;
    }




    public void powerOn() {
        power = "on";
    }

    public String getPower() {
        return power;
    }

    public void powerOff() {
        power = "off";
    }

    public void increase() {
        if(temperature < 30) {
            temperature = temperature + 1;
        }
    }

    public int getTemp() {

        return temperature;
    }

    public void decrease() {
        if (temperature > 16) {
            temperature -= 1;
        }
    }
}