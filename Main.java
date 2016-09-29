import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class Main {
	
	public static void main(String[] args){
		//System.out.println(makeChange(0));
		Integer[] columns=new Integer[GRID_SIZE];
		ArrayList<Integer[]> results=new ArrayList<Integer[]> ();
		placeQueens(0,columns,results);
		//System.out.println(results);
	
	}
	public static final int GRID_SIZE=8;
	public static void placeQueens(int row, Integer[] columns, ArrayList<Integer[]> results){
		if(row==GRID_SIZE){
			results.add(columns.clone());
			for(Integer i:columns){
				System.out.print(i+" ");
			}
			System.out.println();
			
		}else{
			for(int col=0;col<GRID_SIZE;col++){
				if(checkValid(columns,row,col)){
					columns[row]=col;
					placeQueens(row+1,columns,results);
				}
			}
		}
	}
	
	public static boolean checkValid(Integer[] columns,int row1, int column1){
		for(int row2=0;row2<row1;row2++){
			int column2=columns[row2];
			//check if rows have a queen in the same column
			if(column2==column1){
				return false;
			}
			
			//check diagonal
			int cloumnDistance=Math.abs(column2-column1);
			int rowDistance=row1-row2;
			if(cloumnDistance==rowDistance)return false;
		}
		return true;
	}

}
