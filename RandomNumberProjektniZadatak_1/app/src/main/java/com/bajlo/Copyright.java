package com.bajlo;


public class Copyright
{
    private String copyright;

    public String getCopyright ()
    {
        return copyright;
    }

    public void setCopyright (String copyright)
    {
        this.copyright = copyright;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [copyright = "+copyright+"]";
    }
}