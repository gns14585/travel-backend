package com.example.travelback.toss.mapper;

import com.example.travelback.toss.domain.Toss;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TossMapper {

    @Insert("""
            insert into travel.ttoss (
                id, 
                amount,
                orderId,
                requested, 
                phoneNumber,
                userId
                ) 
            values (
                #{id},
                #{amount},
                #{orderId},
                #{requested},
                #{phoneNumber},
                #{userId}
                );
        """)
    int save(Integer id,
             Integer amount,
             String orderId,
             String requested,
             String phoneNumber,
             String userId);


    @Select("""
                select tossid,transTitle,transStartDate,transEndDate,requested,reservation,userId,amount, phoneNumber
                 from travel.ttoss 
                  left join travel.transport t on t.tId = ttoss.id 
                  where  userId=#{userId};
        """)
    List<Toss> getId(String userId);

    @Insert("""
            insert into transtosspay (
                transId,
                amount,
                orderId,
                requested, 
                realUserPhoneNumber,
                userId
                ) 
            values (
                #{id},
                #{amount},
                #{orderId},
                #{requested},
                #{phoneNumber},
                #{userId}
                );
        """)
    int transSave(Integer id, Integer amount, String orderId, String requested, String phoneNumber, String userId);



}

