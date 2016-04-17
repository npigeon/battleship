package battleship;

import java.util.ArrayList;
import java.util.List;

public class Ship{
	List<Coordinates> shipLocation = new ArrayList<Coordinates>();
	
	public Ship(List<Coordinates> shipLoc){
		for(Coordinates shipSegmentLoc:shipLoc){
			shipLocation.add(shipSegmentLoc);
		}
	}

	public List<Coordinates> sortCoordsByX(List<Coordinates> coordList){
		// method for ordering the coordinates in shipLocation in ascending order by horizantal/x coordinate
		// based on merge sort recursive algorithm

		int length=coordList.size(); 
		List<Coordinates> combinedList=new ArrayList<Coordinates>(); //our output variable
		
		if (length==1){  //method just returns input if of length 1
			             //important because a list of size 1 is always sorted
			combinedList=coordList;
		}
		else if(length>=2){
		//otherwise divides list into two roughly equal sublists and applies this method to each of those
		//sublists.
			
			int midPoint=length/2;
			
			
			//recursion used to evaluating 
			//start from single element lists, then solve 2 element listed, then 4 and so on
			
			List<Coordinates> subList1=new ArrayList<Coordinates>(coordList.subList(0, midPoint));
			List<Coordinates> sortedSub1=this.sortCoordsByX(subList1);//evulates first half sublist first
			
			
			List<Coordinates> subList2=new ArrayList<Coordinates>(coordList.subList(midPoint, length));
			List<Coordinates> sortedSub2=this.sortCoordsByX(subList2);//resursion for second half sublist
			
			
			
			while((sortedSub1.size()!=0)||(sortedSub2.size()!=0)){
				//assuming both sortedSub1 & sortedSub2 are already sorted this will loop will merge
				//the two into a single sorted list by repeatedly adding the lesser of the two list's
				//mimimal value to combined list and removing them from their origonal list.  
				// Loop ends when sorted lists are empty
				if(sortedSub1.size()==0){
					
					combinedList.add(sortedSub2.get(0));
					sortedSub2.remove(0);
				}
				else if(sortedSub2.size()==0){
					combinedList.add(sortedSub1.get(0));
					sortedSub1.remove(0);
					
				}
				else if(sortedSub1.get(0).getX()<=sortedSub2.get(0).getX()){
					combinedList.add(sortedSub1.get(0));
					

					sortedSub1.remove(0);
				}
				else{
					combinedList.add(sortedSub2.get(0));
					
					sortedSub2.remove(0);
				}
				
					
			}
			
		}

	return combinedList;  //returns sorted version of currently evaluated sublist
}
	public List<Coordinates> sortCoordsByY(List<Coordinates> coordList){
		// method for ordering the coordinates in shipLocation in ascending order by vertical/y coordinate
		// based on merge sort recursive algorithm
		// sortCoordinatesByX has more detailed comments on the method

		int length=coordList.size();
		List<Coordinates> combinedList=new ArrayList<Coordinates>();
		
		if (length==1){
			combinedList=coordList;
		}
		else if(length>=2){
		
			
			int midPoint=length/2;
			
			
			List<Coordinates> subList1=new ArrayList<Coordinates>(coordList.subList(0, midPoint));
			List<Coordinates> sortedSub1=this.sortCoordsByY(subList1);
			
			List<Coordinates> subList2=new ArrayList<Coordinates>(coordList.subList(midPoint, length));
			List<Coordinates> sortedSub2=this.sortCoordsByY(subList2);

			
			
			while((sortedSub1.size()!=0)||(sortedSub2.size()!=0)){
				if(sortedSub1.size()==0){
					
					combinedList.add(sortedSub2.get(0));
					sortedSub2.remove(0);
				}
				else if(sortedSub2.size()==0){
					combinedList.add(sortedSub1.get(0));
					sortedSub1.remove(0);
					
				}
				else if(sortedSub1.get(0).getY()<=sortedSub2.get(0).getY()){
					combinedList.add(sortedSub1.get(0));
					

					sortedSub1.remove(0);
				}
				else{
					combinedList.add(sortedSub2.get(0));
					
					sortedSub2.remove(0);
				}
				
					
			}
			
		}

	return combinedList;
}
	
	
	
	public boolean checkValidity(){
		//Checks that ship is actually in a contiguous straight line
		Integer possibleCol=shipLocation.get(0).getX();
		Integer possibleRow=shipLocation.get(0).getY();
		
		
		
		boolean valid=true;
		
		this.sortCoordsByX(shipLocation);
		
		for(Coordinates shipSegLoc:shipLocation){  //tests if all entries have the same solumn entry
			if(shipSegLoc.getX()!=possibleCol){
				valid=false;
				break;
			}
		}
		if (valid==true){
			return true;
		}
		else{
			valid=true;
			self.sortByY();
		}
		
		
		
		for(Coordinates shipSegLoc:shipLocation){
			if((shipSegLoc.getY()!=possibleRow) ||){
				valid=false
				break;
			}
		}
		if (valid==true){
			return true;
		}
		else{
			return false;
		}
	}

	private void sortCoordsByX() {
		// TODO Auto-generated method stub
		
	}
}