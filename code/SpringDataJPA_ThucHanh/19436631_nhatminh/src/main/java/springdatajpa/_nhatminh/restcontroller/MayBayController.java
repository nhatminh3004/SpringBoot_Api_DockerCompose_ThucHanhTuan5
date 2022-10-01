package springdatajpa._nhatminh.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import springdatajpa._nhatminh.entity.ChuyenBay;
import springdatajpa._nhatminh.entity.MayBay;
import springdatajpa._nhatminh.repository.ChuyenbayRepository;
import springdatajpa._nhatminh.repository.MayBayRepository;


import java.util.List;

@RestController
public class MayBayController {
    @Autowired
    private MayBayRepository mayBays;

    @GetMapping("/cau2")
    public List<MayBay>  cau2() {
        return  mayBays.findMayBayTamBayHon10000() ;
    }
    @GetMapping("/cau7")
    public int  cau7() {
        return  mayBays.findSoMayBayBoeing() ;
    }
    @GetMapping("/cau11")
    public List<String> cau11() {
        return  mayBays.maMayBayNhanVienHoNGUYENLAI();
    }
}
