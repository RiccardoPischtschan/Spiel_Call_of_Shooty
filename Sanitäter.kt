class Sanitäter (name : String, leben : Int, nahkampf : Int, fernkampf : Int): Soldat(name, leben, nahkampf, fernkampf) {


    var i = 1

    override fun attack(ziel: Soldat) {

        if (this.alive && ziel.alive) {
            angriff(ziel)

        }
    }

    fun nahkampf(ziel: Soldat) {
        ziel.leben -= this.nahkampf
        println("---------------------------------------------------------------------------------------------")
        println("          ${this.name} Messert auf ${ziel.name} im Nahkampf ein und macht 15 schaden")
        invisbleline()
    }

    fun fernkampf(ziel: Soldat) {
        ziel.leben -= this.fernkampf
        println("---------------------------------------------------------------------------------------------")
        println("          ${this.name} Schießt auf ${ziel.name} mit Fernkampf und macht 5 schaden")
        invisbleline()
    }

    fun angriff(ziel: Soldat) {
        while (i > 0) {

            try {
                println("---------------------------------------------------------------------------------------------")
                println("Gebe dein Angriff ein ")
                println("                                     Nahkampf     1")
                println("                                     Fernkampf    2")
                var angriff = readln().toInt()


                when (angriff) {

                    1 ->  {
                        nahkampf(ziel)
                        break
                    }

                    2 ->  {
                        fernkampf(ziel)
                        break
                    }

                    else -> {
                        falscheEingabe()
                        continue
                    }


                }
            } catch (ex: Exception) {
                falscheEingabe()
                continue
            }

        }

    }
}


