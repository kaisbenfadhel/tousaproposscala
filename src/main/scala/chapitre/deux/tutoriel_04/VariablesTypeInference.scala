package chapitre.deux.tutoriel_04

/**
  * Created By kais BEN FADHEL on 15/07/2019
  */
object VariablesTypeInference extends App {

  println("Etape 1: variable immuable")
  val donutsToBuy: Int = 5

  val donutsBought = 5 //le compliant Scala est suffisamment intelligent pour comprendre que le littéral 5 est en réalité un Integer.


  println("Etape 2: Déclarer les types pris en charge par Scala en utilisant Inference")

  val donutsBoughtToday = 5

  val bigNumberOfDonuts = 100000000L

  val smallNumberOfDonuts = 1

  val priceOfDonut = 2.50

  val donutPrice = 2.50f

  val donutStoreName = "Allaboutscala Donut Store"

  val donutByte = 0xa

  val donutFirstLetter = 'D'

 // val nothing = ()


  println("\nEtape 3: Utilisation du compilateur Scala pour convertir un type de données en un autre")
  val numberOfDonuts: Short = 1
  val minimumDonutsToBuy: Int = numberOfDonuts


  println("\nEtape 4: User driven conversion from one data type to another ")
  // RQ: Vous ne pouvez pas convertir un Int en une chaîne
  // val minimumDonutsToSell: String = numberOfDonuts

  val minimumDonutsToSell: String = numberOfDonuts.toString()
}
