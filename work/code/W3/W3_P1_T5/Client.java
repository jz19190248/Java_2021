public class Client {
    // public static void main(String[] args)
    public static void main(String[] args) {
        VideoFile vf;
        OperatingSystemVersion osType1 = new WindowsVersion();
        vf = new AVIFile();
        osType1.setVideo(vf);
        osType1.play("AVI");

        OperatingSystemVersion osType2 = new LinuxVersion();
        vf = new MPEGFile();
        osType2.setVideo(vf);
        osType2.play("MPEG");

        OperatingSystemVersion osType3 = new MacVersion();
        vf = new RMVBFile();
        osType3.setVideo(vf);
        osType3.play("RMVB");
    }
}