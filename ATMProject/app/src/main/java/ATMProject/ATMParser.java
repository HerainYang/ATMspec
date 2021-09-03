package ATMProject;

import MiniDB.*;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * @see MiniDB.AbstractATMParser
 */
public class ATMParser extends AbstractATMParser{
    public ATMParser() throws IOException, ParseException {
    }

    @Override
    public void initParse() throws ParseException, IOException {

    }

    @Override
    public double getCoinsAmount() {
        return 0;
    }

    @Override
    public double getNotesAmount() {
        return 0;
    }

    @Override
    public void addCoinAmount(double amount) {

    }

    @Override
    public void addNotesAmount(double amount) {

    }
}
