package au.com.iglooit.silverwater.service.search;

import au.com.iglooit.silverwater.model.vo.AddressVO;

/**
 * Created with IntelliJ IDEA.
 * IGUser: nicholas.zhu
 * Date: 24/08/2014
 * Time: 8:36 AM
 */
public interface GeoSearchService {
    AddressVO formatAddress(String address);
}
