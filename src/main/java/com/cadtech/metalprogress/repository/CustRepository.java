package com.cadtech.metalprogress.repository;


import com.cadtech.metalprogress.domain.CustEntity;


import com.cadtech.metalprogress.dto.FatherDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.Tuple;
import java.util.List;
import java.util.Map;

public interface CustRepository extends JpaRepository<CustEntity,String> {
//    @Transactional
//    @Query("SELECT NEW com.cadtech.metalprogress.bean.JoinBean(c.cSname,c.ordermEntities.oCustbillcode,c.ordermEntities.oDate,c.ordermEntities.oTargetdate,c.ordermEntities.orderdEntities.productEntity.pNo,c.ordermEntities.orderdEntities.productEntity.pName,c.ordermEntities.orderdEntities.oQty,c.ordermEntities.orderdEntities.oBillqty,c.ordermEntities.orderdEntities.productEntity.makeOrderDetailEntities.makeOrderProcessEntities.mpProcess)  FROM CustEntity c" +
//            " JOIN c.ordermEntities" +
//            " JOIN c.ordermEntities.orderdEntities" +
//            " JOIN c.ordermEntities.orderdEntities.productEntity" +
//            " JOIN c.ordermEntities.orderdEntities.productEntity.makeOrderDetailEntities" +
//            " JOIN c.ordermEntities.orderdEntities.productEntity.makeOrderDetailEntities.makeOrderProcessEntities"
//    )
//    List<JoinBean> selectJoinBean();

    //子階查詢
    @Modifying
    @Query(value = "select  \n" +
            "\t\t\t  count(d.o_code) as 'sum'\n" +
            "\n" +
            "\n" +
            "\n" +
            "            from orderd d \n" +
            "            left join orderm m on d.o_code = m.o_code  \n" +
            "            left join product p on d.o_pid = p.p_id  \n" +
            "            left join bom b on b.b_id = p.p_bomid \n" +
            "            left join bom bb on bb.b_id = d.o_bomid \n" +
            "            left join material me on me.m_no = p.p_material  \n" +
            "            left join cust c on m.o_custno = c.c_no  \n" +
            "            left join cust_sb sb on m.o_subCustid = sb.c_csid  \n" +
            "            left join employee e on d.o_designer = e.e_autoid \n" +
            "            \n" +
            "            left join dbo.MakeOrderDetail modt on modt.m_pdid = p.p_id\n" +
            "            left join bom bbb on b.b_id = modt.m_bomid --製造BOM\n" +
            "            left join MakeOrderProcess mop on mop.mp_MODid = modt.autono\n" +
            "            \n" +
            "            where m.o_invalid=0   \n" +
            "             and d.o_status!=7  \n" +
            "           and isnull(o_bomlevel,0) = 0  \n" +
            "            \n" +
            "            and m.compID like '1'  \n" +
            "            \n" +
            "            \n" +
            "            and m.o_date >=CONVERT(DATE,'2019-11-01') and m.o_date <=CONVERT(DATE,'2019-11-30')\n" +
            "           group by d.o_code\n" +
            "            order by d.o_code"
            ,nativeQuery = true)
    List<Map<String, Object>> selectJoin();

    //父階查詢
    @Modifying

