package lsp

import java.util.*

abstract class FoodProduct: Product() {
    abstract fun getExpiredDate(): Date
}