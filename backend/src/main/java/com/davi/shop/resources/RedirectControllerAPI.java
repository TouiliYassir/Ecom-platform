package com.davi.shop.resources;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

public interface RedirectControllerAPI {

    RedirectView redirectWithUsingRedirectView(
            RedirectAttributes attributes);

}
