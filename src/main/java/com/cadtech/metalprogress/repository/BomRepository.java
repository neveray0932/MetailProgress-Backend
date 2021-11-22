package com.cadtech.metalprogress.repository;

import com.cadtech.metalprogress.domain.BomEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface BomRepository extends JpaRepository<BomEntity,Integer> {
    @Modifying
    @Query(value = "declare @bomid int\n" +
            "\n" +
            "set @bomid = 2  ;\n" +
            "\n" +
            " WITH paths( b_id,vb_id,fineno,b_prodid,b_parentBomid,levels,levelStr,partlists)\n" +
            "\n" +
            " AS (\n" +
            "\n" +
            " -- This section provides the value for the root of the hierarchy\n" +
            "\n" +
            " SELECT  b_id,b_id,b_fineno,b_prodid,b_parentBomId,0,cast ('0' as varchar(200)),CAST(b_prodid as varchar(2000))\n" +
            "\n" +
            " FROM bom AS C\n" +
            "\n" +
            "-- WHERE b_parentBomid =0  and b_id = @bomid\n" +
            "\n" +
            " WHERE b_id = @bomid\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            " UNION ALL\n" +
            "\n" +
            " -- This section provides values for all nodes except the root\n" +
            "\n" +
            " SELECT b.b_id,c.b_id,c.b_fineno,c.b_prodid,c.b_parentBomId,levels +1,cast(levelStr+CAST(levels+1 as varchar) as varchar(200)),cast(partlists+'-('+CAST(c.b_fineno+1000000000 as varchar)+')'+cast(c.b_prodid as varchar) as varchar(2000))\n" +
            "\n" +
            " FROM bom AS C\n" +
            "\n" +
            " inner join bom as b on b.b_prodid = c.b_prodid and b.b_parentBomId =  0\n" +
            "\n" +
            " inner JOIN paths AS p ON c.b_parentBomid = p.b_id\n" +
            "\n" +
            "\n" +
            "\n" +
            " )\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            " SELECT ps.b_id,org.b_parentBomId,ps.vb_id,ps.levels,ps.levelStr,ps.partlists\n" +
            "\n" +
            " --for origianl node property\n" +
            "\n" +
            " ,org.b_fineno,org.b_qty,org.b_color,org.b_maincolor,org.b_isPointweld,org.b_isAttach,org.b_isMRP,org.b_note1\n" +
            "\n" +
            " ,org.b_note2,org.b_note3,org.b_note4,org.b_note5,org.b_note6,org.b_note7,org.b_note8,org.b_note9,org.b_note10,org.b_reqProcess\n" +
            "\n" +
            " ,ps.b_prodid\n" +
            "\n" +
            " ,vnode.b_price,vnode.b_priceID,vnode.b_process,vnode.b_processID,vnode.b_MfrDetail,vnode.b_Surface,vnode.b_PicFileName\n" +
            "\n" +
            " ,vnode.b_description,vnode.b_standBuildTime,vnode.b_isFetchDraw\n" +
            "\n" +
            " --for property that mapping to product\n" +
            "\n" +
            " ,p.p_no,p.p_name,p.p_spec,p.p_kindid,p.p_material,p.p_height,p.p_radius, p.p_width,p.p_length,p.p_size,p.p_pricekind,p.p_PicFileName,\n" +
            "\n" +
            " p.p_imgId,p.p_3DImageID,p.p_custfileno,p.p_location,p.p_version,p.p_invalid,p.p_goodtype,p.p_brand,p.p_avecost,p.p_unitweight,\n" +
            "\n" +
            " pu.pu_name,pk.pk_name,pk.pk_not2make, m.m_name,ppu.pu_name as ppu_name,\n" +
            "\n" +
            " pl.pl_isMaterial\n" +
            "\n" +
            " from Paths ps\n" +
            "\n" +
            " left join product p on p.p_id = ps.b_prodid\n" +
            "\n" +
            " left join bom org on org.b_id = ps.vb_id\n" +
            "\n" +
            " left join bom vnode on vnode.b_id = ps.b_id\n" +
            "\n" +
            " left join PriceLists pl on vnode.b_priceID = pl.pl_id\n" +
            "\n" +
            " left join     prod_kind pk on  p.p_kindid = pk.pk_id\n" +
            "\n" +
            " left join     material m      on  p.p_material = m.m_no\n" +
            "\n" +
            " left join prod_unit pu on pu.pu_id = p.p_unitid\n" +
            "\n" +
            " left join prod_unit ppu  on  ppu.pu_id  = p.p_priceunitid\n" +
            "\n" +
            " order by partlists",nativeQuery = true)
    List<Map<String, Object>> Bom();
}
