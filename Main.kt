fun main() {

    var price = Nahkämpfer("Price", 150, 15, 7)
    var ghost = Scharfschütze("Ghost", 100, 7, 15)
    var soap = Sanitäter("Soap", 200, 10, 5)
    var camper = Camper("RPG Boss", 1000, 15, 20)
    var mini = Miniboss("Mini Boss", 500, 10,15)

    begrüßung()

    var j = 1
    do {

        if (price.leben > 0 || ghost.leben > 0 || soap.leben > 0) {

            if (price.leben > 0) {
                if (price.leben < 50 || ghost.leben <= 0 || soap.leben <= 0) {
                    erstehilfeprice(price, ghost, soap, camper, mini)
                } else {
                    price(price, camper, mini)
                }
            }

                miniboss(camper,mini) // anzeige


            if (ghost.leben > 0) {
                if (price.leben < 0 || ghost.leben <= 50 || soap.leben <= 0) {
                    erstehilfeghost(price, ghost, soap, camper, mini)
                } else {
                    ghost(ghost, camper, mini)
                }
            }

            miniboss(camper,mini)   // anzeige

            if (soap.leben > 0) {
                if (price.leben < 0 || ghost.leben <= 0 || soap.leben <= 50) {
                    erstehilfesoap(price, ghost, soap, camper, mini)
                } else {
                    soap(soap, camper, price, ghost, mini)
                }
            }

            miniboss(camper,mini)   // anzeige

        } else {
            println("---------------------------------------------------------------------------------------------")
            println("---------------------------------------------------------------------------------------------")
            println("                            Deine Kämpfer sind leider Tot                        ")
            println("---------------------------------------------------------------------------------------------")
            println("---------------------------------------------------------------------------------------------")
            println("                                     Game Over")
            println("---------------------------------------------------------------------------------------------")
            println("---------------------------------------------------------------------------------------------")
            break
        }

           kampf(soap, camper, price, ghost)
           miniboss(camper,mini)  // anzeige


        if (camper.leben < 500 && mini.leben > 0){


            minikampf(price,ghost,soap,mini)
        } else if (mini.leben < 0) {
            while (j > 0) {

                println("---------------------------------------------------------------------------------------------")
                println("                       Mini wurde besiegt und taucht nicht mehr auf.               ")
                println("---------------------------------------------------------------------------------------------")
                j--
            }
        }
        lebensstand(price,ghost,soap,camper,mini) // Anzeige
        erstehilfereset(price)
        runde--




    } while(camper.alive && mini.alive)


}


