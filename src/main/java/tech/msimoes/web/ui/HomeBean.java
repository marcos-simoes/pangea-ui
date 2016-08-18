package tech.msimoes.web.ui;

import java.util.Arrays;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * @Author Marcos Simões - m12simoes@gmail.com
 */

@RequestScoped
@Named("homeBean")
public class HomeBean {
    private final List<String> example = Arrays.asList("Test","Dog","Car");

    private String searchInput;



    public String getSearchInput() {
        return searchInput;
    }

    public void setSearchInput(String searchInput) {
        this.searchInput = searchInput;
    }

    public List<String> getSuggestionsFor(final String input){
        return example;
    }
}
