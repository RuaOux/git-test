package cn.itcast.travel.dao;

import cn.itcast.travel.domain.Favorite;

public interface FavoriteDao {
    /*
        根据rid和uid查询收藏信息
     */
    public Favorite findByRidAndUid(int rid, int uid);
    /*
        查询商品路线的收藏数
     */
    int findCountByRid(int rid);

    void add(int rid,int uid);
}
