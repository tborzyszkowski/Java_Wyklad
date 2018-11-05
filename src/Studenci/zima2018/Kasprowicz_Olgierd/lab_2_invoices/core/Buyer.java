package lab2.core;

import org.iban4j.IbanFormatException;
import org.iban4j.IbanUtil;
import org.iban4j.InvalidCheckDigitException;
import org.iban4j.UnsupportedCountryException;

import java.util.StringJoiner;

public class Buyer
{
    private final String name;
    private final String address;
    private final String TIN;
    private final String IBAN;

    public Buyer(String name, String address, String TIN, String IBAN)
    {
        this.name = name;
        this.address = address;
        this.TIN = TIN;

        try
        {
             IbanUtil.validate(IBAN);
        }
        catch (IbanFormatException | InvalidCheckDigitException | UnsupportedCountryException e)
        {
             IBAN = null;
        }

        this.IBAN = IBAN;

    }

    public String getName()
    {
        return name;
    }

    public String getAddress()
    {
        return address;
    }

    public String getTIN()
    {
        return TIN;
    }

    public String getIBAN()
    {
        return IBAN;
    }

    @Override
    public String toString()
    {
        return new StringJoiner(", ", Buyer.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("address='" + address + "'")
                .add("TIN='" + TIN + "'")
                .add("IBAN='" + IBAN + "'")
                .toString();
    }
}
