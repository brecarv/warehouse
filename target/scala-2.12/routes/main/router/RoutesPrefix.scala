// @GENERATOR:play-routes-compiler
// @SOURCE:/home/brecarv/DevWeb/play-java-seed/conf/routes
// @DATE:Sat May 04 19:52:00 BRT 2019


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
