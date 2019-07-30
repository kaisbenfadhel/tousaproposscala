package chapitre.trois.Penser.en.termes.de.fonctions.tutoriel_08

/**
  * Created By kais BEN FADHEL on 30/07/2019
  */

object PolymorphicFunctionWithGenericReturnType extends App {

  println("\nEtape 1: Revoir comment définir une fonction typée générique qui spécifiera le type de son paramètre")

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

  println("\nEtape 2: Revoir comment appeler une fonction qui a des paramètres typés")
  applyDiscount[String]("COUPON_123")
  applyDiscount[Double](10)


  println("\nEtape 3: Comment définir une fonction typée polymorphe ayant également un type de retour générique")

  def applyDiscountWithReturnType[T](discount: T): Seq[T] = {
    discount match {
      case d: String =>
        println(s"pourcentage de Remise  dans la base de données pour $d")
        Seq[T](discount)

      case d: Double =>
        println(s"$d le remise sera appliqué")
        Seq[T](discount)

      case d@_ =>
        println("Type de remise non pris en charge")
        Seq[T](discount)
    }
  }

  println("\nStep 4:  Comment appeler une fonction polymorphe générique qui possède également un type de retour générique")
  println(s"Résultat de applyDiscountWithReturnType avec le paramètre String = ${applyDiscountWithReturnType[String]("COUPON_123")}")

  println()
  println(s"Résultat de applyDiscountWithReturnType avec le paramètre Double = ${applyDiscountWithReturnType[Double](10.5)}")

  println()
  println(s"Résultat de applyDiscountWithReturnType avec le paramètre Char = ${applyDiscountWithReturnType[Char]('U')}")

}
