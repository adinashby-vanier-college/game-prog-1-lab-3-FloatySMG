// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class CrabWorld here.
 * @author (your name) @version (a version number or a date)
 */
public class CrabWorld extends World
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Constructor for objects of class CrabWorld.
     */
    public CrabWorld()
    {
        super(560, 560, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab =  new  Crab();
        addObject(crab, 242, 463);
        Worm worm =  new  Worm();
        addObject(worm, 414, 239);
        Worm worm2 =  new  Worm();
        addObject(worm2, 297, 167);
        Worm worm3 =  new  Worm();
        addObject(worm3, 148, 311);
        Worm worm4 =  new  Worm();
        addObject(worm4, 82, 137);
        Worm worm5 =  new  Worm();
        addObject(worm5, 428, 96);
        Worm worm6 =  new  Worm();
        addObject(worm6, 181, 76);
        Worm worm7 =  new  Worm();
        addObject(worm7, 350, 380);
        Lobster lobster =  new  Lobster();
        addObject(lobster, 328, 142);
        lobster.setLocation(379, 145);
        Lobster lobster2 =  new  Lobster();
        addObject(lobster2, 324, 455);
        Lobster lobster3 =  new  Lobster();
        addObject(lobster3, 275, 228);
        lobster3.setLocation(275, 228);
        crab.setLocation(91, 489);
        Worm worm8 =  new  Worm();
        addObject(worm8, 472, 322);
        Worm worm9 =  new  Worm();
        addObject(worm9, 467, 149);
        Worm worm10 =  new  Worm();
        addObject(worm10, 196, 372);
        Worm worm11 =  new  Worm();
        addObject(worm11, 143, 218);
        Worm worm12 =  new  Worm();
        addObject(worm12, 444, 438);
        Worm worm13 =  new  Worm();
        addObject(worm13, 206, 472);
    }
}
