package lsp

import java.util.*

class ProductVegetable: FoodProduct() {
    override fun getExpiredDate(): Date {
        return Date()
    }

    override fun getName(): String {
        return "Spinanch"
    }
}