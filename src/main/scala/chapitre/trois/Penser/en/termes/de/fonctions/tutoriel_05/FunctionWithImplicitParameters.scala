package chapitre.trois.Penser.en.termes.de.fonctions.tutoriel_05

/**
  * Created By kais BEN FADHEL on 30/07/2019
  */

object FunctionWithImplicitParameters extends App {
  println(s"Etape 1: Comment définir une fonction avec un paramètre implicite")

  //Le paramètre implicite discount de type Double est défini à l'aide du mot clé implicite entre parenthèses
  // après les paramètres de fonction habituels.
  //Cela signifie que la fonction totalCost () nécessitera une valeur implicite de type Double dans la portée,
  // comme défini à l'étape 2 ci-dessous.
  def totalCost(donutType: String, quantity: Int)(implicit discount: Double): Double = {
    println(s"Calcul du prix pour $quantity $donutType")
    val totalCost = 2.50 * quantity * (1 - discount)
    totalCost
  }

  println("\nEtape 2: Comment définir une valeur implicite")
  implicit val discount: Double = 0.1
  println(s"Tous les clients recevront un ${discount * 100}% discount")

  println("\nEtape 3: Comment appeler une fonction ayant un paramètre implicite")
  println(s"""Coût total avec remise de 5 Donuts glacés  = ${totalCost("Donut galcée", 5)}""")
  //Vous n'avez pas eu besoin de répercuter manuellement la valeur de remise lorsque vous appelez la fonction totalCost ().
  //Le compilateur Scala recherchera une valeur implicite de type Double pour le paramètre implicite de remise que vous avez défini
  // à l'étape 2.
  //S'il n'y a pas de valeurs implicites dans la portée, vous obtiendrez une erreur du compilateur.

  println("\nEtape 4: Comment définir une fonction prenant plusieurs paramètres implicites")

  def totalCost2(donutType: String, quantity: Int)(implicit discount: Double, storeName: String): Double = {
    println(s"[$storeName] Calcul du prix pour $quantity $donutType")
    val totalCost = 2.50 * quantity * (1 - discount)
    totalCost
  }

  println("\nEtape 5: Comment appeler une fonction qui prend plusieurs paramètres implicites")
  implicit val storeName: String = "Donut Store savoureux"
  println(s"""Coût total avec remise de 5 Donuts glacés  = ${totalCost2("Donut glacée", 5)}""")

  println("\nStep 6: Comment transmettre manuellement des paramètres implicites")
  println(s"""Coût total avec remise de 5 Donuts glacés, passé manuellement = ${totalCost2("Glazed Donut", 5)(0.1, "Scala Donut Store")}""")
}
