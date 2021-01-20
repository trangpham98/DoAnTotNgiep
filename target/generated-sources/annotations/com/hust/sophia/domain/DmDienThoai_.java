package com.hust.sophia.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DmDienThoai.class)
public abstract class DmDienThoai_ {

	public static volatile SingularAttribute<DmDienThoai, byte[]> hinhSanPham;
	public static volatile SingularAttribute<DmDienThoai, String> tenDienThoai;
	public static volatile SingularAttribute<DmDienThoai, String> ghiChu;
	public static volatile SingularAttribute<DmDienThoai, String> giaDienThoai;
	public static volatile SingularAttribute<DmDienThoai, String> moTaSanPham;
	public static volatile SingularAttribute<DmDienThoai, Long> id;
	public static volatile SingularAttribute<DmDienThoai, String> daBan;
	public static volatile SingularAttribute<DmDienThoai, String> ngayNhap;
	public static volatile SingularAttribute<DmDienThoai, String> ngayXuat;
	public static volatile SingularAttribute<DmDienThoai, String> hangSanXuat;
	public static volatile SingularAttribute<DmDienThoai, String> hinhSanPhamContentType;

	public static final String HINH_SAN_PHAM = "hinhSanPham";
	public static final String TEN_DIEN_THOAI = "tenDienThoai";
	public static final String GHI_CHU = "ghiChu";
	public static final String GIA_DIEN_THOAI = "giaDienThoai";
	public static final String MO_TA_SAN_PHAM = "moTaSanPham";
	public static final String ID = "id";
	public static final String DA_BAN = "daBan";
	public static final String NGAY_NHAP = "ngayNhap";
	public static final String NGAY_XUAT = "ngayXuat";
	public static final String HANG_SAN_XUAT = "hangSanXuat";
	public static final String HINH_SAN_PHAM_CONTENT_TYPE = "hinhSanPhamContentType";

}

