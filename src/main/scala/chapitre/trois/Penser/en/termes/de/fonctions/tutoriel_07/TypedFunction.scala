package chapitre.trois.Penser.en.termes.de.fonctions.tutoriel_07

/**
  * Created By kais BEN FADHEL on 30/07/2019
  */
object TypedFunction extends App {
  println("Etape 1: Comment définir une fonction qui prend un paramètre String")

  def applyDiscount(couponCode: String) {
    println(s"Pourcentage de Remise  dans la base de données pour $couponCode")
  }

  println("\nEtape 2: Comment définir une fonction qui prend un paramètre de type Double")

  def applyDiscount(percentageDiscount: Double) {
    println(s"$percentageDiscount le remise sera appliqué")
  }

  println("\nEtape 3: Appel de la fonction applyDiscount avec les types de paramètre String ou Double")
  applyDiscount("COUPON_1234")
  applyDiscount(10)

  println("\nEtape 4: Comment définir une fonction typée générique qui spécifiera le type de son paramètre")

  def applyDiscount[T](discount: T) {
    discount match {
      case d: String =>
        println(s"pourcentage de Remise  dans la base de données pour $d")

      case d: Double =>
        println(s"$d le remise sera appliqué")

      case _ =>
        println("Type de remise non pris en charge")
    }
  }

  println("\nEtape 5: Comment appeler une fonction qui a des paramètres typés")
  applyDiscount[String]("COUPON_123")
  applyDiscount[Double](10)

}
