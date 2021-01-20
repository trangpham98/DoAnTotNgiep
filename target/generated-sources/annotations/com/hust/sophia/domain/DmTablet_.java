package com.hust.sophia.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DmTablet.class)
public abstract class DmTablet_ {

	public static volatile SingularAttribute<DmTablet, String> tenTablet;
	public static volatile SingularAttribute<DmTablet, String> ghiChu;
	public static volatile SingularAttribute<DmTablet, String> moTaSanPham;
	public static volatile SingularAttribute<DmTablet, String> giaTablet;
	public static volatile SingularAttribute<DmTablet, Long> id;
	public static volatile SingularAttribute<DmTablet, String> ngayNhap;
	public static volatile SingularAttribute<DmTablet, String> ngayXuat;
	public static volatile SingularAttribute<DmTablet, String> hangSanXuat;

	public static final String TEN_TABLET = "tenTablet";
	public static final String GHI_CHU = "ghiChu";
	public static final String MO_TA_SAN_PHAM = "moTaSanPham";
	public static final String GIA_TABLET = "giaTablet";
	public static final String ID = "id";
	public static final String NGAY_NHAP = "ngayNhap";
	public static final String NGAY_XUAT = "ngayXuat";
	public static final String HANG_SAN_XUAT = "hangSanXuat";

}

