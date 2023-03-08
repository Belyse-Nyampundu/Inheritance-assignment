fun main(){
  val car =Car("voltswagen","Sedan","black",6)
    car.carry(10)
    car.identity()
    var result = car.calculateParkingFees(5)
    println(result)

    val bus = Bus("Voltswagen","Sedan","black",6)
    var trip =bus.maxTripFare(1500.32)
    println(trip)
    var product = bus.calculateParkingFees(2)
    println(product)
}

 open class Car(val make: String,val model: String,val color: String,val capacity: Int){

     fun carry(people: Int){
         var x =people - capacity
         if(people<=capacity){
        println("Carrying $people passengers")
         }else{
             println("Over capacity by $people")
         }
     }
     fun identity(){
         println("I am a $color $make $model")
     }
   open  fun calculateParkingFees(hours: Int): Int{
         return hours * 20
     }
 }

 class Bus( make: String,model: String, color: String,capacity: Int):Car(make,model,color,capacity){

  fun maxTripFare(fare: Double): Double{
      return fare * capacity
  }

     override fun calculateParkingFees(hours: Int): Int {
     //   return super.calculateParkingFees(hours)
       return hours *capacity

     }


 }




