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
    @GetMapping("/cau8")
    public int  cau8() {
        return  nhanVienService.tongsoluongtraNhanVien() ;
    }
    @GetMapping("/cau9")
    public List<String>  cau9() {
        return  nhanVienService.manhanvienLaiMayBayBoeing() ;
    }
    @GetMapping("/cau10")
    public List<NhanVien>  cau10() {
        return  nhanVienService.findNhanVienBoeing747() ;
    }
    @GetMapping("/cau12")
    public List<String>  cau12() {
        return  nhanVienService.findMaSoPhiCongBoeingAndAirbus() ;
    }
}
