//********************************************************************
//  Executive.java       Author: Lewis/Loftus/Cocking
//
//  Represents an executive staff member, who can earn a bonus.
//********************************************************************

public class Executive extends Employee
{
    private double bonus;

    //-----------------------------------------------------------------
    //  Sets up an executive with the specified information.
    //-----------------------------------------------------------------
    public Executive (String eName, String eAddress, String ePhone,
    String socSecNumber, double rate)
    {
        super (eName, eAddress, ePhone, socSecNumber, rate);

        bonus = 0;  // bonus has yet to be awarded
    }

    //-----------------------------------------------------------------
    //  Awards the specified bonus to this executive.
    //-----------------------------------------------------------------
    public void awardBonus (double execBonus)
    {
        bonus = execBonus;
    }

    //-----------------------------------------------------------------
    //  Computes and returns the pay for an executive, which is the
    //  regular employee payment plus a one-time bonus.
    //-----------------------------------------------------------------
    public double pay()
    {
        double payment = super.pay() + bonus;

        bonus = 0;

        return payment;
    }
}
