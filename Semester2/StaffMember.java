//********************************************************************
//  StaffMember.java       Author: Lewis/Loftus/Cocking
//
//  Represents a generic staff member.
//********************************************************************

abstract public class StaffMember
{
    private String name;
    private String address;
    private String phone;

    //-----------------------------------------------------------------
    //  Sets up a staff member using the specified information.
    //-----------------------------------------------------------------
    public StaffMember (String eName, String eAddress, String ePhone)
    {
        name = eName;
        address = eAddress;
        phone = ePhone;
    }

    //-----------------------------------------------------------------
    //  Returns a string including the basic employee information.
    //-----------------------------------------------------------------
    public String toString()
    {
        String result = "Name: " + name + "\n";

        result += "Address: " + address + "\n";
        result += "Phone: " + phone;

        return result;
    }

    //-----------------------------------------------------------------
    //  Derived classes must define the pay method for each type of
    //  employee.
    //-----------------------------------------------------------------
    public abstract double pay();
}
