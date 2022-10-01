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
    @GetMapping("/cau4")
    public List<ChuyenBay> cau4() {
        return chuyenbayRepository.findChuyenBayDoDaiHon8000andNhoHon10000();
    }
    @GetMapping("/cau5")
    public List<ChuyenBay> cau5() {
        return chuyenbayRepository.findChuyenBayCau5("SGN","BMV");
    }
    @GetMapping("/cau6")
    public int cau6() {
        return chuyenbayRepository.sochuyenBayXuatPhatSaiGon("SGN");
    }
    @GetMapping("/cau14")
    public List<String> cau14() {
        return chuyenbayRepository.chuyenbaythuchienByAirbusA320();
    }
}
