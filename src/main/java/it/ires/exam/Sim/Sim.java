package it.ires.exam.Sim;

import java.time.LocalTime;
import java.util.*;

public class Sim {
    private String phoneNumber;
    private double remainingCredit;
    private List phoneCalls;
    private String company;
    private PricePlan pricePlan;
    private LocalTime startingConversationTime;
    private LocalTime endingConversationTime;

    public Sim(String phoneNumber, String company) {
        this.phoneNumber = phoneNumber;
        this.remainingCredit = remainingCredit;
        this.phoneCalls = new ArrayList<>();
        this.company = company;
        this.pricePlan = pricePlan;
        this.startingConversationTime = startingConversationTime;
        this.endingConversationTime = endingConversationTime;

    }

    public boolean startPhonecall(Phonecall phonecall) {
        phoneCalls.add(phonecall);
        setStartingConversationTime(LocalTime.now());
        return true;
    }

    public void endPhonecall(Phonecall phonecall) {
        phoneCalls.add(phonecall);
        setEndingConversationTime(LocalTime.now());

    }

    public int getPhonecallMinutes() {
        int phonecallDuration = startingConversationTime.getMinute() - endingConversationTime.getMinute();



        return phonecallDuration;
    }

    public String getPhoneNumber() {
      /*  Scanner scnr = new Scanner(System.in);
        long input = scnr.nextLong();
        Pattern pattern = Pattern.compile("(\\+\\d{3})(\\\\d{4})(\\\\d+)"); */
        return this.phoneNumber;
    }

    public double getRemainingCredit() {
        return remainingCredit;
    }

    public List<Phonecall> getPhoneCalls() {
        return phoneCalls;
    }

    public String getCompany() {

        return company;
    }

    public PricePlan getPricePlan() {
        return pricePlan;
    }

    public void setStartingConversationTime(LocalTime startingConversationTime) {
        this.startingConversationTime = startingConversationTime;
    }

    public void setEndingConversationTime(LocalTime endingConversationTime) {
        this.endingConversationTime = endingConversationTime;
    }

    public LocalTime getStartingConversationTime() {
        return startingConversationTime;
    }

    public LocalTime getEndingConversationTime() {
        return endingConversationTime;
    }

    @Override
    public String toString() {
        return "Sim{" +
                "phoneNumber=" + phoneNumber +
                ", remainingCredit=" + remainingCredit +
                ", phoneCalls=" + phoneCalls +
                ", company=" + company +
                ", pricePlan=" + pricePlan +
                '}';
    }
}
