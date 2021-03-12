package ee.taltech.a_theory2.question2contribution;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cakes")
public class API2_Cakes {

    // todo this is contribution question
    //  this assignment is only for one team member (if this code is not committed by that team member how do I know this code was theirs?)

    // todo
    //  this assignment consists of 2 parts
    //  practical assignment A, B, C, D, E
    //          All classes are available in classes package
    //          If you want to test these practical assignments add these to your project.
    //          Example: If you Application.java is in the package ee.taltech, make sure theory is in package ee.taltech as well (ee.taltech.theory)
    //  theoretical assignment F, G, H

    //todo practical assignment
    // Management wants to define an API endpoint so frontend can display data about cakes (think cake e-shop)
    // A Add necessary annotations to this class so this class can serve data
    // B Add a method to query all the cakes (method content is not important - I am grading urls, annotations, names, and parameters)
    // C Add a method to query a single cake by it's unique identifier (method content is not important - I am grading urls, annotations, names, and parameters)
    // D Modify an existing method to query/filter cakes by weight while keeping existing functionality
    // E Modify an existing method to query/filter cakes by name while keeping existing functionality
    // @GetMapping(value = "/")
    // public List <Cake> cakes (@RequestParam Optional<String> name, Optional<String> weight){
    //      if ((name == null || name == "") && (weight == null || weight == "")){
    //          return null;
    //      }
    //      else if ((name == null || name == "") && (!weight.isEmpty()){
    //          return findCake(weight);
    //      }
    //      else if ((weight == null || weight == "") && (!name.isEmpty()){
    //          return findCake(name);
    //      }
    //      else{
    //          return findCake(name, weight);
    //      }
    // }
    // @GetMapping( value = "/cakeid")
    // public Cake cake(@RequestParam Long id){
    //      return cake.getCake(id);
    // }
    //todo theoretical assignment
    // F write pseudocode for saving a new cake (add annotations or http method names, urls, necessary parameters)
    // @GetMapping ( value = "/bakecake")
    // public Cake bakeCake(@RequestParam Long id, String name, String sweetness, String size, String weight, String rating){
    //      Cake freshcake = new Cake();
    //      freshcake.setId(id);
    //      freshcake.setName(name);
    //      freshcake.setSweetness(sweetness);
    //      freshcake.setSize(size);
    //      freshcake.setWeight(weight);
    //      freshcake.setRating(rating);
    //      return freshcake;
    // }
    // G write pseudocode for updating existing cake (add annotations or http method names, urls, necessary parameters)
    // @GetMapping ( value = "/oldcake")
    // public void oldCake(@RequestParam Long id, Optional<String> name, Optional<String> sweetness, Optional<String> size, Optional<String> weight, Optional<String> rating){
    //      Cake oldcake = getCake(id);
    //      oldcake.setId(id);
    //      oldcake.setName(name);
    //      oldcake.setSweetness(sweetness);
    //      oldcake.setSize(size);
    //      oldcake.setWeight(weight);
    //      oldcake.setRating(rating);
    // }
    // H write pseudocode for deleting a cake (add annotations or http method names, urls, necessary parameters)
    // @GetMapping ( value = "/eatcake")
    // public void oldCake(@RequestParam Long id){
    //      delete(getCake(id));
    // }
}
