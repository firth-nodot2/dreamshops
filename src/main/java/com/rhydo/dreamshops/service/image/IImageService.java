package com.rhydo.dreamshops.service.image;

import com.rhydo.dreamshops.dto.ImageDto;
import com.rhydo.dreamshops.model.Image;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IImageService {
    Image getImageById(Long id);
    void deleteImageById(Long id);
    List<ImageDto> saveImages(List<MultipartFile> file, Long productId);
    void updateImage(MultipartFile files, Long imageId);
}
