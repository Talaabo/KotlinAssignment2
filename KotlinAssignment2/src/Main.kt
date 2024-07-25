//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Define the Vehicle class with properties colour, make, and model
open class Vehicle(val colour: String, val make: String, val model: String) {

    // Method to simulate acceleration
    open fun accelerate() {
        println("$make $model in $colour is accelerating")
    }

    // Method to simulate stopping
    open fun stop() {
        println("$make $model in $colour has stopped")
    }
}

// Define the Car class inheriting from Vehicle
class Car(colour: String, make: String, model: String, val numberOfDoors: Int) : Vehicle(colour, make, model) {

    // Override the accelerate method for Car
    override fun accelerate() {
        println("$make $model in $colour with $numberOfDoors doors is accelerating")
    }

    // Override the stop method for Car
    override fun stop() {
        println("$make $model in $colour with $numberOfDoors doors has stopped")
    }

    // Additional method for parallel parking
    fun parallelPark() {
        println("$make $model in $colour is parallel parking")
    }
}

// Define the Bus class inheriting from Vehicle
class Bus(colour: String, make: String, model: String, val passengerCapacity: Int) : Vehicle(colour, make, model) {

    // Override the accelerate method for Bus
    override fun accelerate() {
        println("$make $model in $colour with capacity for $passengerCapacity passengers is accelerating")
    }

    // Override the stop method for Bus
    override fun stop() {
        println("$make $model in $colour with capacity for $passengerCapacity passengers has stopped")
    }

    // Additional method to open the rear door
    fun openRearDoor() {
        println("The rear door of $make $model in $colour is now open")
    }
}

// Main function to demonstrate the usage of Car and Bus classes
fun main() {
    // Create an instance of Car with color set to Blue
    val myCar = Car("Blue", "Toyota", "Corolla", 4)
    myCar.accelerate()
    myCar.stop()
    myCar.parallelPark()

    // Create an instance of Bus with color set to Blue
    val myBus = Bus("Blue", "Mercedes", "Sprinter", 20)
    myBus.accelerate()
    myBus.stop()
    myBus.openRearDoor()
}
