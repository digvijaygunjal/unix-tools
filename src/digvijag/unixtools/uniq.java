package digvijag.unixtools;

import digvijag.filesystem.MyFileReader;

public class Uniq {
    public static void main(String[] args) {
        String fileName, fileData = "", result;
        MyFileReader rf = new MyFileReader();
        try {
            fileName = args[0];
            fileData = rf.readFile(fileName);
        } catch (Exception e) {
            System.err.println("SomeThing went Wrong");
        }
        result = new UniqOperations().getUniqueData(fileData);
        System.out.println(result);
    }
}