import java.util.ArrayList;

class Directory implements abstractFile {
    String name;

    public Directory(String root) {
        name = root;
    }

    public void is() {
        System.out.println(name);
        for(int i = 0; i < includedFiles.size(); i++){
            includedFiles.get(i).is();
        }
    }
    ArrayList<abstractFile> includedFiles = new ArrayList<>();

    public void add(abstractFile File) {
            includedFiles.add(File);
    }


}
    