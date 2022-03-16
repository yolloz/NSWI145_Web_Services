package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void simpleCocTest()
    {
        ManufacturerClient  client = new ManufacturerClient();
        String vin = "abc";
        Coc coc = client.getCoc(vin);
        assertEquals("VIN is not the same.", vin, coc.VIN);
    }

    @Test
    public void simpleTechnicalDataTest()
    {
        ManufacturerClient  client = new ManufacturerClient();
        String vin = "abc";
        TechnicalData td = client.getTechnicalData(vin);
        assertEquals("VIN is not the same.", vin, td.VIN);
    }
}
