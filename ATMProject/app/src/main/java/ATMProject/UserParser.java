package ATMProject;

import MiniDB.*;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * @see MiniDB.AbstractUserParser
 */
public class UserParser extends AbstractUserParser {
    public UserParser(String card_number) throws IOException, ParseException {
        super(card_number);
    }

    @Override
    public void initParse() throws ParseException, IOException {

    }

    @Override
    public String testPIN() {
        return null;
    }

    @Override
    public double getBalance() {
        return 0;
    }

    @Override
    public void withdraw(double Amount, boolean need_notes) {

    }

    @Override
    public void deposit(double Amount) {

    }

    @Override
    public String getStartDate() {
        return null;
    }

    @Override
    public String getExpirationDate() {
        return null;
    }

    @Override
    public boolean isStolen() {
        return false;
    }

    @Override
    public boolean isBlocked() {
        return false;
    }
}
