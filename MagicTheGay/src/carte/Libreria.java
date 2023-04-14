/**
 * 
 */
package carte;

import java.util.ArrayList;

/**
 * @author Labmultimediale
 *
 */
public class Libreria {
	
	public ArrayList<Carta> grixisMidrange = new ArrayList<>();
	public ArrayList<Carta> drawTwoDimir = new ArrayList<>();
	
	public Libreria() {
		this.grixisMidrangeGenerator();
		this.drawTwoDimirGenerator();
	}
	
	public void grixisMidrangeGenerator() {
		this.grixisMidrange.add(new Istantaneo("Abrade", 2, null));
		this.grixisMidrange.add(new Istantaneo("Abrade", 2, null));
		this.grixisMidrange.add(new Istantaneo("Abrade", 2, null));
		this.grixisMidrange.add(new Istantaneo("Go for the Throat", 2, null));
		this.grixisMidrange.add(new Istantaneo("Go for the Throat", 2, null));
		this.grixisMidrange.add(new Istantaneo("Go for the Throat", 2, null));
		this.grixisMidrange.add(new Istantaneo("Make Disappear", 2, null));
		this.grixisMidrange.add(new Istantaneo("Make Disappear", 2, null));
		this.grixisMidrange.add(new Istantaneo("Make Disappear", 2, null));
		this.grixisMidrange.add(new Istantaneo("Negate", 2, null));
		this.grixisMidrange.add(new Istantaneo("Negate", 2, null));
		this.grixisMidrange.add(new Istantaneo("Parasitic Grasp", 2, null));
		this.grixisMidrange.add(new Istantaneo("Parasitic Grasp", 2, null));
		this.grixisMidrange.add(new Terra("Blackleave Cliffs", Mana.Nero, Mana.Rosso));
		this.grixisMidrange.add(new Terra("Blackleave Cliffs", Mana.Nero, Mana.Rosso));
		this.grixisMidrange.add(new Terra("Blackleave Cliffs", Mana.Nero, Mana.Rosso));
		this.grixisMidrange.add(new Terra("Derkslick Shores", Mana.Blu, Mana.Nero));
		this.grixisMidrange.add(new Terra("Derkslick Shores", Mana.Blu, Mana.Nero));
		this.grixisMidrange.add(new Terra("Derkslick Shores", Mana.Blu, Mana.Nero));
		this.grixisMidrange.add(new Terra("Haunted Ridge", Mana.Nero, Mana.Rosso));
		this.grixisMidrange.add(new Terra("Haunted Ridge", Mana.Nero, Mana.Rosso));
		this.grixisMidrange.add(new Terra("Haunted Ridge", Mana.Nero, Mana.Rosso));
		this.grixisMidrange.add(new Terra("Shipwreck Marsh", Mana.Blu, Mana.Nero));
		this.grixisMidrange.add(new Terra("Shipwreck Marsh", Mana.Blu, Mana.Nero));
		this.grixisMidrange.add(new Terra("Shipwreck Marsh", Mana.Blu, Mana.Nero));
		this.grixisMidrange.add(new Terra("Shipwreck Marsh", Mana.Blu, Mana.Nero));
		this.grixisMidrange.add(new Terra("Sulfurous Springs", Mana.Generico, Mana.Nero, Mana.Rosso, true));
		this.grixisMidrange.add(new Terra("Sulfurous Springs", Mana.Generico, Mana.Nero, Mana.Rosso, true));
		this.grixisMidrange.add(new Terra("Sulfurous Springs", Mana.Generico, Mana.Nero, Mana.Rosso, true));
		this.grixisMidrange.add(new Terra("Sulfurous Springs", Mana.Generico, Mana.Nero, Mana.Rosso, true));
		this.grixisMidrange.add(new Terra("Swamp", Mana.Nero));
		this.grixisMidrange.add(new Terra("Takenuma Abandoned Mire", Mana.Nero));
		this.grixisMidrange.add(new Terra("Xanders Lounge", Mana.Blu, Mana.Nero, Mana.Rosso, false));
		this.grixisMidrange.add(new Terra("Xanders Lounge", Mana.Blu, Mana.Nero, Mana.Rosso, false));
		this.grixisMidrange.add(new Terra("Xanders Lounge", Mana.Blu, Mana.Nero, Mana.Rosso, false));
		this.grixisMidrange.add(new Terra("Xanders Lounge", Mana.Blu, Mana.Nero, Mana.Rosso, false));
		this.grixisMidrange.add(new Creatura("Bladecoil Serpent", 7, 5, 4, null));
		this.grixisMidrange.add(new Creatura("Bloodtithe Harvester", 2, 3, 2, null));
		this.grixisMidrange.add(new Creatura("Bloodtithe Harvester", 2, 3, 2, null));
		this.grixisMidrange.add(new Creatura("Bloodtithe Harvester", 2, 3, 2, null));
		this.grixisMidrange.add(new Creatura("Bloodtithe Harvester", 2, 3, 2, null));
		this.grixisMidrange.add(new Creatura("Corpse Appraiser", 3, 3, 3, null));
		this.grixisMidrange.add(new Creatura("Corpse Appraiser", 3, 3, 3, null));
		this.grixisMidrange.add(new Creatura("Corpse Appraiser", 3, 3, 3, null));
		this.grixisMidrange.add(new Creatura("Corpse Appraiser", 3, 3, 3, null));
		this.grixisMidrange.add(new Creatura("Razorlash Transmogrant", 2, 3, 1, null));
		this.grixisMidrange.add(new Creatura("Sheoldred the Apocalypse", 4, 4, 5, null));
		this.grixisMidrange.add(new Creatura("Sheoldred the Apocalypse", 4, 4, 5, null));
		this.grixisMidrange.add(new Creatura("Reckoner Bankbuster", 2, 4, 4, null));
		this.grixisMidrange.add(new Creatura("Reckoner Bankbuster", 2, 4, 4, null));
		this.grixisMidrange.add(new Creatura("Reckoner Bankbuster", 2, 4, 4, null));
		this.grixisMidrange.add(new Stregoneria("Invoke Despair", 5));
		this.grixisMidrange.add(new Stregoneria("Invoke Despair", 5));
		this.grixisMidrange.add(new Stregoneria("Invoke Despair", 5));
		this.grixisMidrange.add(new Stregoneria("Invoke Despair", 5));
		this.grixisMidrange.add(new Incantesimo("Fable of the Mirror-Breaker", 3));
		this.grixisMidrange.add(new Incantesimo("Fable of the Mirror-Breaker", 3));
		this.grixisMidrange.add(new Incantesimo("Fable of the Mirror-Breaker", 3));
		this.grixisMidrange.add(new Incantesimo("Fable of the Mirror-Breaker", 3));
	}
	
