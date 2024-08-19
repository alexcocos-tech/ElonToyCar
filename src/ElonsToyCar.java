public class ElonsToyCar{
    private int distanceDriven;
    private int batteryPrecentage;

    private ElonsToyCar(){
        this.distanceDriven = 0;
        this.batteryPrecentage = 100;
    }

    static ElonsToyCar buy(){
        return new ElonsToyCar();
    }

    public String distanceDisplay(){
        return "Distanta parcursa este " + distanceDriven + " metri.";
    }

    public String batteryDisplay(){
        if(batteryPrecentage == 0){
            return "Baterie epuizata";
        }
        return "Procentul de baterie este " + batteryPrecentage + " %.";
    }
    public void drive(){
        if(batteryPrecentage > 0){
            distanceDriven += 20;
            batteryPrecentage--;
        }
    }

    public static void main(String[] args) {
        ElonsToyCar car = new ElonsToyCar();
        car.drive();
        car.drive();
        car.drive();
        car.drive();
        car.drive();
        car.drive();
        car.drive();
        car.drive();
        System.out.println(car.distanceDisplay());
        System.out.println(car.batteryDisplay());

    }


}