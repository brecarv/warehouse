package controllers;
import play.mvc.Controller;
import play.mvc.Result;
import java.util.List;
import javax.inject.Inject;
import models.*;
import views.html.products.*;
import play.data.FormFactory;
import play.data.Form;

public class Products extends Controller {    
    @Inject
    FormFactory formFactory;
    
//    Form<Product> boundForm = formFactory.form(Product.class).bindFromRequest();
 //   Product product = productForm.get();

    public Result list() {
        List<Product> products = Product.findAll();
        return ok(list.render(products));
    }
    
    public Result newProduct(){
        Form<Product> productForm = formFactory.form(Product.class);
        return ok(details.render(productForm));
    }
    
    public Result details(String ean) {
        return ok();
    }

    public Result save() {
        Form<Product> productForm = formFactory.form(Product.class);
        Form<Product> boundForm = productForm.bindFromRequest();
        if(boundForm.hasErrors()) {
            flash("error", "Please correct the form below.");
            return badRequest(details.render(boundForm));
        }
        Product product = boundForm.get();
        product.save();
        flash("success", String.format("Successfully added product %s", product));
        return redirect(routes.Products.list());
    }

}