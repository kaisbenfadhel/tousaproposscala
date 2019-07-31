package chapitre.trois.Penser.en.termes.de.fonctions.tutoriel_18

/**
  * Created By kais BEN FADHEL on 30/07/2019
  */

object TailRecursiveFunction extends App {
  //La fonction récursive de queue aidera à prévenir les débordements dans votre pile d’appels
  // car l’évaluation de votre construction en boucle a lieu à chaque étape.

  println("Etape 1: Comment définir un tableau de type String")
  val arrayDonuts: Array[String] = Array("Donut Vanille", "Donut Fraise ", "Donut Complet", "Donut Glacée")

  println("\nEtape 2: Comment définir une fonction récursive")

  @annotation.tailrec
  def search(donutName: String, donuts: Array[String], index: Int): Option[Boolean] = {
    if (donuts.length == index) {
      None
    } else if (donuts(index) == donutName) {
      Some(true)
    } else {
      val nextIndex = index + 1
      search(donutName, donuts, nextIndex)
    }
  }

  //Le  @annotation.tailrec indique au compilateur d'ajouter des Optimisations en ce qui concerne la pile de gestion
  // de cadre de cette fonction est récursive.
  println("\nEtape 3: Comment appeler une fonction récursive")
  val found = search("Donut Glacée", arrayDonuts, 0)
  println(s"Recherche Donut Chocolat= $found")

  val notFound = search("Donut Chocolat", arrayDonuts, 0)
  println(s"Recherche Donut Chocolat = $notFound")

}
