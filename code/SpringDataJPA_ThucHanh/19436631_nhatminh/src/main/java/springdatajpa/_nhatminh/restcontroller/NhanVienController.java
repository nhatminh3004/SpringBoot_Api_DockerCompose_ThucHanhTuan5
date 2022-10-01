package springdatajpa._nhatminh.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springdatajpa._nhatminh.entity.MayBay;
import springdatajpa._nhatminh.entity.NhanVien;
import springdatajpa._nhatminh.repository.MayBayRepository;
import springdatajpa._nhatminh.repository.NhanVienRepository;

import java.util.List;

@RestController
public class NhanVienController {
    @Autowired
    private NhanVienRepository nhanVienService;

    @GetMapping("/cau3")
    public List<NhanVien>  cau3() {
        return  nhanVienService.findNhanVienLuongNhoHon10000() ;
    }
}
