package com.imooc.o2o.enums;

/**
 * <Description>店铺状态枚举类<br>
 * 
 * @author HuangWenyi<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年3月2日 <br>
 * @since V1.0<br>
 * @see com.imooc.o2o.enums <br>
 */
public enum ShopStateEnum {
    CHECK(0, "审核中"), OFFLINE(-1, "非法店铺"), SUCCESS(1, "操作成功"), PASS(2, "通过认证"), INNER_ERROR(-1001,
        "内部系统错误"), NULL_SHOPID(-1002, "ShopId为空"),NULL_SHOP(-1003,"shop信息为空");
    // 结果状态
    private int state;

    // 状态标识
    private String stateInfo;

    private ShopStateEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    /**
     * Description:返回相应state状态的信息<br>
     * 
     * @author HuangWenyi<br>
     * @taskId <br>
     * @param state
     * @return ShopStateEnum<br>
     */
    public static ShopStateEnum stateOf(int state) {
        for (ShopStateEnum stateEnum : values()) {
            if (stateEnum.getState() == state) {
                return stateEnum;
            }
        }
        return null;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

}
