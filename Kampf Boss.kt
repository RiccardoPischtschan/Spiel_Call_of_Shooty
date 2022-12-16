fun kampf(soap: Soldat, camper: Soldat, price: Soldat, ghost: Soldat) {

    if (camper.leben > 0) {
        if (price.leben <= soap.leben) {
            if (soap.leben >= ghost.leben) {
                println("---------------------------------------------------------------------------------------------")
                println("                            Der kämpfer ${camper.name} greift ${soap.name} an")
                println("---------------------------------------------------------------------------------------------")
                camper.attack(soap)

            } else {
                println("---------------------------------------------------------------------------------------------")
                println("                            Der kämpfer ${camper.name} greift ${ghost.name} an")
                println("---------------------------------------------------------------------------------------------")
                camper.attack(ghost)

            }
        } else if (price.leben <= ghost.leben) {
            println("---------------------------------------------------------------------------------------------")
            println("                            Der kämpfer ${camper.name} greift ${ghost.name} an")
            println("---------------------------------------------------------------------------------------------")
            camper.attack(ghost)

        } else {
            println("---------------------------------------------------------------------------------------------")
            println("                            Der kämpfer ${camper.name} greift ${price.name} an")
            println("---------------------------------------------------------------------------------------------")
            camper.attack(price)

        }
    } else{
        camper.alive = false
    }
}

 fun minikampf(price:Soldat,ghost: Soldat,soap: Soldat,mini:Soldat){

     var fight = mutableListOf(price,ghost,soap)

     if (mini.leben>0) {
         var angriff = fight.random()
         when (angriff) {
             price -> if (price.leben > 0) {

                 println("---------------------------------------------------------------------------------------------")
                 println("                          Price wird von Mini angegriffen")
                 mini.attack(price)
             } else {
                 fight.remove(price)
             }

             ghost -> if (ghost.leben > 0) {
                 println("---------------------------------------------------------------------------------------------")
                 println("                          Ghost wird von Mini angegriffen")
                 mini.attack(ghost)
             } else {
                 fight.remove(ghost)
             }

             soap -> if (soap.leben > 0) {

                 println("---------------------------------------------------------------------------------------------")
                 println("                           Soap wird von Mini angegriffen")
                 mini.attack(soap)
             } else {
                 fight.remove(soap)
             }


         }
     }

 }

