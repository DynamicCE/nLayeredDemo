package nLayeredDemo.core;

import nLayeredDemo.jLogger.jLoggerManager;

// dışarıdan bi sistem kullanmak istersen Adapter'ini yazmamız gerekir
public
class jLoggerManagerAdapter implements LoggerService{
    @Override
    public
    void logToSystem ( String message ) {
        jLoggerManager manager = new jLoggerManager (); //Adapter içinde newleyebiliriz sakıncalı değil
        manager.log ( message );
    }
}
// dışarıdan gelen servisi kullanmak için Interace ve Adapter oluşturduk
// bunu yapmamızın sebebi dış servisi programda newlemenin sakıncalı olması
// programda newlemek yerine adapter içinde newleyip kullanırız