

if __name__ == "__main__":
    fetchMovieReviews = MovieReviewsRepo()
    printMovieReviews = ConsolePrinter()

    userCommand = UserCommand(fetchMovieReviews, printMovieReviews)

    movieUser = MovieUser(userCommand)

    starWarsRequest = MovieSearchRequest("StarWars")
    starTreckRequest = MovieSearchRequest("StarTreck")

    print("Didplayin reviews for movie " + starWarsRequest.getMovieName)
    movieUser.processInput(starWarsRequest)

    print("Didplayin reviews for movie " + starTreckRequest.getMovieName)
    movieUser.processInput(starTreckRequest)