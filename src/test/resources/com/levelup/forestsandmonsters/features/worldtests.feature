Feature: World validation checks 
    
    I want to move my character. My map checks if that movement
    is valid before allowing character to move.

    Scenario Outline: Check boundary
        Given I have a list of valid tiles
        And the next X player position <moveX> 
        And  next Y player position<moveY>
        When the player validates his movement
        Then map should return <result>
        Examples:
            | moveX |moveY | result |
            | 0     | 0    | true   |
            | 0     | 0    | false  |