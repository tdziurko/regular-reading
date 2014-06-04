package pl.tomaszdziurko.regular_reading

import org.scalatra._
import scalate.ScalateSupport

class RegularReadingScalatraServlet extends RegularReadingStack {

  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }
  
}
