package filepersistence;

import streamMachine.PersistenceException;

import java.io.IOException;

public class SensorDataStorageImpl implements StreamMachine {

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
