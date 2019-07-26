package chapitre.deux.principes.fondamentaux.tutoriel_08

/**
  * Created By kais BEN FADHEL on 25/07/2019
  */

object WhileLoop extends App {


  println("Etape 1: Comment utiliser la boucle While en Scala")
  //nous avons utilisé une variable mutable ! Et nous savons que la mutation est une mauvaise chose en programmation fonctionnelle !
  //Encore une fois, il existe de meilleurs moyens fonctionnels pour obtenir la même sémantique de boucle en utilisant des techniques
  // de pliage ou récursives .
  var numberOfDonutsToBake = 10
  while (numberOfDonutsToBake > 0) {
    println(s"Donuts restants à cuire = $numberOfDonutsToBake")
    numberOfDonutsToBake -= 1
  }

  println("\nEtape2: Comment utiliser la boucle do while en Scala")
  var numberOfDonutsBaked = 0
  do {
    numberOfDonutsBaked += 1
    println(s"Nombre de beignets cuits = $numberOfDonutsBaked")
  } while (numberOfDonutsBaked < 5)
}
