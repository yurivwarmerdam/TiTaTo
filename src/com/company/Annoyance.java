package com.company;

import javax.lang.model.element.NestingKind;

/**
 * Created by Gebruiker on 4/23/2016.
 */
public class Annoyance {
    private int annoyance =0;
     public String shout(){
         if (annoyance == 0){
             annoyance++;
             return "try again. I know you didn't mean to mess up.";
         }
         else if (annoyance == 1){
             annoyance++;
             return "Come on, pay a little more attention to what you're typing.";
         }
         else if (annoyance == 2){
             annoyance++;
             return "You realize I'm trying to be patient here, don't you? just play the game right.";
         }
         else if (annoyance == 3){
             annoyance++;
             return "Real mature. A number between 1 and 9 is not hard to come up with, Dickhead.";
         }
         else{
             annoyance++;
             return "stop being clever, asshole. Try again:";
         }
     }
}
