package SceneController;

import javafx.event.ActionEvent;

/**
 * This interface has a function that control the behaviours of all buttons that in the same scene, Every controller should implement this.
 * @author herain (zhonghao)
 * @version 1.0.0
 */
public interface Clickable {
    /**
     * @see javafx.event.ActionEvent
     */
    public void buttonActionController(ActionEvent event);
}
