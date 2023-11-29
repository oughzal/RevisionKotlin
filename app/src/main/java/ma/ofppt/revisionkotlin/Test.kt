package ma.ofppt.revisionkotlin

fun main() {
    val livre1 = Livre()
    val livre2 = Livre("Titre")
    val livre3 = Livre("Titre","auteur")
    val livre4 = Livre("Titre","auteur",3.9)
    val livre5 = Livre("Titre","auteur",3.9,2023)
    val livre6 = Livre(livre1) // this = livre2 , livre = livre1

}