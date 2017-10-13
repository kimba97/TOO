
package controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller()
public class InicioControlador {
    
    @RequestMapping("inicio.htm")
    public ModelAndView inicio()
    {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("inicio");
        return mav;
    } 
}
