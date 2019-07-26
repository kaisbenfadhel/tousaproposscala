package chapitre.trois.Penser.en.termes.de.fonctions.tutoriel_04


/**
  * Created By kais BEN FADHEL on 26/07/2019
  */
object FunctionWithOptionReturnType extends App {

  println(s"Etape 1: Comment définir une fonction qui retourne une option de type chaîne")

  //Définissons une fonction appelée dailyCouponCode ()  qui suppose une recherche dans la base de données afin
  // de fournir à nos clients un code de coupon quotidien.
  def dailyCouponCode(): Option[String] = {
    // rechercher dans la base de données si nous allons fournir à nos clients un coupon aujourd'hui
    val couponFromDb = "COUPON_1234"
    Option(couponFromDb).filter(_.nonEmpty)
  }

  println(s"\nÉtape 2: appelez la fonction avec le type de retour Option à l'aide de getOrElse")
  val todayCoupon: Option[String] = dailyCouponCode()
  println(s"Code de coupon du jour = ${todayCoupon.getOrElse("Pas de coupon Aujourd'hui")}")


}
