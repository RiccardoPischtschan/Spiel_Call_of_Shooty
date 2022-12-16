class Scharfschütze (name : String, leben : Int, nahkampf : Int, fernkampf : Int): Soldat(name, leben, nahkampf, fernkampf) {


    var brandMun = fernkampf * 2
    var hochgeschwindigkeitsgeschoss = fernkampf * 3
    var i = 1

    override fun attack(ziel: Soldat) {

        if (this.alive && ziel.alive) {

            while (i > 0) {

                try {

                    println("---------------------------------------------------------------------------------------------")
                    println("Gebe dein Angriff ein ")
                    println("                                     Nahkampf        1")
                    println("                                     Fernkampf       2")
                    println("                                     Brand Mun       3")
                    println("                                     HG Geschoss     4")
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

                        3 ->  {
                            brandmuni(ziel)
                            break
                        }

                        4 ->  {
                            hggeschoss(ziel)
                            break
                        }

                        else -> falscheEingabe()


                    }
                } catch (ex: Exception) {
                    falscheEingabe()
                    continue
                }

            }
        }
    }
        fun nahkampf(ziel: Soldat) {
            ziel.leben -= this.nahkampf
            println("---------------------------------------------------------------------------------------------")
            println("           ${this.name} Messert auf ${ziel.name} im Nahkampf ein und macht 15 schaden")
            invisbleline()
        }

        fun fernkampf(ziel: Soldat) {
            ziel.leben -= this.fernkampf
            println("---------------------------------------------------------------------------------------------")
            println("          ${this.name} Schießt auf ${ziel.name} mit Fernkampf und macht 15 schaden")
            invisbleline()
        }

        fun brandmuni(ziel: Soldat) {
            ziel.leben -= this.brandMun
            println("---------------------------------------------------------------------------------------------")
            println("          ${this.name} Schießt auf ${ziel.name} mit Brand Mun und macht 30 schaden")
            invisbleline()
        }

        fun hggeschoss(ziel: Soldat) {
            ziel.leben -= this.hochgeschwindigkeitsgeschoss
            println("---------------------------------------------------------------------------------------------")
            println("       ${this.name} Schießt auf ${ziel.name} mit Hochgeschwindigkeitsgeschoss und macht 45 schaden")
            invisbleline()
        }
    }
