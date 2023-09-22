Feature: WorldTests
    
    I want to move my character. My map checks if that movement
    is valid before allowing character to move.

    Scenario Outline: Check boundary
        Given I have a list of valid tiles
        And next X player position <moveX> 
        And  next Y player position <moveY>
        When the player validates his movement
        Then map should return <result>
        Examples:
            | moveX |moveY | result |
            | 0     | -1   | false  |
            | 10    | 0    | false  |
            | 5     | 5    | true   |