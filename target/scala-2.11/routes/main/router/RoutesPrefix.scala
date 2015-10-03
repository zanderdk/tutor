
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/zander/activator/Tutor/conf/routes
// @DATE:Fri Oct 02 12:44:42 CEST 2015


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
