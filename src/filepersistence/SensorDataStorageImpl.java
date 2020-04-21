package filepersistence;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class SensorDataStorageImpl implements SensorDataStorage {

    @Override
    public void saveData(long time, float values) throws PersistenceException, IOException {
    }
    @Override
    public void size() {

    }

    @Override
    public void writeDataSetAndPosition(long[] timeStamps, float[] values) throws Exception {

    }

    @Override
    public void readDataSetAndPosition(long[] timeStamps, float[] values) throws Exception {

    }

    @Override
    public Object file(String filename) {
        return null;
    }

}
