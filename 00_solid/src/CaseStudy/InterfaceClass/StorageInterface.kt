package CaseStudy.InterfaceClass

interface StorageInterface<T> {
    fun fill(source: T)
    fun getSource(): T
}