import java.util.Calendar

import scala.collection.mutable.ListBuffer

class SecurityControlUnit(sensors : ListBuffer[Sensor]) extends ControlUnit(sensors){

  def timeCheck(): Boolean = {
    val now = Calendar.getInstance()
    val currentHour = now.get(Calendar.HOUR_OF_DAY)
    if((currentHour >= 22) || (currentHour <= 6)) true else false
  }

  override def pollSensors() {
        if(timeCheck()){super.pollSensors()}
    else  super.pollSensors()
    }
}

object SecurityControlUnit
