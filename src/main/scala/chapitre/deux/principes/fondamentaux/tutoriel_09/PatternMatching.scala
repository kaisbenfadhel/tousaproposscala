package chapitre.deux.principes.fondamentaux.tutoriel_09

/**
  * Created By kais BEN FADHEL on 26/07/2019
  */

object PatternMatching extends App {

  println("Etape 1: Pattern matching 101 - exemple très basic")
  val donutType = "Donut glacé"
  donutType match {
    case "Donut glacé" => println("Très Délicieux")
    case "Donut nature" => println("Délicieux")
    //vous devriez avoir remarqué que contrairement à Java ou à .NET , il n'y a pas d' instruction break !
  }

  println("\nEtape 2: Pattern matching retourne le résultat")
  val tasteLevel = donutType match {
    case "Donut glacé" => "Très Délicieux"
    case "Donut nature" => "Délicieux"
  }
  println(s"Niveau de gout de  $donutType = $tasteLevel")
  //Notez que vous n'avez pas eu à utiliser le mot-clé return comme vous le feriez dans Java ou .NET .


  println("\nEtape 3: Pattern matching en utilisant l'opérateur générique")
  val tasteLevel2 = donutType match {
    case "Donut glacé" => "Très Délicieux"
    case "Donut nature" => "Délicieux"
    case _ => "Délicieux"
  }
  println(s"Niveau de gout de $donutType = $tasteLevel2")

  println("\nEtape 4: Pattern matching avec deux items ou plus sur le même état")
  val tasteLevel3 = donutType match {
    case "Donut glacé" | "Donut fraise" => "Très Délicieux"
    case "Plain Donut" => "Délicieux"
    case _ => "Délicieux"
  }
  println(s"Niveau de gout de $donutType = $tasteLevel3")

  println("\nEtape 5; Pattern matching et en utilisant des expressions if dans la clause case")
  val tasteLevel4 = donutType match {
    case donut if (donut.contains("glacé") || donut.contains("fraise")) => "Très Délicieux"
    case "Donut nature" => "Délicieux"
    case _ => "Délicieux"
  }
  println(s"Niveau de gout de $donutType = $tasteLevel4")


  println("\nEtape 6: Pattern matching par types")
  val priceOfDonut: Any = 2.5
  val priceType = priceOfDonut match {
    case price: Int => "Int"
    case price: Double => "Double"
    case price: Float => "Float"
    case price: String => "String"
    case price: Boolean => "Boolean"
    case price: Char => "Char"
    case price: Long => "Long"
  }
  println(s"Dtype de prix de Donut  = $priceType")
}
