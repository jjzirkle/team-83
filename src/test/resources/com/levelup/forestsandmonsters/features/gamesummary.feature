Feature: GameSummary

I want to end the game and see the summary screen

Scenario Outline:: End the game

    When the game is ended
    Then the Game has <totalPositions> positions


    Examples:

        | numPositions |
        | 25 |

