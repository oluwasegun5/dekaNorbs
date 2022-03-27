package tddClass;

public class AirConditioner {

    private boolean power;
    private int temperature;


    public AirConditioner() {
        temperature = 16;
    }




    public void power() {
        power = !power;
    }

    public boolean isOn() {
        return power;
    }

    public void increase() {
        if (isOn()) {
            if (temperature < 30) {
                temperature = temperature + 1;
            }
        }
    }

    public int getTemp() {

            return temperature;

    }

    public void decrease() {
        if (isOn()) {
            if (temperature > 16) {
                temperature -= 1;
            }
        }
    }
}