package chapitre.trois.Penser.en.termes.de.fonctions.tutoriel_06

/**
  * Created By kais BEN FADHEL on 30/07/2019
  */

object ImplicitFunction extends App {
  println("Etape 1:Comment créer une classe wrapper String qui étendra le type String")


  // vous pouvez simplement comparer deux chaînes à l'aide de == plutôt que d'utiliser la méthode equals () contrairement a Java et .NET .
  class DonutString(s: String) {

    def isFavoriteDonut: Boolean = s == "Donut glacée"

  }

  println("\nEtape 2: Comment créer une fonction implicite pour convertir une chaîne en classe wrapper String")

  //Définir une fonction implicite est similaire à la définition d’autres fonctions, sauf que nous avons préfixé
  // la signature de la fonction à l’aide du mot-clé implicite
  object DonutConverstions {
    implicit def stringToDonutString(s: String) = new DonutString(s)
  }

  println("\nEtape 3: Comment importer la conversion de chaîne afin qu'elle soit dans la portée")
  import DonutConverstions._

  println("\nEtape 4: Comment créer des valeurs de chaîne")
  val glazedDonut = "Donut glacée"
  val vanillaDonut = "Donut Vanille"

  println("\nEtape 5: Comment accéder à la fonction de chaîne personnalisée appelée isFavaoriteDonu")
  println(s"Le Donut glacée est mon beignet préféré = ${glazedDonut.isFavoriteDonut}")
  println(s"Le Donut vanille est mon beignet préféré = ${vanillaDonut.isFavoriteDonut}")
}
