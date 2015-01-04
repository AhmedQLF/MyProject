package de.saring.exerciseviewer.gui;

import de.saring.util.AppResources;
import de.saring.util.unitcalc.FormatUtils;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.util.Optional;

/**
 * This is the GUI context of the ExerciseViewer sub-application. It contains helper methods
 * and resource access for all ExerciseViewer components.
 *
 * @author Stefan Saring
 */
public interface EVContext {

    /**
     * Returns the primary stage (main window) of the application.
     *
     * @return Stage
     */
    Stage getPrimaryStage();

    /**
     * Displays a modal message dialog of the passed type with the specified message title and message
     * for the specified parent window.
     *
     * @param parent the parent component of the message dialog
     * @param alertType the type of the message dialog
     * @param titleKey the resource key for the dialog title text
     * @param messageKey the resource key for the message text
     * @param arguments list of objects which needs to be inserted in the message text (optional)
     * @return An Optional that contains the result of the displayed dialog.
     */
    Optional<ButtonType> showFxMessageDialog(Window parent, Alert.AlertType alertType, String titleKey,
                             String messageKey, Object... arguments);

    /**
     * Displays a modal text input dialog for the specified parameters.
     *
     * @param parent parent window of the input dialog
     * @param titleKey resource key for the dialog title
     * @param messageKey resource key for the dialog message
     * @param initialValue initial text value to be displayed
     * @return Optional containing the entered String (can be empty text) or Optional.empty() when the user has cancelled the dialog
     */
    Optional<String> showFxTextInputDialog(Window parent, String titleKey, String messageKey, String initialValue);

    /**
     * Returns the provider of application text resources.
     *
     * @return AppResources
     */
    AppResources getFxResources();

    /**
     * Returns the format utils class for the current unit system.
     *
     * @return the current FormatUtils instance
     */
    FormatUtils getFormatUtils();
}
