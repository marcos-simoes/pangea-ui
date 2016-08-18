package tech.msimoes.config;

import com.ocpsoft.pretty.faces.annotation.URLMapping;
import com.ocpsoft.pretty.faces.annotation.URLMappings;

import javax.enterprise.context.ApplicationScoped;

/**
 * @Author Marcos Simões - m12simoes@gmail.com
 */

@ApplicationScoped
@URLMappings(mappings = {
        @URLMapping(id = "home", pattern = "/",viewId = "home.xhtml"),
})
public class Application {
}
