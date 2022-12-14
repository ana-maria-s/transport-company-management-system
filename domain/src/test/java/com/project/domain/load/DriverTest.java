package com.project.domain.load;

import static org.junit.Assert.assertSame;

import com.project.domain.load.helper.License;
import org.junit.Test;

public class DriverTest {

    @Test
    public void testConstructor() {
        Driver actualDriver = new Driver("Jane", "Doe", 1, new License(10));
        License license = new License(10);
        actualDriver.setLicense(license);
        assertSame(license, actualDriver.getLicense());
    }
}

