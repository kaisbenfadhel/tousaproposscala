package chapitre.quatre.Oriente.Objet.A.Laide.De.classes

/**
  * Created By kais BEN FADHEL on 31/07/2019
  */

object CreateClassesAndObjects extends App {

  // "Etape 1: Comment définir une classe simple pour représenter un objet Donut")
  class Donut(name: String, productCode: Long) {

    def print = println(s"Nom de Donut  = $name, codeProduit = $productCode")

  }

  println("\nEtape 2: Comment créer des instances de la classe Donut")
  val glazedDonut = new Donut("Donut Glacée", 1111)
  val vanillaDonut = new Donut("Donut Vanille", 2222)

  println("\nEtape 3: Comment appeler la fonction print pour chaque objet en anneau")
  glazedDonut.print
  vanillaDonut.print

  println("\nEtape 4: Comment accéder aux propriétés de la classe Donut")
  //glazedDonut.name
  //glazedDonut.productCode
  //Vous obtiendrez une erreur du compilateur si vous essayez d'accéder aux propriétés name ou productCode à partir des objets donut.
  //Bien sûr, vous pouvez définir des fonctions getter pour exposer ces propriétés, mais dans les prochains tutoriels, nous montrerons
  // comment utiliser la classe de cas  pour  fournir automatiquement des accesseurs à vos objets.


}
