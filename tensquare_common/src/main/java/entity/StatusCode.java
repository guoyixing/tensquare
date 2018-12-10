package entity;

/**
 * 状态码常量类
 *
 * @date 2018-12-10 15:31
 * @since 1.0.0
 */
public class StatusCode {
    /**
     * 成功
     */
    public static final int OK = 20000;
    /**
     * 失败
     */
    public static final int ERROR = 20001;
    /**
     * 用户名或者密码错误
     */
    public static final int LOGINERROR = 20000;
    /**
     * 权限不足
     */
    public static final int ACCESSERROP = 20000;
    /**
     * 远程调用失败
     */
    public static final int REMOTEERROR = 20000;
    /**
     * 重复操作
     */
    public static final int REPERROR = 20000;

    private StatusCode() {
    }
}
