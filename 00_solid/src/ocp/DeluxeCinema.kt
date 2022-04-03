package ocp

class DeluxeCinema(price: Double) : Cinema(price) {
    override fun calculateAdminFee(): Double {
        return ( (price*12)/100 )
    }


}