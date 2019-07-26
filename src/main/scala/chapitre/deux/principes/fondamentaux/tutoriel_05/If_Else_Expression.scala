package chapitre.deux.principes.fondamentaux.tutoriel_05

/**
  * Created By kais BEN FADHEL on 25/07/2019
  */

object If_Else_Expression extends App {

  println("Etape 1: Utilisation de la clause if comme déclaration")
  val numberOfPeople = 25
  val donutsPerPerson = 2

  if (numberOfPeople > 10)
    println(s"Nombre de beignets à acheter = ${numberOfPeople * donutsPerPerson}")

  println(s"\nEtape 2: Utilisation de la clause if et else comme déclaration")
  val defaultDonutsToBuy = 8

  if (numberOfPeople > 10)
    println(s"Nombre de beignets à acheter = ${numberOfPeople * donutsPerPerson}")
  else
    println(s"Nombre de beignets à acheter = $defaultDonutsToBuy")


  println("\nEtape 3: Utilisation if, else if, et else clause comme déclaration")
  if (numberOfPeople > 10) {
    println(s"Nombre de beignets à acheter = ${numberOfPeople * donutsPerPerson}")
  } else if (numberOfPeople == 0) {
    println("Le nombre de personnes est zéro.")
    println(s"Nombre de beignets à acheter = $defaultDonutsToBuy")
  }

  println("\nEtape 4: Utiliser la clause if et else comme expression")
  val numberOfDonutsToBuy = if (numberOfPeople > 10) (numberOfPeople * donutsPerPerson) else defaultDonutsToBuy
  println(s"Nombre de beignets à acheter = $numberOfDonutsToBuy")

}
