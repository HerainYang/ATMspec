package ATMProject;

import MiniDB.Valid;

/**
 * Front end should use validationTest function to generate the user parser.
 * @see MiniDB.Valid
 */
public class ValidationTester implements Valid {
    @Override
    public UserParser validationTest(String card_number, String PIN) {
        return null;
    }

    @Override
    public long testAmount(String input_amount) {
        return 0;
    }

    @Override
    public boolean enoughCashInATM(long input_amount, boolean need_notes) {
        return false;
    }
}
