
package filepersistence;

import java.io.IOException;

/**
 * We assume: Each sensor gets its own storage engine. There wont be a parameter
 * sensor name.
 */
public interface SensorDataStorage {

    /**
     * This method can be called by a sensor to save a data set.
     * @param time UNIX time when measurement took place
     * @param values sensor data
     * @throws PersistenceException if something unexpected happened. Insufficient right, medium broken, offline..
     */
    void saveData(long time, float values) throws PersistenceException, IOException;

    // what else could we need? Get inspired by e.g. this:
    // https://docs.oracle.com/javase/7/docs/api/java/util/List.html

    // size() is usually a good idea
    void size();
    // get at data set at a position as well.
    void writeDataSetAndPosition( long[] timeStamps, float [] values) throws Exception;
    void readDataSetAndPosition( long[] timeStamps, float []values) throws Exception;
    Object file (String filename);
    // what can go wrong.... Declare methods. Don't forget exceptions. Write comments!

}