package genralspecific

abstract class Laptop(
    private var id: String,
    private var name: String,
    private var weight: Double
)

class ComputerLaptop(
    private var idCmpLpt: String,
    private var nameCmpLpt: String,
    private var weightCmpLpt: Double,
    private var price: Int,
    private var sizeScree: Double
): Product(idCmpLpt,nameCmpLpt,weightCmpLpt)

class NotebookLaptop(
    private var ntbkId: String,
    private var ntbkName: String,
    private var ntbkWeight: Double,
    private var ntbkUpgradabel: Boolean
) : Product(ntbkId,ntbkName,ntbkWeight)