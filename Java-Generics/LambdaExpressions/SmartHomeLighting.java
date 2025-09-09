interface LightBehavior {
    void activate();
}

public class SmartHomeLighting {
    public static void main(String[] args) {
        
        LightBehavior motionTrigger = () -> System.out.println("Lights ON with soft white glow (motion detected).");    
        LightBehavior eveningTrigger = () -> System.out.println("Lights ON with warm ambiance (evening mode).");       
        LightBehavior voiceTrigger = () -> System.out.println("Lights ON with party mode colors (voice command).");

        motionTrigger.activate();
        eveningTrigger.activate();
        voiceTrigger.activate();
    }
}