	@SuppressWarnings("serial")
	public void drawTwoDimirGenerator() {
		this.drawTwoDimir.add(new Creatura("Evolved Sleeper", 1 , 1 , 1, (new ArrayList<>(){{add(Mana.Nero);}})));
		this.drawTwoDimir.add(new Creatura("Evolved Sleeper", 1 , 1 , 1, (new ArrayList<>(){{add(Mana.Nero);}})));
		this.drawTwoDimir.add(new Creatura("Evolved Sleeper", 1 , 1 , 1, (new ArrayList<>(){{add(Mana.Nero);}})));
		this.drawTwoDimir.add(new Creatura("Evolved Sleeper", 1 , 1 , 1, (new ArrayList<>(){{add(Mana.Nero);}})));
		this.drawTwoDimir.add(new Creatura("Evangel of Synthesis", 2 , 2 , 3, (new ArrayList<>(){{add(Mana.Blu);add(Mana.Nero);}})));
		this.drawTwoDimir.add(new Creatura("Evangel of Synthesis", 2 , 2 , 3, (new ArrayList<>(){{add(Mana.Blu);add(Mana.Nero);}})));
		this.drawTwoDimir.add(new Creatura("Evangel of Synthesis", 2 , 2 , 3, (new ArrayList<>(){{add(Mana.Blu);add(Mana.Nero);}})));
		this.drawTwoDimir.add(new Creatura("Evangel of Synthesis", 2 , 2 , 3, (new ArrayList<>(){{add(Mana.Blu);add(Mana.Nero);}})));
		this.drawTwoDimir.add(new Creatura("Faerie Vandal", 2 , 1 , 2, (new ArrayList<>(){{add(Mana.Generico);add(Mana.Blu);}})));
		this.drawTwoDimir.add(new Creatura("Faerie Vandal", 2 , 1 , 2, (new ArrayList<>(){{add(Mana.Generico);add(Mana.Blu);}})));
		this.drawTwoDimir.add(new Creatura("Faerie Vandal", 2 , 1 , 2, (new ArrayList<>(){{add(Mana.Generico);add(Mana.Blu);}})));
		this.drawTwoDimir.add(new Creatura("Faerie Vandal", 2 , 1 , 2, (new ArrayList<>(){{add(Mana.Generico);add(Mana.Blu);}})));
		this.drawTwoDimir.add(new Creatura("Gurling Anoiter", 3 , 1 , 3, (new ArrayList<>(){{add(Mana.Generico);add(Mana.Generico);add(Mana.Nero);}})));
		this.drawTwoDimir.add(new Creatura("Gurling Anoiter", 3 , 1 , 3, (new ArrayList<>(){{add(Mana.Generico);add(Mana.Generico);add(Mana.Nero);}})));
		this.drawTwoDimir.add(new Creatura("Gurling Anoiter", 3 , 1 , 3, (new ArrayList<>(){{add(Mana.Generico);add(Mana.Generico);add(Mana.Nero);}})));
		this.drawTwoDimir.add(new Creatura("Gurling Anoiter", 3 , 1 , 3, (new ArrayList<>(){{add(Mana.Generico);add(Mana.Generico);add(Mana.Nero);}})));
		this.drawTwoDimir.add(new Creatura("Gixian Puppeteer", 4 , 4 , 3, (new ArrayList<>(){{add(Mana.Generico);add(Mana.Generico);add(Mana.Generico);add(Mana.Nero);}})));
		this.drawTwoDimir.add(new Creatura("Gixian Puppeteer", 4 , 4 , 3, (new ArrayList<>(){{add(Mana.Generico);add(Mana.Generico);add(Mana.Generico);add(Mana.Nero);}})));
		this.drawTwoDimir.add(new Creatura("Gixian Puppeteer", 4 , 4 , 3, (new ArrayList<>(){{add(Mana.Generico);add(Mana.Generico);add(Mana.Generico);add(Mana.Nero);}})));
		this.drawTwoDimir.add(new Creatura("Gixian Puppeteer", 4 , 4 , 3, (new ArrayList<>(){{add(Mana.Generico);add(Mana.Generico);add(Mana.Generico);add(Mana.Nero);}})));
		this.drawTwoDimir.add(new Istantaneo("Consider", 1, (new ArrayList<>(){{add(Mana.Blu);}})));
		this.drawTwoDimir.add(new Istantaneo("Consider", 1, (new ArrayList<>(){{add(Mana.Blu);}})));
		this.drawTwoDimir.add(new Istantaneo("Consider", 1, (new ArrayList<>(){{add(Mana.Blu);}})));
		this.drawTwoDimir.add(new Istantaneo("Consider", 1, (new ArrayList<>(){{add(Mana.Blu);}})));
		this.drawTwoDimir.add(new Istantaneo("Rona's Vortex", 1, (new ArrayList<>(){{add(Mana.Blu);}})));
		this.drawTwoDimir.add(new Istantaneo("Rona's Vortex", 1, (new ArrayList<>(){{add(Mana.Blu);}})));
		this.drawTwoDimir.add(new Istantaneo("Go For The Throat", 2, (new ArrayList<>(){{add(Mana.Generico);add(Mana.Nero);}})));
		this.drawTwoDimir.add(new Istantaneo("Go For The Throat", 2, (new ArrayList<>(){{add(Mana.Generico);add(Mana.Nero);}})));
		this.drawTwoDimir.add(new Istantaneo("Infernal Grasp", 2, (new ArrayList<>(){{add(Mana.Generico);add(Mana.Nero);}})));
		this.drawTwoDimir.add(new Istantaneo("Infernal Grasp", 2, (new ArrayList<>(){{add(Mana.Generico);add(Mana.Nero);}})));
		this.drawTwoDimir.add(new Istantaneo("Tainted Indulgence", 2, (new ArrayList<>(){{add(Mana.Blu);add(Mana.Nero);}})));
		this.drawTwoDimir.add(new Istantaneo("Tainted Indulgence", 2, (new ArrayList<>(){{add(Mana.Blu);add(Mana.Nero);}})));
		this.drawTwoDimir.add(new Istantaneo("Tainted Indulgence", 2, (new ArrayList<>(){{add(Mana.Blu);add(Mana.Nero);}})));
		this.drawTwoDimir.add(new Istantaneo("Tainted Indulgence", 2, (new ArrayList<>(){{add(Mana.Blu);add(Mana.Nero);}})));
		this.drawTwoDimir.add(new Istantaneo("Thirst for Discovery", 3, (new ArrayList<>(){{add(Mana.Generico);add(Mana.Generico);add(Mana.Blu);}})));
		this.drawTwoDimir.add(new Istantaneo("Thirst for Discovery", 3, (new ArrayList<>(){{add(Mana.Generico);add(Mana.Generico);add(Mana.Blu);}})));
		this.drawTwoDimir.add(new Istantaneo("Thirst for Discovery", 3, (new ArrayList<>(){{add(Mana.Generico);add(Mana.Generico);add(Mana.Blu);}})));
		this.drawTwoDimir.add(new Istantaneo("Thirst for Discovery", 3, (new ArrayList<>(){{add(Mana.Generico);add(Mana.Generico);add(Mana.Blu);}})));
		this.drawTwoDimir.add(new Terra("Island", Mana.Blu));
		this.drawTwoDimir.add(new Terra("Island", Mana.Blu));
		this.drawTwoDimir.add(new Terra("Island", Mana.Blu));
		this.drawTwoDimir.add(new Terra("Island", Mana.Blu));
		this.drawTwoDimir.add(new Terra("Island", Mana.Blu));
		this.drawTwoDimir.add(new Terra("Island", Mana.Blu));
		this.drawTwoDimir.add(new Terra("Island", Mana.Blu));
		this.drawTwoDimir.add(new Terra("Shipwreck Marsh", Mana.Blu, Mana.Nero));
		this.drawTwoDimir.add(new Terra("Shipwreck Marsh", Mana.Blu, Mana.Nero));
		this.drawTwoDimir.add(new Terra("Shipwreck Marsh", Mana.Blu, Mana.Nero));
		this.drawTwoDimir.add(new Terra("Shipwreck Marsh", Mana.Blu, Mana.Nero));
		this.drawTwoDimir.add(new Terra("Swamp", Mana.Nero));
		this.drawTwoDimir.add(new Terra("Swamp", Mana.Nero));
		this.drawTwoDimir.add(new Terra("Swamp", Mana.Nero));
		this.drawTwoDimir.add(new Terra("Swamp", Mana.Nero));
		this.drawTwoDimir.add(new Terra("Swamp", Mana.Nero));
		this.drawTwoDimir.add(new Terra("Swamp", Mana.Nero));
		this.drawTwoDimir.add(new Terra("Swamp", Mana.Nero));
		this.drawTwoDimir.add(new Terra("Underground River", Mana.Generico, Mana.Blu, Mana.Nero, true));
		this.drawTwoDimir.add(new Terra("Underground River", Mana.Generico, Mana.Blu, Mana.Nero, true));
		this.drawTwoDimir.add(new Terra("Underground River", Mana.Generico, Mana.Blu, Mana.Nero, true));
		this.drawTwoDimir.add(new Terra("Underground River", Mana.Generico, Mana.Blu, Mana.Nero, true));
	}
}
