import java.util.ArrayList;
import java.util.List;

import eu.printingin3d.javascad.coords.Angles3d;
import eu.printingin3d.javascad.models.Abstract3dModel;
import eu.printingin3d.javascad.coords.Coords3d;
import eu.printingin3d.javascad.coords.Dims3d;
import eu.printingin3d.javascad.coords.Triangle3d;
import eu.printingin3d.javascad.models.*;
import eu.printingin3d.javascad.tranzitions.Difference;
import eu.printingin3d.javascad.tranzitions.Mirror;
import eu.printingin3d.javascad.tranzitions.Rotate;
import eu.printingin3d.javascad.tranzitions.Union;
import eu.printingin3d.javascad.models.Cylinder;

class Building extends Union {


    Building(){
        super(getModels());
    }

    private static List<Abstract3dModel> getModels(){
        List<Abstract3dModel> models = new ArrayList<Abstract3dModel>();

        Difference first = new Difference(
                new Cube(new Dims3d(50,100,25)).move(new Coords3d(0,0,12)),
                new Cube(new Dims3d(20,20,20)).move(new Coords3d(0,-58,0)),
                new Cube(new Dims3d(20,40,20)).move(new Coords3d(-33,10,0)),
                 new Cube(new Dims3d(20,10,4)).move(new Coords3d(-34.5,-45,5)),
                 new Cube(new Dims3d(20,10,4)).move(new Coords3d(-34.5,-34,5)),
                 new Cube(new Dims3d(20,10,4)).move(new Coords3d(-34.5,-23,5)),
                 new Cube(new Dims3d(20,10,4)).move(new Coords3d(-34.5,-45,14)),
                    new Cube(new Dims3d(20,10,4)).move(new Coords3d(-34.5,-34,14)),
                    new Cube(new Dims3d(20,10,4)).move(new Coords3d(-34.5,-23,14)),
                     new Cube(new Dims3d(20,10,4)).move(new Coords3d(-34.5,-12,14)),
                     new Cube(new Dims3d(20,10,4)).move(new Coords3d(-34.5,-1,14)),
                     new Cube(new Dims3d(20,10,4)).move(new Coords3d(-34.5,10,14)),
                     new Cube(new Dims3d(20,10,4)).move(new Coords3d(-34.5,21,14)),
                     new Cube(new Dims3d(20,10,4)).move(new Coords3d(-34.5,32,14)),
                     new Cube(new Dims3d(20,10,4)).move(new Coords3d(-34.5,43,14)),
                new Cube(new Dims3d(20,10,4)).move(new Coords3d(-34.5,-45,21)),
                new Cube(new Dims3d(20,10,4)).move(new Coords3d(-34.5,-34,21)),
                new Cube(new Dims3d(20,10,4)).move(new Coords3d(-34.5,-23,21)),
                new Cube(new Dims3d(20,10,4)).move(new Coords3d(-34.5,-12,21)),
                new Cube(new Dims3d(20,10,4)).move(new Coords3d(-34.5,-1,21)),
                new Cube(new Dims3d(20,10,4)).move(new Coords3d(-34.5,10,21)),
                new Cube(new Dims3d(20,10,4)).move(new Coords3d(-34.5,21,21)),
                new Cube(new Dims3d(20,10,4)).move(new Coords3d(-34.5,32,21))


        );
        models.add(first);

       Difference second = new Difference(
               new Cube(new Dims3d(50,104,15)).move(new Coords3d(0,-2,30)),
               new Cube(new Dims3d(44,9,8)).move(new Coords3d(0,-58,30)),
                new Cube(new Dims3d(20,10,4)).move(new Coords3d(-34.5,-41,26)),
                new Cube(new Dims3d(20,10,4)).move(new Coords3d(-34.5,-30,26)),
                new Cube(new Dims3d(20,10,4)).move(new Coords3d(-34.5,-19,26)),
                new Cube(new Dims3d(20,10,4)).move(new Coords3d(-34.5,-8,26)),
                new Cube(new Dims3d(20,10,4)).move(new Coords3d(-34.5,3,26)),
                new Cube(new Dims3d(20,10,4)).move(new Coords3d(-34.5,14,26)),
                new Cube(new Dims3d(20,10,4)).move(new Coords3d(-34.5,25,26)),
                new Cube(new Dims3d(20,10,4)).move(new Coords3d(-34.5,36,26)),
                new Cube(new Dims3d(20,10,4)).move(new Coords3d(-34.5,47,26)),
                new Cube(new Dims3d(20,0,4)).move(new Coords3d(-34.5,58,26)),
                    new Cube(new Dims3d(20,10,4)).move(new Coords3d(-34.5,-47,31)),
                    new Cube(new Dims3d(20,10,4)).move(new Coords3d(-34.5,-36,31)),
                            new Cube(new Dims3d(20,10,4)).move(new Coords3d(-34.5,-25,31)),
                                    new Cube(new Dims3d(20,10,4)).move(new Coords3d(-34.5,-14,31)),
                                            new Cube(new Dims3d(20,10,4)).move(new Coords3d(-34.5,-3,31)),
                                                    new Cube(new Dims3d(20,10,4)).move(new Coords3d(-34.5,8,31)),
                                                            new Cube(new Dims3d(20,10,4)).move(new Coords3d(-34.5,19,31)),
                                                                    new Cube(new Dims3d(20,10,4)).move(new Coords3d(-34.5,30,31)),
                                                                            new Cube(new Dims3d(20,10,4)).move(new Coords3d(-34.5,41,31))












                                                                                    );
       models.add(second);

       Union third = new Union(
               new Cube(new Dims3d(45,20,12)).move(new Coords3d(2.5,40,43)),
               new Cube(new Dims3d(40,20,12)).move(new Coords3d(5,40,53)),
               new Cube(new Dims3d(35,20,12)).move(new Coords3d(7.5,40,63)),
               new Cube(new Dims3d(30,20,12)).move(new Coords3d(10,40,73)),
               new Cube(new Dims3d(25,20,12)).move(new Coords3d(12.5,40,83)),
               new Cube(new Dims3d(10,18,6)).move(new Coords3d(10,40,90)));

       models.add(third);

      Difference fourth = new Difference(
              third,
              new Cube(new Dims3d(30,25,12)).move(new Coords3d(10,20,53))

      );
       models.add(fourth);

        return models;
    }


}