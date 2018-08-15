package com.bdcom.cn.vip;

/**
 * 虚拟IP设置
 */
public class VIPConfigUtil {


    public static void addVIP(String ip,String netCardName,String netMask) throws Exception {
        String path= System.getProperty("user.dir")+"/src/main/cmd/";
        String addVIPCMD="netsh interface ip add address \""+netCardName+"\" "
                + ip + " "+netMask;
        Runtime.getRuntime().exec(path+"nircmd.exe elevate "+addVIPCMD);
    }

    public static void addVIPV6(String ip,String netCardName) throws Exception {
        String path= System.getProperty("user.dir")+"/src/main/cmd/";
        String addVIPCMD="netsh interface ipv6 add address \""+netCardName+"\" "
                + ip;
        Runtime.getRuntime().exec(path+"nircmd.exe elevate "+addVIPCMD);
    }

    public static void deleteVIP(String ip,String netCardName,String netMask) throws Exception {
        String path= System.getProperty("user.dir")+"/src/main/cmd/";
        String deleteVIPCMD="netsh interface ip delete address \""+netCardName+"\" "
                + ip + " "+netMask;
        Runtime.getRuntime().exec(path+"nircmd.exe elevate "+deleteVIPCMD);
    }

    public static void deleteVIPV6(String ip,String netCardName) throws Exception {
        String path= System.getProperty("user.dir")+"/src/main/cmd/";
        String deleteVIPCMD="netsh interface ipv6 delete address \""+netCardName+"\" "
                + ip;
        Runtime.getRuntime().exec(path+"nircmd.exe elevate "+deleteVIPCMD);
    }

    public static void main(String []args){

        try {
            //addVIP("172.16.21.111","以太网","255.255.255.0");
            //deleteVIP("172.16.21.111","以太网","255.255.255.0");
            addVIPV6("2405:200:1413::E1A","以太网");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

