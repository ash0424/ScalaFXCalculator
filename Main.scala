import java.io.IOException
import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.Includes._
import scalafx.scene.Parent
import scalafx.scene.Scene
import scalafx.stage.Stage
import scalafxml.core.{FXMLLoader, FXMLView, NoDependencyResolver}
import javafx.{scene => jfxs}
import view.CalculatorLayoutController
import model.Calculator

object Main extends JFXApp {
  
  val resource = getClass.getResource("view/CalculatorLayout.fxml")
    if (resource == null) {
      throw new IOException("Cannot load resource: CalculatorLayout.fxml")
    }

  val root = FXMLView(resource, NoDependencyResolver)

  stage = new JFXApp.PrimaryStage() {
    alwaysOnTop = true
    title = "Calculator" 
    scene = new Scene(root)
  }

} 

