package data.warehousedata;

import java.io.FileInputStream;

import po.stockmanagermanpo.Storingpo;

public class Storing {
	
	public static boolean write(Storingpo po) throws Exception{
		FileInputStream fis = new FileInputStream("src/main/java/data/save/Storing.txt");
		return true;
		
	}

}
