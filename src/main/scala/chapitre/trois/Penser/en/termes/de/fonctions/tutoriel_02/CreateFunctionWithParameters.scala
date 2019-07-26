package chapitre.trois.Penser.en.termes.de.fonctions.tutoriel_02

/**
  * Created By kais BEN FADHEL on 26/07/2019
  */

object CreateFunctionWithParameters extends App {
  println("Etape 1:  Comment définir une fonction avec des paramètres")

  def calculateDonutCost(donutName: String, quantité: Int): Double = {
    println(s"calculer le coût pour $donutName, quantité = $quantité")

    // faire des calculs ...
    2.50 * quantité
  }

  println("\nEtape 2:  Comment appeler une fonction avec des paramètres")
  val totalCost = calculateDonutCost("Donut Glacée", 5)
  println(s"Coût total des donuts = $totalCost")
  //RQ= Nous avons stocké la valeur renvoyée par notre fonction CalculateDonutCost
  // dans une variable immuable appelée totalCost .

  println("\nEtape 3: Comment ajouter des valeurs par défaut aux paramètres de fonction")

  def calculateDonutCost2(donutName: String, quantité: Int, couponCode: String = "NO CODE"): Double = {
    println(s"Calcul du coût pour $donutName, quantité = $quantité, couponCode = $couponCode")
    // faire des calculs ...
    2.50 * quantité
  }

  println("\nEtape 4: Comment appeler une fonction avec des paramètres ayant des valeurs par défaut")
  val totalCostWithDiscount = calculateDonutCost2("Donut glacée", 4, "COUPON_12345")
  val totalCostWithoutDiscount = calculateDonutCost2("Donut glacée", 4)
  println(s"Coût total des donuts = $totalCostWithDiscount")
  //RQ= Si vous utilisiez Java , vous auriez dû utiliser la surcharge de méthodes pour obtenir le même effet souhaité.
  //Cependant, la possibilité de fournir une valeur par défaut aux paramètres de fonction dans Scala est une solution
  // beaucoup plus élégante!
}
