package com.mkaszynski.wpm.demo.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class InMemoryHireRepository implements HireRepository {
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
