package interfaces;

import java.util.UUID;

public interface uuidFactory {
	
	public static String getUUID() {
		
		String toReturn = UUID.randomUUID().toString();
		
		return toReturn;
	}

}
