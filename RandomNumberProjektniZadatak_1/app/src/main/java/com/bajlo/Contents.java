package com.bajlo;


public class Contents
{
    private String number;

    private String answer;

    private Base base;

    public String getNumber ()
    {
        return number;
    }

    public void setNumber (String number)
    {
        this.number = number;
    }

    public String getAnswer ()
    {
        return answer;
    }

    public void setAnswer (String answer)
    {
        this.answer = answer;
    }

    public Base getBase ()
    {
        return base;
    }

    public void setBase (Base base)
    {
        this.base = base;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [number = "+number+", answer = "+answer+", base = "+base+"]";
    }
}

