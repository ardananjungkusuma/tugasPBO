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
public class main {
    public static void main(String[] args) {
        SepedaMotor spdm = new SepedaMotor();
        SepedaMotor spdm2 = new SepedaMotor();
        SepedaMotor spdm3 = new SepedaMotor();
        SepedaMotor spdm4 = new SepedaMotor();
        Mesin msn = new Mesin();
        Mesin msn2 = new Mesin();
        Mesin msn3 = new Mesin();
        Mesin msn4 = new Mesin();
        spdm.setMesin(msn);
        spdm2.setMesin(msn2);
        spdm3.setMesin(msn3);
        spdm4.setMesin(msn4);
        
        spdm.setMerk("Honda");
        spdm.nyalakanMotor();
        msn.tambahKecepatan(spdm);
        msn.tambahKecepatan(spdm);
        msn.tambahKecepatan(spdm);
        msn.tambahKecepatan(spdm);
        msn.tambahKecepatan(spdm);
        msn.tambahKecepatan(spdm);
        msn.tambahKecepatan(spdm);
        msn.tambahKecepatan(spdm);
        msn.tambahKecepatan(spdm);
        msn.tambahKecepatan(spdm);
        msn.tambahKecepatan(spdm);
        spdm.info();
        
        spdm2.setMerk("Ducati");
        spdm2.nyalakanMotor();
        msn2.tambahKecepatan(spdm2);
        msn2.tambahKecepatan(spdm2);
        msn2.tambahKecepatan(spdm2);
        msn2.tambahKecepatan(spdm2);
        msn2.tambahKecepatan(spdm2);
        msn.tambahKecepatan(spdm2);
        spdm2.info();
        
        spdm3.setMerk("suzuki");
        msn3.tambahKecepatan(spdm3);
        spdm3.info();
        
    }
}
