class FireSensor extends Sensor with battery {
  var battery : Int = 100
  override def isTriggered: Boolean = {
    if(battery > 0) battery -= 10 else battery = 0
    if(battery != 0) {
      val x = (math.random() * 100).toInt
      if (x < 5) return true else return false
    }
    else return false

  }

  override def getLocation: String = "Reception"

  override def getSensorType: String = "Fire Sensor"

  override def getBatteryPercentage: Double = {
    battery
  }

  override def getSensorCategory: String = "Hazard"
}
