package chapitre.quatre.Oriente.Objet.A.Laide.De.classes

/**
  * Created By kais BEN FADHEL on 31/07/2019
  */

object DeclareValuesAndFieldsInCompanionObject extends App {

  println("Etape 1: Comment définir une classe simple pour représenter un objet Donut")

  class Donut(name: String, productCode: Option[Long] = None) {

    def print = println(s"Donut name = $name, productCode = ${productCode.getOrElse(0)}, uuid = ${Donut.uuid}")

  }

  println("\nEtape 2: Comment déclarer des champs et des valeurs dans un objet compagnon")

  object Donut {

    private val uuid = 1

    def apply(name: String, productCode: Option[Long]): Donut = {
      new Donut(name, productCode)
    }

    def apply(name: String): Donut = {
      new Donut(name)
    }
  }

  println("\nEtape 3: Comment créer des instances de la classe Donut à l'aide de l'objet Compagnon")
  val glazedDonut = Donut("Donut Glacée", Some(1111))
  val vanillaDonut = Donut("Donut Vanille")

  println("\nStep 4: Comment appeler la fonction sur chaque objet Donut")
  glazedDonut.print
  vanillaDonut.print


}
