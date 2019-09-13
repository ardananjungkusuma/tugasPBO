package js3;

/**
 *
 * @author ardan
 */
public class MotorDemo {
    public static void main(String[] args){
        Motor motor = new Motor();
        motor.tambahKecepatan();
        motor.printStatus();
        
        motor.nyalakanMesin();
        motor.printStatus();
        
        motor.tambahKecepatan();
        motor.printStatus();
        motor.tambahKecepatan();
        motor.tambahKecepatan();
        motor.printStatus();
        
        motor.kurangiKecepatan();
        motor.printStatus();
        motor.tambahKecepatan();
        motor.tambahKecepatan();
        motor.printStatus();
        motor.tambahKecepatan();
        motor.printStatus();
        motor.tambahKecepatan();
        motor.printStatus();
    }
}
