package com.example.dep;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class DepTest 
    extends TestCase
{
    public DepTest( String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( DepTest.class );
    }

    public void testDep()
    {
        assertEquals( "Hello GitLab!", Dep.hello( "GitLab" ) );
        assertEquals( "Bye GitLab!", Dep.bye( "GitLab" ) );
    }
}
