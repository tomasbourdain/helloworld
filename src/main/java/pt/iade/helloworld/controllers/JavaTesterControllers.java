package pt.iade.helloworld.controllers;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.iade.helloworld.models.CurricularUnit;


@RestController
@RequestMapping(path="/api/java/tester/")
public class JavaTesterControllers {
    private Logger logger = LoggerFactory.getLogger(JavaTesterControllers.class);

    @GetMapping(path = "/access/{student}/{covid}", produces= MediaType.APPLICATION_JSON_VALUE) 
    public boolean getGreeting(@PathVariable("student") boolean isStudent,
                               @PathVariable("covid") boolean hasCovid) {
        if (isStudent && !(hasCovid)) {
            return true ;
        } else { 
            return false ;
        }
    }
    
    @GetMapping(path = "/required/{student}/{temperature}/{classType}", produces= MediaType.APPLICATION_JSON_VALUE) 
    public boolean getRequired(@PathVariable("student") boolean isStudent,
                               @PathVariable("temperature") double hasCovid,
                               @PathVariable("classType") String type) {  
        if (isStudent && (34.5 < hasCovid) && (hasCovid> 37.5) && type =="presential" ){
            return true;
        } else {
            return false;
        }
    }  
                                   
    @GetMapping(path = "/evacuation/{fire}/{numberOfCovids}/{powerShutdown}/{comeBackTime}", produces= MediaType.APPLICATION_JSON_VALUE) 
    public boolean getBuilding(@PathVariable("fire") boolean hasFire,
                               @PathVariable("numberOfCovids") double numCovid,
                               @PathVariable("powerShutdown") boolean isPwShut,
                               @PathVariable("comeBackTime") int backTime) { 
        if (((hasFire) && (numCovid > 5))  ||  ((isPwShut) && (backTime > 15))){
            return true;
        }else{
            return false;
        }
                         


    @GetMapping(path = "/author/{name}/{classnum}/{height}/{fanball}/{clubcolor}", produces= MediaType.APPLICATION_JSON_VALUE) 
    public String getAuthor(@PathVariable("name") String name, 
                            @PathVariable("classnum") Number classnum, 
                            @PathVariable("height") Number height ,
                            @PathVariable("fanball") char fanball ,
                            @PathVariable("clubcolor") char clubcolor, 
                            String MyText) {
        MyText = "Done by " + name + " with number " + classnum + ".";
        MyText=MyText +"I am " + height + " tall";
        if (fanball == 'n') {
            MyText=MyText + " and not a fan of football." ;
        } else if (fanball == 'y'){
            MyText=MyText+" and I am a fan of football." ;
            if (clubcolor == 'r') {
                MyText=MyText + "My Favourite club is Benfica." ;
            } else if (clubcolor == 'g')  {
                MyText=MyText + "My Favourite club is Sporting Clube Portugal.";
            } else if (clubcolor == 'b')  {
                MyText=MyText +"My Favourite club is Porto.";
            }
        }
 
        logger.info(MyText); 
        return MyText;
}


    private ArrayList<CurricularUnit> units = new ArrayList<CurricularUnit>();

    @PostMapping(path = "/units")
    public CurricularUnit saveUnit(@RequestBody CurricularUnit unit) {
        logger.info("Added unit "+unit.getName());
        units.add(unit);
        return unit;
    }
}
