package com.geode.demo;

import org.springframework.data.gemfire.repository.GemfireRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoRepository extends GemfireRepository<Demo, String> {
}
