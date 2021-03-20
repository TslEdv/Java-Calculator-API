package ee.taltech.a_theory2.question2contribution;

import ee.taltech.a_theory2.question2contribution.classes.Cake;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

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
    @GetMapping(value = "/")
    public List<Cake> cakes (@RequestParam Optional<String> name, @RequestParam Optional<String> weight){
        return null;
    }
    @GetMapping( value = "/{id}")
    public Cake cake(@RequestParam Long id){
         return null;
    }
    //todo theoretical assignment
    // F write pseudocode for saving a new cake (add annotations or http method names, urls, necessary parameters)
    // @PostMapping (value = "/bakecake")
    // public Cake bakeCake(@RequestBody Cake cake){
    //      return cakeRepository.save(cake);
    // }
    // G write pseudocode for updating existing cake (add annotations or http method names, urls, necessary parameters)
    // @PutMapping (value = "/oldcakerefreshed")
    // public Cake oldCake(@PathVariable Long id, @RequestBody Cake cakeDetails){
    //      Cake cake = cakeRepository.findById(id);
    //      cake.setName(cakeDetails.getName());
    //      cake.setSweetness(cakeDetails.getSweetness());
    //      cake.setSize(cakeDetails.getSize());
    //      cake.setWeight(cakeDetails.getWeight());
    //      cake.setRating(cakeDetails.getRating());
    //      final Cake updatedCake = cakeRepository.save(cake);
    //      return ResponseEntity.ok(updatedCake);
    // }
    // H write pseudocode for deleting a cake (add annotations or http method names, urls, necessary parameters)
    // @DeleteMapping ( value = "/eatcake/{id}")
    // public Map<String, Boolean> oldCake(@PathVariable Long id){
    //      Cake cake = cakeRepository.findById(id);
    //      cakeRepository.delete(cake);
    //      Map<String, Boolean> response = new HashMap<>();
    //      response.put("deleted", Boolean.TRUE);
    //      return response;
    // }
}
