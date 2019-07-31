package chapitre.quatre.Oriente.Objet.A.Laide.De.classes

import chapitre.quatre.Oriente.Objet.A.Laide.De.classes.SingletonObject.DonutShoppingCartCalculator

/**
  * Created By kais BEN FADHEL on 31/07/2019
  */

object SingletonObject extends App {

  //Déclarer un objet Singleton que vous pouvez utiliser pour stocker des champs globaux et des fonctions ou méthodes utilitaires
  //Le modèle Singleton est si couramment utilisé que Scala a rendu très facile la création d'instances uniques d'un objet.
  // Tout ce que vous avez à faire est d’utiliser le mot-clé Object comme nous le montrerons dans les étapes ci-dessous.


  println("Step 1: Comment déclarer un objet singleton")

  object DonutShoppingCartCalculator {

    println("\nStep 2: Comment définir un champ global")
    val discount: Double = 0.01

    println("\nStep 3: Comment définir une fonction utilitaire appelée CalculateTotalCost")

    def calculateTotalCost(donuts: List[String]): Double = {
      // calculate the cost of donuts
      return 1
    }
  }

  println("\nEtape 4: Comment appeler le champ de remise global à partir de l'étape 2")
  println(s"Remise globale = ${DonutShoppingCartCalculator.discount}")

  println("\nEtape 5: Comment appeler la fonction utilitaire CalculateTotalCost à partir de l'étape 3")
  println(s"Appelez la fonction CalculateTotalCost = ${DonutShoppingCartCalculator.calculateTotalCost(List())}")


}




