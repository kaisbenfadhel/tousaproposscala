package chapitre.trois.Penser.en.termes.de.fonctions.tutoriel_01

/**
  * Created By kais BEN FADHEL on 26/07/2019
  */
object CreateAndUseFunctions extends App {

  println("\nEtape 1: Comment définir et utiliser une fonction qui n'a pas de paramètre et qui a un type de retour")

  def favoriteDonut(): String = {
    "Donut Glacée"
  }

  val myFavoriteDonut = favoriteDonut()
  println(s"Mon Donut préféré est:  $myFavoriteDonut")

  println("\nEtape 2: Comment définir et utiliser une fonction sans parenthèse")

  def leastFavoriteDonut = "Donut Nature"

  println(s"Mon donut préféré est: $leastFavoriteDonut")


  println("\nEtape 3: Comment définir et utiliser une fonction sans type de retour")

  def printDonutSalesReport(): Unit = {
    //Unit  est similaire à l'utilisation du mot clé void dans une méthode.
    // consulter les données de vente dans la base de données et créer un rapport
    println("Impression du rapport de vente de Donut")
  }

  printDonutSalesReport()
}
