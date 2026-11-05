package com.example.session.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import jakarta.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AttributeController {

    @GetMapping("/session/attributes")
    public String attributes(

            @RequestParam(required = false) String attrib_name,
            @RequestParam(required = false) String attrib_value,
            @RequestParam(required = false) String attrib_remove,

            HttpSession session,
            Model model) {

        // Remove Attribute
        if ("on".equals(attrib_remove)) {

            if (attrib_name != null && !attrib_name.isBlank()) {
                session.removeAttribute(attrib_name);
            }

        } else {

            // Add/Update Attribute
            if (attrib_name != null &&
                    !attrib_name.isBlank() &&
                    attrib_value != null &&
                    !attrib_value.isBlank()) {

                session.setAttribute(attrib_name, attrib_value);
            }
        }

        // Collect all attributes

        Map<String, Object> attributes = new LinkedHashMap<>();

        session.getAttributeNames().asIterator()
                .forEachRemaining(name ->
                        attributes.put(name, session.getAttribute(name)));

        model.addAttribute("attributes", attributes);

        return "attributes";
    }
}