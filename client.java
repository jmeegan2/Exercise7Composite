public class client {
    public static void main(String[] args) {

      File myFileOne = new File("myFile1.txt");
      File myFileTwo = new File("myFile2.txt");

      Directory rootDirectory = new Directory("Root");
      Directory subDirectory = new Directory("SubDir");

      rootDirectory.add(myFileOne);
      subDirectory.add(myFileTwo);
      rootDirectory.add(subDirectory);

        rootDirectory.is();

    }
}
