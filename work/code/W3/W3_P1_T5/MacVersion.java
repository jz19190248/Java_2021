public class MacVersion extends OperatingSystemVersion {
    public void play(String fileName) {
        String osType = "Mac播放";
        this.vf.decode(osType, fileName);
    }

}
