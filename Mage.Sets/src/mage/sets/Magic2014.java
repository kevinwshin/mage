
package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 *
 * @author North
 */
public final class Magic2014 extends ExpansionSet {

    private static final Magic2014 instance = new Magic2014();

    public static Magic2014 getInstance() {
        return instance;
    }

    private Magic2014() {
        super("Magic 2014", "M14", ExpansionSet.buildDate(2013, 7, 19), SetType.CORE);
        this.hasBoosters = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;
        cards.add(new SetCardInfo("Academy Raider", 124, Rarity.COMMON, mage.cards.a.AcademyRaider.class));
        cards.add(new SetCardInfo("Accorder's Shield", 204, Rarity.UNCOMMON, mage.cards.a.AccordersShield.class));
        cards.add(new SetCardInfo("Accursed Spirit", 83, Rarity.COMMON, mage.cards.a.AccursedSpirit.class));
        cards.add(new SetCardInfo("Act of Treason", 125, Rarity.COMMON, mage.cards.a.ActOfTreason.class));
        cards.add(new SetCardInfo("Advocate of the Beast", 164, Rarity.COMMON, mage.cards.a.AdvocateOfTheBeast.class));
        cards.add(new SetCardInfo("Air Servant", 42, Rarity.UNCOMMON, mage.cards.a.AirServant.class));
        cards.add(new SetCardInfo("Ajani, Caller of the Pride", 1, Rarity.MYTHIC, mage.cards.a.AjaniCallerOfThePride.class));
        cards.add(new SetCardInfo("Ajani's Chosen", 2, Rarity.RARE, mage.cards.a.AjanisChosen.class));
        cards.add(new SetCardInfo("Altar's Reap", 84, Rarity.COMMON, mage.cards.a.AltarsReap.class));
        cards.add(new SetCardInfo("Angelic Accord", 3, Rarity.UNCOMMON, mage.cards.a.AngelicAccord.class));
        cards.add(new SetCardInfo("Angelic Wall", 4, Rarity.COMMON, mage.cards.a.AngelicWall.class));
        cards.add(new SetCardInfo("Archaeomancer", 43, Rarity.COMMON, mage.cards.a.Archaeomancer.class));
        cards.add(new SetCardInfo("Archangel of Thune", 5, Rarity.MYTHIC, mage.cards.a.ArchangelOfThune.class));
        cards.add(new SetCardInfo("Armored Cancrix", 44, Rarity.COMMON, mage.cards.a.ArmoredCancrix.class));
        cards.add(new SetCardInfo("Artificer's Hex", 85, Rarity.UNCOMMON, mage.cards.a.ArtificersHex.class));
        cards.add(new SetCardInfo("Auramancer", 6, Rarity.COMMON, mage.cards.a.Auramancer.class));
        cards.add(new SetCardInfo("Awaken the Ancient", 126, Rarity.RARE, mage.cards.a.AwakenTheAncient.class));
        cards.add(new SetCardInfo("Banisher Priest", 7, Rarity.UNCOMMON, mage.cards.b.BanisherPriest.class));
        cards.add(new SetCardInfo("Barrage of Expendables", 127, Rarity.UNCOMMON, mage.cards.b.BarrageOfExpendables.class));
        cards.add(new SetCardInfo("Battle Sliver", 128, Rarity.UNCOMMON, mage.cards.b.BattleSliver.class));
        cards.add(new SetCardInfo("Blessing", 8, Rarity.UNCOMMON, mage.cards.b.Blessing.class));
        cards.add(new SetCardInfo("Blightcaster", 86, Rarity.UNCOMMON, mage.cards.b.Blightcaster.class));
        cards.add(new SetCardInfo("Blood Bairn", 87, Rarity.COMMON, mage.cards.b.BloodBairn.class));
        cards.add(new SetCardInfo("Blur Sliver", 129, Rarity.COMMON, mage.cards.b.BlurSliver.class));
        cards.add(new SetCardInfo("Bogbrew Witch", 88, Rarity.RARE, mage.cards.b.BogbrewWitch.class));
        cards.add(new SetCardInfo("Bonescythe Sliver", 9, Rarity.RARE, mage.cards.b.BonescytheSliver.class));
        cards.add(new SetCardInfo("Bramblecrush", 165, Rarity.UNCOMMON, mage.cards.b.Bramblecrush.class));
        cards.add(new SetCardInfo("Brave the Elements", 10, Rarity.UNCOMMON, mage.cards.b.BraveTheElements.class));
        cards.add(new SetCardInfo("Briarpack Alpha", 166, Rarity.UNCOMMON, mage.cards.b.BriarpackAlpha.class));
        cards.add(new SetCardInfo("Brindle Boar", 167, Rarity.COMMON, mage.cards.b.BrindleBoar.class));
        cards.add(new SetCardInfo("Bubbling Cauldron", 205, Rarity.UNCOMMON, mage.cards.b.BubblingCauldron.class));
        cards.add(new SetCardInfo("Burning Earth", 130, Rarity.RARE, mage.cards.b.BurningEarth.class));
        cards.add(new SetCardInfo("Cancel", 45, Rarity.COMMON, mage.cards.c.Cancel.class));
        cards.add(new SetCardInfo("Canyon Minotaur", 131, Rarity.COMMON, mage.cards.c.CanyonMinotaur.class));
        cards.add(new SetCardInfo("Capashen Knight", 11, Rarity.COMMON, mage.cards.c.CapashenKnight.class));
        cards.add(new SetCardInfo("Celestial Flare", 12, Rarity.COMMON, mage.cards.c.CelestialFlare.class));
        cards.add(new SetCardInfo("Chandra, Pyromaster", 132, Rarity.MYTHIC, mage.cards.c.ChandraPyromaster.class));
        cards.add(new SetCardInfo("Chandra's Outrage", 133, Rarity.COMMON, mage.cards.c.ChandrasOutrage.class));
        cards.add(new SetCardInfo("Chandra's Phoenix", 134, Rarity.RARE, mage.cards.c.ChandrasPhoenix.class));
        cards.add(new SetCardInfo("Charging Griffin", 13, Rarity.COMMON, mage.cards.c.ChargingGriffin.class));
        cards.add(new SetCardInfo("Child of Night", 89, Rarity.COMMON, mage.cards.c.ChildOfNight.class));
        cards.add(new SetCardInfo("Claustrophobia", 46, Rarity.COMMON, mage.cards.c.Claustrophobia.class));
        cards.add(new SetCardInfo("Clone", 47, Rarity.RARE, mage.cards.c.Clone.class));
        cards.add(new SetCardInfo("Colossal Whale", 48, Rarity.RARE, mage.cards.c.ColossalWhale.class));
        cards.add(new SetCardInfo("Congregate", 14, Rarity.UNCOMMON, mage.cards.c.Congregate.class));
        cards.add(new SetCardInfo("Coral Merfolk", 49, Rarity.COMMON, mage.cards.c.CoralMerfolk.class));
        cards.add(new SetCardInfo("Corpse Hauler", 90, Rarity.COMMON, mage.cards.c.CorpseHauler.class));
        cards.add(new SetCardInfo("Corrupt", 91, Rarity.UNCOMMON, mage.cards.c.Corrupt.class));
        cards.add(new SetCardInfo("Cyclops Tyrant", 135, Rarity.COMMON, mage.cards.c.CyclopsTyrant.class));
        cards.add(new SetCardInfo("Dark Favor", 92, Rarity.COMMON, mage.cards.d.DarkFavor.class));
        cards.add(new SetCardInfo("Dark Prophecy", 93, Rarity.RARE, mage.cards.d.DarkProphecy.class));
        cards.add(new SetCardInfo("Darksteel Forge", 206, Rarity.MYTHIC, mage.cards.d.DarksteelForge.class));
        cards.add(new SetCardInfo("Darksteel Ingot", 207, Rarity.COMMON, mage.cards.d.DarksteelIngot.class));
        cards.add(new SetCardInfo("Dawnstrike Paladin", 15, Rarity.COMMON, mage.cards.d.DawnstrikePaladin.class));
        cards.add(new SetCardInfo("Deadly Recluse", 168, Rarity.COMMON, mage.cards.d.DeadlyRecluse.class));
        cards.add(new SetCardInfo("Deathgaze Cockatrice", 94, Rarity.COMMON, mage.cards.d.DeathgazeCockatrice.class));
        cards.add(new SetCardInfo("Demolish", 136, Rarity.COMMON, mage.cards.d.Demolish.class));
        cards.add(new SetCardInfo("Devout Invocation", 16, Rarity.MYTHIC, mage.cards.d.DevoutInvocation.class));
        cards.add(new SetCardInfo("Diabolic Tutor", 95, Rarity.UNCOMMON, mage.cards.d.DiabolicTutor.class));
        cards.add(new SetCardInfo("Dismiss into Dream", 50, Rarity.RARE, mage.cards.d.DismissIntoDream.class));
        cards.add(new SetCardInfo("Disperse", 51, Rarity.COMMON, mage.cards.d.Disperse.class));
        cards.add(new SetCardInfo("Divination", 52, Rarity.COMMON, mage.cards.d.Divination.class));
        cards.add(new SetCardInfo("Divine Favor", 17, Rarity.COMMON, mage.cards.d.DivineFavor.class));
        cards.add(new SetCardInfo("Domestication", 53, Rarity.RARE, mage.cards.d.Domestication.class));
        cards.add(new SetCardInfo("Doom Blade", 96, Rarity.UNCOMMON, mage.cards.d.DoomBlade.class));
        cards.add(new SetCardInfo("Door of Destinies", 208, Rarity.RARE, mage.cards.d.DoorOfDestinies.class));
        cards.add(new SetCardInfo("Dragon Egg", 137, Rarity.UNCOMMON, mage.cards.d.DragonEgg.class));
        cards.add(new SetCardInfo("Dragon Hatchling", 138, Rarity.COMMON, mage.cards.d.DragonHatchling.class));
        cards.add(new SetCardInfo("Duress", 97, Rarity.COMMON, mage.cards.d.Duress.class));
        cards.add(new SetCardInfo("Elite Arcanist", 54, Rarity.RARE, mage.cards.e.EliteArcanist.class));
        cards.add(new SetCardInfo("Elixir of Immortality", 209, Rarity.UNCOMMON, mage.cards.e.ElixirOfImmortality.class));
        cards.add(new SetCardInfo("Elvish Mystic", 169, Rarity.COMMON, mage.cards.e.ElvishMystic.class));
        cards.add(new SetCardInfo("Encroaching Wastes", 227, Rarity.UNCOMMON, mage.cards.e.EncroachingWastes.class));
        cards.add(new SetCardInfo("Enlarge", 170, Rarity.UNCOMMON, mage.cards.e.Enlarge.class));
        cards.add(new SetCardInfo("Essence Scatter", 55, Rarity.COMMON, mage.cards.e.EssenceScatter.class));
        cards.add(new SetCardInfo("Festering Newt", 98, Rarity.COMMON, mage.cards.f.FesteringNewt.class));
        cards.add(new SetCardInfo("Fiendslayer Paladin", 18, Rarity.RARE, mage.cards.f.FiendslayerPaladin.class));
        cards.add(new SetCardInfo("Fireshrieker", 210, Rarity.UNCOMMON, mage.cards.f.Fireshrieker.class));
        cards.add(new SetCardInfo("Flames of the Firebrand", 139, Rarity.UNCOMMON, mage.cards.f.FlamesOfTheFirebrand.class));
        cards.add(new SetCardInfo("Fleshpulper Giant", 140, Rarity.UNCOMMON, mage.cards.f.FleshpulperGiant.class));
        cards.add(new SetCardInfo("Fog", 171, Rarity.COMMON, mage.cards.f.Fog.class));
        cards.add(new SetCardInfo("Forest", 246, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 247, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 248, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 249, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Fortify", 19, Rarity.COMMON, mage.cards.f.Fortify.class));
        cards.add(new SetCardInfo("Frost Breath", 56, Rarity.COMMON, mage.cards.f.FrostBreath.class));
        cards.add(new SetCardInfo("Galerider Sliver", 57, Rarity.RARE, mage.cards.g.GaleriderSliver.class));
        cards.add(new SetCardInfo("Garruk, Caller of Beasts", 172, Rarity.MYTHIC, mage.cards.g.GarrukCallerOfBeasts.class));
        cards.add(new SetCardInfo("Garruk's Horde", 173, Rarity.RARE, mage.cards.g.GarruksHorde.class));
        cards.add(new SetCardInfo("Giant Growth", 174, Rarity.COMMON, mage.cards.g.GiantGrowth.class));
        cards.add(new SetCardInfo("Giant Spider", 175, Rarity.COMMON, mage.cards.g.GiantSpider.class));
        cards.add(new SetCardInfo("Gladecover Scout", 176, Rarity.COMMON, mage.cards.g.GladecoverScout.class));
        cards.add(new SetCardInfo("Glimpse the Future", 58, Rarity.UNCOMMON, mage.cards.g.GlimpseTheFuture.class));
        cards.add(new SetCardInfo("Gnawing Zombie", 99, Rarity.UNCOMMON, mage.cards.g.GnawingZombie.class));
        cards.add(new SetCardInfo("Goblin Diplomats", 141, Rarity.RARE, mage.cards.g.GoblinDiplomats.class));
        cards.add(new SetCardInfo("Goblin Shortcutter", 142, Rarity.COMMON, mage.cards.g.GoblinShortcutter.class));
        cards.add(new SetCardInfo("Griffin Sentinel", 20, Rarity.COMMON, mage.cards.g.GriffinSentinel.class));
        cards.add(new SetCardInfo("Grim Return", 100, Rarity.RARE, mage.cards.g.GrimReturn.class));
        cards.add(new SetCardInfo("Groundshaker Sliver", 177, Rarity.COMMON, mage.cards.g.GroundshakerSliver.class));
        cards.add(new SetCardInfo("Guardian of the Ages", 211, Rarity.RARE, mage.cards.g.GuardianOfTheAges.class));
        cards.add(new SetCardInfo("Haunted Plate Mail", 212, Rarity.RARE, mage.cards.h.HauntedPlateMail.class));
        cards.add(new SetCardInfo("Hive Stirrings", 21, Rarity.COMMON, mage.cards.h.HiveStirrings.class));
        cards.add(new SetCardInfo("Howl of the Night Pack", 178, Rarity.UNCOMMON, mage.cards.h.HowlOfTheNightPack.class));
        cards.add(new SetCardInfo("Hunt the Weak", 179, Rarity.COMMON, mage.cards.h.HuntTheWeak.class));
        cards.add(new SetCardInfo("Illusionary Armor", 59, Rarity.UNCOMMON, mage.cards.i.IllusionaryArmor.class));
        cards.add(new SetCardInfo("Imposing Sovereign", 22, Rarity.RARE, mage.cards.i.ImposingSovereign.class));
        cards.add(new SetCardInfo("Indestructibility", 23, Rarity.RARE, mage.cards.i.Indestructibility.class));
        cards.add(new SetCardInfo("Into the Wilds", 180, Rarity.RARE, mage.cards.i.IntoTheWilds.class));
        cards.add(new SetCardInfo("Island", 234, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 235, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 236, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 237, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Jace, Memory Adept", 60, Rarity.MYTHIC, mage.cards.j.JaceMemoryAdept.class));
        cards.add(new SetCardInfo("Jace's Mindseeker", 61, Rarity.RARE, mage.cards.j.JacesMindseeker.class));
        cards.add(new SetCardInfo("Kalonian Hydra", 181, Rarity.MYTHIC, mage.cards.k.KalonianHydra.class));
        cards.add(new SetCardInfo("Kalonian Tusker", 182, Rarity.UNCOMMON, mage.cards.k.KalonianTusker.class));
        cards.add(new SetCardInfo("Lava Axe", 143, Rarity.COMMON, mage.cards.l.LavaAxe.class));
        cards.add(new SetCardInfo("Lay of the Land", 183, Rarity.COMMON, mage.cards.l.LayOfTheLand.class));
        cards.add(new SetCardInfo("Lifebane Zombie", 101, Rarity.RARE, mage.cards.l.LifebaneZombie.class));
        cards.add(new SetCardInfo("Lightning Talons", 144, Rarity.COMMON, mage.cards.l.LightningTalons.class));
        cards.add(new SetCardInfo("Liliana of the Dark Realms", 102, Rarity.MYTHIC, mage.cards.l.LilianaOfTheDarkRealms.class));
        cards.add(new SetCardInfo("Liliana's Reaver", 103, Rarity.RARE, mage.cards.l.LilianasReaver.class));
        cards.add(new SetCardInfo("Liturgy of Blood", 104, Rarity.COMMON, mage.cards.l.LiturgyOfBlood.class));
        cards.add(new SetCardInfo("Manaweft Sliver", 184, Rarity.UNCOMMON, mage.cards.m.ManaweftSliver.class));
        cards.add(new SetCardInfo("Marauding Maulhorn", 145, Rarity.COMMON, mage.cards.m.MaraudingMaulhorn.class));
        cards.add(new SetCardInfo("Mark of the Vampire", 105, Rarity.COMMON, mage.cards.m.MarkOfTheVampire.class));
        cards.add(new SetCardInfo("Master of Diversion", 24, Rarity.COMMON, mage.cards.m.MasterOfDiversion.class));
        cards.add(new SetCardInfo("Megantic Sliver", 185, Rarity.RARE, mage.cards.m.MeganticSliver.class));
        cards.add(new SetCardInfo("Merfolk Spy", 62, Rarity.COMMON, mage.cards.m.MerfolkSpy.class));
        cards.add(new SetCardInfo("Messenger Drake", 63, Rarity.COMMON, mage.cards.m.MessengerDrake.class));
        cards.add(new SetCardInfo("Millstone", 213, Rarity.UNCOMMON, mage.cards.m.Millstone.class));
        cards.add(new SetCardInfo("Mind Rot", 106, Rarity.COMMON, mage.cards.m.MindRot.class));
        cards.add(new SetCardInfo("Mindsparker", 146, Rarity.RARE, mage.cards.m.Mindsparker.class));
        cards.add(new SetCardInfo("Minotaur Abomination", 107, Rarity.COMMON, mage.cards.m.MinotaurAbomination.class));
        cards.add(new SetCardInfo("Molten Birth", 147, Rarity.UNCOMMON, mage.cards.m.MoltenBirth.class));
        cards.add(new SetCardInfo("Mountain", 242, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 243, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 244, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 245, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mutavault", 228, Rarity.RARE, mage.cards.m.Mutavault.class));
        cards.add(new SetCardInfo("Naturalize", 186, Rarity.COMMON, mage.cards.n.Naturalize.class));
        cards.add(new SetCardInfo("Negate", 64, Rarity.COMMON, mage.cards.n.Negate.class));
        cards.add(new SetCardInfo("Nephalia Seakite", 65, Rarity.COMMON, mage.cards.n.NephaliaSeakite.class));
        cards.add(new SetCardInfo("Nightmare", 108, Rarity.RARE, mage.cards.n.Nightmare.class));
        cards.add(new SetCardInfo("Nightwing Shade", 109, Rarity.COMMON, mage.cards.n.NightwingShade.class));
        cards.add(new SetCardInfo("Oath of the Ancient Wood", 187, Rarity.RARE, mage.cards.o.OathOfTheAncientWood.class));
        cards.add(new SetCardInfo("Ogre Battledriver", 148, Rarity.RARE, mage.cards.o.OgreBattledriver.class));
        cards.add(new SetCardInfo("Opportunity", 66, Rarity.UNCOMMON, mage.cards.o.Opportunity.class));
        cards.add(new SetCardInfo("Pacifism", 25, Rarity.COMMON, mage.cards.p.Pacifism.class));
        cards.add(new SetCardInfo("Path of Bravery", 26, Rarity.RARE, mage.cards.p.PathOfBravery.class));
        cards.add(new SetCardInfo("Pay No Heed", 27, Rarity.COMMON, mage.cards.p.PayNoHeed.class));
        cards.add(new SetCardInfo("Phantom Warrior", 67, Rarity.UNCOMMON, mage.cards.p.PhantomWarrior.class));
        cards.add(new SetCardInfo("Pillarfield Ox", 28, Rarity.COMMON, mage.cards.p.PillarfieldOx.class));
        cards.add(new SetCardInfo("Pitchburn Devils", 149, Rarity.COMMON, mage.cards.p.PitchburnDevils.class));
        cards.add(new SetCardInfo("Plains", 230, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 231, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 232, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 233, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Planar Cleansing", 29, Rarity.RARE, mage.cards.p.PlanarCleansing.class));
        cards.add(new SetCardInfo("Plummet", 188, Rarity.COMMON, mage.cards.p.Plummet.class));
        cards.add(new SetCardInfo("Predatory Sliver", 189, Rarity.COMMON, mage.cards.p.PredatorySliver.class));
        cards.add(new SetCardInfo("Primeval Bounty", 190, Rarity.MYTHIC, mage.cards.p.PrimevalBounty.class));
        cards.add(new SetCardInfo("Pyromancer's Gauntlet", 214, Rarity.RARE, mage.cards.p.PyromancersGauntlet.class));
        cards.add(new SetCardInfo("Quag Sickness", 110, Rarity.COMMON, mage.cards.q.QuagSickness.class));
        cards.add(new SetCardInfo("Quicken", 68, Rarity.RARE, mage.cards.q.Quicken.class));
        cards.add(new SetCardInfo("Ranger's Guile", 191, Rarity.COMMON, mage.cards.r.RangersGuile.class));
        cards.add(new SetCardInfo("Ratchet Bomb", 215, Rarity.RARE, mage.cards.r.RatchetBomb.class));
        cards.add(new SetCardInfo("Regathan Firecat", 150, Rarity.COMMON, mage.cards.r.RegathanFirecat.class));
        cards.add(new SetCardInfo("Ring of Three Wishes", 216, Rarity.MYTHIC, mage.cards.r.RingOfThreeWishes.class));
        cards.add(new SetCardInfo("Rise of the Dark Realms", 111, Rarity.MYTHIC, mage.cards.r.RiseOfTheDarkRealms.class));
        cards.add(new SetCardInfo("Rod of Ruin", 217, Rarity.UNCOMMON, mage.cards.r.RodOfRuin.class));
        cards.add(new SetCardInfo("Rootwalla", 192, Rarity.COMMON, mage.cards.r.Rootwalla.class));
        cards.add(new SetCardInfo("Rumbling Baloth", 193, Rarity.COMMON, mage.cards.r.RumblingBaloth.class));
        cards.add(new SetCardInfo("Sanguine Bond", 112, Rarity.RARE, mage.cards.s.SanguineBond.class));
        cards.add(new SetCardInfo("Savage Summoning", 194, Rarity.RARE, mage.cards.s.SavageSummoning.class));
        cards.add(new SetCardInfo("Scavenging Ooze", 195, Rarity.RARE, mage.cards.s.ScavengingOoze.class));
        cards.add(new SetCardInfo("Scourge of Valkas", 151, Rarity.MYTHIC, mage.cards.s.ScourgeOfValkas.class));
        cards.add(new SetCardInfo("Scroll Thief", 69, Rarity.COMMON, mage.cards.s.ScrollThief.class));
        cards.add(new SetCardInfo("Seacoast Drake", 70, Rarity.COMMON, mage.cards.s.SeacoastDrake.class));
        cards.add(new SetCardInfo("Seismic Stomp", 152, Rarity.COMMON, mage.cards.s.SeismicStomp.class));
        cards.add(new SetCardInfo("Sengir Vampire", 113, Rarity.UNCOMMON, mage.cards.s.SengirVampire.class));
        cards.add(new SetCardInfo("Sensory Deprivation", 71, Rarity.COMMON, mage.cards.s.SensoryDeprivation.class));
        cards.add(new SetCardInfo("Sentinel Sliver", 30, Rarity.COMMON, mage.cards.s.SentinelSliver.class));
        cards.add(new SetCardInfo("Seraph of the Sword", 31, Rarity.RARE, mage.cards.s.SeraphOfTheSword.class));
        cards.add(new SetCardInfo("Serra Angel", 32, Rarity.UNCOMMON, mage.cards.s.SerraAngel.class));
        cards.add(new SetCardInfo("Shadowborn Apostle", 114, Rarity.COMMON, mage.cards.s.ShadowbornApostle.class));
        cards.add(new SetCardInfo("Shadowborn Demon", 115, Rarity.MYTHIC, mage.cards.s.ShadowbornDemon.class));
        cards.add(new SetCardInfo("Shimmering Grotto", 229, Rarity.COMMON, mage.cards.s.ShimmeringGrotto.class));
        cards.add(new SetCardInfo("Shivan Dragon", 154, Rarity.RARE, mage.cards.s.ShivanDragon.class));
        cards.add(new SetCardInfo("Shiv's Embrace", 153, Rarity.UNCOMMON, mage.cards.s.ShivsEmbrace.class));
        cards.add(new SetCardInfo("Shock", 155, Rarity.COMMON, mage.cards.s.Shock.class));
        cards.add(new SetCardInfo("Show of Valor", 33, Rarity.COMMON, mage.cards.s.ShowOfValor.class));
        cards.add(new SetCardInfo("Shrivel", 116, Rarity.COMMON, mage.cards.s.Shrivel.class));
        cards.add(new SetCardInfo("Siege Mastodon", 34, Rarity.COMMON, mage.cards.s.SiegeMastodon.class));
        cards.add(new SetCardInfo("Silence", 35, Rarity.RARE, mage.cards.s.Silence.class));
        cards.add(new SetCardInfo("Sliver Construct", 218, Rarity.COMMON, mage.cards.s.SliverConstruct.class));
        cards.add(new SetCardInfo("Smelt", 156, Rarity.COMMON, mage.cards.s.Smelt.class));
        cards.add(new SetCardInfo("Solemn Offering", 36, Rarity.COMMON, mage.cards.s.SolemnOffering.class));
        cards.add(new SetCardInfo("Soulmender", 37, Rarity.COMMON, mage.cards.s.Soulmender.class));
        cards.add(new SetCardInfo("Spell Blast", 72, Rarity.UNCOMMON, mage.cards.s.SpellBlast.class));
        cards.add(new SetCardInfo("Sporemound", 196, Rarity.COMMON, mage.cards.s.Sporemound.class));
        cards.add(new SetCardInfo("Staff of the Death Magus", 219, Rarity.UNCOMMON, mage.cards.s.StaffOfTheDeathMagus.class));
        cards.add(new SetCardInfo("Staff of the Flame Magus", 220, Rarity.UNCOMMON, mage.cards.s.StaffOfTheFlameMagus.class));
        cards.add(new SetCardInfo("Staff of the Mind Magus", 221, Rarity.UNCOMMON, mage.cards.s.StaffOfTheMindMagus.class));
        cards.add(new SetCardInfo("Staff of the Sun Magus", 222, Rarity.UNCOMMON, mage.cards.s.StaffOfTheSunMagus.class));
        cards.add(new SetCardInfo("Staff of the Wild Magus", 223, Rarity.UNCOMMON, mage.cards.s.StaffOfTheWildMagus.class));
        cards.add(new SetCardInfo("Steelform Sliver", 38, Rarity.UNCOMMON, mage.cards.s.SteelformSliver.class));
        cards.add(new SetCardInfo("Stonehorn Chanter", 39, Rarity.UNCOMMON, mage.cards.s.StonehornChanter.class));
        cards.add(new SetCardInfo("Striking Sliver", 157, Rarity.COMMON, mage.cards.s.StrikingSliver.class));
        cards.add(new SetCardInfo("Strionic Resonator", 224, Rarity.RARE, mage.cards.s.StrionicResonator.class));
        cards.add(new SetCardInfo("Suntail Hawk", 40, Rarity.COMMON, mage.cards.s.SuntailHawk.class));
        cards.add(new SetCardInfo("Swamp", 238, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 239, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 240, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 241, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Syphon Sliver", 117, Rarity.RARE, mage.cards.s.SyphonSliver.class));
        cards.add(new SetCardInfo("Tenacious Dead", 118, Rarity.UNCOMMON, mage.cards.t.TenaciousDead.class));
        cards.add(new SetCardInfo("Thorncaster Sliver", 158, Rarity.RARE, mage.cards.t.ThorncasterSliver.class));
        cards.add(new SetCardInfo("Thunder Strike", 159, Rarity.COMMON, mage.cards.t.ThunderStrike.class));
        cards.add(new SetCardInfo("Tidebinder Mage", 73, Rarity.RARE, mage.cards.t.TidebinderMage.class));
        cards.add(new SetCardInfo("Time Ebb", 74, Rarity.COMMON, mage.cards.t.TimeEbb.class));
        cards.add(new SetCardInfo("Tome Scour", 75, Rarity.COMMON, mage.cards.t.TomeScour.class));
        cards.add(new SetCardInfo("Trading Post", 225, Rarity.RARE, mage.cards.t.TradingPost.class));
        cards.add(new SetCardInfo("Trained Condor", 76, Rarity.COMMON, mage.cards.t.TrainedCondor.class));
        cards.add(new SetCardInfo("Traumatize", 77, Rarity.RARE, mage.cards.t.Traumatize.class));
        cards.add(new SetCardInfo("Trollhide", 197, Rarity.COMMON, mage.cards.t.Trollhide.class));
        cards.add(new SetCardInfo("Undead Minotaur", 119, Rarity.COMMON, mage.cards.u.UndeadMinotaur.class));
        cards.add(new SetCardInfo("Vampire Warlord", 120, Rarity.UNCOMMON, mage.cards.v.VampireWarlord.class));
        cards.add(new SetCardInfo("Vastwood Hydra", 198, Rarity.RARE, mage.cards.v.VastwoodHydra.class));
        cards.add(new SetCardInfo("Verdant Haven", 199, Rarity.COMMON, mage.cards.v.VerdantHaven.class));
        cards.add(new SetCardInfo("Vial of Poison", 226, Rarity.UNCOMMON, mage.cards.v.VialOfPoison.class));
        cards.add(new SetCardInfo("Vile Rebirth", 121, Rarity.COMMON, mage.cards.v.VileRebirth.class));
        cards.add(new SetCardInfo("Volcanic Geyser", 160, Rarity.UNCOMMON, mage.cards.v.VolcanicGeyser.class));
        cards.add(new SetCardInfo("Voracious Wurm", 200, Rarity.UNCOMMON, mage.cards.v.VoraciousWurm.class));
        cards.add(new SetCardInfo("Wall of Frost", 78, Rarity.UNCOMMON, mage.cards.w.WallOfFrost.class));
        cards.add(new SetCardInfo("Wall of Swords", 41, Rarity.UNCOMMON, mage.cards.w.WallOfSwords.class));
        cards.add(new SetCardInfo("Warden of Evos Isle", 79, Rarity.UNCOMMON, mage.cards.w.WardenOfEvosIsle.class));
        cards.add(new SetCardInfo("Water Servant", 80, Rarity.UNCOMMON, mage.cards.w.WaterServant.class));
        cards.add(new SetCardInfo("Wild Guess", 161, Rarity.COMMON, mage.cards.w.WildGuess.class));
        cards.add(new SetCardInfo("Wild Ricochet", 162, Rarity.RARE, mage.cards.w.WildRicochet.class));
        cards.add(new SetCardInfo("Windreader Sphinx", 81, Rarity.MYTHIC, mage.cards.w.WindreaderSphinx.class));
        cards.add(new SetCardInfo("Windstorm", 201, Rarity.UNCOMMON, mage.cards.w.Windstorm.class));
        cards.add(new SetCardInfo("Witchstalker", 202, Rarity.RARE, mage.cards.w.Witchstalker.class));
        cards.add(new SetCardInfo("Woodborn Behemoth", 203, Rarity.UNCOMMON, mage.cards.w.WoodbornBehemoth.class));
        cards.add(new SetCardInfo("Wring Flesh", 122, Rarity.COMMON, mage.cards.w.WringFlesh.class));
        cards.add(new SetCardInfo("Xathrid Necromancer", 123, Rarity.RARE, mage.cards.x.XathridNecromancer.class));
        cards.add(new SetCardInfo("Young Pyromancer", 163, Rarity.UNCOMMON, mage.cards.y.YoungPyromancer.class));
        cards.add(new SetCardInfo("Zephyr Charge", 82, Rarity.COMMON, mage.cards.z.ZephyrCharge.class));
    }
}
