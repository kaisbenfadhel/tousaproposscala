package chapitre.deux.principes.fondamentaux.tutoriel_13

/**
  * Created By kais BEN FADHEL on 26/07/2019
  */

object Enum extends App {

  println("Etape 1: Comment créer une énumération")

  object Donut extends Enumeration {
    type Donut = Value

    val Glacée = Value("Glacée")
    val Fraise = Value("Fraise")
    val Nature = Value("Nature")
    val Vanille = Value("Vanille")
  }

  println("\nEtape2: comment imprimer la valeur de chaîne de l'énumération")
  println(s"Donut Vanille string value = ${Donut.Vanille}")

  println("\nEtape 3: Comment imprimer l'id de l'énumération")
  println(s"Vanille Donut id = ${Donut.Vanille.id}")

  println("\nEtape 4: Comment imprimer toutes les valeurs répertoriées dans Énumération")
  println(s"Donut types = ${Donut.values}")

  println("\nStep 5: Comment établir une correspondance pattern match sur les valeurs d'énumération")
  Donut.values.foreach {
    case d if (d == Donut.Fraise || d == Donut.Glacée) => println(s"Donut préféré trouvé = $d")
    case _ => None
  }

  println("\nEtape 6: Comment changer l'ordre par défaut des valeurs d'énumération")

  object DonutTaste extends Enumeration {
    type DonutTaste = Value

    val Tasty = Value(1, "Délicieux")
    val VeryTasty = Value(0, "Très Délicieux")
    val Ok = Value(-1, "Ok")
  }

  println(s"Donut taste values = ${DonutTaste.values}")
  println(s"Donut taste of OK id = ${DonutTaste.Ok.id}")

}
