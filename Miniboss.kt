class Miniboss(name : String, leben : Int, nahkampf : Int, fernkampf : Int): Soldat(name, leben, nahkampf, fernkampf) {

    var claymor = nahkampf * 2
    var granatwerfer = fernkampf *2

    var attack = mutableListOf("fernkampf","nahkampf","claymor","granatwerfer")

    override fun attack(ziel: Soldat) {


        if (this.alive && ziel.alive) {


            var angriff = attack.random()

            when (angriff) {
                "nahkampf" -> nahkampf(ziel)
                "fernkampf" -> fernkampf(ziel)
                "claymor" -> claymor(ziel)
                "granatwerfer" -> granatwerfer(ziel)
            }


        }
    }
    fun nahkampf(ziel: Soldat){
        ziel.leben -= this.nahkampf
        println("---------------------------------------------------------------------------------------------")
        println("          ${this.name} Schießt auf ${ziel.name} mit Nahkampf und macht 10 schaden")
        invisbleline()
    }
    fun fernkampf(ziel: Soldat){
        ziel.leben -= this.fernkampf
        println("---------------------------------------------------------------------------------------------")
        println("         ${this.name} Schießt auf ${ziel.name} mit Fernkampf und macht 15 schaden")
        invisbleline()
    }
    fun claymor(ziel: Soldat){
        ziel.leben -= this.claymor
        println("---------------------------------------------------------------------------------------------")
        println("         ${this.name} Schießt auf ${ziel.name} mit Fernkampf und macht 20 schaden")
        invisbleline()
    }
    fun granatwerfer(ziel: Soldat){
        ziel.leben -= this.granatwerfer
        println("---------------------------------------------------------------------------------------------")
        println("         ${this.name} Schießt auf ${ziel.name} mit Fernkampf und macht 30 schaden")
        invisbleline()
    }
}