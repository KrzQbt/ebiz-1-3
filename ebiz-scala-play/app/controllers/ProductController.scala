package controllers

import data.ShopRepository
import domain.ShopProduct
import io.circe.syntax.EncoderOps
import play.api.mvc.Results.Ok
import play.api.mvc._
//import play.api.libs.json.Json

import javax.inject.{Inject, Singleton}

@Singleton
class ProductController @Inject()(val shopRepository: ShopRepository,val controllerComponents: ControllerComponents) extends BaseController {

    def getProductById(id: Int) = Action { implicit request: Request[AnyContent] =>

        if( shopRepository.getProductById(id) == null) {
            NotFound
        } else {
            Ok(shopRepository.getProductById(id).asJson.toString)
        }

    }

    def getAllProducts() = Action { implicit request: Request[AnyContent] =>
        Ok(shopRepository.getAllProducts().asJson.toString())
    }

    def postProduct() = Action { implicit request: Request[AnyContent] =>

        shopRepository.createProduct(ShopProduct.deserializeFromJson(request.body.asJson.get.toString))
        Ok
    }


    def updateProductById(id: Int) = Action { implicit request: Request[AnyContent] =>

        if (shopRepository.getProductById(id) == null) {
            NotFound
        } else {
            shopRepository.updateProduct(id,ShopProduct.deserializeFromJson(request.body.asJson.get.toString))
            Ok
        }

    }


    def deleteProductById(id: Int) = Action { implicit request: Request[AnyContent] =>

        if (shopRepository.getProductById(id) == null) {
            NotFound
        } else {
            shopRepository.deleteProduct(id)
            Ok
        }

    }







}
