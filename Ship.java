import java.util.ArrayList;
import java.util.List;

public class Ship(){
	List<Coordinates> shipLocation = new ArrayList<Coordinates>();
	
	public Ship(List<Coordinates> shipLoc){
		for(Coordinates shipSegmentLoc:shipLoc){
			shipLocation.add(shipSegmentLoc);
		}
	}

	public List<List<Integer>> sortCoordsByX(List<List<Integer>> inputList){
		// method for ordering the coordinates in shipLocation in ascending order by horizantal/x coordinate
		

		int length=input.size();
		List<List<Integer>> combinedList=new ArrayList<List<Integer>>();
		
		if (length==1){
			combinedList=input;
		}
		else if(length>=2){
		
			
			int midPoint=length/2;
			
			
			List<List<Integer>> subList1=new ArrayList<List<Integer>>(input.subList(0, midPoint));
			List<List<Integer>> sortedSub1=this.sortCoords(subList1,sortIndex);
			
			List<List<Integer>> subList2=new ArrayList<List<Integer>>(input.subList(midPoint, length));
			List<List<Integer>> sortedSub2=this.sortCoords(subList2,sortIndex);

			
			
			while((sortedSub1.size()!=0)||(sortedSub2.size()!=0)){
				if(sortedSub1.size()==0){
					
					combinedList.add(sortedSub2.get(0));
					sortedSub2.remove(0);
				}
				else if(sortedSub2.size()==0){
					combinedList.add(sortedSub1.get(0));
					sortedSub1.remove(0);
					
				}
				else if(sortedSub1.get(0).get(sortIndex)<=sortedSub2.get(0).get(sortIndex)){
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
	
	
	public void sortByX(){
		for()
	}
	public void sortByY(){
		
	}
	public boolean checkValidity(){
		//Checks that ship is actually in a contiguous straight line
		Integer possibleCol=shipLocation.get(0).getX();
		Integer possibleRow=shipLocation.get(0).getY();
		
		
		
		boolean valid=true;
		
		self.sortByX();
		
		for(Coordinates shipSegLoc:shipLocation){  //tests if all entries have the same solumn entry
			if(shipSegLoc.getX()!=possibleCol){
				valid=false
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
}