package dao;

import bean.RechargeBean;

import java.util.Date;
import java.util.List;

/**
 * @author Larimar
 * @time 2019/7/24 星期三 16:21
 */
public interface RechargeDao {
    public boolean saveRecharge(String userName, RechargeBean recharge);
    public boolean delRecharge(String userName,RechargeBean recharge);
    public boolean updateRecharge(String userName,RechargeBean recharge);
    public List<RechargeBean> selectAllRechers(String userName);//查找某个用户的全部充值订单
    public List<RechargeBean> selectRechersByType(int type);//根据充值方式查找充值订单
    public List<RechargeBean> selectRechersByDate(Date date);//根据日期查找充值信息
}