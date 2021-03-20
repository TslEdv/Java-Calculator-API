package ee.taltech.a_theory2.question2contribution;

import ee.taltech.a_theory2.question2contribution.classes.Headphone;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("headphones")
public class API3_Headphones {

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
    // Management wants to define an API endpoint so frontend can display data about headphones (think headphones e-shop)
    // A Add necessary annotations to this class so this class can serve data
    // B Add a method to query all the headphones (method content is not important - I am grading urls, annotations, names, and parameters)
    @GetMapping(value = "/")
    public List<Headphone> headphones(@RequestParam String price, @RequestParam String anc){
        return null;
    }
    // C Add a method to query a single headphones by it's unique identifier (method content is not important - I am grading urls, annotations, names, and parameters)
    @GetMapping(value ="/{id}")
    public Headphone headphone(@PathVariable Long id){
        return null;
    }
    // D Modify an existing method to query/filter headphones by price while keeping existing functionality (price can be a string)

    // E Modify an existing method to query/filter anc (active noise cancellation) while keeping existing functionality (anc can be a string)

    //todo theoretical assignment
    // F write pseudocode for saving a new pair of headphones (add annotations or http method names, urls, necessary parameters)
    // @GetMapping(value = "/createHeadphone")
    // public void createHeadphone(@RequestParam  String manufacturer, String price, String anc, String rating, String releaseYear){
    // }
    // G write pseudocode for updating existing pair of headphones (add annotations or http method names, urls, necessary parameters)
    /* @GetMapping(value = "/updateHeadphone")
      public void updateHeadphone(@RequestParam Long id, Optional<String> manufacturer, Optional<String> price, Optional<String> anc, Optional<String> rating, Optional<String> releaseYear){
        Headphone headphone = new Headphone();
        headphone.setPrice(price);
        headphone.setAnc(anc);
        headphone.setRating(rating);
        headphone.setReleaseYear(releaseYear);
        headphone.setManufacturer(manufacturer);

    }
     */
    // H write pseudocode for deleting a pair of headphones (add annotations or http method names, urls, necessary parameters)
    /* @GetMapping(value = "/removeHeadphone")
    public void removeHeadphone(@RequestParam Long id){
        removeHeadphone(getHeadphone(id));
    }
    */
    //
    //
}
