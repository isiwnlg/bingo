package bingo;

import java.text.MessageFormat;

@SuppressWarnings("serial")
public class BingoRuntimeException extends RuntimeException {
   
   public BingoRuntimeException( Throwable th )
   {
      super(th);
   }

   public BingoRuntimeException( String message )
   {
      super(message);
   }

   public BingoRuntimeException( String message, Object...objects)
   {
      super( MessageFormat.format(message, objects));
   }
}
