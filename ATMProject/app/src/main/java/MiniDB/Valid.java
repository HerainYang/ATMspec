package MiniDB;

import ATMProject.*;

/**
 * This interface will test the validation of everything.
 * @author herain (zhonghao)
 * @version 1.0.0
 */
public interface Valid {
    /**
     * Test the validation of the card
     * @param card_number The number entered by user.
     * @param PIN The PIN code entered by user.
     * @return the parser of the user json file, parser can be used for further operations.
     */
    public UserParser validationTest(String card_number, String PIN);

    /**
     * Test the number input by user is valid or not.
     * @param input_amount The number input by user.
     * @return -1 is it is invalid, n if it is valid.
     */
    public long testAmount(String input_amount);

    /**
     * Test if there is enough money in the ATM
     * @param input_amount The number input by user.
     * @param need_notes Ture if the user needs notes.
     * @return True if there is enough money in the ATM.
     */
    public boolean enoughCashInATM(long input_amount, boolean need_notes);
}
