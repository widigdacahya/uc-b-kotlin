package CaseStudy.InterfaceClass

interface Vehicle<T> {
    fun accelerate()
    fun brake()
    fun refill(source: T)
}