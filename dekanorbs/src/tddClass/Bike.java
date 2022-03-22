package tddClass;

public class Bike {
    private String power;
    private int speed;
    private String gear;

    public String turnOn() {
        power = "ON";
        return power;
    }

    public String turnOff() {
        power = "OFF";
        return power;
    }
    public int speedometer() {return speed;}

    public void accelerate(){

        if(speed >= 40){
            speed += 4;
            gear = "gear four";
        }
        if (speed >=30 && speed <40){
            speed += 3;
            gear = "gear three";
            //if (speed > 40)speed = 40;
        }
        if (speed >= 20 && speed <30){
            speed += 2;
            gear = "gear two";
        }
        if (speed <20){
            //if(speed > 20)speed = 19;
            speed += 1;
            gear = "gear one";

        }
        //gear three
        /*
        */
    }

    public void decelerate(){
        //gear one
        if (speed <=20){
            speed -= 1;
            gear = "gear one";
        }
        //gear two
        if (speed >=20 && speed <=30){
            speed -= 2;
            gear = "gear two";
            //if (speed < 20)speed = 20;
        }
        //gear three
        if (speed >=30 && speed <=40){
            speed -= 3;
            gear = "gear three";
            //if (speed < 30)speed = 30;
        }
        if(speed >= 40){
            speed -= 4;
            gear = "gear four";
            //if (speed < 40)speed = 40;
        }
    }

    public  String getGear(){
        return gear;
    }
}
