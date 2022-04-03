package CaseStudy

class SpeedController(
    private val batteryManagmntSystm: BatteryManagementSystem,
    private val motor: ElectricMotor
) {

    fun control() {
        val battery = batteryManagmntSystm.getBattery()
        motor.rotate(battery)
    }

}