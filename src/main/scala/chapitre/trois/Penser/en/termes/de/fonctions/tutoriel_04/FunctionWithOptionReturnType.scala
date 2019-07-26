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

  println(s"\nEtape 3: Comment appeler une fonction avec le type de retour Option en utilisant pattern matching")
  dailyCouponCode() match {
    case Some(couponCode) => println(s"Code de coupon du jour = $couponCode")
    case None => println(s"Désolé, il n'y a pas de code promo aujourd'hui!")

      println(s"\nEtape 4: Comment appeler une fonction avec le type de retour Option à l’aide de la fonction map ()")
      dailyCouponCode().map(couponCode => println(s"Code de coupon du jour = $couponCode"))
  }


  println("\nStep 5: Passez en revue la fonction CalculateDonutCost () du tutoriel précédent")
  def calculateDonutCost(donutName: String, quantity: Int, couponCode: Option[String]): Double = {
    println(s"Calcul du coût pour $donutName, quantity = $quantity")

    couponCode match {
      case Some(coupon) =>
        val discount = 0.1 // Let's simulate a 10% discount
      val totalCost = 2.50 * quantity * (1 - discount)
        totalCost

      case None => 2.50 * quantity
    }
  }

  // appliquer le code de coupon quotidien si nous en avons un
  println(s"""Coût total avec code de coupon quotidien = ${calculateDonutCost("Donut Glacée", 5, dailyCouponCode())}""")
}
