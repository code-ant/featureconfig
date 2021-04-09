package me.wang.featureconfig.service.impl;

import me.wang.featureconfig.entity.PlatformEntity;
import me.wang.featureconfig.mapper.PlatformMapper;
import me.wang.featureconfig.service.PlatformService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlatformServiceImpl implements PlatformService {

    private final PlatformMapper platformMapper;

    public PlatformServiceImpl(PlatformMapper platformMapper) {
        this.platformMapper = platformMapper;
    }

    @Override
    public List<PlatformEntity> getAllPlatforms() {
        return platformMapper.getAllPlatform();
    }

    @Override
    public void updatePlatformInfo(PlatformEntity platformEntity) {
        platformMapper.updatePlatform(platformEntity);
    }

    @Override
    public void addPlatform(PlatformEntity platformEntity) {
        platformMapper.addPlatform(platformEntity);
    }

    @Override
    public void deletePlatformById(Integer id) {
        platformMapper.deletePlatformById(id);
    }
}
