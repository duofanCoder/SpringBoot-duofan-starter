package com.duofan.starter.repository.common;

import com.duofan.starter.model.common.File;
import org.springframework.data.repository.CrudRepository;

public interface FileRepository extends CrudRepository<File, Long> {
}
