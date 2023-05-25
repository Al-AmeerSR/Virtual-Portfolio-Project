package com.example.task3.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.task3.crud.model.ContactForm;



@Controller
@EnableAutoConfiguration
public class Testcontroller {

	@Autowired
    private JavaMailSender mailSender;
	@RequestMapping("/")
	public String displays(Model model) {
		model.addAttribute("contactForm", new ContactForm());
		return"index";
	}
	@RequestMapping("/success")
	public String displays1(Model model) {
		model.addAttribute("contactForm", new ContactForm());
		return"success";
	}
	@PostMapping("/sendEmail")
    public String sendEmail( @ModelAttribute("contactForm") ContactForm contactForm, Model model)throws MailException {
        
            // Create a SimpleMailMessage and set the relevant information
            SimpleMailMessage message = new SimpleMailMessage();
            message.setTo("iamameer37@gmail.com"); // Set your email address here
            message.setSubject("New message from " + contactForm.getUsername());
            message.setText(contactForm.getMessage()+ "\n\nFrom: " + contactForm.getEmail());

            // Send the email
            mailSender.send(message);
           
            model.addAttribute("successMessage", "Your message has been sent successfully!");
            return "success";
     
    }
}
