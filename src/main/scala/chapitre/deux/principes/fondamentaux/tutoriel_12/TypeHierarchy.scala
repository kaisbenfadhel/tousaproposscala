package chapitre.deux.principes.fondamentaux.tutoriel_12

/**
  * Created By kais BEN FADHEL on 26/07/2019
  */

object TypeHierarchy extends App {

  println("Etape 1: Déclarer une variable de type Any")
  val favoriteDonut: Any = "Donut glacée"
  println(s"Donut préféré de type Any= $favoriteDonut")


  println("\nEtape 2: Déclarer une variable de type AnyRef")
  val donutName: AnyRef = "Donut glacée"
  println(s"Donut Nom de type AnyRef = $donutName")

  println("\nStep 3: Déclarer une variable de type AnyVal")
  val donutPrice: AnyVal = 2.50
  println(s"Donut prix de type AnyVal = $donutPrice")
}
