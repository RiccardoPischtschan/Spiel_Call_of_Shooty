fun soap(soap: Soldat, camper: Soldat,price: Soldat,ghost: Soldat, mini: Soldat) {
    var i = 1
    if (soap.leben > 0){
        if (camper.leben >= 0) {

            while (i > 0) {
                println("---------------------------------------------------------------------------------------------")
                println("                            Der kämpfer ${soap.name} greift an oder verarztet")
                println("---------------------------------------------------------------------------------------------")
                println("---------------------------------------------------------------------------------------------")
                println("Gebe dein Aktion ein ")
                println("                                     Angriff      1")
                println("                                     Heilung      2")
                invisbleline()
                println("                                     Lebensstand  3")
                try {

                    var aktion = readln().toInt()

                    when (aktion) {
                        1 -> if (camper.leben <= 500) {
                            println("---------------------------------------------------------------------------------------------")
                            println("                           Soap greift an! Wähle dein Ziel")
                            invisbleline()

                                    println("---------------------------------------------------------------------------------------------")
                                    println("Wer soll angegriffen werden?")
                                    println("                                     RPG Boss       1 ")
                                    println("                                     Mini Boss      2")

                                    var angriff = readln().toInt()

                                    when (angriff) {
                                        1 -> {
                                            soapcamper(soap, camper)
                                            break
                                        }

                                        2 -> {
                                            soapmini(soap, mini)
                                            break
                                        }

                                        else -> {
                                            falscheEingabe()
                                            continue
                                        }
                                    }

                        } else {
                            soapcamper(soap, camper)
                            break
                        }


                        2 ->  {
                            heilung(soap, price, ghost,camper,mini)
                            break
                        }
                        3 ->   {
                            lebensstand(price, ghost, soap, camper, mini)
                            continue
                        }
                        else -> falscheEingabe()
                    }
                } catch (ex: Exception) {
                    falscheEingabe()
                    continue
                }
            }
        } else {
            soapmini(soap, mini)
        }


    } else {
        soap.alive = false

    }
}
fun soapcamper(soap: Soldat,camper: Soldat){

    println("---------------------------------------------------------------------------------------------")
    println("                            Der kämpfer ${soap.name} greift ${camper.name} an")
    println("---------------------------------------------------------------------------------------------")
    soap.attack(camper)
}
fun soapmini(soap: Soldat,mini: Soldat){
    println("---------------------------------------------------------------------------------------------")
    println("                            Der kämpfer ${soap.name} greift ${mini.name} an")
    println("---------------------------------------------------------------------------------------------")
    soap.attack(mini)
}
fun heilung(soap: Soldat,price: Soldat,ghost: Soldat,camper: Soldat,mini: Soldat){
    var i = 1
    while (i > 0) {
        try {
            println("---------------------------------------------------------------------------------------------")
            println("Gebe dein Heilung ein ")
            println("                                     Fernspritze  1")
            println("                                     Verband      2")
            invisbleline()
            println("                                     Lebensstand  3")

            var gesundheit = readln().toInt()

            when (gesundheit) {
                1 ->  {
                    sanifernspritze(price, ghost, soap)
                    break
                }
                2 ->  {
                    saniverband(price, ghost, soap)
                    break
                }
                3 -> {
                    lebensstand(price,ghost,soap, camper, mini)
                    continue
                }
                else -> {
                    falscheEingabe()
                    continue
                }
            }
        } catch (ex : Exception){
            falscheEingabe()
            continue
        }
    }
}
fun sanifernspritze(price:Soldat,ghost:Soldat,soap:Soldat){
    var fernSpritze = 60
    var i = 1
    while (i > 0) {
        try {
            println("---------------------------------------------------------------------------------------------")
            println("Wer soll geheilt werden? ")
            println("                                     Price       1")
            println("                                     Ghost       2")
            println("                                     Soap        3")
            var heilung = readln().toInt()
            when (heilung) {
                1 ->  {
                    price.leben += fernSpritze
                    break
                }
                2 ->  {
                    ghost.leben += fernSpritze
                    break
                }
                3 ->  {
                    soap.leben += fernSpritze
                    break
                }
                else -> falscheEingabe()
            }
        } catch (ex : Exception){
            falscheEingabe()
            continue
        }
    }
}
fun saniverband(price:Soldat,ghost:Soldat,soap:Soldat){
    var verband = 30
    var i = 1
    while (i > 0) {
        try {
            println("---------------------------------------------------------------------------------------------")
            println("wer soll geheilt werden")
            println("                                     Price       1")
            println("                                     Ghost       2")
            println("                                     Soap        3")
            var heilung = readln()!!.toInt()
            when (heilung) {
                1 ->  {
                    price.leben += verband
                    break
                }
                2 ->  {
                    ghost.leben += verband
                    break
                }
                3 ->  {
                    soap.leben += verband
                    break
                }
                else -> falscheEingabe()
            }
        } catch (ex : Exception){
            falscheEingabe()
            continue
        }
    }
}
