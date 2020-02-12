package Pyramid.Service;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * This class checks if the word entered by the user is a pyramid
 * returns true (if the word is a pyramid)
 * returns false (if the word is not a pyramid)
 * Created By- Suramya Mishra
 */

@Service
public class PyramidService {

    public boolean checkForPyramid(String str) {
        HashSet<String> chars = new HashSet<>(Arrays.asList(str.split("")));
        ArrayList<Integer> counter = new ArrayList<>();
        chars.forEach((s) -> {
                    int count = StringUtils.countOccurrencesOf(str, s);
                    counter.add(count);
                });
        if(chars.size() == counter.size()) {
            for (int i = 1; i < chars.size() + 1; i++) {
                if(!counter.contains(i)) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }
}