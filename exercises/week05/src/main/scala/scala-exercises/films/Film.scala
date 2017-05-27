package films

/**
  * Created by Sonny on 27/05/2017.
  */
case class Film(name : String, yearOfRelease : Int, imdbRating : Double, director : Director) {

  def directorsAge : Int = yearOfRelease - director.yearOfBirth

  def isDirectedBy(person : Director) : Boolean = person ==  director

  /*
  def copy(name : String = name, yearOfRelease : Int = yearOfRelease,
           imdbRating : Double = imdbRating, director : Director = director) : Film = {
    new Film(name, yearOfRelease, imdbRating, director)
  }
*/

}

object Film {

  /*
  def apply(name : String, yearOfRelease : Int, imdbRating : Double, director : Director) : Film = {
    Film(name, yearOfRelease, imdbRating, director)
  }
*/

  def highestRating(film1 : Film, film2 : Film) : Double = {
    if(film1.imdbRating > film2.imdbRating) {film1.imdbRating}
    else {film2.imdbRating}
  }

  def oldestDirectorAtTheTime(film1 : Film, film2 : Film) : Director = {
    if(film1.directorsAge > film2.directorsAge) {film1.director}
    else {film2.director}
  }
}