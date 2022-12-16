class Camper (name : String, leben : Int, nahkampf : Int, fernkampf : Int): Soldat(name, leben, nahkampf, fernkampf) {


        var flammenwerfer = nahkampf * 3
        var molli = nahkampf * 2
        var granate = fernkampf * 3

        var attack = mutableListOf("nahkampf", "fernkampf", "doppelRPG", "flammenwerfer", "molli", "granate")
        var westen = listOf("Y","N")


    fun kevlarweste(ziel: Soldat) {
        if (kevlarWeste > 0) {
            kevlarWeste -= 1
            println("---------------------------------------------------------------------------------------------")
            println("                        Es ist eine Kavlar Weste kaputt gegangen")
            platte()
        } else {
            granatenhit(ziel)
            println("---------------------------------------------------------------------------------------------")
            println("                            Es sind alle westen verbraucht")     // todo println bearbeiten

        }
    }

    fun weste(ziel: Soldat) {
        println("---------------------------------------------------------------------------------------------")
        println("                                 Du wurdest hart getroffen")
        println("---------------------------------------------------------------------------------------------")
        var eingabe = westen.random()
        when (eingabe) {
            "Y" -> kevlarweste(ziel)
            "N" -> {
                beinTreffer()   // todo println bearbeiten
                granatenhit(ziel)
            }
        }
    }
    fun doppelRPG(ziel: Soldat){

        ziel.leben = ziel.leben / 100 * 20
        println("---------------------------------------------------------------------------------------------")
        println("           ${this.name} Schießt auf ${ziel.name} mit Doppel RPG und macht 80% schaden")         // todo println bearbeiten
        invisbleline()
    }



    override fun attack(ziel: Soldat) {


        if (this.alive && ziel.alive) {
            var angriff = attack.random()

            when (angriff) {
                "nahkampf" -> nahkampf(ziel)
                "fernkampf" -> fernkampf(ziel)
                "doppelRPG" -> doppelRPG(ziel)
                "flammenwerfer" -> flammenwerfer(ziel)
                "molli" -> molli(ziel)
                "granate" -> weste(ziel)
                }


        }


    }
    fun nahkampf(ziel: Soldat){
        ziel.leben -= this.nahkampf
        println("---------------------------------------------------------------------------------------------")
        println("          ${this.name} Schießt auf ${ziel.name} mit Nahkampf und macht 15 schaden")
        invisbleline()
    }
    fun fernkampf(ziel: Soldat){
        ziel.leben -= this.fernkampf
        println("---------------------------------------------------------------------------------------------")
        println("         ${this.name} Schießt auf ${ziel.name} mit Fernkampf und macht 20 schaden")
        invisbleline()
    }

    fun flammenwerfer(ziel: Soldat){
        ziel.leben -= this.flammenwerfer
        println("---------------------------------------------------------------------------------------------")
        println("        ${this.name} Schießt auf ${ziel.name} mit Flammenwerfer und macht 45 schaden")
        invisbleline()
    }
    fun molli(ziel: Soldat){
        ziel.leben -= this.molli
        println("---------------------------------------------------------------------------------------------")
        println("           ${this.name} Schießt auf ${ziel.name} mit Molli und macht 30 schaden")
        invisbleline()
    }
    fun granatenhit (ziel: Soldat){
        ziel.leben -= this.granate
        println("---------------------------------------------------------------------------------------------")
        println("           ${this.name} Schießt auf ${ziel.name} mit Granate und macht 60 schaden")
        invisbleline()

    }
}