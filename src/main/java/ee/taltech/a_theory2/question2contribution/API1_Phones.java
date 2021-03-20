package ee.taltech.a_theory2.question2contribution;

import ee.taltech.a_theory2.question2contribution.classes.Phone;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("phones")
public class API1_Phones {

    // todo this is contribution question
    //  this assignment is only for one team member (if this code is not committed by that team member how do I know this code was theirs?)

    // todo
    //  this assignment consists of 2 parts
    //  practical assignment A, B, C, D, E
    //     * All classes are available in classes package
    //     * If you want to test these practical assignments add these to your project.
    //       Example: If you Application.java is in the package ee.taltech, make sure theory is in package ee.taltech as well (ee.taltech.theory)
    //  theoretical assignment F, G, H

    //todo practical assignment
    // Management wants to define an API endpoint so frontend can display data about phones (think phone e-shop)
    // A Add necessary annotations to this class so this class can serve data
    // B Add a method to query all the phones (method content is not important - I am grading urls, annotations, names, and parameters)
    @GetMapping(value="/")
    public List<Phone> phones(@RequestParam Optional<Integer> year, @RequestParam Optional<String> manufacturer){
        return null;
    }
    // C Add a method to query a single phone by it's unique identifier (method content is not important - I am grading urls, annotations, names, and parameters)
    @GetMapping(value="/{id}")
    public Phone phone(@PathVariable Long id){
        return null;
    }
    // D Modify an existing method to query/filter phones by manufacturer while keeping existing functionality
    // E Modify an existing method to query/filter phones by release year while keeping existing functionality

    //todo theoretical assignment
    // F write pseudocode for saving a new phone (add annotations or http method names, urls, necessary parameters)
    /*
    @PostMapping(value="/createPhone")
    public void newPhone(@RequestBody Phone phone){
        Phone phone = new Phone(phone);
    }
    // G write pseudocode for updating existing phone (add annotations or http method names, urls, necessary parameters)
    @PostMapping(value="/updatePhone")
    public void updatePhone(@PathVariable long id, @RequestBody Phone phone){
        Phone toUpdate = getPhone(id);
        toUpdate = phone;
    }
    // H write pseudocode for deleting a phone (add annotations or http method names, urls, necessary parameters)
    @PostMapping(value="/deletePhone")
    public void deletePhone(@PathVariable long id){
        deletePhone(getPhone(id));
    }
     */
}
