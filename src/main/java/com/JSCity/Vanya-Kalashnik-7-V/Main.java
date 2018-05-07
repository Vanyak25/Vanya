import java.io.File;
import java.io.IOException;

import eu.printingin3d.javascad.exceptions.IllegalValueException;
import eu.printingin3d.javascad.utils.SaveScadFiles;

public class Main {
    public static void main(String[] args) throws IllegalValueException, IOException {
        new SaveScadFiles(new File("D:\Vanya\Laba_5\IdeaProjects")).
                addModel("parus.scad", new Building()).
                saveScadFiles();

    }
}