package com.sourcecode.balant.common.util;

import com.sourcecode.balant.common.constants.BalantConstants;

import javax.servlet.ServletRequest;

public class BalantUtil {
    public static void setCommonResult(ServletRequest request, CommonResult result) {
        request.setAttribute(BalantConstants.REQUEST_ATTR_COMMON_RESULT, result);
    }
}
