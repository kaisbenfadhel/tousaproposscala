package chapitre.trois.Penser.en.termes.de.fonctions.tutoriel_13

/**
  * Created By kais BEN FADHEL on 30/07/2019
  */
object HigherOrderFunctionCallByNameFunction extends App {
  println("Etape 1: Comment définir une liste avec des éléments Tuple3")
  val listOrders = List(("Glazed Donut", 5, 2.50), ("Vanilla Donut", 10, 3.50))

  println("\nEtape 2: Comment définir une fonction à parcourir en boucle chaque élément Tuple3 de la liste et calculer le coût total")

  def placeOrder(orders: List[(String, Int, Double)])(exchangeRate: Double): Double = {
    var totalCost: Double = 0.0
    orders.foreach { order =>
      val costOfItem = order._2 * order._3 * exchangeRate
      println(s"Coût de ${order._2} ${order._1} = £$costOfItem")
      totalCost += costOfItem
    }
    totalCost
  }

  println("\nEtape 3: Comment appeler une fonction avec le paramètre de groupe curryé pour la liste des éléments Tuple3")
  println(s"Total cost of order = £${placeOrder(listOrders)(0.5)}")

  println("\nEtape 4: Comment définir une fonction appel par nom")

  def placeOrderWithByNameParameter(orders: List[(String, Int, Double)])(exchangeRate: => Double): Double = {
    var totalCost: Double = 0.0
    orders.foreach { order =>
      val costOfItem = order._2 * order._3 * exchangeRate
      println(s"Coût de ${order._2} ${order._1} = £$costOfItem")
      totalCost += costOfItem
    }
    totalCost
  }

}

