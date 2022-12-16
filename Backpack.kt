

var defibrillator = 1
var medipack = 3

var i = 1
var runde = 5


fun erstehilfeprice(price: Soldat, ghost: Soldat, soap: Soldat, camper: Soldat, mini: Soldat) {
    if (runde <= 0) {
            if (medipack > 0 || defibrillator > 0) {
                if (price.leben < 50 && medipack > 0) {
                        println("---------------------------------------------------------------------------------------------")
                        println("                                        Price")

                    while (i > 0) {
                        invisbleline()
                        println("                               Möchtest du ein Medipack")
                        println("                                        J / N")
                        try {

                            var verbrauch = readln().uppercase()
                            when (verbrauch) {
                                "J" -> {
                                    medipack--
                                    price.leben += 20
                                    price.backpack = false
                                    break
                                }

                                "N" -> {
                                    println("---------------------------------------------------------------------------------------------")
                                    println("                   Du wolltest kein Medipack und kannst Angreifen")
                                    price(price, camper, mini)
                                    break
                                }
                                else -> falscheEingabe()
                            }
                        } catch (ex : Exception) {
                            falscheEingabe()
                        }
                    }
                }
                if (ghost.leben < 0 && defibrillator > 0 && price.backpack) {
                    println("---------------------------------------------------------------------------------------------")
                    println("                         Price belebt Ghost mit Defi wieder.")   // todo println besser machen
                    ghost.leben += 100
                    ghost.alive = true
                    defibrillator--
                    price.backpack = false
                }
                if (soap.leben < 0 && defibrillator > 0 && price.backpack) {
                    println("---------------------------------------------------------------------------------------------")
                    println("                         Price belebt Soap mit Defi wieder.")     // todo println besser machen
                    soap.leben += 100
                    soap.alive = true
                    defibrillator--
                    price.backpack = false
                }

            } else {
                price(price, camper, mini)
            }
        } else {
            price(price, camper, mini)
        }
}
fun erstehilfeghost(price: Soldat, ghost: Soldat, soap: Soldat, camper: Soldat, mini: Soldat) {
    if (runde <= 0 && price.backpack) {
            if (medipack > 0 || defibrillator > 0) {
                if (ghost.leben < 50 && medipack > 0) {
                        println("---------------------------------------------------------------------------------------------")
                        println("                                      Ghost")

                    while (i > 0) {
                        invisbleline()
                        println("                             Möchtest du ein Medipack")    // todo println besser machen
                        println("                                      J / N")
                        try {

                            var verbrauch = readln().uppercase()
                            when (verbrauch) {
                                "J" -> {
                                    medipack--
                                    ghost.leben += 20
                                    price.backpack = false
                                    break
                                }

                                "N" -> {
                                    println("---------------------------------------------------------------------------------------------")
                                    println("                       Du wolltest kein Medipack und kannst Angreifen") // todo println besser machen
                                    ghost(ghost, camper, mini)
                                    break
                                }
                                else -> falscheEingabe()
                            }
                        } catch (ex : Exception) {
                            falscheEingabe()
                        }
                    }
                }
                if (price.leben < 0 && defibrillator > 0 && price.backpack) {
                    println("---------------------------------------------------------------------------------------------")
                    println("                           Ghost belebt Price mit Defi wieder.")   // todo println besser machen
                    price.leben += 100
                    price.alive = true
                    defibrillator--
                    price.backpack = false
                }
                if (soap.leben < 0 && defibrillator > 0 && price.backpack) {
                    println("---------------------------------------------------------------------------------------------")
                    println("                            Ghost belebt Soap mit Defi wieder.")     // todo println besser machen
                    soap.leben += 100
                    soap.alive = true
                    defibrillator--
                    price.backpack = false
                }

            } else {
                ghost(ghost, camper, mini)
            }
        } else {

            ghost(ghost, camper, mini)
        }
}
fun erstehilfesoap(price: Soldat, ghost: Soldat, soap: Soldat,camper: Soldat,mini: Soldat) {
    if (runde <= 0 && price.backpack) {
            if (medipack > 0 || defibrillator > 0) {
                if (soap.leben < 50 && medipack > 0) {
                        println("---------------------------------------------------------------------------------------------")
                        println("                                       Soap")

                    while (i > 0) {
                        println("---------------------------------------------------------------------------------------------")
                        println("                               Möchtest du ein Medipack")    // todo println besser machen
                        println("                                        J / N")
                        try {
                            var verbrauch = readln().uppercase()
                            when (verbrauch) {
                                "J" -> {
                                    medipack--
                                    soap.leben += 20
                                    price.backpack = false
                                    break
                                }

                                "N" -> {
                                    println("---------------------------------------------------------------------------------------------")
                                    println("                        Du wolltest kein Medipack und kannst Angreifen")        // todo println besser machen
                                    soap(soap, camper, price, ghost, mini)
                                    break
                                }
                                else -> falscheEingabe()

                            }
                        } catch (ex : Exception){
                            falscheEingabe()
                        }
                    }
                }
                if (price.leben < 0 && defibrillator > 0 && price.backpack) {
                    println("---------------------------------------------------------------------------------------------")
                    println("                            Soap belebt Price mit Defi wieder.")   // todo println besser machen
                    price.leben += 100
                    price.alive = true
                    defibrillator--
                    price.backpack = false
                }
                if (ghost.leben < 0 && defibrillator > 0 && price.backpack) {
                    println("---------------------------------------------------------------------------------------------")
                    println("                            Soap belebt Soap mit Defi wieder.")     // todo println besser machen
                    ghost.leben += 100
                    ghost.alive = true
                    defibrillator--
                    price.backpack = false
                }

            } else {
                soap(soap, camper, price, ghost, mini)
            }
        } else {

            soap(soap, camper, price, ghost, mini)
        }
}
fun erstehilfereset(price: Soldat) {
    price.backpack = true
}
