
import archersysos.jawa.net.*;
import java.io.IOException;
class JLSProgram{
      public static void main(String [] args)
   {
      int port = Integer.parseInt(args[0]);
      try
      {
         Thread t = new JawaLibraryServer(port);
         t.start();
      }catch(IOException e)
      {
         e.printStackTrace();
      }
   }
}