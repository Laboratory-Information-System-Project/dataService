package com.douzone.dataservice.service.collectservice;

import com.douzone.dataservice.mapper.collectmapper.BarcodeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class BarcodeServiceImpl implements BarcodeService{

    private final BarcodeMapper barcodeMapper;

    private static final String PRESCRIBE_CODE = "PRESCRIBE_CODE";
    @Override
    public List<Map<String, Object>> getBarcodeByPrescribeCodeList(List<String> prescribeCodeList) {
        List<Map<String, Object>> barcodeList = barcodeMapper.findBarcodeByPrescribeCodeList(prescribeCodeList);
        int length = barcodeList.size();
        Map <String,Object> result = barcodeList.get(0);

        List<Map<String, Object>> barcodeInfoForReturn = new ArrayList<>();
        barcodeInfoForReturn.add(result);

        for (int i = 0; i < length - 1; i++) {
            Map<String, Object> current = barcodeList.get(i);
            Map<String, Object> next = barcodeList.get(i+1);

            String currentBarcode = (String) current.get("BARCODE");
            String nextBarcode = (String) next.get("BARCODE");

            if(!currentBarcode.equals(nextBarcode)){
                barcodeInfoForReturn.add(next);
            }else {
                String currentPrescribeCode = result.get(PRESCRIBE_CODE).toString();
                currentPrescribeCode = currentPrescribeCode.concat( ","+ next.get(PRESCRIBE_CODE).toString());
                result.put(PRESCRIBE_CODE, currentPrescribeCode);
            }


        }

        return barcodeInfoForReturn;
    }
}
