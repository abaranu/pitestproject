package org.example.pitest.services;

import org.springframework.stereotype.Service;

@Service
public class FakeService {

    public int fakeMethod() {
        return 2;
    }
}
