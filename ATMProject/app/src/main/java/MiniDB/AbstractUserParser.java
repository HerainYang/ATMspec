package MiniDB;

import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * This class will read the json file of the user, and return what you need, or modify the json file as you wish
 * @author herain (zhonghao)
 * @version 1.0.0
 */
public abstract class AbstractUserParser {
    private String card_number;
    private JSONObject card_info;

    /**
     * This class should take the card number as input
     * @param card_number
     * @throws IOException When the file format error
     * @throws ParseException When the file can not be parse
     */
    public AbstractUserParser(String card_number) throws IOException, ParseException {
        this.card_number = card_number;
        initParse();
    }

    /**
     * Reads and parses the json file and stores it in the card_info attribute.
     * @throws ParseException When the file format error
     * @throws IOException When the file can not be read
     */
    public abstract void initParse() throws ParseException, IOException;

    /**
     * @return the PIN of the user
     */
    public abstract String testPIN();

    /**
     * Get "balance" from json file.
     * @return The balance of the user.
     */
    public abstract double getBalance();

    /**
     * Withdraw money from ATM, the validation of the amount should be check before calling this function.
     * @param Amount How many does user need
     * @param need_notes True if the user need notes.
     */
    public abstract void withdraw(double Amount, boolean need_notes);

    /**
     * Withdraw money (notes) from ATM, the validation of the amount should be check before calling this function.
     * @param Amount How many does user need
     */
    public void withdraw(double Amount){
        withdraw(Amount, true);
    }

    /**
     * Deposit money to ATM, the validation of the amount should be check before calling this function.
     * @param Amount How many does user deposit
     */
    public abstract void deposit(double Amount);

    /**
     * Get "start_date" from json file.
     * @return the date this card can be used.
     */
    public abstract String getStartDate();

    /**
     * Get "expiration_date" from json file.
     * @return the date this card expire.
     */
    public abstract String getExpirationDate();

    /**
     * Test the card is stolen or not.
     * @return if the card is stolen.
     */
    public abstract boolean isStolen();

    /**
     * Test the card is blocked or not.
     * @return if the card is blocked.
     */
    public abstract boolean isBlocked();
}
