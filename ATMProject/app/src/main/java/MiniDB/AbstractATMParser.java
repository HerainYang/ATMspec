package MiniDB;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * This class should be instantiated every the program start running.
 * @author herain (zhonghao)
 * @version 1.0.0
 */
public abstract class AbstractATMParser {
    private JSONObject ATM_info;

    /**
     * This class should take the card number as input
     * @throws IOException When the file format error
     * @throws ParseException When the file can not be parse
     */
    public AbstractATMParser() throws IOException, ParseException {
        initParse();
    }

    /**
     * Reads and parses the json file and stores it in the ATM_info attribute.
     * @throws ParseException When the file format error
     * @throws IOException When the file can not be read
     */
    public abstract void initParse() throws ParseException, IOException;

    /**
     * @return how many coins in the ATM
     */
    public abstract double getCoinsAmount();

    /**
     * @return how many notes in the ATM
     */
    public abstract double getNotesAmount();

    /**
     * @param amount The number of coins add to the ATM.
     */
    public abstract void addCoinAmount(double amount);

    /**
     * @param amount The number of notes add to the ATM.
     */
    public abstract void addNotesAmount(double amount);
}
