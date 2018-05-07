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
            Union first = new Union(
                    new Cube(new Dims3d(50,50,20)).move(new Coords3d(0,0,10)),
                    new Prism(60,35.4,30,4).move(new Coords3d(0,0,45)).rotate(Angles3d.zOnly(45)),
                    new Cylinder(3,7).rotate(Angles3d.xOnly(90)).move(new Coords3d(0,22,74)),
                    new Cylinder(3,7).rotate(Angles3d.xOnly(90)).move(new Coords3d(0,-22,74)),
                    new Cylinder(3,7).rotate(Angles3d.yOnly(90)).move(new Coords3d(22,0,74)),
                    new Cylinder(3,7).rotate(Angles3d.yOnly(90)).move(new Coords3d(-22,0,74)),
                    new Cube(new Dims3d(42,42,8)).move(new Coords3d(0,0,77))
            );
            models.add(first);
            Union second = new Union(


                    new Prism(40,33,26,4).rotate(Angles3d.zOnly(45)).rotate(Angles3d.xOnly(180)).move(new Coords3d(0,0,100)),
                    new Prism(40,33,26,4).rotate(Angles3d.zOnly(45)).rotate(Angles3d.xOnly(180)).move(new Coords3d(0,0,140)),
                    new Prism(40,33,26,4).rotate(Angles3d.zOnly(45)).rotate(Angles3d.xOnly(180)).move(new Coords3d(0,0,180)),
                    new Prism(40,33,26,4).rotate(Angles3d.zOnly(45)).rotate(Angles3d.xOnly(180)).move(new Coords3d(0,0,220)),
                    new Prism(40,33,26,4).rotate(Angles3d.zOnly(45)).rotate(Angles3d.xOnly(180)).move(new Coords3d(0,0,260)),
                    new Prism(40,33,26,4).rotate(Angles3d.zOnly(45)).rotate(Angles3d.xOnly(180)).move(new Coords3d(0,0,300)),
                    new Prism(40,33,26,4).rotate(Angles3d.zOnly(45)).rotate(Angles3d.xOnly(180)).move(new Coords3d(0,0,340)),
                    new Prism(40,33,26,4).rotate(Angles3d.zOnly(45)).rotate(Angles3d.xOnly(180)).move(new Coords3d(0,0,380))
            );
            models.add(second);
            Union third = new Union(
                    new Cube(new Dims3d(35,35,8)).move(new Coords3d(0,0,400)),
                    new Cube(new Dims3d(25,25,8)).move(new Coords3d(0,0,406)),
                    new Prism(25,5,8,4).move(new Coords3d(0,0,420)).rotate(Angles3d.zOnly(45)),
                    new Prism(5,5,3,4).move(new Coords3d(0,0,434)).rotate(Angles3d.zOnly(45)),
                    new Prism(40,2,0.5,4).move(new Coords3d(0,0,440)).rotate(Angles3d.zOnly(45))
            );
            models.add(third);
        return models;
    }


}