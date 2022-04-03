package CaseStudy

import CaseStudy.InterfaceClass.StorageInterface

class Battery(private var electrons: Electrons) : StorageInterface<Electrons> {

    override fun fill(source: Electrons) {
        this.electrons = source
    }

    override fun getSource(): Electrons {
        return electrons
    }

}