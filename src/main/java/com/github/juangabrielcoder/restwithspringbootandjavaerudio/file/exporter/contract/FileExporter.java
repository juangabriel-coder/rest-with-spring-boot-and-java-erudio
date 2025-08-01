package com.github.juangabrielcoder.restwithspringbootandjavaerudio.file.exporter.contract;

import com.github.juangabrielcoder.restwithspringbootandjavaerudio.data.dto.PersonDTO;
import org.springframework.core.io.Resource;

import java.util.List;

public interface FileExporter {

    Resource exportFile(List<PersonDTO> people) throws Exception;
}