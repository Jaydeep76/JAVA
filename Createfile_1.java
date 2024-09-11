import java.io.*;



class Createfile_1{

    public static void main(String[] args)
    {
        File f = new File("D:\\Asim\\abcdf.txt");
        try{
            if(f.createNewFile())
            {
                System.out.print("file is successfully created");
            }
            else{
                System.out.println("file already exist");
            }
       
            // try{
            //     if(f.delete())
            //     {
            //         System.out.print("file is successfully deleted");
            //     }
            //     else{
            //         System.out.println("file dosen't exist");
            //     }
            // }
            // catch(IOException i){
            //     System.out.print("exception handling");
            // }
         //File D = new File("D:\\Asim\\abcd.txt");
         if (f.delete()){
            System.out.println("deleted succefully");
        }
        else{
            System.out.println(" file cannot be deleted ");
        }

            
         FileWriter w = new FileWriter("D:\\Asim\\abcd.txt");
         w.write("hello");
         w.close();
         System.out.println("successfully written in file");

         FileReader r =new FileReader("D:\\Asim\\abcd.txt");
         r.read();
         r.close();
         System.out.println("successfully read");
        }
        catch(IOException i){
            System.out.print("exception handling");
        }

       
    }
}



