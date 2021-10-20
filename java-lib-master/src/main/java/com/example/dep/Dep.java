package com.example.dep;

/**
 * This class allows to say 'Hello' and 'Bye' to friends,
 * or even to ignore someone
 */
public class Dep
{

    /**
     * Say 'Hello' to a friend
     *
     * @param  name  the name of your friend
     * @return       a greeting message to your friend
     */
    public static String hello( String name )
    {
        return "Hello " + name + "!";
    }

    /**
     * Say 'Bye' to a friend
     *
     * @param  name  the name of your friend
     * @return       a goodbye message to your friend
     */
    public static String bye( String name )
    {
        return "Bye " + name + "!";
    }

    /**
     * Say nothing
     */
    public static void ignore( String name )
    {
        return;
    }
}
