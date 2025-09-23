package HierarchicalInheritancePrograms;

class media{
    void play(){
        System.out.println("Media playing..");
    }
}

class audio extends media{
    void adjustVolume(){
        System.out.println("Adjusting volume..");
    }
}

class video extends media{
    void adjustBrightness(){
        System.out.println("Adjusting brightness..");
    }
}

public class MediaaExample {
    public static void main(String[] args) {
        audio obj = new audio();
        obj.play();
        obj.adjustVolume();

        video obj2 = new video();
        obj2.play();
        obj2.adjustBrightness();
    }
}
