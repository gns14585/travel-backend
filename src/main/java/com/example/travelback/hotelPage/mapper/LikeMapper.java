package com.example.travelback.hotelPage.mapper;

import com.example.travelback.hotelPage.domain.Like;
import org.apache.ibatis.annotations.*;

@Mapper
public interface LikeMapper {

    @Select("SELECT * FROM hotelike WHERE id = #{id}")
    Like getLikeById(Integer id);

    @Select("SELECT * FROM hotelike WHERE hid = #{hotelId}")
    Like getLikesByHotelId(Integer hotelId);

    @Select("SELECT * FROM hotelike WHERE userId=#{userId}")
    Like getLikesByUserId(String userId);

    @Insert("INSERT INTO hotelike (hid, userId,name,mainImgUrl,location,roomType) VALUES (#{hotelId}, #{userId},#{name},#{mainImgUrl},#{location},#{roomType})")
    void insertLike(Like like);


    @Delete("DELETE FROM hotelike WHERE hid = #{hid}")
    void deleteLike(Integer id);

}
