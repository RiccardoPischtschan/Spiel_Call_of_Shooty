fun ghost(ghost: Soldat, camper: Soldat,mini: Soldat) {
     var i = 1
    if (ghost.leben > 0) {
        if (camper.leben >= 0) {
            if (camper.leben <= 500) {
                while (i > 0) {
                    try {
                        println("---------------------------------------------------------------------------------------------")
                        println("                          Ghost greift an! Wähle dein Ziel")
                        invisbleline()
                        println("Wer soll angegriffen werden   ")
                        println("                                     RPG Boss       1")
                        println("                                     Mini Boss      2")
                        underline()
                        var angriff = readln().toInt()
                        when (angriff) {
                            1 ->  {
                                ghostcamper(ghost, camper)
                                break
                            }
                            2 -> {
                                ghostmini(ghost, mini)
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
                ghostcamper(ghost, camper)
            }
        } else {
            ghostmini(ghost, mini)
        }
    } else {
        ghost.alive = false

    }
}
fun ghostcamper(ghost: Soldat,camper: Soldat){
    println("---------------------------------------------------------------------------------------------")
    println("                            Der kämpfer ${ghost.name} greift ${camper.name} an")
    println("---------------------------------------------------------------------------------------------")
    ghost.attack(camper)
}
fun ghostmini(ghost: Soldat,mini: Soldat){
    println("---------------------------------------------------------------------------------------------")
    println("                            Der kämpfer ${ghost.name} greift ${mini.name} an")
    println("---------------------------------------------------------------------------------------------")
    ghost.attack(mini)
}