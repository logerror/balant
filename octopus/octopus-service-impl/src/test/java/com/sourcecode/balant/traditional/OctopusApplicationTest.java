/*
 * Copyright 2012-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sourcecode.balant.traditional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Basic integration tests for demo application.
 * 
 * @author Dave Syer
 */
@SpringBootApplication(scanBasePackages = "com.sourcecode.balant.octopus")
public class OctopusApplicationTest {

    public static void main(String[] args) {
        SpringApplication.run(OctopusApplicationTest.class, args);
    }

}