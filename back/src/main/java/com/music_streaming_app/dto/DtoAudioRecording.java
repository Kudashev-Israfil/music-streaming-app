package com.music_streaming_app.dto;

import com.music_streaming_app.entity.Author;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DtoAudioRecording {
    private Long id;
    private MultipartFile file;
    private Author author;
    private String description;
    private String sourceUrl;
}
