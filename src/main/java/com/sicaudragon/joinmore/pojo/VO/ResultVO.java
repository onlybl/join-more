package com.sicaudragon.joinmore.pojo.VO;

import lombok.Data;

/**
 * http请求返回的最外层对象
 * @author BeFondOfTaro
 * Created in 12:07 2018/1/18
 */
@Data
public class ResultVO {
    /** 错误码. */
    private Integer code;

    /** 提示信息. */
    private String msg;

    /** 具体内容. */
    private Object data;

    public void setData(Object data) {
        this.data = data;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
