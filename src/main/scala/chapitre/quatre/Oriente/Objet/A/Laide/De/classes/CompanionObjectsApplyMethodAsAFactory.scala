package chapitre.quatre.Oriente.Objet.A.Laide.De.classes


/**
  * Created By kais BEN FADHEL on 31/07/2019
  */


object CompanionObjectsApplyMethodAsAFactory extends App {

  println("Etape 1: Comment définir une classe simple pour représenter un objet Donut")

  class Donut(name: String, productCode: Option[Long] = None) {

    def print = println(s"Nom de Donut = $name, codeProduit = ${productCode.getOrElse(0)}")

  }

  println("\nEtape 2: Comment déclarer une hiérarchie de classes par héritage à l'aide du mot-clé extend")

  class GlazedDonut(name: String) extends Donut(name)

  class VanillaDonut(name: String) extends Donut(name)

  println("\nEtape 3:  Comment déclarer la méthode apply d'un objet compagnon en tant factory")

  object Donut {

    def apply(name: String): Donut = {
      name match {
        case "Glazed Donut" => new GlazedDonut(name)
        case "Vanilla Donut" => new VanillaDonut(name)
        case _ => new Donut(name)
      }
    }

  }

  println("\nStep 4: Comment appeler la méthode apply d'un objet compagnon qui est une factory")
  val glazedDonut = Donut("Donut Glacée")
  println(s"Le Type de la classe  glazedDonut = ${glazedDonut.getClass}")
  glazedDonut.print

  val vanillaDonut = Donut("Donut Vanille")
  println(s"Le Type de la classe vanillaDonut = ${vanillaDonut.getClass}")
  vanillaDonut.print


}
