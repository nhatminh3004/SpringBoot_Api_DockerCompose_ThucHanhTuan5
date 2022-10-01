package springdatajpa._nhatminh.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springdatajpa._nhatminh.entity.MayBay;
import springdatajpa._nhatminh.entity.NhanVien;
import springdatajpa._nhatminh.repository.MayBayRepository;
import springdatajpa._nhatminh.repository.NhanVienRepository;

import java.util.ArrayList;
import java.util.HashMap;
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
    @GetMapping("/cau15")
    public List<String>  cau15() {
        return  nhanVienService.findTenPhiCongLaiBoeing();
    }
    @GetMapping("/cau22")
    public List<String>  cau22() {
        return  nhanVienService.findNhanVienLaiDuoc3LoaiMayBay();
    }
    @GetMapping("/cau23")
    public List <HashMap<String, Object>> cau23() {
        List<Object[]> listObject= nhanVienService.cau23();
        List <HashMap<String,Object>> giaTriReturn =new ArrayList<>();
        for (Object[] obj : listObject){
            HashMap<String,Object> tempMap =new HashMap<>();
            tempMap.put("Mã phi công :",obj[0]);
            tempMap.put("Tầm bay lớn nhất  :",obj[1]);
            tempMap.put("Loại máy bay:",obj[2]);
            giaTriReturn.add(tempMap);
        }
        return giaTriReturn;
    }

}
