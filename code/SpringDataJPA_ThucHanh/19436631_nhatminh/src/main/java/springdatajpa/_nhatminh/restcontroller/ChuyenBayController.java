package springdatajpa._nhatminh.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springdatajpa._nhatminh.entity.ChuyenBay;
import springdatajpa._nhatminh.repository.ChuyenbayRepository;

import java.util.List;

@RestController
public class ChuyenBayController {
    @Autowired
    private ChuyenbayRepository chuyenbayRepository;

    @GetMapping("/cau1")
    public List<ChuyenBay> cau1() {
        return chuyenbayRepository.findChuyenBayDiDaLat("DAD");
    }
}
