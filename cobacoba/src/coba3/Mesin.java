/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba3;

/**
 *
 * @author ardan
 */
public class Mesin {

    private int kecepatan;
    private SepedaMotor motor;

    public Mesin() {

    }

    public int getKecepatan() {
        return kecepatan;
    }

    public SepedaMotor getMotor() {
        return motor;
    }

    public void setMotor(SepedaMotor motor) {
        this.motor = motor;
    }

    public void tambahKecepatan(SepedaMotor motor) {
        if (motor.getStatusMotor() == true) {
            if (motor.getMerk().equalsIgnoreCase("Honda")) {
                kecepatan += 10;
                if (kecepatan > 100) {
                    kecepatan = 100;
                    System.out.println("Kecepatan Max 100");
                }
            } else if (motor.getMerk().equalsIgnoreCase("Yamaha")) {
                kecepatan += 15;
                if (kecepatan > 100) {
                    kecepatan = 100;
                    System.out.println("Kecepatan Max 100");
                }
            } else if (motor.getMerk().equalsIgnoreCase("Suzuki")) {
                kecepatan += 25;
                if (kecepatan > 100) {
                    kecepatan = 100;
                    System.out.println("Kecepatan Max 100");
                }
            } else if (motor.getMerk().equalsIgnoreCase("Ducati")) {
                kecepatan += 50;
                if (kecepatan > 200) {
                    kecepatan = 200;
                    System.out.println("Kecepatan Max 200");
                }

            }
        } else {
            System.out.println("Motor Mati.Nyalakan Terlebih dahulu.");
        }

    }

    public void kurangiKecepatan(SepedaMotor motor) {
        if (motor.getStatusMotor() == true) {
            if (motor.getMerk().equalsIgnoreCase("Honda")) {
                kecepatan -= 5;
                if (kecepatan < 0) {
                    kecepatan = 0;
                    System.out.println("Kecepatan Min 0");
                }
            } else if (motor.getMerk().equalsIgnoreCase("Yamaha")) {
                kecepatan -= 10;
                if (kecepatan < 0) {
                    kecepatan = 0;
                    System.out.println("Kecepatan Min 0");
                }
            } else if (motor.getMerk().equalsIgnoreCase("Suzuki")) {
                kecepatan -= 15;
                if (kecepatan < 0) {
                    kecepatan = 0;
                    System.out.println("Kecepatan Min 0");
                }
            } else if (motor.getMerk().equalsIgnoreCase("Ducati")) {
                kecepatan -= 30;
                if (kecepatan < 0) {
                    kecepatan = 0;
                    System.out.println("Kecepatan Min 0");
                }

            }
        } else {
            System.out.println("Motor Mati. Nyalakan Terlebih dahulu.");
        }
    }
}
