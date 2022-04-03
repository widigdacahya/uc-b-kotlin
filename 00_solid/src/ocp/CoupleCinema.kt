package ocp

class CoupleCinema(price: Double) : Cinema(price) {
    override fun calculateAdminFee(): Double {
        return ( (price*15)/100)
    }


}