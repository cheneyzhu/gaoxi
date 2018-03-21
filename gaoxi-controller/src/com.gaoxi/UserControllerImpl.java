@RestController
public class UserControllerImpl implements UserController {
    @Reference(version = "1.0.0")
    private UserService userService;
    @Override
    public Result login(LoginReq loginReq, HttpServletResponse httpRsp) {
        // 登录鉴权
        UserEntity userEntity = userService.login(loginReq);
    }
}