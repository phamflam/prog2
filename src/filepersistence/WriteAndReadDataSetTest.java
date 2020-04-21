package filepersistence;

import org.junit.Test;

import java.nio.file.attribute.UserPrincipalNotFoundException;

import static org.junit.Assert.*;

public class WriteAndReadDataSetTest {

    @Test
    public void Test() throws Exception {
        SensorDataStorage s = new SensorDataStorageImpl();
        s.saveData(Long.MIN_VALUE -1, -Float.MIN_VALUE -1);
        s.saveData(Long.MAX_VALUE+1, 0);
        s.saveData(Long.MIN_VALUE-1, 0);
        s.saveData(0, Float.MIN_VALUE-1);
        s.saveData(0, Float.MAX_VALUE+1);
    }

    @Test
    public void Test2() throws Exception{
        SensorDataStorage s2= new SensorDataStorageImpl();
        s2.writeDataSetAndPosition(new long[]{Long.MIN_VALUE - 1}, new float[]{Float.MIN_VALUE - 1});
        s2.writeDataSetAndPosition(new long[] {Long.MAX_VALUE+1},new float[] {0} );
        s2.writeDataSetAndPosition(new long[]{Long.MIN_VALUE - 1}, new float[]{0});
        s2.writeDataSetAndPosition(new long[]{0}, new float[]{Float.MIN_VALUE - 1});
        s2.writeDataSetAndPosition(new long[]{0}, new float[]{Float.MAX_VALUE+1});
    }
    @Test
    public void Test3() throws Exception{
        SensorDataStorage s3= new SensorDataStorageImpl();
        s3.readDataSetAndPosition(new long[]{Long.MIN_VALUE - 1}, new float[]{Float.MIN_VALUE - 1});
        s3.readDataSetAndPosition(new long[] {Long.MAX_VALUE+1},new float[] {0} );
        s3.readDataSetAndPosition(new long[]{Long.MIN_VALUE - 1}, new float[]{0});
        s3.readDataSetAndPosition(new long[]{0}, new float[]{Float.MIN_VALUE - 1});
        s3.readDataSetAndPosition(new long[]{0}, new float[]{Float.MAX_VALUE+1});
    }
    @Test
    public void Test4() throws Exception {
        SensorDataStorage s4= new SensorDataStorageImpl();

    }

}