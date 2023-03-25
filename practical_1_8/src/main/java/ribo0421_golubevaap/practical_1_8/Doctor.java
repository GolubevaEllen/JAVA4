/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ribo0421_golubevaap.practical_1_8;

/**
 *
 * @author Vedro
 */
public class Doctor implements Comparable<Doctor>{
    private String fio;
    private String special;
    private int number;
    private int work_days;
    private boolean attestation;

    public Doctor(String fio, String special, int number, int work_days, boolean attestation) {
        this.fio = fio;
        this.special = special;
        this.number = number;
        this.work_days = work_days;
        this.attestation = attestation;
    }
    
    @Override
    public int compareTo (Doctor d) {
        return fio.compareTo(d.getFio());
    }
    
    public String getFio() {
        return this.fio;
    }
    public String getSpecial() {
        return this.special;
    }
    public int getNumber() {
        return this.number;
    }
    public int getWork_days() {
        return this.work_days;
    }
    public boolean isAttestated() {
        return this.attestation;
    }
    
    public void setFio(String fio) {
        this.fio = fio;
    }
    public void setSpecial(String special) {
        this.special = special;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public void setWork_days(int work_days) {
        this.work_days = work_days;
    }
    public void setAttestation(boolean attestation) {
        this.attestation = attestation;
    }
    
    public String getInfo() {
        return this.fio+", "+this.special+", "+this.number+", "+this.work_days
                +", "+this.attestation;
    }
    public void changeAttestation(Doctor doc) {
        doc.setAttestation(!doc.isAttestated());
    }
}
