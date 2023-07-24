package it.ires.exam.Smartphone;

import it.ires.exam.Sim.*;

public class Smartphone {
    private Sim sim;

    public Smartphone(Sim sim) {
        this.sim = sim;
    }

    public boolean startPhonecall(Phonecall phonecall) {
        if (phonecall == null) {
            sim.startPhonecall(phonecall);

        }

        return false;
    }
    public void endPhonecall(Phonecall phonecall) {
        sim.endPhonecall(phonecall);

    }
    public int getPhonecallMinutes(){
        sim.getPhonecallMinutes();
        return getPhonecallMinutes();
    }
    public int phonecallDurationFor() {
        for (Phonecall phonecall : sim.getPhoneCalls()) {
            sim.getPhonecallMinutes();

        }

        return phonecallDurationFor();
    }
}
