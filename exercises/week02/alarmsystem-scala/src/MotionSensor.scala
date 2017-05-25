class MotionSensor extends Sensor {

  override def isTriggered: Boolean = {
    true
  }

  override def getLocation: String = "Floor 1"

  override def getSensorType: String = "Motion Sensor"

  override def getSensorCategory: String = "Security"

}
