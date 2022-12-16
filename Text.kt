fun begrüßung(){
    underline()
    println("                                           Willkommen                             ")
    println("                                              bei")
    println("                                         Call of Shooty")
    underline()
    invisbleline()
    println("                                         Deine Soldaten        ")
    invisbleline()
    println("               Price                         Ghost                         Soap")
    println("            Nahkämpfer                   Scharfschütze                   Sanitäter")
    println("                150                           100                           200")
    println("             4 Attacks                     4 Attacks                     2 Attacks")
    println("                                                                         2 Heilung")
    invisbleline()
    underline()
    invisbleline()
    println("                                            Backpack")
    invisbleline()
    println("             3 Westen                    1 Defibrillator                 3 Medi Packs")
    invisbleline()
    println("                               Backpack wird in Runde 5 Aktiviert")
    invisbleline()
    underline()
    invisbleline()
    println("                                          Deine Gegner")
    invisbleline()
    println("                        RPG Boss                               Mini Boss")
    println("                         1000                                     500")
    println("                       6 Attacks                               4 Attacks")
    invisbleline()
    underline()
    invisbleline()
    println("                                          Viel Glück " )
    println("                                              und")
    println("                                      Lass dich nicht Töten")
    invisbleline()
    underline()
}

fun lebensstand(price:Soldat,ghost :Soldat, soap : Soldat,camper :Soldat,mini:Soldat){
    println("_____________________________________________________________________________________________")
    println("                                                                                             ")
    println("Lebensstand Kämpfer")
    println("                    \\ ")
    println("                     \\ ")
    println("                      \\_____________________________________________________________________")
    println("                                                                                             ")
    if (price.leben > 0) {
        println("                                     ${price.name} hat ${price.leben}")
    } else {
        println("                                     ${price.name} ist Dead")
    }
    if (ghost.leben > 0) {
        println("                                     ${ghost.name} hat ${ghost.leben}")
    } else {
        println("                                     ${ghost.name} ist Dead")
    }
    if (soap.leben > 0) {
        println("                                     ${soap.name}  hat ${soap.leben}")
    } else{
        println("                                     ${soap.name}  ist Dead")
    }
        println("                                                                                             ")
        println("_____________________________________________________________________________________________")

    if (camper.leben > 500) {
        println("                                                                                             ")
        println("Lebensstand Boss")
        println("                  \\")
        println("                   \\")
        println("                    \\_______________________________________________________________________")
        println("                                                                                             ")
        println("                                     ${camper.name} hat ${camper.leben}")
        invisbleline()
        underline()
    } else {
        invisbleline()
        println("Lebensstand Boss")
        println("                  \\")
        println("                   \\")
        println("                    \\_______________________________________________________________________")
        println("                                                                                             ")
        if (camper.leben > 0) {
            println("                                     ${camper.name}    hat ${camper.leben}")
        } else {
            println("                                     ${camper.name}    ist Dead")
        }
        if (mini.leben > 0) {
            println("                                     ${mini.name}   hat ${mini.leben}")
        } else{
            println("                                     ${mini.name}   ist Dead")
        }
        invisbleline()
        underline()
    }
}

fun miniboss(camper: Soldat,mini: Soldat){

    while (camper.leben <= 500)
    if (mini.anzeige > 0) {
        underline()
        println("                       Der Mini Boss ist aufgetaucht und mischt mit.")
        underline()
        println("                                                                     ")
        println("                              _/M\\_                                 ")
        println("                              (  °)⠕                                 ")
        println("                             |_____=/====  —   —   —                 ")
        println("                             |      |                                ")
        println("                             |______|                                ")
        println("                            / /   \\ \\                              ")
        println("                           / /     \\ \\                             ")
        println("                          ⠛⠛⠛       ⠛⠛⠛                             ")
        underline()
        mini.anzeige --
        break
    } else{
        break
    }
}
fun falscheEingabe(){

    println("/////////////////////////////////////////////////////////////////////////////////////////////")
    println("      ////////         Falsche eingabe! Bitte versuche es nochmal         /////////")
    println("/////////////////////////////////////////////////////////////////////////////////////////////")
}
fun platte(){
    underline()
    println("                                                                                             ")
    println("                                         _____________                                       ")
    println("                                        / /         \\ \\                                     ")
    println("                                       / /           \\ \\                                    ")
    println("                                      | |             | |                                    ")
    println("                                      | |             | |                                    ")
    println("                                      | |             | |                                    ")
    println("                                      | |_____________| |                                    ")
    println("                                      |_________________|                                    ")
    println("                                                                                             ")
    underline()

}
fun beinTreffer (){
     underline()
    println("                               und wurdest am Bein getroffen                                ")
    println("                                                                                            ")
    println("                                  /         __         \\                                   ")
    println("                                 /         /  \\         \\                                 ")
    println("                                /         /    \\         \\                                ")
    println("                               /         /      \\         \\                               ")
    println("                              /         /        \\        /⠱                               ")
    println("                             /         /          ⠛⠛⠛⠛⠛⠛⠛⠱  ⠣                              ")
    println("                            /         /             ⠏     ⠣    ⠣                            ")
    println("                           ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿            ⠟   ⠏      ⠟                              ")
     underline()


}

fun line() {
    println("---------------------------------------------------------------------------------------------")
}
fun invisbleline(){
    println("                                                                                             ")
}
fun underline (){
    println("_____________________________________________________________________________________________")
}
/*fun delay(){

    Thread.sleep(millisecond: Int)
}*/