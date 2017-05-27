class SmokeSensor extends Sensor with Battery{
  var battery : Int = 100
  override def isTriggered: Boolean = {
    if(battery > 0) battery -= 20 else battery = 0
    if(battery != 0) {
    val x = (math.random()*100).toInt
    if(x < 10) true else false
    }
    else  return false
  }

  override def getLocation: String = "ClassRoom 20"

  override def getSensorType: String = "Smoke sensor"

  override def getBatteryPercentage: Double = {
   battery
  }

  override def getSensorCategory: String = "Hazard"
}