    @Query(value = "select DISTINCT d.o_code,m.o_date, c.c_sname, sb.c_csname,p.p_no as  o_prodno, b.b_process,mop.mp_over, d.itemno ,\n" +
            "p_name,p_spec, me.m_name, p.p_height,  d.o_targetdate, o_qty, o_makeOrderQty, o_billqty, \n" +
            "d.o_status, e_name as designer,  o_bomid, o_bomlevel, o_bomparentid, o_bomlevels, o_bom_root_bom_id, \n" +
            "o_bom_hasChild,  d.autono, m.o_custbillcode,d.o_memo01,d.o_memo02,d.o_memo03,d.o_memo04,d.o_designprocessid,\n" +
            "d.o_designprocess,m.o_memo, m.o_custbilldate,m.o_planyymm,\n" +
            "(case when d.o_bomid >0 then bb.b_maincolor else b.b_maincolor end) as b_maincolor,  \n" +
            "p_length,p_width,p_diameter  \n" +
            "from orderd d  \n" +
            "left join orderm m on d.o_code = m.o_code  \n" +
            "left join product p on d.o_pid = p.p_id  \n" +
            "left join bom b on b.b_id = p.p_bomid \n" +
            "left join bom bb on bb.b_id = d.o_bomid \n" +
            "left join material me on me.m_no = p.p_material  \n" +
            "left join cust c on m.o_custno = c.c_no  \n" +
            "left join cust_sb sb on m.o_subCustid = sb.c_csid  \n" +
            "left join employee e on d.o_designer = e.e_autoid \n" +
            "\n" +
            "left join dbo.MakeOrderDetail modt on modt.m_pdid = p.p_id\n" +
            "left join bom bbb on b.b_id = modt.m_bomid --製造BOM\n" +
            "left join MakeOrderProcess mop on mop.mp_MODid = modt.autono\n" +
            "where m.o_invalid=0   \n" +

            "and isnull(o_bomlevel,0) = 0  \n" +
            "and m.compID like '1'  \n" +
            "order by d.o_code, d.itemno",nativeQuery = true)
    List<Map<String, Object>> selectDISTINCTJoin();


    //子階where查詢
    @Modifying

    @Query(value = "select DISTINCT  p.p_id,d.o_code,m.o_date,b.b_process,mop.mp_over,mop.mp_process, c.c_sname, p.p_no as o_prodno,\n" +
            "p_name,  d.o_targetdate, o_qty, o_makeOrderQty, o_billqty,\n" +
            "d.o_status,  \n" +
            "  m.o_custbillcode\n" +

            "from orderd d  \n" +
            "left join orderm m on d.o_code = m.o_code  \n" +
            "left join product p on d.o_pid = p.p_id  \n" +
            "left join bom b on b.b_id = p.p_bomid  \n" +
            "left join bom bb on bb.b_id = d.o_bomid \n" +
            "left join material me on me.m_no = p.p_material  \n" +
            "left join cust c on m.o_custno = c.c_no  \n" +
            "left join cust_sb sb on m.o_subCustid = sb.c_csid  \n" +
            "left join employee e on d.o_designer = e.e_autoid\n" +
            "\n" +
            "left join dbo.MakeOrderDetail modt on modt.m_pdid = p.p_id\n" +
            "left join bom bbb on b.b_id = modt.m_bomid --製造BOM\n" +
            "left join MakeOrderProcess mop on mop.mp_MODid = modt.autono" +
            "\n" +
            "\n" +
            "where m.o_invalid=0   \n" +
            " and d.o_status!=7 " +
            "\n" +
            "and m.compID like '1'  \n" +
            "and c.c_sname like %?1%\n" +
            "and p.p_name like %?2%\n" +
            "and p.p_no like %?3%\n" +
            "and d.o_code like %?4%\n" +
            "and m.o_date >=CONVERT(DATE,?5) and m.o_date <=CONVERT(DATE,?6)\n" +
            "and d.o_targetdate >=CONVERT(DATE,?7) and d.o_targetdate <=CONVERT(DATE,?8)\n" +
            "order by d.o_code",nativeQuery = true)
    List<Map<String, Object>> selectWhere(String cSname, String pName, String pNo, String oCode,
                                                  String oDate1, String oDate2, String oTargetDate1, String oTargetDate2);






    //父階where查詢
    @Modifying

