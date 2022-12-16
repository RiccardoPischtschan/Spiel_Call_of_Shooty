fun price(price: Soldat,camper: Soldat,mini: Soldat) {

    var i = 1
    if (price.leben > 0) {
        if (camper.leben >= 0) {
            if (camper.leben <= 500) {
                while (i > 0) {
                    try {
                        println("---------------------------------------------------------------------------------------------")
                        println("                           Price greift an! Wähle dein Ziel")
                        invisbleline()
                        println("Wer soll angegriffen werden ")
                        println("                                     RPG Boss       1")
                        println("                                     Mini Boss      2")
                        var angriff = readln().toInt()
                        when (angriff) {
                            1 ->  {
                                pricecamper(price, camper)
                                break
                            }
                            2 -> {
                                pricemini(price, mini)
                                break
                            }
                            else -> falscheEingabe()
                        }
                    } catch (ex: Exception) {
                        falscheEingabe()
                        continue
                    }
                }
            } else {
                pricecamper(price, camper)
            }
        } else {
            pricemini(price, mini)
        }
        } else {
            price.alive = false
        }
}
fun pricecamper(price: Soldat,camper: Soldat){
    println("---------------------------------------------------------------------------------------------")
    println("                            Der kämpfer ${price.name} greift ${camper.name} an")
    println("---------------------------------------------------------------------------------------------")
    price.attack(camper)
}
fun pricemini(price: Soldat,mini: Soldat){
    println("---------------------------------------------------------------------------------------------")
    println("                            Der kämpfer ${price.name} greift ${mini.name} an")
    println("---------------------------------------------------------------------------------------------")
    price.attack(mini)
}
