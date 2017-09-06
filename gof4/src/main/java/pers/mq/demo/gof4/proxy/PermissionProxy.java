package pers.mq.demo.gof4.proxy;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: mq
 * Date: 2017-09-06
 * Time: 下午5:39
 */
public class PermissionProxy implements AbstractPermission {

    private RelPermission permission = new RelPermission();
    private int level = 0;
    @Override
    public void modifyUserInfo() {
        if(0==level)
        {
            System.out.println("对不起，你没有该权限!");
        }
        else if(1==level)
        {
            permission.modifyUserInfo();
        }
    }

    @Override
    public void viewNote() {
        System.out.println("查看帖子！");
    }

    @Override
    public void publishNote() {
        if(0==level)
        {
            System.out.println("对不起，你没有该权限!");
        }
        else if(1==level)
        {
            permission.publishNote();
        }
    }

    @Override
    public void modifyNote() {
        if(0==level)
        {
            System.out.println("对不起，你没有该权限!");
        }
        else if(1==level)
        {
            permission.modifyNote();
        }
    }

    @Override
    public void setLevel(int level) {
        this.level=level;
    }
}
