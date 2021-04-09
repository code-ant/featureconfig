package me.wang.featureconfig.controller;

import me.wang.featureconfig.entity.PlatformEntity;
import me.wang.featureconfig.service.PlatformService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class PlatformController {

    final
    PlatformService platformService;

    public PlatformController(PlatformService platformService) {
        this.platformService = platformService;
    }

    @RequestMapping("/platform")
    public String getPlatform(Model model){
        List<PlatformEntity> platformEntities = platformService.getAllPlatforms();
        model.addAttribute("platforms", platformEntities);
        return "platform";
    }

}
