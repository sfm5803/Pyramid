package Pyramid.Controller;

import Pyramid.Service.PyramidService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * This class accepts the word as input, returns if the word is pyramid or not by calling checkForPyramid() method in PyramidService class
 * returns true (if the word is a pyramid)
 * returns false (if the word is not a pyramid)
 * Created By- Suramya Mishra
 */

@RestController
@RequestMapping("/pyramid")
public class PyramidController {
    private PyramidService pyramidService;
    public PyramidController(PyramidService pyramidService) {
        this.pyramidService = pyramidService;
    }
    @RequestMapping("/{word}")
    public boolean checkWord(@PathVariable String word) {
        boolean isPyramid = pyramidService.checkForPyramid(word);
        return isPyramid;
    }
}