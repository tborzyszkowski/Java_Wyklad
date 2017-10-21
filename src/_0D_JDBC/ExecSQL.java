package _0D_JDBC;
/**
   @version 1.30 2004-08-05
   @author Cay Horstmann
*/

import java.io.*;
import java.util.*;
import java.sql.*;
 
/**
   Program wykonuje polecenia języka SQL zapisane w pliku.
   Uruchomienie programu:
   java -classpath ścieżkaSterownika:. ExecSQL plikPolecenie
*/
class ExecSQL
{
	
   public static void main (String args[]) throws ClassNotFoundException
   {   
      try
      {
         Scanner in;
         if (args.length == 0)
            in = new Scanner(System.in);
         else
            in = new Scanner(new File(args[0]));
         
         Connection conn = getConnectionLite();
         try
         {
            Statement stat = conn.createStatement();
                       
            while (true)
            {
               if (args.length == 0) System.out.println("Enter command or EXIT to exit:");
               
               if (!in.hasNextLine()) return;

               String line = in.nextLine();
               if (line.equalsIgnoreCase("EXIT")) return;
               try
               {
                  boolean hasResultSet = stat.execute(line);
                  if (hasResultSet)
                     showResultSet(stat);
               }
               catch (SQLException e)
               {
                  while (e != null)
                  {  
                     e.printStackTrace();
                     e = e.getNextException();
                  }
               }
            }
         }
         finally
         {
            conn.close();
         }
      }
      catch (SQLException e)
      {
         while (e != null)
         {  
            e.printStackTrace();
            e = e.getNextException();
         }
      }
      catch (IOException e)
      {  
         e.printStackTrace();
      }      
   }

  	public static Connection getConnectionLite() throws SQLException, IOException, ClassNotFoundException {
		Properties props = new Properties();
		FileInputStream in = new FileInputStream("databaseLite.properties");
		props.load(in);
		in.close();

		String drivers = props.getProperty("jdbc.drivers");
		if (drivers != null)
			System.setProperty("jdbc.drivers", drivers);
		Class.forName(drivers);
		String url = props.getProperty("jdbc.url");

		return DriverManager.getConnection(url);
	}
/*  public static Connection getConnection()
      throws SQLException, IOException
   {  
      Properties props = new Properties();
      FileInputStream in = new FileInputStream("../database.properties");
      props.load(in);
      in.close();

      String drivers = props.getProperty("jdbc.drivers");
      if (drivers != null) System.setProperty("jdbc.drivers", drivers);

      String url = props.getProperty("jdbc.url");
      String username = props.getProperty("jdbc.username");
      String password = props.getProperty("jdbc.password");

      return DriverManager.getConnection(url, username, password);
   }
*/
   /**
      Wyświetla wynik zapytania.
      @param stat polecenie, którego wynik jest wyświetlany
   */
   public static void showResultSet(Statement stat) 
      throws SQLException
   { 
      ResultSet result = stat.getResultSet();
      ResultSetMetaData metaData = result.getMetaData();
      int columnCount = metaData.getColumnCount();

      for (int i = 1; i <= columnCount; i++)
      {  
         if (i > 1) System.out.print(", ");
         System.out.print(metaData.getColumnLabel(i));
      }
      System.out.println();

      while (result.next())
      {  
         for (int i = 1; i <= columnCount; i++)
         {  
            if (i > 1) System.out.print(", ");
            System.out.print(result.getString(i));
         }
         System.out.println();
      }
      result.close();
   }
}
