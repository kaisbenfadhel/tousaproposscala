package chapitre.quatre.Oriente.Objet.A.Laide.De.classes

/**
  * Created By kais BEN FADHEL on 31/07/2019
  */

object CompanionObjects extends App {

  //nous allons apprendre à créer un  objet compagnon  pour une classe donnée. A son tour, vous utiliserez l'objet compagnon
  // pour créer des instances pour cette classe particulière sans  avoir à utiliser le  nouveau mot-clé.
  println("Etape 1: How to define a simple class to represent a Donut object")

  class Donut(name: String, productCode: Long) {

    def print = println(s"Nom de Donut = $name, codeProduit = $productCode")

  }

  //Un objet compagnon est défini à l'aide du mot clé object et le nom de l'objet doit être identique au nom de la classe.
  //De plus, l'objet compagnon doit définir une méthode apply () qui sera responsable de l'instanciation d'une instance de la classe donnée.
  println("\nEtape 2: Comment déclarer un objet compagnon pour la classe Donut")

  object Donut {

    def apply(name: String, productCode: Long): Donut = {
      new Donut(name, productCode)
    }

  }

  println("\nEtape 3:  Comment créer des instances de la classe Donut à l'aide de l'objet compagnon")
  val glazedDonut = Donut("Donut Glacée", 1111)
  val vanillaDonut = Donut("Donut Vanille", 2222)

  println("\nEtape 4: Comment appeler la fonction print pour chaque objet en anneau")
  glazedDonut.print
  vanillaDonut.print

}
