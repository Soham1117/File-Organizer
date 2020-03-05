import java.io.File;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

public class MoveApp
{
	
	public MoveApp(String newaddress)
	{
		String address = newaddress.replaceAll("\\\\","\\\\\\\\");
    	File folder = new File(address);
    	String[] files = folder.list();
        String[] extensions = new String[files.length]; 
        String currentDirectory = address;
        String[] paths = new String[files.length];
        
	for (int i=0; i < files.length;i++)
    {
    	if(files[i].indexOf(".") > -1)
    	{    	
      	extensions[i] = FilenameUtils.getExtension(files[i]); 	
       	}
    	if(extensions[i]!=null)
    	{	
    	paths[i] = currentDirectory+"\\"+extensions[i]+" Files";	
    	File file = new File(currentDirectory+"\\"+(extensions[i].toUpperCase()+" Files"));		
    	file.mkdir();	
    	}
    	
    }
    for (int j=0; j < files.length;j++)
    {
    try 
	{
    	if(paths[j]!=null && files[j].indexOf(".") > -1)
    	{
    	File source = new File(address+"//"+files[j]);
		File destination = new File(paths[j]);
		
		FileUtils.moveFileToDirectory(source, destination, true);
    	//FileUtils.copyFileToDirectory(source, destination);  
		//FileUtils.forceDelete(source);
    	}
	}
	catch (Exception e) 
	{
	e.printStackTrace();
	} 
     
      
  }
}
}
