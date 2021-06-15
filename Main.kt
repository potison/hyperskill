package machine

import java.util.*

class Machine {
    var scan = Scanner(System.`in`)
    var water = 400
    var milk = 540
    var beans = 120
    var cups = 9
    var money = 550
    var action = ""
    val espressoWater = 250
    val espressoBeans = 16
    val espressoCost = 4
    val latteWater = 350
    val latteMilk = 75
    val latteBeans = 20
    val latteCost = 7
    val cappWater = 200
    val cappMilk = 100
    val cappBeans = 12
    val cappCost = 6

    enum class State{

    }

    fun input(action: String) {

    }

    fun fill(water: Int, ) {
        println("Write how many ml of water do you want to add:")
        var water = readLine()!!.toInt()
        println("Write how many ml of milk do you want to add:")
        var milk = readLine()!!.toInt()
        println("Write how many grams of coffee beans do you want to add:")
        var beans = readLine()!!.toInt()
        println("Write how many disposable cups of coffee do you want to add:")
        var cups = readLine()!!.toInt()
    }

    fun state(water: Int, milk: Int, beans: Int, cups: Int, money: Int  ) {
        println("The coffee machine has:")
        println("$water of water")
        println("$milk of milk")
        println("$beans of beans")
        println("$cups of disposable cups")
        println("$money of money")
    }

    while (action != "exit") {
        println()
        println("Write action (buy, fill, take, remaining, exit):")
        action = readLine()!!
        when (action) {
            "remaining" -> state(water, milk, beans, cups, money)
            "exit" -> break
            "buy" -> {
                println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:")
                var sort = readLine()!!
                when (sort) {
                    "1" -> {
                        if (water >= espressoWater && beans >= espressoBeans) {
                            println("I have enough resources, making you a coffee!")
                            water -= espressoWater
                            beans -= espressoBeans
                            cups -= 1
                            money += espressoCost
                        } else {
                            println("Sorry, not enough water!")
                        }
                    }
                    "2" -> {
                        if (water >= latteWater && milk >= latteMilk && beans >= latteBeans) {
                            println("I have enough resources, making you a coffee!")
                            water -= latteWater
                            milk -= latteMilk
                            beans -= latteBeans
                            cups -= 1
                            money += latteCost
                        } else {
                            println("Sorry, not enough water!")
                        }
                    }
                    "3" -> {
                        if (water >= cappWater && milk >= cappMilk && beans >= cappBeans) {
                            println("I have enough resources, making you a coffee!")
                            water -= cappWater
                            milk -= cappMilk
                            beans -= cappBeans
                            cups -= 1
                            money += cappCost
                        } else {
                            println("Sorry, not enough water!")
                        }
                    }
                    "back" -> println()

                }

            }
            "fill" -> {
                println("Write how many ml of water do you want to add:")
                var addWater = readLine()!!.toInt()
                water += addWater
                println("Write how many ml of milk do you want to add:")
                var addMilk = readLine()!!.toInt()
                milk += addMilk
                println("Write how many grams of coffee beans do you want to add:")
                var addBeans = readLine()!!.toInt()
                beans += addBeans
                println("Write how many disposable cups of coffee do you want to add:")
                var addCups = readLine()!!.toInt()
                cups += addCups
                println()

            }
            "take" -> {


                println("I gave you $$money")
                money -= money
                println()

            }

        }

    }
}



fun main() {



}











//    println("Write how many ml of water the coffee machine has:")
//    var waterTank = scan.nextInt()
//    println("Write how many ml of milk the coffee machine has:")
//    var milkTank = scan.nextInt()
//    println("Write how many grams of coffee beans the coffee machine has:")
//    var beansTank = scan.nextInt()
//    println("Write how many cups of coffee you will need:")
//    var cups = scan.nextInt()
//        var milkRequired = cups * milk
//    var waterRequired = cups * water
//    var beansRequired = cups * beans
//    var possibleCupsByWater = waterTank / water
//    var possibleCupsByMilk = milkTank / milk
//    var possibleCupsByBeans = beansTank / beans
//    var minWaterMilk = Math.min(possibleCupsByWater,possibleCupsByMilk)
//    var maxCups = Math.min(minWaterMilk,possibleCupsByBeans)
//
//
//
//        var possibleCups = maxCups / cups
//        var moreCups = possibleCups - cups
//    if (possibleCups / cups > 0) {
//        println("Yes, I can make that amount of coffee (and even $moreCups more than that)")
//
//    } else if (possibleCups % cups == 0 && possibleCups / cups > 0) {
//        println("Yes, I can make that amount of coffee")
//    } else if (cups > maxCups) {
//        println("No, I can make only $maxCups cups of coffee")
//    }
//    println(possibleCupsByWater)
//    println(possibleCupsByMilk)
//    println(possibleCupsByBeans)
//    println(maxCups)
//    println(milkRequired)
//    println(waterRequired)
//    println(beansRequired)
//    println(possibleCups % cups)
//    println(waterTank)
//    println(milkTank)
//    println(beansTank)
//    println(waterTank / waterRequired)
//    println("$waterTank $waterRequired")



