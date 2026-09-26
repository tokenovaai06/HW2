fun main(){
    val mySong = Song("Him & I", "G-Eazy & Halsey", 2017, 1700)
    mySong.printDescription()
    println("Popular: ${mySong.isPopular}")

}
class Song(
    val title: String,
    val artist: String,
    val year: Int,
    val playCount: Int
){
    val isPopular = playCount >= 1000

    fun printDescription() {
        println("$title, performed by $artist, was released in $year.")
    }
}

