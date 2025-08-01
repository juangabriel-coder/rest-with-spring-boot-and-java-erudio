package com.github.juangabrielcoder.restwithspringbootandjavaerudio.file.importer.contract;



import com.github.juangabrielcoder.restwithspringbootandjavaerudio.data.dto.PersonDTO;

import java.io.InputStream;
import java.util.List;

public interface FileImporter {

    List<PersonDTO> importFile(InputStream inputStream) throws Exception;
}