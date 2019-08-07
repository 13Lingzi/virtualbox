import org.junit.Test;
import org.virtualbox_6_0.IVirtualBox;
import org.virtualbox_6_0.VirtualBoxManager;

import javax.annotation.Resource;

public class VbTest {
    @Resource
    private VirtualBoxManager virtualBoxManager;
    @Resource
    private IVirtualBox iVirtualBox;
    @Test
    public void test(){
        System.out.println(iVirtualBox.getVersion());
    }


}
