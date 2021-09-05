Tic Tac Toe game
-------------------
This is a rough design and emphasis is on design following SOLID,using singleton,observer design pattern and not logic.
Rules
________

1.There will be a 3*3 grid of type char
2.There will be 2 players
3.In the game there are 2 states X and 0 that can be associated with each player till the end of game
4.Each player will have turn and mark on the grid
5.There are few winning moves such as ,the player who can mark 1 complete row,column or diagonal with same symbol wins.
6.After each player makes a move,game manager will check if the move matches with winner move
7.If it matches,that player will win the game and game will be over.

Entities
_________
Board
Player 
State enum
Game Manager implements observer
Notifier 
Observer interface

Properties
___________
Board - grid-2d array of type char,notifier
Player - name, selectedState
State enum - X and O states
GameManager - board,playerList, winningPlayer
Notifier-Observer

Funtionalities
_______________
Board- printBoard(),checkIfWinngingMove(),constructor,markNewPosition()
Player- constructor to assign name and state, markInBoard()
Game Manager- constructor-take input and set state to player,Play(),main() to take input;
Notifier - broadcast()
Observer interface -notify()

Flow
_______
->GameManager starts a game
->creates notifier object
->defines board
->assigns players,
->gives them name,
->randomly assigns a state to a player 

->GameManager calls start()
->players will take turn and markInBoard()
->it will continue till one player wins

markInBoard(board)-calculate position/take user input 
calls markNewPosition(position,player)-in the position where a player wants,player's state will be marked in board
call checkIfWinngingMove()-
->check if same symbol is there row wise,column wise,diagonal wise
->if yes,broadcast


Additional Task
__________________

//There could be some additions like-
//Player could be a interface with some default method which PlayerImpl extends in case we add different type of player in future 
like players with option to set some premium skin/name/assign a state that they want

//there could be option to play multiple matches in a row and declare a winner based on number of matches won -like a tournament
//leaderboard option to maintain ranks of different players 
//statistics option for each player to see how many matches won,how many matches played each day etc
//playerPro option that shows probable winning moves to a player or gives hint


Learning
----------
//if any one entity has lot of responsibility then evaluate again and check the responsibility again
//if a call is being repeated many time,check if it could be modified
//try to keep minimum number of properties

