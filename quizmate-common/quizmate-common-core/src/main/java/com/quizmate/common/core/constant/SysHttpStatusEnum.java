package com.quizmate.common.core.constant;

/**
 * <h3>quizmate</h3>
 * <p>http 状态码枚举类</p>
 *
 * @author moru
 * @since 2025-08-30 18:23
 */
public enum SysHttpStatusEnum {
    SUCCESS(200, "操作成功"),
    CREATED(201, "对象创建成功"),
    ACCEPTED(202, "请求已经被接受"),
    NO_CONTENT(204, "操作已执行成功，但无返回数据"),
    MOVED_PERM(301, "资源已被移除"),
    SEE_OTHER(303, "重定向"),
    NOT_MODIFIED(304, "资源未被修改"),
    BAD_REQUEST(400, "参数列表错误（缺少，格式不匹配）"),
    UNAUTHORIZED(401, "未授权"),
    FORBIDDEN(403, "访问受限，授权过期"),
    NOT_FOUND(404, "资源或服务未找到"),
    BAD_METHOD(405, "不允许的 HTTP 方法"),
    CONFLICT(409, "资源冲突或被锁"),
    UNSUPPORTED_TYPE(415, "不支持的数据或媒体类型"),
    ERROR(500, "系统内部错误"),
    NOT_IMPLEMENTED(501, "接口未实现"),
    WARN(601, "系统警告消息");

    private final int code;
    private final String message;

    SysHttpStatusEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static SysHttpStatusEnum valueOf(int code) {
        for (SysHttpStatusEnum status : values()) {
            if (status.code == code) {
                return status;
            }
        }
        return null;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
