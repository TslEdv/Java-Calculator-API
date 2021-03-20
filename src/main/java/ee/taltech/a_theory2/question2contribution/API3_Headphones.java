package ee.taltech.a_theory2.question2contribution;

import ee.taltech.a_theory2.question2contribution.classes.Headphone;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
    public List<Headphone> headphones(@RequestParam Optional<String> price, @RequestParam Optional<String> anc){
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
    // @PostMapping (value = "/createHeadphone")
    // public Headphone (@RequestBody Headphone headphone){
    // return headphone.Repository.save(headphone);
    // }
    // G write pseudocode for updating existing pair of headphones (add annotations or http method names, urls, necessary parameters)
    /*@PutMapping(value = "/updateHeadphone")
      public Headphone updateHeadphone(@PathVariable Long id, @RequestBody Headphone headphone.Details){
        Headphone headphone = headphone.Repository.findById(id);
        headphone.setManufacturer(headphone.Details.getManufacturer());
        headphone.setPrice(headphone.Details.getPrice);
        headphone.setRating(headphone.Details.getRating());
        headphone.setAnc(headphone.Details.getAnc());
        headphone.setReleaseYear(headphone.Details.getReleaseYear());
        final Headphone updateHeadphone = headphoneRepository.save(headphone);
        return ResponseEntity.ok(updateHeadphone);
    }
     */
    // H write pseudocode for deleting a pair of headphones (add annotations or http method names, urls, necessary parameters)
    /* @DeleteMapping(value = "/removeHeadphone")
    public Map<String, Boolean>  deleteHeadphone(@PathVariable Long id){
        Headphone headphone = headphoneRepository.findById(id);
        headphoneRepository.delete(headphone);
         Map<String, Boolean> response = new HashMap<>();
         response.put("delete", Boolean.TRUE);
         return response;
    }
    */
    //
    //
}
