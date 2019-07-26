package chapitre.deux.principes.fondamentaux.tutoriel_11

/**
  * Created By kais BEN FADHEL on 26/07/2019
  */
object Option extends App {

  println("Etape 1: Comment utiliser Option and Some - exemple basic")
  val glazedDonutTaste: Option[String] = Some("Très délicieux")
  println(s"Donut glacée a le goût   = ${glazedDonutTaste.get}")
  //Comme nous avons intégré notre chaîne dans une option, pour appeler sa valeur, nous appelons la fonction get ()  comme indiqué ci-dessus.
  //Mais appeler get () dans un système de production est généralement une odeur de code car vous risquez de vous retrouver avec la même
  // exception NullPointerException.


  println("\nEtape 2: Comment utiliser Option and None - exemple basic")
  val glazedDonutName: Option[String] = None
  println(s"Donut glacée name = ${glazedDonutName.getOrElse("Donut glacée")}")

  println("\nStep 3: Comment utiliser Pattern Matching avec Option")
  glazedDonutName match {
    case Some(name) => println(s"Nom de donut reçu = $name")
    case None => println(s"Aucun nom de donut n'a été trouvé!")
  }

  println("\nAstuce 1: Filtre Aucun en utilisant la fonction map")
  glazedDonutTaste.map(taste => println(s"glazedDonutTaste = $taste"))
  glazedDonutName.map(name => println(s"glazedDonutName = $name"))
}
