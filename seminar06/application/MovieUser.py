from domain import MovieSearchRequest
from ports import iUserInput

class MovieUser:
    def __init__(self, userInputDriverPort: iUserInput):
        self.userInputDriverPort = userInputDriverPort

    def processInput(self, movieSearchRequest: MovieSearchRequest):
        self.userInputDriverPort.handleUserInput(MovieSearchRequest)