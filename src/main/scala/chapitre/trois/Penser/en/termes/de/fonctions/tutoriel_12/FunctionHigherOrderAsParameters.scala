package chapitre.trois.Penser.en.termes.de.fonctions.tutoriel_12


/**
  * Created By kais BEN FADHEL on 30/07/2019
  */

object FunctionHigherOrderAsParameters extends App {
  println("Etape 1: Revoir comment définir une fonction avec des groupes de paramètres au curry")

  //La fonction totalCost () possède un paramètre de réduction qui pourrait être un candidat potentiel pour transmettre une
  // fonction permettant d'appliquer la logique de réduction.
  //En d'autres termes, redéfinissons la fonction totalCost () pour prendre une autre fonction pour le paramètre de remise indiqué
  // ci-dessous à l'étape 2.
  def totalCost(donutType: String)(quantity: Int)(discount: Double): Double = {
    println(s"Calcul du coût total pour $quantity $donutType with ${discount * 100}% discount")
    val totalCost = 2.50 * quantity
    totalCost - (totalCost * discount)
  }

  println("\nEtape 2: Comment définir une fonction d'ordre supérieur qui prend une autre fonction en paramètre")

  //Une fonction d'ordre supérieur est une fonction qui prend une autre fonction en tant que paramètre.
  def totalCostWithDiscountFunctionParameter(donutType: String)(quantity: Int)(f: Double => Double): Double = {
    println(s"Calcul du coût total pour $quantity $donutType")
    val totalCost = 2.50 * quantity
    f(totalCost)
  }

  println("\nEtape 3: Comment appeler une fonction d'ordre supérieur et passer une fonction anonyme en paramètre")
  val totalCostOf5Donuts = totalCostWithDiscountFunctionParameter("Donut glacée")(5) { totalCost =>
    val discount = 2 // supposez que vous récupérez le remise de la base de données
    totalCost - discount
  }
  println(s"Coût total de 5 Donuts glacés avec fonction de remise anonyme = $totalCostOf5Donuts")


  println("\nStep 4: Comment définir et passer une fonction à une fonction d'ordre supérieur")

  def applyDiscount(totalCost: Double): Double = {
    val discount = 2 // supposez que vous récupérez le remise de la base de données
    totalCost - discount
  }

  println(s"Coût total de 5 Donuts glacés avec fonction discount = ${totalCostWithDiscountFunctionParameter("Donut glacée")(5)(applyDiscount(_))}")


}
