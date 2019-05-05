
package views.html.products

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object list extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Products catalogue")/*3.28*/ {_display_(Seq[Any](format.raw/*3.30*/("""
"""),format.raw/*4.1*/("""<h2>All products</h2>
<table class="table table-striped">
    <thead>
        <tr>
            <th>EAN</th>
            <th>Name</th>
            <th>Description</th>
        </tr>
    </thead>
    <tbody>
        """),_display_(/*14.10*/for(product <- products) yield /*14.34*/ {_display_(Seq[Any](format.raw/*14.36*/(""" """),format.raw/*14.37*/("""<tr>
            <td><a href=""""),_display_(/*15.27*/routes/*15.33*/.Products.details(product.ean)),format.raw/*15.63*/("""">
                    """),_display_(/*16.22*/product/*16.29*/.ean),format.raw/*16.33*/("""
                """),format.raw/*17.17*/("""</a></td>
            <td><a href=""""),_display_(/*18.27*/routes/*18.33*/.Products.details(product.ean)),format.raw/*18.63*/("""">
                    """),_display_(/*19.22*/product/*19.29*/.name),format.raw/*19.34*/("""</a></td>
            <td><a href=""""),_display_(/*20.27*/routes/*20.33*/.Products.details(product.ean)),format.raw/*20.63*/("""">
                    """),_display_(/*21.22*/product/*21.29*/.description),format.raw/*21.41*/("""</a></td>
            </tr>
            """)))}),format.raw/*23.14*/("""
    """),format.raw/*24.5*/("""</tbody>
</table>
""")))}))
      }
    }
  }

  def render(products:List[Product]): play.twirl.api.HtmlFormat.Appendable = apply(products)

  def f:((List[Product]) => play.twirl.api.HtmlFormat.Appendable) = (products) => apply(products)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat May 04 19:50:16 BRT 2019
                  SOURCE: /home/brecarv/DevWeb/play-java-seed/app/views/products/list.scala.html
                  HASH: 71b13e777b90d590bee98957616c55398ccb1664
                  MATRIX: 963->1|1082->27|1109->29|1143->55|1182->57|1209->58|1451->273|1491->297|1531->299|1560->300|1618->331|1633->337|1684->367|1735->391|1751->398|1776->402|1821->419|1884->455|1899->461|1950->491|2001->515|2017->522|2043->527|2106->563|2121->569|2172->599|2223->623|2239->630|2272->642|2344->683|2376->688
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|45->14|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|54->23|55->24
                  -- GENERATED --
              */
          