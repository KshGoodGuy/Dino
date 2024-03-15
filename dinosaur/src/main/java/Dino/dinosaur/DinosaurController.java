package Dino.dinosaur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DinosaurController {

    @Autowired
    private DinosaurManager dinosaurManager;

    @GetMapping("/dinosaurs")
    public String listDinosaurs(Model model) {
        List<Dinosaur> dinosaurs = dinosaurManager.getAllDinosaurs();
        model.addAttribute("dinosaurs", dinosaurs);
        return "dinosaurs/list";
    }

    @GetMapping("/dinosaurs/{name}")
    public String showDinosaurProfile(@PathVariable String name, Model model) {
        List<Dinosaur> dinosaur = dinosaurManager.findDinosaurByName(name);
        if (dinosaur == null) {
            // 공룡을 찾을 수 없는 경우 에러 처리
            return "error"; // 에러 페이지로 리다이렉트 또는 에러 메시지를 보여줄 수 있습니다.
        }
        model.addAttribute("dinosaur", dinosaur);
        return "dinosaurs/profile";
    }
}
