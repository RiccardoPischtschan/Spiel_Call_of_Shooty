class Nahkämpfer (name : String, leben : Int, nahkampf : Int, fernkampf : Int): Soldat(name, leben, nahkampf, fernkampf) {


    var messer = nahkampf * 3
    var molli = nahkampf * 2

    var i = 1

    override fun attack(ziel: Soldat) {

            if (this.alive && ziel.alive) {

                while (i > 0) {

                    try {
                        println("---------------------------------------------------------------------------------------------")
                        println("Gebe dein Angriff ein ")
                        println("                                     Nahkampf     1")
                        println("                                     Fernkampf    2")
                        println("                                     Messer       3")
                        println("                                     Molli        4")
                        var angriff = readln().toInt()
                        line()

                        when (angriff) {

                            1 ->  {
                                  nahkampf(ziel)
                                   break
                                  }
                            2 ->  {
                                fernkampf(ziel)
                                break
                                 }
                            3 ->  {
                                messer(ziel)
                                break
                                }
                            4 ->  {
                                molli(ziel)
                                break
                                }

                            else -> falscheEingabe()


                        }
                    } catch (ex: Exception) {
                         falscheEingabe()
                    }

                }

            }

    }
    fun nahkampf(ziel: Soldat){
        ziel.leben -= this.nahkampf
        println("---------------------------------------------------------------------------------------------")
        println("              ${this.name} Messert auf ${ziel.name} im Nahkampf ein und macht 15 schaden")
        invisbleline()

    }
    fun fernkampf(ziel: Soldat){
        ziel.leben -= this.fernkampf
        println("---------------------------------------------------------------------------------------------")
        println("             ${this.name} Schießt auf ${ziel.name} mit Fernkampf und macht 7 schaden")
        invisbleline()

    }
    fun messer(ziel: Soldat){
        ziel.leben -= this.messer
        println("---------------------------------------------------------------------------------------------")
        println("             ${this.name} Schießt auf ${ziel.name} mit einem Messer und macht 45 schaden")
        invisbleline()

    }
    fun molli(ziel: Soldat){
        ziel.leben -= this.molli
        println("---------------------------------------------------------------------------------------------")
        println("          ${this.name} Schießt auf ${ziel.name} mit einem Molli und macht 30 schaden")
        invisbleline()

    }
}