    @Query(value = "select DISTINCT d.o_code,m.o_date,b.b_process,mop.mp_over, c.c_sname,p.p_no as  o_prodno ,\n" +
            "p_name,  d.o_targetdate, o_qty, o_makeOrderQty, o_billqty, \n" +
            "d.o_status,  \n" +
            " m.o_custbillcode \n" +



            "from orderd d  \n" +
            "left join orderm m on d.o_code = m.o_code  \n" +
            "left join product p on d.o_pid = p.p_id  \n" +
            "left join bom b on b.b_id = p.p_bomid \n" +
            "left join bom bb on bb.b_id = d.o_bomid \n" +
            "left join material me on me.m_no = p.p_material  \n" +
            "left join cust c on m.o_custno = c.c_no  \n" +
            "left join cust_sb sb on m.o_subCustid = sb.c_csid  \n" +
            "left join employee e on d.o_designer = e.e_autoid \n" +
            "\n" +
            "left join dbo.MakeOrderDetail modt on modt.m_pdid = p.p_id\n" +
            "left join bom bbb on b.b_id = modt.m_bomid --製造BOM\n" +
            "left join MakeOrderProcess mop on mop.mp_MODid = modt.autono\n" +
            "\n" +
            "\n" +
            "where m.o_invalid=0   \n" +
            " and d.o_status!=7 " +
            "and isnull(o_bomlevel,0) = 0  \n" +
            "\n" +
            "and m.compID like '1'  \n" +
            "and c.c_sname like %?1%\n" +
            "and p.p_name like %?2%\n" +
            "and p.p_no like %?3%\n" +
            "and d.o_code like %?4%\n" +
            "and m.o_date >=CONVERT(DATE,?5) and m.o_date <=CONVERT(DATE,?6)\n" +
            "and d.o_targetdate >=CONVERT(DATE,?7) and d.o_targetdate <=CONVERT(DATE,?8)\n" +
            "order by d.o_code",nativeQuery = true)
    List<Tuple> selectDistinctWhere(String cSname, String pName, String pNo, String oCode,
                                    String oDate1, String oDate2, String oTargetDate1, String oTargetDate2);

    //父階where查詢
    @Modifying
    @Query(value = "select DISTINCT d.o_code,m.o_date,b.b_process,mop.mp_over, c.c_sname,p.p_no as  o_prodno ,\n" +
            "p_name,  d.o_targetdate, o_qty, o_makeOrderQty, o_billqty, \n" +
            "d.o_status,  \n" +
            " m.o_custbillcode \n" +
            "from orderd d  \n" +
            "left join orderm m on d.o_code = m.o_code  \n" +
            "left join product p on d.o_pid = p.p_id  \n" +
            "left join bom b on b.b_id = p.p_bomid \n" +
            "left join bom bb on bb.b_id = d.o_bomid \n" +
            "left join material me on me.m_no = p.p_material  \n" +
            "left join cust c on m.o_custno = c.c_no  \n" +
            "left join cust_sb sb on m.o_subCustid = sb.c_csid  \n" +
            "left join employee e on d.o_designer = e.e_autoid \n" +
            "\n" +
            "left join dbo.MakeOrderDetail modt on modt.m_pdid = p.p_id\n" +
            "left join bom bbb on b.b_id = modt.m_bomid --製造BOM\n" +
            "left join MakeOrderProcess mop on mop.mp_MODid = modt.autono\n" +
            "\n" +
            "\n" +
            "where m.o_invalid=0   \n" +
            " and d.o_status!=7 " +
            "and isnull(o_bomlevel,0) = 0  \n" +
            "\n" +
            "and m.compID like '1'  \n" +
            "and c.c_sname like %?1%\n" +
            "and p.p_name like %?2%\n" +
            "and p.p_no like %?3%\n" +
            "and d.o_code like %?4%\n" +
            "and m.o_date >=CONVERT(DATE,?5) and m.o_date <=CONVERT(DATE,?6)\n" +
            "and d.o_targetdate >=CONVERT(DATE,?7) and d.o_targetdate <=CONVERT(DATE,?8)\n" +
            "order by d.o_code offset ((?9-1)*?10) rows fetch next ?10 rows only ",nativeQuery = true)
    List<Tuple> selectDistinctWherePage(String cSname, String pName, String pNo, String oCode,
                                    String oDate1, String oDate2, String oTargetDate1, String oTargetDate2
                                        ,Integer pageIndex, Integer pageSize
    );



}
