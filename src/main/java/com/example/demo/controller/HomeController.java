package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@Controller
public class HomeController
{
    @Autowired
    UserService userService;

    @Autowired
    PurchaseService purchaseService;

    @Autowired
    CompanyService companyService;

    @Autowired
    PartnerService partnerService;

    @Autowired
    VendorService vendorService;

    @Autowired
    SaleService saleService;

    @RequestMapping("/")
    public String firstRequest() {
        return "index";
    }
    @RequestMapping("/loginPage")
    public String loginpage() {
        return "signup";
    }

    @RequestMapping("/home")
    public String home() {
        return "home";
    }

    @RequestMapping("/newsh")
    public String newsh(Model model) {
        model.addAttribute("id",saleService.nextSaleId());
        model.addAttribute("listCompany",companyService.getCompany());
        return "newsale";
    }

    @RequestMapping("/manag")
    public String manag() {
        return "manag";
    }

    @RequestMapping("/saledet")
    public String saledet() {
        return "saledet";
    }

    @RequestMapping("/expe")
    public String expe(Model model) {
        model.addAttribute("listVendor",vendorService.getVendor());
        return "exp";
    }

    @RequestMapping("/expedet")
    public String expedet() {
        return "expdet";
    }

    @RequestMapping("/newcom")
    public String newcom(Model model) {
        long l=companyService.nextCompanyId();
        model.addAttribute("id",l);
        return "newcom";
    }

    @RequestMapping("/comdet")
    public String comdet() {
        return "comdet";
    }

    @RequestMapping("/shar")
    public String shar(Model model)
    {
        model.addAttribute("listPartner",partnerService.getPartner());
        return "shar";
    }

    @RequestMapping("/shardet")
    public String shardet() {
        return "shardet";
    }

    @RequestMapping("/debdet")
    public String debdet() {
        return "debdet";
    }

    @RequestMapping("/debenture")
    public String debenture() {
        return "debenture";
    }

    @RequestMapping("/partn")
    public String partn(Model model) {
        long l= partnerService.nextPartnerId();
        model.addAttribute("id",l);
        return "partn";
    }

    @RequestMapping("/partndet")
    public String partndet() {
        return "partndet";
    }

    @RequestMapping("/ven")
    public String ven(Model model) {
        long l=vendorService.nextVendorId();
        model.addAttribute("id",l);
        return "ven";
    }

    @RequestMapping("/vendet")
    public String vendet() {
        return "vendet";
    }

    @RequestMapping("/purdetails")
    public String purdetails(Model model)
    {
        return "purdetails";
    }


    @RequestMapping("/newpurchase")
    public String newpurchase(Model model)
    {
        model.addAttribute("purchaseId",purchaseService.nextPurchaseId());
        model.addAttribute("listCompany",companyService.getCompany());
        return "newpurchase";
    }

    @PostMapping("/purd")
    public String PurchaseFilter(@RequestParam("drop")String option, @RequestParam("cred")String value, Model model)
    {

        if(value.equals("")&&!option.equalsIgnoreCase("All"))
        {
            model.addAttribute("msg","Value can Not be Empty");
            return "purdetails";
        }
       List<Purchase> purchaseList= purchaseService.getPurchaseBasedOnOption(option, value);
       model.addAttribute("purchase",purchaseList);
        return "purdetails";
    }
    @PostMapping("/sald")
    public String SaleFilter(@RequestParam("drop")String option, @RequestParam("cred")String value, Model model)
    {

        if(value.equals("")&&!option.equalsIgnoreCase("All"))
        {
            model.addAttribute("msg","Value can Not be Empty");
            return "saledet";
        }
        List<Sale> saleList= saleService.getsaleBasedOnOption(option, value);
        model.addAttribute("sale",saleList);
        return "saledet";
    }

    @PostMapping("/login")
    public String loginValidation(@RequestParam("user")String username,@RequestParam("pass")String password)
    {
        User user=userService.getUser().get(0);
        if(user.getUsername().equalsIgnoreCase(username)&&user.getPassword().equals(password))
        {
            return "home";
        }
     else
        {
            return "login";
        }
    }


    @PostMapping("/register")
    public String addUser(@RequestParam("user")String username,@RequestParam("pass")String password)
    {
        User user=new User();
        user.setUsername(username);
        user.setPassword(password);
        userService.save(user);
        return "login";
    }
    @PostMapping("/pur")
    public String addPurchase(@RequestParam("iid")String invoice,@RequestParam("pid")String productid,@RequestParam("buyer")String buyer,@RequestParam("date")String date,@RequestParam("goods")String goods,@RequestParam("amt")String amt)
    {
        Purchase p=new Purchase();
        p.setDate(LocalDate.parse(date));
        p.setGoods(goods);
        p.setInvoice(Integer.parseInt(invoice));
        p.setPurchaseFrom(buyer);
        p.setamt(Long.parseLong(amt));
        purchaseService.save(p);
        return "purdetails";
    }
    @PostMapping("/sal")
    public String addsale(@RequestParam("iid")String invoice,@RequestParam("sid")String saleid,@RequestParam("com")String com,@RequestParam("date")String date,@RequestParam("goods")String goods,@RequestParam("amt")String amt)
    {
        Sale s=new Sale();
        s.setDate(LocalDate.parse(date));
        s.setGoods(goods);
        s.setInvoice(Integer.parseInt(invoice));
        s.setSoldto(com);
        s.setAmt(Long.parseLong(amt));
        saleService.save(s);
        return "saledet";
    }

    @PostMapping("/addCompany")
    public String addCompany(@RequestParam("cid")String cid,@RequestParam("address")String address,@RequestParam("name")String name,@RequestParam("gst")String gst)
    {
        Company c = new Company();
        c.setAddress(address);
        c.setGst(gst);
        c.setName(name);
        companyService.save(c);
        return "comdet";
    }
    @PostMapping("/addpartner")
    public String addpartner(@RequestParam("pid")String pid, @RequestParam("name")String name, @RequestParam("dob") Date dob, @RequestParam("ph_number")Long ph_number,@RequestParam("add")String add)
    {
        Partner p = new Partner();
        p.setName(name);
        p.setDob(dob);
        p.setPh_number(ph_number);
        p.setAddress(add);
        partnerService.save(p);
        return "partn";
    }
    @PostMapping("/addVendor")
    public String addVendor(@RequestParam("vid")String vid, @RequestParam("name")String name, @RequestParam("ph_number")Long ph_number,@RequestParam("add")String add)
    {
        Vendor v = new Vendor();
        v.setName(name);
        v.setPh_number(ph_number);
        v.setAddress(add);
        vendorService.save(v);
        return "vendet";
    }


    @PostMapping("/upload")
    public String handleFileUpload(@RequestParam("file") MultipartFile file) {
        return "redirect:/";
    }
}

