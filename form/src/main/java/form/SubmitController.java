package form;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SubmitController {

    @RequestMapping(value="/invoice", method=RequestMethod.GET)
    public String greetingForm(Model model) {
        model.addAttribute("invoice", new Invoice());
        return "invoice";
    }

    @RequestMapping(value="/invoice", method=RequestMethod.POST)
    public String formSubmit(@ModelAttribute Invoice invoice, Model model) {
        model.addAttribute("invoice", invoice);
        //tu planowałem obsłużyć dodawanie danych z obietku typu Invoice do bazy danych po uprzedniej konfiguracji
        //hibernate'a ale zatrzymał mnie problem z konfiguracją Tomcata.
        return "invoice";
    }

}
