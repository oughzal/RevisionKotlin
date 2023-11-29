package ma.ofppt.revisionkotlin

class Livre() {
    init {
        //cmp++
    }

    var titre = ""
        get() = field
        set(value) {
            field = value
        }
    var auteur = ""
        get() = field
        set(value) {
            field = value
        }
    var prix = 0.0
        get() = field
        set(value) {
            field = value
        }
    var annee = 0
        get() = field
        set(value) {
            field = value
        }

    companion object {
        var cmp = 0
    }

    fun compter(): Int {
        return cmp
    }

    fun compter2() {
        println(cmp)
    }

    constructor(titre: String) : this() { //(String)
        this.titre = titre
    }

    constructor(titre: String, auteur: String) : this(titre) { // (String,String)
        this.auteur = auteur
    }

    constructor(titre: String, auteur: String, prix: Double) : this(
        titre,
        auteur
    ) { //(str,str,double) != (double,str,str) != (str,double,str)
        this.prix = prix
        // cmp++
    }

    constructor(titre: String, auteur: String, prix: Double, annee: Int) : this(
        titre,
        auteur,
        prix
    ) {
        this.annee = annee
        // cmp++
    }

    constructor(livre: Livre) : this() {
        this.titre = livre.titre   // livre2.titre = livre.titre
        this.auteur = livre.auteur
        this.prix = livre.prix
        this.annee = livre.annee
    }

    fun afficher(): String {
        return "Titre : $titre \nAuteur: $auteur \n..."
    }

    fun afficher2() {
        println("Titre : $titre \nAuteur: $auteur \n...")
    }
    fun type():Int{
        // 1 : prix < 100
        // 2 : <500
        //3 : > 500
        if(this.prix<100) return 1
        if(this.prix <=500) return 2
        return 3
    }

}