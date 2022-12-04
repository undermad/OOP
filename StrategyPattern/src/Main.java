public class Main {
    public static void main(String[] args) {
        NPC_Behavior npcBehave = new NPC_Behavior();
        ENEMY_Behavior enemyBehave = new ENEMY_Behavior();

        Entity murloc = new ENEMY_Murloc(enemyBehave);
        Entity npc = new NPC_Merchant(npcBehave);

        murloc.performBehavior();
        npc.performBehavior();
        npc.setEntityBehavior(enemyBehave);
        npc.performBehavior();
        npc.setEntityBehavior(npcBehave);
        System.out.println("************************");
        npc.performBehavior();
        murloc.performBehavior();
    }
}