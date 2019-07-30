package chapitre.trois.Penser.en.termes.de.fonctions.tutoriel_11


/**
  * Created By kais BEN FADHEL on 30/07/2019
  */

object FunctionCurryingWithParameterGroups extends App {
  //nous allons apprendre à créer des fonctions dont les paramètres sont organisés en groupes de paramètres,
  // également appelé fonction Currying
  println("Etape 1: Comment définir une fonction avec des groupes de paramètres au curry")

  def totalCost(donutType: String)(quantity: Int)(discount: Double): Double = {
    println(s"Calcul du coût total pour $quantity $donutType with ${discount * 100}% discount")
    val totalCost = 2.50 * quantity
    totalCost - (totalCost * discount)
  }

  println("\nEtape 2: Comment appeler une fonction avec des groupes de paramètres au curry")
  println(s" coût Total = ${totalCost("Donut glacée")(10)(0.1)}")


  println("\nEtape 3:Comment créer une fonction partiellement appliquée à partir d'une fonction avec des groupes de paramètres au curry")
  val totalCostForGlazedDonuts = totalCost("Glazed Donut") _

  println("\nEtape 4: Comment appeler une fonction partiellement appliquée")
  println(s"\ncoût Total de Donuts glacées ${totalCostForGlazedDonuts(10)(0.1)}")

}
