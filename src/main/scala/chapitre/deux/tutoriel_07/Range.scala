package chapitre.deux.tutoriel_07

/**
  * Created By kais BEN FADHEL on 25/07/2019
  */

object Range extends App {

  println("Etape 1: Créer une Rang numérique simple de 1 à 5 inclus")
  val from1To5 = 1 to 5
  println(s"Range de 1 a 5 inclusive = $from1To5")



  println("\nEtape 2: Créer Rang numérique comprise entre 1 et 5, à l'exclusion du dernier nombre entier 5")
  //Nous utilisons le untilmot clé pour exclure la dernière limite supérieure qui est le numéro 5.
  val from1Until5 = 1 until 5
  println(s"Range de 1 until 5 ou 5 est exclu  = $from1Until5")

  println("\nStep 3: Créer une plage numérique comprise entre 0 et 10, mais incrémenter de multiples de 2")
  val from0To10By2 = 0 to 10 by 2
  println(s"Range de 0 à 10 avec des multiples de 2 = $from0To10By2")

  println("\nEtape 4: Créer une plage alphabétique pour représenter la lettre a à z")
  val alphabetRangeFromAToZ = 'a' to 'z'
  println(s"Range des alphabets de a à z = $alphabetRangeFromAToZ")


  println(s"\nEtape 5:  ranges  de caractères avec incréments spécifiés par l'utilisateur")
  val alphabetRangeFromAToZBy2 = 'a' to 'z' by 2
  println(s"Range de tous les autres alphabets = $alphabetRangeFromAToZBy2")


  println("\nEtape 6: Stocker nos ranges dans des collections ")
  val listFrom1To5 = (1 to 5).toList
  println(s"Range pour list = ${listFrom1To5.mkString(" ")}")

  val setFrom1To5 = (1 to 5).toSet
  println(s"Range pour set = ${setFrom1To5.mkString(" ")}")

  val sequenceFrom1To5 = (1 to 5).toSeq
  println(s"Range pour sequence = ${sequenceFrom1To5.mkString(" ")}")

  val arrayFrom1To5 = (1 to 5).toArray
  println(s"Range pour array = `${arrayFrom1To5.mkString(" ")}")


  arrayFrom1To5.foreach(print(_))
  setFrom1To5.foreach(print(_))
}


