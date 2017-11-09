package turtlerace

trait AbsentMinded extends RaceTurtle {
  val absent: Int = scala.util.Random.nextInt(100) //0-99% chans

  override def raceStep(): Unit = {
    if(scala.util.Random.nextInt(100)+1 > absent){
      forward(scala.util.Random.nextInt(defaultStep))
    }
  }
  override def toString: String = {
    s"Absent turtle ($absent): #$nbr name: $name"
  }
}