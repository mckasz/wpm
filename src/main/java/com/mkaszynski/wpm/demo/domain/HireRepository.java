package com.mkaszynski.wpm.demo.domain;

import java.util.List;

public interface HireRepository {
    void save(Hire hire);
    List<Hire> list();
}
