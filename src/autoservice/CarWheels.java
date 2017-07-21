package autoservice;

public class CarWheels {
    private double tireState = 1.0;

    public CarWheels(){

    }

    public CarWheels(double tireState){
        this.tireState = tireState;
    }

    public void changeTire(){
        tireState = 1.0;
    }

    public void tireRubbing(double percentage){
        tireState -= (tireState*percentage/100.0);
    }

    public double getTireState(){
        return tireState;
    }

    public void getInfo(){
        System.out.println("The tire state: " + tireState);
    }

}