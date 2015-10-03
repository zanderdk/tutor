
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>

<html ng-app="stregsystemet"> 
    <head>
        <title>"""),_display_(/*6.17*/title),format.raw/*6.22*/("""</title>
        <link rel="stylesheet" href=""""),_display_(/*7.39*/routes/*7.45*/.Assets.at("stylesheets/foundation.min.css")),format.raw/*7.89*/("""">
        <script src="http://code.jquery.com/jquery-2.1.4.js" type="text/javascript"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.5/angular.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.5/angular-route.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular-resource.min.js">
        <script src=""""),_display_(/*12.23*/routes/*12.29*/.Assets.at("javascripts/hash.js")),format.raw/*12.62*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*13.23*/routes/*13.29*/.Assets.at("javascripts/foundation.min.js")),format.raw/*13.72*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*14.23*/routes/*14.29*/.Assets.at("javascripts/vendor/modernizr.js")),format.raw/*14.74*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*15.23*/routes/*15.29*/.Assets.at("javascripts/vendor/fastclick.js")),format.raw/*15.74*/("""" type="text/javascript"></script>

        <!-- <link href="http://getbootstrap.com/dist/css/bootstrap.min.css" rel="stylesheet"> -->
        <!-- <script src="http://getbootstrap.com/dist/js/bootstrap.min.js"></script> -->
        <!-- <script src="http://getbootstrap.com/assets/js/ie10&#45;viewport&#45;bug&#45;workaround.js"></script> -->
        <!-- <script src=""""),_display_(/*20.28*/routes/*20.34*/.Assets.at("javascripts/jquery.cookie.js")),format.raw/*20.76*/("""" type="text/javascript"></script> -->
        <script>
            angular.module("Tutor", [])
        </script>
    </head>
        <body>


  <section class="gs-navigation">
    <section class="gs-topbar">
  <nav class="top-bar" data-topbar="">
    <ul class="title-area">
      <li class="name">
        <h1><a href="/">Title</a></h1>
      </li>
      <li class="toggle-topbar menu-icon"><a href="#"><span>Menu</span></a></li>
    </ul>

    
  <section class="top-bar-section">
      <ul class="right">
        <li class="has-form">
          <div class="row collapse">
            <div class="small-8 large-7 columns">
              <input placeholder="Search" type="text">
            </div>
            <div class="small-3 large-3 end columns">
              <a href="#" class="alert button expand">Go</a>
            </div>
          </div>
        </li>
        <li class="has-dropdown not-click">
          <a href="#">Dropdown</a>
          <ul class="dropdown"><li class="title back js-generated"><h5><a href="javascript:void(0)">Back</a></h5></li><li class="parent-link hide-for-medium-up"><a class="parent-link js-generated" href="#">Dropdown</a></li>
            <li><a href="#">First link in dropdown</a></li>
          </ul>
        </li>
      </ul>
    </section></nav>

            """),_display_(/*60.14*/content),format.raw/*60.21*/("""
        """),format.raw/*61.9*/("""</body>
  </html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Sat Oct 03 13:27:39 CEST 2015
                  SOURCE: /home/zander/activator/Tutor/app/views/main.scala.html
                  HASH: b4181662a371a9ae0f89d85feebbf5d00692cd56
                  MATRIX: 530->1|655->31|682->32|783->107|808->112|881->159|895->165|959->209|1406->629|1421->635|1475->668|1559->725|1574->731|1638->774|1722->831|1737->837|1803->882|1887->939|1902->945|1968->990|2366->1361|2381->1367|2444->1409|3776->2714|3804->2721|3840->2730
                  LINES: 20->1|25->1|26->2|30->6|30->6|31->7|31->7|31->7|36->12|36->12|36->12|37->13|37->13|37->13|38->14|38->14|38->14|39->15|39->15|39->15|44->20|44->20|44->20|84->60|84->60|85->61
                  -- GENERATED --
              */
          