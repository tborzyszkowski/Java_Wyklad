# java_world
An app that imitates the world with balance. Using *awt* and *swing* library. Implements the *ActionListener*.

## Organism description
###### Multiply
##### Formula
*organism count / 10 + 1 + CONST*<br><br>
**Example**<br>
<table>
<thead><tr><th>organism count</th><th>formula (int)</th><th>CONST</th><th>chance</th><th>formula (int)</th><th>CONST</th><th>chance</th><th>formula (int)</th><th>CONST</th><th>chance</th></tr></thead><tbody>
 <tr><td>1</td><td>1</td><td>0</td><td><b>100.00%</b></td><td>2</td><td>1</td><td><b>50.00%</b></td><td>6</td><td>5</td><td><b>16.67%</b></td></tr>
 <tr><td>2</td><td>1</td><td>0</td><td><b>100.00%</b></td><td>2</td><td>1</td><td><b>50.00%</b></td><td>6</td><td>5</td><td><b>16.67%</b></td></tr>
 <tr><td>3</td><td>1</td><td>0</td><td><b>100.00%</b></td><td>2</td><td>1</td><td><b>50.00%</b></td><td>6</td><td>5</td><td><b>16.67%</b></td></tr>
 <tr><td>9</td><td>1</td><td>0</td><td><b>100.00%</b></td><td>2</td><td>1</td><td><b>50.00%</b></td><td>6</td><td>5</td><td><b>16.67%</b></td></tr>
 <tr><td>10</td><td>2</td><td>0</td><td><b>50.00%</b></td><td>3</td><td>1</td><td><b>33.33%</b></td><td>7</td><td>5</td><td><b>14.29%</b></td></tr>
 <tr><td>20</td><td>3</td><td>0</td><td><b>33.33%</b></td><td>4</td><td>1</td><td><b>25.00%</b></td><td>8</td><td>5</td><td><b>12.50%</b></td></tr>
 <tr><td>30</td><td>4</td><td>0</td><td><b>25.00%</b></td><td>5</td><td>1</td><td><b>20.00%</b></td><td>9</td><td>5</td><td><b>11.11%</b></td></tr>
 <tr><td>40</td><td>5</td><td>0</td><td><b>20.00%</b></td><td>6</td><td>1</td><td><b>16.67%</b></td><td>10</td><td>5</td><td><b>10.00%</b></td></tr>
 <tr><td>50</td><td>6</td><td>0</td><td><b>16.67%</b></td><td>7</td><td>1</td><td><b>14.29%</b></td><td>11</td><td>5</td><td><b>9.09%</b></td></tr>
 <tr><td>60</td><td>7</td><td>0</td><td><b>14.29%</b></td><td>8</td><td>1</td><td><b>12.50%</b></td><td>12</td><td>5</td><td><b>8.33%</b></td></tr>
 <tr><td>70</td><td>8</td><td>0</td><td><b>12.50%</b></td><td>9</td><td>1</td><td><b>11.11%</b></td><td>13</td><td>5</td><td><b>7.69%</b></td></tr>
 <tr><td>80</td><td>9</td><td>0</td><td><b>11.11%</b></td><td>10</td><td>1</td><td><b>10.00%</b></td><td>14</td><td>5</td><td><b>7.14%</b></td></tr>
 <tr><td>90</td><td>10</td><td>0</td><td><b>10.00%</b></td><td>11</td><td>1</td><td><b>9.09%</b></td><td>15</td><td>5</td><td><b>6.67%</b></td></tr>
 <tr><td>100</td><td>11</td><td>0</td><td><b>9.09%</b></td><td>12</td><td>1</td><td><b>8.33%</b></td><td>16</td><td>5</td><td><b>6.25%</b></td></tr>
 <tr><td>110</td><td>12</td><td>0</td><td><b>8.33%</b></td><td>13</td><td>1</td><td><b>7.69%</b></td><td>17</td><td>5</td><td><b>5.88%</b></td></tr>
</tbody></table>

**grass** - CONST: 15
<br>
**muschroom** - CONST: 20; 100% chance after kill another organism; dying after 10 moves; can spawn everytime
<br>
**sheep** - CONST: 0; when meet another sheep
<br>
**wolf** - CONST: 1; when meet another wolf
<br>
**bear** - CONST: 2

###### Actions
**grass** - nothing
<br>
**mushroom** - kill another organism when they meet
<br>
**sheep** - nothing
<br>
**wolf** - aim to sheep when sheep population is greater than 20 pieces, get extra one move; does not move after eating a sheep for 1 turn
<br>
**bear** - nothing

###### Stats
**grass** - strength: 0, movement: 0, life: 400 days
<br>
**mushroom** - strength: 0, movement: 0, life: 10 days
<br>
**sheep** - strength: 0, movement: 1, life: 500 days
<br>
**wolf** - strength: 5, movement: 2, life: 800 days
<br>
**bear** - strength: 20, movement: 1, life: 1200 days

#### java_world.java
Set world board size given in px - x, y. The autoscaler of the board is implemented. Can pass another size.
<br>
**autoplay** - auto play mode; **TRUE/FALSE**

#### MyFrame.java
Create the form. Parameters *WIDTH* and *HEIGHT* sets form size.

#### RightClickMouse.java
Mouse clicked event. Add organism from the context menu.

#### ContextMenu.java
Define organisms on context menu.

#### Organism.java
Main class that contains parameters of all organisms.

#### Animal.java, Plant.java, ...
Extends Organism.java. Specified actions for group of organism.

#### Grass.java, Sheep.java, ...
Extends Animal.java or Plant.java. Specified actions for any kind of organism.

#### World.java
Defined java world! Parameters:
<br>
**size** - size of world
<br>
**organismArray** - array of organism at world
<br>
**animalsArr** - array of animals
<br>
**plantsArr** - array of plants
<br>
**queueSpawnOrganism** - array for organism which will be spawned
<br>
**myFrame** - form
<br>
**minOrganismQty** - the minimum number of organisms that will be spawned
<br>

Also exists *addOrganism* and *drawWorld* method.

*drawWorld* method is responsible for clear the world board and sets organism on board.

#### Coordinates.java
Class exists coordinates of organisms or world size. Contains *equals* method.

#### Board.java
Board on form. Sets grid layout. Sets labels on board, clear board.

#### BoardArea.java
Extends JPanel. Area on board. Coloring organisms, set label method and clear label method. Contains all Board operations.

#### WorldBoard.java
Extends World.java.

#### NewOrganism.java
Implements ActionListener. Creating virtual/temp organism.