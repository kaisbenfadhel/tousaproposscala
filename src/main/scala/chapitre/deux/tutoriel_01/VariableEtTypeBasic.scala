package chapitre.deux.tutoriel_01

/**
  * Created By kais BEN FADHEL on 15/07/2019
  */
object VariableEtTypeBasic extends App {

  println("Etape 1: Variables immuables")
  val donutsToBuy: Int = 5

  //    donutsToBuy = 10 // vous obtiendrez une erreur de compilation car donutToBuy est immuable


  println("\nEtape 2: Variables mutables")
  var favoriteDonut: String = "Thé glacé"
  favoriteDonut = "Ice cream" //Le compilateur Scala ne se plaint plus que nous réaffections la valeur favoriteDonut de "Thé glacé" à "Ice cream".


  println("\nEtape 3: lazy initialization")
  lazy val donutService = "initialize some donut service"
  //Vous pouvez parfois souhaiter différer l'initialisation de certaines variables jusqu'au moment où elles sont consommées par votre application.
  // Ceci est généralement appelé "lazy initialization"  et nous devons utiliser le mot clé : lazy.


  println("\nEtape 4: Types pris en charge par Scala")
  val donutsBought: Int = 5

  val bigNumberOfDonuts: Long = 100000000L

  val smallNumberOfDonuts: Short = 1

  val priceOfDonut: Double = 2.50

  val donutPrice: Float = 2.50f

  val donutStoreName: String = "Tous à propos scala"

  //val donutByte: Byte = 0xa

  val donutFirstLetter: Char = 'D'

  val nothing: Unit = ()


  println("\nEtape 5: Déclarez une variable sans initialisation")
  var leastFavoriteDonut: String = _

  leastFavoriteDonut = "Plain Donut"
}
