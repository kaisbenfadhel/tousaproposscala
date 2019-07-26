package chapitre.deux.principes.fondamentaux.tutoriel_03

/**
  * Created By kais BEN FADHEL on 15/07/2019
  */
object EscapeCharacter extends App {

  println("Etape 1: Comment échapper Json String")
  // val donutJson: String ="{"donut_name":"Glazed Donut","taste_level":"Very Tasty","price":2.50}"


  println("\nEtape 2: Utilisation backslash pour échapper aux citations")
  val donutJson2: String ="{\"donut_name\":\"Glazed Donut\",\"taste_level\":\"Very Tasty\",\"price\":7.50}"
  println(s"donutJson2 = $donutJson2")


  println("\nEtape 3: Utilisation triple quotes \"\"\" pour échapper des caractères")
  val donutJson3: String = """{"donut_name":"Glazed Donut","taste_level":"Very Tasty","price":2.50}"""
  println(s"donutJson3 = $donutJson3")


  println("\nEtape 4: Créer un texte multiligne en utilisant stripMargin")
  val donutJson4: String =
    """
      |{
      |"donut_name":"Glazed Donut",
      |"taste_level":"Very Tasty",
      |"price":2.50
      |}
    """
      .stripMargin

}
