package data

import domain.ShopProduct

import javax.inject.Singleton
import scala.collection.mutable.ArrayBuffer

@Singleton
class ShopRepository {

    private var products = ArrayBuffer[ShopProduct]()

    private var productNextId = 1

    def getProductById(id: Int): ShopProduct = {
        products.find(_.id == id).orNull
    }
    def getAllProducts(): ArrayBuffer[ShopProduct] ={
        products
    }

    def createProduct(shopProduct: ShopProduct): Unit = {
        products.addOne(new ShopProduct(productNextId,
            shopProduct.name,
            shopProduct.categoryId,
            shopProduct.description))

    }


    def updateProduct(id:Int, newShopProduct: ShopProduct): Unit = {
       var updated = products.find(_.id ==id).orNull

        if(updated != null){
            updated.name = newShopProduct.name
            updated.description = newShopProduct.description
            updated.categoryId = newShopProduct.categoryId
        }


    }

    def deleteProduct(id:Int) ={
        var deleted = products.find(_.id == id).orNull

        if (deleted != null) {
            products -= deleted
        }

    }


}
