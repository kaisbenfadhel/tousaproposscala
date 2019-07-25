package chapitre.deux.tutoriel_06


/**
  * Created By kais BEN FADHEL on 25/07/2019
  */

object ForLoop extends App {

  println("Etape 1: Une simple  boucle For de 1 à 5 inclus")
  for(numberOfDonuts <- 1 to 5){
    println(s"Nombre de beignets à acheter  = $numberOfDonuts")
  }

  println("\nEtape: Une simple  boucle For de 1 à 5, où 5 n'est pas inclus")
  //Nous avons utilisé le mot clé until qui signifie que l'itération numéro 5 n'était PAS incluse.
  for(numberOfDonuts <- 1 until 5){
    println(s"Nombre de beignets à acheter  = $numberOfDonuts")
  }

  println("\nEtape 3: Filtrer les valeurs en utilisant les conditions if dans la boucle for")
  val donutIngredients = List("farine", "sucre", "jaunes d'oeuf", "sirop", "aromatisant")
  for(ingredient <- donutIngredients if ingredient == "sucre"){
    println(s"Ingrédient trouvé  édulcorant = $ingredient")
  }

  println("\nStep 4: Filtrez les valeurs en utilisant les conditions if dans la boucle for et renvoyez le résultat en utilisant le mot-clé  yield ")
  val sweeteningIngredients = for {
    ingredient <- donutIngredients
    if (ingredient == "sucre" || ingredient == "sirop")
  } yield ingredient
  println(s"Ingrédients édulcorants = $sweeteningIngredients")


  println("\nEtape 5: Utiliser pour la compréhension pour parcourir en boucle un tableau bidimensionnel")

  //nous allons utiliser la classe Scala Array et appeler la fonction ofDim () ,
  // lui passer le type String entre crochets [String] , puis spécifier notre tableau 2 par 2 dans le paramètre function
  val twoDimensionalArray = Array.ofDim[String](2,2)
  twoDimensionalArray(0)(0) = "farine"
  twoDimensionalArray(0)(1) = "sucre"
  twoDimensionalArray(1)(0) = "oeuf"
  twoDimensionalArray(1)(1) = "sirop"

  for { x <- 0 until 2
        y <- 0 until 2
  } println(s"Donut ingrédient à l'index ${(x,y)} = ${twoDimensionalArray(x)(y)}")
}
