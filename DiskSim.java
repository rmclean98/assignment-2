//Ryan McLean
//Assignment 2

import java.util.Scanner;

public class DiskSim {
	
	public static final int NUM_SECTORS = DiskParam.NUM_SECTORS;
	public static final int NUM_FILES = DiskParam.NUM_FILES;
	public static final int MAX_SIZE = DiskParam.MAX_SIZE;
	public static final int SECTOR_SIZE = DiskParam.SECTOR_SIZE;	
	
	//Create method finds enough free sectors in "free-sector" list to store information 
	//that is contained in the file being created.
	
	public static void create(List<SectorUsage> free) { //probably not void but just need a filler for now
		
		if(1 > 2) {
			System.out.println("Create");
		}
		
	}
	
	//delete method resets the associated entry in "files-array" and 
	//updates "free-sectors" list to show the freed space on the disk.
	
	//don't show the size field when the command was successful
	
	public static void delete() { //probably not void but just need a filler for now
		
		
	}
	
	//The print method prints the information in "files-array" for the file with <file_id>.
	//It prints the information one line at a time.
	
	//Print as a header line the following:
	//Sector usage for file <file_id> --- size = <size> characters
	
	public static void print(List<SectorUsage> free) {
		
		for(int i = 1; i < free.size(); i++){
			if(!free.isEmpty()){
				free.get(i);
				System.out.println(i);
			}
		}
	}
	
	//The where method obtains the corresponding slot in the "files-array".
	//Then prints the contents of the "free-sector" list
	
	public static int where() {
		
		return 0;
	}
	
	//The exit method exits the program, and gives a summary 
	//message of the total number of files currently on the disk.
	
	public static void exit() {
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		List<SectorUsage> free_sectors = new List<SectorUsage>();
		
		String[] c = new String[3];
	
		do {
			c = scanner.nextLine().split(" ");
		}while(c[0] != "x");
		
		
		List<SectorUsage> file_usage = new List<SectorUsage>();

		
		
		
		
		
		
		
		
		
		FileInfo[] files_array = new FileInfo [NUM_FILES]; 
		
		files_array[0] = new FileInfo();
		files_array[0].numchars = 10;
		file_usage.add(1, new SectorUsage(1, files_array[0].numchars));
		files_array[0].file_usage = file_usage;
		
		free_sectors.add(1, new SectorUsage(0,NUM_SECTORS-1));
		System.out.println(free_sectors.isEmpty());
		System.out.println(free_sectors.size());
		free_sectors.add(2, new SectorUsage(0,NUM_SECTORS-1));
		System.out.println(free_sectors.isEmpty());
		System.out.println(free_sectors.size());
		
		
		System.out.println("numChar: " + files_array[0].numchars + ", IsEmpty: " + files_array[0].file_usage.isEmpty() + ", Size: " + files_array[0].file_usage.size());
		
		System.out.println("-------------");
		print(free_sectors);
		//list of available sectors called "free-sectors"
		//list of sector information about the space called "file-usage"
		//Need an array called "files-array"
		
		FileInfo item = new FileInfo();
		
		item.numchars = 10;
	}
}