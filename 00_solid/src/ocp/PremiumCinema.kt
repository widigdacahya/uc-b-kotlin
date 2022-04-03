package ocp

class PremiumCinema(price:Double) : Cinema(price) {
    override fun calculateAdminFee(): Double {
        return ((price*20)/100)
    }


}