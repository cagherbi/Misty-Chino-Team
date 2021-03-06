/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piratescaribbean;

import byui.cit260.piratesCaribbean.model.Actor;
import byui.cit260.piratesCaribbean.model.Game;
import byui.cit260.piratesCaribbean.model.Navigation;
import byui.cit260.piratesCaribbean.model.Location;
import byui.cit260.piratesCaribbean.model.MapIslands;
import byui.cit260.piratesCaribbean.model.OnTheSeaLevel;
import byui.cit260.piratesCaribbean.model.Player;
import byui.cit260.piratesCaribbean.model.PortRoyal;
import byui.cit260.piratesCaribbean.model.Ship;
import byui.cit260.piratesCaribbean.model.Supply;
import byui.cit260.piratesCaribbean.model.TreasureIslandLevel;
import byui.cit260.piratesCaribbean.model.Weapons;
import byui.cit260.piratesCarribean.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.omg.IOP.ENCODING_CDR_ENCAPS.value;

/**
 *
 * @author Misty Darrington & Chino Agherbi 
 */
public class PiratesCaribbean {

    /**
     * @param args the command line arguments
     */
    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        PiratesCaribbean.logFile = logFile;
    }
    
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        PiratesCaribbean.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        PiratesCaribbean.player = player;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        PiratesCaribbean.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        PiratesCaribbean.inFile = inFile;
    }
            
    
    public static void main(String[] args) {
    
        try {
        
        PiratesCaribbean.inFile =
                new BufferedReader( new InputStreamReader(System.in));
        
        PiratesCaribbean.outFile = new PrintWriter(System.out, true);
        
        String filePath = "log.txt";
        PiratesCaribbean.logFile = new PrintWriter(filePath);
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
        return;
        
        } catch (Throwable e) {
        
                System.out.println(" Exception: " + e.toString() +
                                    "\nCause: " + e.getCause() +
                                    "\nMessage: " + e.getMessage());
                
                e.printStackTrace();;
        }
        finally {
            try {
                if (PiratesCaribbean.inFile != null)
                   PiratesCaribbean.inFile.close();
                
                if (PiratesCaribbean.outFile != null)
                   PiratesCaribbean.outFile.close();
                
                 if (PiratesCaribbean.logFile != null)
                   PiratesCaribbean.logFile.close();
                
                 ErrorView.display(this.getClass().getName()
                         "You must enter a value.");
                         continue;
            }
            
                break;
        }
                 
            } catch (Exception e) {
              ErrorView.display(this.getClass().getName()
                           "Error reading input: " + e.getMessage());
                return null;
        }
        
        
        
        Player playerOne = new Player();
        
            playerOne.setName("Johnny Depp");
            playerOne.setBestTime(7.00);
        
                String playerInfo = playerOne.toString();
                System.out.println(playerInfo);
                    
        Location treasureIsland = new Location();
        Location portRoyal = new Location();
        Location shipboard = new Location();
        
            treasureIsland.setLevelNameOne("Treasure Island");
            portRoyal.setLevelNameTwo("Port Royal");
            shipboard.setLevelNameThree("Shipboard");
            
                String setLevelNameOne = treasureIsland.toString();
                String setLevelNameTwo = portRoyal.toString();
                String setLevelNameThree = shipboard.toString();
                                
        OnTheSeaLevel onTheSeaLevelInfo = new OnTheSeaLevel();
                
            onTheSeaLevelInfo.setDescription("");
            onTheSeaLevelInfo.setTravelTime(13);
            
                String setDescription = onTheSeaLevelInfo.toString();
                System.out.println(setDescription);
                
        Ship shipOne = new Ship();
        
            shipOne.setShipName("Black Pearl");
                    
                String shipName = shipOne.toString();
                System.out.println(shipName);
               
            
        TreasureIslandLevel tiDescription = new TreasureIslandLevel();
        TreasureIslandLevel tiTravelTime = new TreasureIslandLevel();
        TreasureIslandLevel tiNoOfItems = new TreasureIslandLevel();
        
            tiDescription.setIslandDescription("...");
            tiTravelTime.setTravelTime("...");
            tiNoOfItems.setNoOfItems(0);
            
                String setIslandDescription = tiDescription.toString();
                System.out.println();
                
                String setTravelTime = tiTravelTime.toString();
                System.out.println();
                
                String setNoOfItems = tiNoOfItems.toString();
                System.out.println();
                
        Weapons typeOne = new Weapons();
        
            typeOne.setWeaponType("Sword");
            
                String weaponTypeOne = typeOne.toString();
                System.out.println();
                
        Supply foodType = new Supply();       
        Supply drinkType = new Supply();
        Supply weaponType = new Supply();
        Supply toolType = new Supply();
         
            foodType.setFoodType("...");
            drinkType.setDrinkType("...");
            weaponType.setWeaponType("...");
            toolType.setToolType("...");
          
                String setFoodType = foodType.toString();
                System.out.println();
                
                String setDrinkType = drinkType.toString();
                System.out.println();
                
                String setWeaponType = weaponType.toString();
                System.out.println();
                
                String setToolType = toolType.toString();
                System.out.println();
                
        MapIslands headed = new MapIslands();
        MapIslands directionNorth = new MapIslands();
        MapIslands directionSouth = new MapIslands();
        MapIslands directionEast = new MapIslands();
        MapIslands directionwest = new MapIslands();
        
        
            headed.setMapIsalands("...");
            directionNorth.setDirectionNorth("...");
            directionSouth.setDirectionSouth("...");
            directionEast.setDirectionEast("...");
            directionwest.setDirectionWest("...");
            
               String setMapIslands = headed.toString();
               System.out.println(setDescription);
               
               String setDirectionNorth = directionNorth.toString();
               System.out.println(setDescription);
               
               String setDirectionSouth = directionSouth.toString();
               System.out.println(setDescription);
               
               String setDirectionEast = directionEast.toString();
               System.out.println(setDescription);
               
               String setDirectionWest = directionwest.toString();
               System.out.println(setDescription);
               
               
            
        PortRoyal onThePortRoyalLevelInfo = new PortRoyal();
                
           onThePortRoyalLevelInfo.setDescription("");
           onThePortRoyalLevelInfo.setTravelTime("...");
            
                String setdescription = onThePortRoyalLevelInfo.toString();
                System.out.println(setDescription);
            

        Navigation navType = new Navigation();
        
            navType.setNavigationType("compass");
            
                String naviagationTypeOne = navType.toString();
                System.out.println(); 
                
        
                    
        
        Game gameOne = new Game();
        
            gameOne.setName("...");
            gameOne.setBestTime(3.00);
        
                String gameInfo = gameOne.toString();
                System.out.println(playerInfo);  
            
        
        Actor actorName = new Actor();
        Actor actorDescription = new Actor();
        
            actorName.setName("...");
           actorDescription.setDescription("...");
        
                String actorInfo = actorName.toString();
                System.out.println(actorName);          
                
                String descriptionInfo = actorDescription.toString();
                System.out.println(actorDescription);
                
                    
        
    }

    private static void levelCompleted(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static String travelTime(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static String noOfItems(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static String weaponDescription(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static String weaponType(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static String tiTravelTime(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static PrintWriter getOutFie() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}