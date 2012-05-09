package sample.scala.handlers
import org.eclipse.core.commands.AbstractHandler
import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.jface.dialogs.MessageDialog
import org.eclipse.ui.handlers.HandlerUtil

class SampleHandler extends AbstractHandler {

  def SampleHandler() {}

  override def execute(event: ExecutionEvent): Object = {
    val window = HandlerUtil.getActiveWorkbenchWindowChecked(event)
    MessageDialog.openInformation(
      window.getShell(),
      "Scala",
      "Hello, Scala world")

    return Nil
  }
}
