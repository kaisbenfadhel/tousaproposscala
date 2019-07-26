package chapitre.trois.Penser.en.termes.de.fonctions.tutoriel_03

/**
  * Created By kais BEN FADHEL on 26/07/2019
  */

object FunctionWithOptionParameters extends App {
  println("Etape 1: Comment définir une option dans un paramètre de fonction")

  //Dans notre fonction, nous allons tester un couponCode valide en utilisant une correspondance de modèle .
  //Dans le cas de Some (coupon), nous supposons une recherche dans la base de données pour le rabais à appliquer. Mais, dans notre exemple,
  // nous supposerons que la réduction est de 10%.

  //Dans le cadre de la correspondance des modèles, nous fournissons également le cas Aucun où aucun couponCode n'a été transmis.
  def calculateDonutCost(donutName: String, quantité: Int, couponCode: Option[String]): Double = {
    println(s"Calcul du coût pour $donutName, quantité = $quantité")

    couponCode match {
      case Some(coupon) =>
        val discount = 0.1 // Simulons un remise de 10%
      val totalCost = 2.50 * quantité * (1 - discount)
        totalCost

      case None => 2.50 * quantité
    }
  }

  println("\nEtape 2: Comment appeler une fonction qui a un paramètre Option")
  println(s"""coût total = ${calculateDonutCost("Donut Glacée", 5, None)}""")
  //Comme notre client ne possède pas de couponCode, nous avons dû fournir un paramètre None en tant que paramètre couponCode.
  //Fournir un paramètre None pour chaque option n'est peut-être pas très élégant. Heureusement, cela est facilement résolu
  // - voir l’étape 3 ci-dessous.


  println("\nEtape 3: Comment attribuer une valeur par défaut à un paramètre Option")

  def calculateDonutCostWithDefaultOptionValue(donutName: String, quantité: Int, couponCode: Option[String] = None): Double = {
    println(s"Calcul du coût pour $donutName, quantity = $quantité")

    couponCode match {
      case Some(coupon) =>
        val discount = 0.1 // Let's simulate a 10% discount
      val totalCost = 2.50 * quantité * (1 - discount)
        totalCost

      case _ => 2.50 * quantité
    }
  }

  println("\nEtape 4: Comment appeler une fonction dont le paramètre Option a une valeur par défaut")
  //Si vous avez un couponCode légitime à transmettre, vous pouvez utiliser Some () comme indiqué ci-dessous:
  println(s"""Total cost = ${calculateDonutCostWithDefaultOptionValue(" Donut Glacée", 5)}""")
  println(s"""Total cost with discount = ${calculateDonutCostWithDefaultOptionValue(" Donut Glacée", 5, Some("COUPON_1234"))}""")


  println(s"\nAstuce 1: utilisez la fonction map pour extraire une valeur d'option valide")
  val favoriteDonut: Option[String] = Some("Donut Glacée")
  favoriteDonut.map(d => println(s"Donut Favorie = $d"))

  val leastFavoriteDonut: Option[String] = None
  leastFavoriteDonut.map(d => println(s"Donut préféré = $d"))

}
