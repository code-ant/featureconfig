package me.wang.featureconfig.service;

import me.wang.featureconfig.entity.PlatformEntity;

import java.util.List;

public interface PlatformService {
    List<PlatformEntity> getAllPlatforms();
    void updatePlatformInfo(PlatformEntity platformEntity);
    void addPlatform(PlatformEntity platformEntity);
    void deletePlatformById(Integer id);
}
