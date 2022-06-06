//********************************************************************
//  Employee.java       Author: Lewis/Loftus/Cocking
//
//  Represents a general paid employee.
//********************************************************************

public class Employee extends StaffMember
{
    private String socialSecurityNumber;
    private double payRate;

    //-----------------------------------------------------------------
    //  Sets up an employee with the specified information.
    //-----------------------------------------------------------------
    public Employee (String eName, String eAddress, String ePhone,
    String socSecNumber, double rate)
    {
        super (eName, eAddress, ePhone);

        socialSecurityNumber = socSecNumber;
        payRate = rate;
    }

    //-----------------------------------------------------------------
    //  Returns the pay rate for this employee.
    //-----------------------------------------------------------------
    public double getPayRate()
    {
        return payRate;
    }

    //-----------------------------------------------------------------
    //  Returns information about an employee as a string.
    //-----------------------------------------------------------------
    public String toString()
    {
        String result = super.toString();

        result += "\nSocial Security Number: " + socialSecurityNumber;

        return result;
    }

    //-----------------------------------------------------------------
    //  Returns the amount this employee should be paid.
    //-----------------------------------------------------------------
    public double pay()
    {
        return payRate;
    }
}
