package p06_TirePressureMonitoringSystem;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class AlarmTest {

    private Sensor sensor;
    private Alarm alarm;

    @Before
    public void setUp(){
        sensor = Mockito.mock(Sensor.class);
        alarm = new Alarm(sensor);
    }

    @Test
    public void testAlarmShouldBeOnForLowPressure(){
        when(sensor.popNextPressurePsiValue()).thenReturn(14.0);
        alarm.check();
        Assert.assertTrue(alarm.getAlarmOn());
    }

    @Test
    public void testAlarmShouldBeOnForHighPressure(){
        when(sensor.popNextPressurePsiValue()).thenReturn(25.0);
        alarm.check();
        Assert.assertTrue(alarm.getAlarmOn());
    }

    @Test
    public void testAlarmShouldBeOffForNormalPressure(){
        when(sensor.popNextPressurePsiValue()).thenReturn(17.0);
        alarm.check();
        Assert.assertFalse(alarm.getAlarmOn());
    }

}