fun main(args: Array<String>) {
    val items = arrayListOf("laptop", "mouse", "pen", "paper", "mug", "phone")
    println("My items at the beginning is $items, then need to remove some")
    val needToRemove = listOf("pen", "paper", "mug", "phone")
    println("Things need to remove is $needToRemove")
    items.removeAll(needToRemove)
    println("Now i had $items")

}