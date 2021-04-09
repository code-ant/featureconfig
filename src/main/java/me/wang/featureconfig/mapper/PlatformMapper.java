package me.wang.featureconfig.mapper;

import me.wang.featureconfig.entity.PlatformEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PlatformMapper {
    List<PlatformEntity> getAllPlatform();
    void updatePlatform(PlatformEntity platformEntity);
    void addPlatform(PlatformEntity platformEntity);
    void deletePlatformById(Integer id);
}
