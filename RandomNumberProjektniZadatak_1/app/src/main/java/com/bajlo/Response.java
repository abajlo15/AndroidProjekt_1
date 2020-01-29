package com.bajlo;
public class Response
{
    private Copyright copyright;

    private Contents contents;

    private Success success;

    public Copyright getCopyright ()
    {
        return copyright;
    }

    public void setCopyright (Copyright copyright)
    {
        this.copyright = copyright;
    }

    public Contents getContents ()
    {
        return contents;
    }

    public void setContents (Contents contents)
    {
        this.contents = contents;
    }

    public Success getSuccess ()
    {
        return success;
    }

    public void setSuccess (Success success)
    {
        this.success = success;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [copyright = "+copyright+", contents = "+contents+", success = "+success+"]";
    }
}

