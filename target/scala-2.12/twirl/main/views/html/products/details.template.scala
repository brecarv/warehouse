
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

object details extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(productForm: Form[Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""

"""),_display_(/*5.2*/main("Product form")/*5.22*/ {_display_(Seq[Any](format.raw/*5.24*/("""
	"""),format.raw/*6.2*/("""<h1>Product form</h1>
	"""),_display_(/*7.3*/helper/*7.9*/.form(action = routes.Products.save())/*7.47*/ {_display_(Seq[Any](format.raw/*7.49*/("""
	"""),format.raw/*8.2*/("""<fieldset>
		<legend>Product ("""),_display_(/*9.21*/productForm("name")/*9.40*/.getValue()),format.raw/*9.51*/(""")</legend>
		"""),_display_(/*10.4*/helper/*10.10*/.inputText(productForm("ean"), '_label -> "EAN")),format.raw/*10.58*/("""
		"""),_display_(/*11.4*/helper/*11.10*/.inputText(productForm("name"),'_label -> "Name")),format.raw/*11.59*/("""
		"""),_display_(/*12.4*/helper/*12.10*/.inputText(productForm("description"), '_label -> "Description")),format.raw/*12.74*/("""
	"""),format.raw/*13.2*/("""</fieldset>
    <input type="submit" class="btn btn-primary" value="save">
    
    """),_display_(/*16.6*/helper/*16.12*/.CSRF.formField),format.raw/*16.27*/("""
	"""),format.raw/*17.2*/("""<a class="btn" href=""""),_display_(/*17.24*/routes/*17.30*/.Products.list()),format.raw/*17.46*/("""">Cancel</a>
	""")))}),format.raw/*18.3*/("""
""")))}))
      }
    }
  }

  def render(productForm:Form[Product]): play.twirl.api.HtmlFormat.Appendable = apply(productForm)

  def f:((Form[Product]) => play.twirl.api.HtmlFormat.Appendable) = (productForm) => apply(productForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat May 04 19:50:16 BRT 2019
                  SOURCE: /home/brecarv/DevWeb/play-java-seed/app/views/products/details.scala.html
                  HASH: 1e3d2395021c0ddfb484cba8c22cbd6f259afe0b
                  MATRIX: 966->1|1067->31|1111->47|1139->50|1167->70|1206->72|1234->74|1283->98|1296->104|1342->142|1381->144|1409->146|1466->177|1493->196|1524->207|1564->221|1579->227|1648->275|1678->279|1693->285|1763->334|1793->338|1808->344|1893->408|1922->410|2033->495|2048->501|2084->516|2113->518|2162->540|2177->546|2214->562|2259->577
                  LINES: 28->1|31->2|34->3|36->5|36->5|36->5|37->6|38->7|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|47->16|47->16|47->16|48->17|48->17|48->17|48->17|49->18
                  -- GENERATED --
              */
          