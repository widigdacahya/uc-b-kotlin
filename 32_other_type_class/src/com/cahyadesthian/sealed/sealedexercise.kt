package com.cahyadesthian.sealed

import kotlin.random.Random

abstract class LoteryPrizes

sealed class CarGift: LoteryPrizes()
sealed class VocationGift: LoteryPrizes()
sealed class GiftCardGift : LoteryPrizes()

class GiftCarChevy: CarGift()
class GiftCarVocationToParis: VocationGift()
class GiftCardVoucher50M: GiftCardGift()

fun giveLotery(): LoteryPrizes {
    val randGive = Random.nextInt(5)
    when(randGive) {
        1->return GiftCarChevy()
        2->return GiftCarVocationToParis()
        else->return GiftCardVoucher50M()
    }
}

fun main(args:Array<String>) {
    var aRandomGift = giveLotery()
    var thePrice:String? = ""
    when(aRandomGift) {
        is CarGift -> thePrice = "A Chevvy Car"
        is VocationGift -> thePrice = "A 100 Day tip to Big City in the world"
        is GiftCardVoucher50M -> thePrice = "A gift is Gift Card 50M"
    }
    println("Congratulation!! Now you would get $thePrice")

}