package online.mengxun.server.controller;


import online.mengxun.server.dto.AdminDTO;
import online.mengxun.server.repository.AdminRepository;
import online.mengxun.server.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminRepository adminRepository;


    //注册一个admin账号
    @PostMapping("/")
    public Response registerAdminAccount(@RequestBody AdminDTO.RegisterAdmin formBody){
        try{
            System.out.println(formBody.toString());
            return Response.success(formBody);
        }catch (Exception e){
            e.printStackTrace();
            return Response.error("Unknown Error Happened");
        }
    }
}
