package org.example.domain.model;

import org.example.domain.model.DormName;
import org.example.domain.model.FeePolicy;

public class NewFeePolicy implements FeePolicy {

    @Override
    public int calculate(DormName name) {
        if(name == DormName.OREUM)
        {
            return 400;
        }
        else if(name == DormName.PUREUM)
        {
            return 200;
        }

        return -1;
    }

}
