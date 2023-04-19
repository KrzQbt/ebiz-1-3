package domain


//import io.circe.generic.semiauto.deriveCodec
//import io.circe.syntax.EncoderOps
import io.circe.generic.semiauto.deriveCodec
import io.circe.parser
//import io.circe.parser.decode
import io.circe.syntax.EncoderOps

case class ShopProduct(val id: Int, var name:String ,var categoryId:Int, var description:String)

object ShopProduct {
    implicit val codec = deriveCodec[ShopProduct]
    def encode(shopProduct: ShopProduct): String = {
        shopProduct.asJson.toString
    }

    def deserializeFromJson(jsonString: String): ShopProduct = {
        parser.decode[ShopProduct](jsonString).toOption.get
    }

}

