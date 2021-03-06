import com.softserve.spark._
import org.scalatra._
import javax.servlet.ServletContext

class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext) {
    context.mount(new MyScalatraServlet, "/*")
  }
  override def destroy(context: ServletContext) {
    analytics.Worker.stop
  }
}
