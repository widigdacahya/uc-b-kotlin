package srp


fun main(args: Array<String>) {

    val anOrder = Order()

    anOrder.addItem(Item())

    val repository = OrderRepository()

    repository.save(anOrder)

    val viewer = OrderViewer()

    viewer.printOrder(anOrder)

}