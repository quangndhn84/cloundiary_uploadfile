package ra.uf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import ra.uf.dto.EmpRequest;
import ra.uf.model.Employee;
import ra.uf.service.UploadFileService;

import java.io.IOException;
@Controller
@RequestMapping("employeeController")
public class EmployeeController {
    @Autowired
    private UploadFileService uploadFileService;

    @GetMapping("/initCreate")
    public String initCreate(Model model) {
        model.addAttribute("emp", new EmpRequest());
        return "newEmployee";
    }

    @PostMapping("/create")
    public String createEmp(EmpRequest emp) throws IOException {
        String avatarLink = uploadFileService.uploadFile(emp.getAvatar());
        System.out.println("LINK ẢNH: " + avatarLink);
        return "employees";
    }
}
