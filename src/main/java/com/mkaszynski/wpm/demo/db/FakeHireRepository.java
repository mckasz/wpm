package com.mkaszynski.wpm.demo.db;

import com.mkaszynski.wpm.demo.domain.Hire;
import com.mkaszynski.wpm.demo.domain.HireRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FakeHireRepository implements HireRepository {
    private final Map<Integer, Hire> hires = new HashMap<>();

    @Override
    public void save(Hire hire) {
        hire.setId(hires.size());
        hires.put(hire.getId(), hire);
    }

    @Override
    public List<Hire> list() {
        return new ArrayList<>(hires.values());
    }
}
