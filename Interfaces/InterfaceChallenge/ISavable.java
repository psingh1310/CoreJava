package com.prashant;

import java.util.ArrayList;
import java.util.List;

public interface ISavable {
    List<String> write();  //storage it return ArrayList
    void read(List<String> savedValues);  //To populate objects fields from the ArrayList
}
