package ocp

class StandardCinema(price: Double) : Cinema(price) {
    override fun calculateAdminFee(): Double {
        return ( (price*10)/100 )
    }

}