import java.io.*;

public class issue_2672_example {

	public static void doRight(String fileName) {
		try{
			InputStream inputstream = new FileInputStream(fileName);
			byte [] buffer = new byte[1];
			int count = 0;
			if((count = inputstream.read(buffer)) > 0){
                System.out.println(buffer.toString());
            }
            else{
			    System.out.println("Experiment succeeds");
            }
		}
		catch(Exception e){
			System.out.println(e);
		}	
	}

	public static void doWrong(String fileName){
        try{
            InputStream inputstream = new FileInputStream(fileName);
            byte [] buffer = new byte[100];
            inputstream.read(buffer);
            System.out.println(buffer.toString());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

	public static void main(String[] args){
		String fileName = "/Users/utsavchokshi/Projects_2/temp1.txt";
		doRight(fileName);
		doWrong(fileName);

	}


}