package chapitre.deux.principes.fondamentaux.tutoriel_02

/**
  * Created By kais BEN FADHEL on 15/07/2019
  */
object StringInterpolation extends App {

  println("Etape 1: Utilisation String interpolation  pour imprimer une variable")
  val favoriteDonut: String = "Glazed Donut"
  println(s"My favorite donut = $favoriteDonut")


  println("\nEtape 2: Utilisation String interpolation sur les propriétés d'un objet")

  case class Donut(name: String, tasteLevel: String)

  val favoriteDonut2: Donut = Donut("Glazed Donut", "Very Tasty")
  println(s"My favorite donut name = ${favoriteDonut2.name}, tasteLevel = ${favoriteDonut2.tasteLevel}")


  println("\nEtape 3: Utilisation String interpolation pour évaluer des expressions")
  val qtyDonutsToBuy: Int = 10
  println(s"Est-ce que nous achetons 10 donuts = ${qtyDonutsToBuy == 10}")


  println("\nEtape 4: Utilisation String interpolation  pour formater du texte")
  val donutName: String = "Vanilla Donut"
  val donutTasteLevel: String = "Tasty"
  println(f"$donutName%10s $donutTasteLevel")


  println("\nEtape 5: Utilisation f interpolation pour formater des nombres")
  val donutPrice: Double = 7.50
  println(s"prix Donut = $donutPrice")
  //si nous voulions imprimer les 2 décimales pour la variable donutPrice. Ceci peut être réalisé en utilisant le f interpolateur.
  println(f"prix donut Formatter = $donutPrice%.2f")

  println("\nEtape 6: Utilisation de l'interpolation brute")
  println(raw"Favorite donut\t$donutName")
}
