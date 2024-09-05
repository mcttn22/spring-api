package com.mcttn22.springapi;

import org.springframework.data.repository.CrudRepository;
import com.mcttn22.springapi.DataTable;

public interface DataRepository extends CrudRepository<DataTable, Integer> {}

