package chapitre.deux.principes.fondamentaux.tutoriel_10

/**
  * Created By kais BEN FADHEL on 26/07/2019
  */

object Tuples extends App {

  println("Etape 1: Utiliser Tuple2 pour stocker 2 points de données")
  val glazedDonutTuple = Tuple2("Donut glacé", "Très Délicieux")
  println(s"Donut glacé avec 2 points de données = $glazedDonutTuple")


  println("\nEtape 2: Accéder à chaque élément du tuple")
  val donutType = glazedDonutTuple._1
  val donutTasteLevel = glazedDonutTuple._2
  println(s"$donutType a un goût $donutTasteLevel")

  println("\nEtape 3: Utilisation de classes TupleN pour stocker plus de 2 points de donnéess")
  val glazedDonut = Tuple3("Donut glacée", "Très délicieux", 2.50)
  println(s"${glazedDonut._1} le niveau de goût est ${glazedDonut._2} et son prix est ${glazedDonut._3}")

  println("\nEtape 4: Comment utiliser pattern matching sur les Tuples")
  val strawberryDonut = Tuple3("Donut fraise", "Très délicieux", 2.50)
  val plainDonut = Tuple3("Donut nature", "Délicieux", 2)


  val donutList = List(glazedDonut, strawberryDonut, plainDonut)
  val priceOfPlainDonut = donutList.foreach { tuple => {
    tuple match {
      case ("Donut nature", taste, prix) => println(s"Donut type = Donut nature, prix = $prix")
      case d if d._1 == "Donut glacée" => println(s"Donut type = ${d._1}, prix = ${d._3}")
      case _ => None
    }

  }
  }
  println("\nEtape: Raccourci pour créer des tuples")
  val chocolateDonut = ("Donut chocolat", "Très délicieux", 3.0)
  println(s"Donut chocolat a un goût = ${chocolateDonut._2}, prix = ${chocolateDonut._3}")


}
