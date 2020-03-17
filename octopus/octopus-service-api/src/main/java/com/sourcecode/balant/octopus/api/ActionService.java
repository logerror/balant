package com.sourcecode.balant.octopus.api;


import com.sourcecode.balant.octopus.api.bo.ActionBO;

public interface ActionService {
    ActionBO getActionById(Long id);
}
