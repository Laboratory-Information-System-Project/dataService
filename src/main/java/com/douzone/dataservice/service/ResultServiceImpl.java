package com.douzone.dataservice.service;

import com.douzone.dataservice.domain.ResultDTO;
import com.douzone.dataservice.domain.ResultSearchDTO;
import com.douzone.dataservice.mapper.ResultMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ResultServiceImpl implements ResultService{
    private final ResultMapper mapper;

    @Override
    public List<ResultDTO> allList(){
        return mapper.selectAll();
    }

    @Override
    public List<ResultDTO> getSearchResult(ResultSearchDTO resultSearch){
        return mapper.getSearchResultMapper(resultSearch);
    }

    @Override
    public List<ResultDTO> searchNotDate(int text){

        return mapper.searchNotDate(text);
    }


}
