package org.example.domain.model;

import org.example.domain.model.DormName;
import org.example.domain.model.FeePolicy;

public class OldFeePolicy implements FeePolicy
{
    @Override
    public int calculate(DormName name) {
        if(name == DormName.OREUM)
        {
            return 200;
        }
        else if(name == DormName.PUREUM)
        {
            return 100;
        }

        return -1;
    }
}
