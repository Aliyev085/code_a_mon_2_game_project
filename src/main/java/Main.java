import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Random rand = new Random();
        // Chain of Responsibility Pattern
        CodeAMonStats codeAMonStatsFire1 = new CodeAMonStats(100, 90, 1, 5, "Fire");
        CodeAMonStats codeAMonStatsFire2 = new CodeAMonStats(100, 90, 1, 5, "Fire");

        CodeAMonStats codeAMonStatsWater1 = new CodeAMonStats(100, 70, 1, 5, "Water");
        CodeAMonStats codeAMonStatsWater2 = new CodeAMonStats(100, 70, 1, 5, "Water");

        CodeAMonStats codeAMonStatsGrass1 = new CodeAMonStats(100, 50, 1, 5, "Grass");
        CodeAMonStats codeAMonStatsGrass2 = new CodeAMonStats(100, 50, 1, 5, "Grass");

        ArrayList<CodeAMonStats> trainerList1 = new ArrayList<CodeAMonStats>();



        //iterator Design pattern


        trainerList1.add(codeAMonStatsFire1);
        trainerList1.add(codeAMonStatsGrass1);
        trainerList1.add(codeAMonStatsWater1);

        ArrayList<CodeAMonStats> trainerList2 = new ArrayList<CodeAMonStats>();
        trainerList2.add(codeAMonStatsFire2);
        trainerList2.add(codeAMonStatsGrass2);
        trainerList2.add(codeAMonStatsWater2);

        TrainerStats trainerStats1 = new TrainerStats(100, 50, 1, "Water Mon Trainer");
        trainerStats1.setListOfMonsters(trainerList1);

        TrainerStats trainerStats2 = new TrainerStats(100, 65, 1, "Fire Mon Trainer");
        trainerStats2.setListOfMonsters(trainerList2);

        for (int i = 0; i < 5; i++) {
            int cycle = rand.nextInt(3) + 1;
            if (cycle == 1) {
                System.out.println("<===================  Day time Starts  ===================>");
                TimeUnit.MILLISECONDS.sleep(500);

                int fightDecide = rand.nextInt(4) + 1;
                if (fightDecide == 1) {
                    System.out.println("\n\n\n\n\nFight Between Fire_Mon and Water_Mon");
                    System.out.println("Game Loading...");
                    TimeUnit.MILLISECONDS.sleep(2000);

                    System.out.println("\nFight Starts");
                    TimeUnit.MILLISECONDS.sleep(500);


                    //command design pattern


                    while (trainerStats1.getListOfMonsters().get(0).getHealth() >= 0 || trainerStats2.getListOfMonsters().get(2).getHealth() >= 0) {
                        int decideAttack = rand.nextInt(100);
                        // Randomly decide either fire attack first or water
                        if (decideAttack % 2 != 0) {
                            System.out.println("\n\nFire Attack on Water");
                            TimeUnit.MILLISECONDS.sleep(500);

                            // Randomly decide either speedy attack or Double damage attack
                            int attackType = rand.nextInt(3) + 1;
                            if (attackType == 1) {
                                // Speed type Attack on Water mon
                                TimeUnit.MILLISECONDS.sleep(500);

                                // Decorator Pattern
                                Attack fireMonAttack = new SpeedTypeAttack(new FireMonAttack());
                                fireMonAttack.attack();

                                trainerStats1.getListOfMonsters().get(0).setPoints(trainerStats1.getListOfMonsters()
                                        .get(0).getPoints() + 5);

                                trainerStats2.getListOfMonsters().get(2).setHealth(trainerStats2.getListOfMonsters()
                                        .get(2).getHealth() - 5);
                                trainerStats2.getListOfMonsters().get(2).setPoints(trainerStats2.getListOfMonsters()
                                        .get(2).getPoints() - 2);
                            } else if (attackType == 2) {
                                // Double Damage type Attack on Water mon
                                TimeUnit.MILLISECONDS.sleep(500);
                                Attack fireMonAttack = new DoubleDamageTypeAttack(new FireMonAttack());
                                fireMonAttack.attack();

                                trainerStats1.getListOfMonsters().get(0).setPoints(trainerStats1.getListOfMonsters()
                                        .get(0).getPoints() + 8);

                                trainerStats2.getListOfMonsters().get(2).setHealth(trainerStats2.getListOfMonsters()
                                        .get(2).getHealth() - 8);
                                trainerStats2.getListOfMonsters().get(2).setPoints(trainerStats2.getListOfMonsters()
                                        .get(2).getPoints() - 3);
                            } else {
                                // Simple Damage type attack
                                TimeUnit.MILLISECONDS.sleep(500);
                                System.out.println("Simple Attack by Fire on Water MON");

                                trainerStats1.getListOfMonsters().get(0).setPoints(trainerStats1.getListOfMonsters()
                                        .get(0).getPoints() + 3);

                                trainerStats2.getListOfMonsters().get(2).setHealth(trainerStats2.getListOfMonsters()
                                        .get(2).getHealth() - 3);
                                trainerStats2.getListOfMonsters().get(2).setPoints(trainerStats2.getListOfMonsters()
                                        .get(2).getPoints() - 1);
                            }
                        } else {
                            System.out.println("\n\nWater Attack on Fire Mon");
                            TimeUnit.MILLISECONDS.sleep(500);
                            int attackType = rand.nextInt(3) + 1;
                            if (attackType == 1) {
                                // Speed type Attack on Water mon
                                TimeUnit.MILLISECONDS.sleep(500);
                                Attack waterMonAttack = new SpeedTypeAttack(new WaterMonAttack());
                                waterMonAttack.attack();

                                trainerStats2.getListOfMonsters().get(2).setPoints(trainerStats2.getListOfMonsters()
                                        .get(2).getPoints() + 6);

                                trainerStats1.getListOfMonsters().get(0).setHealth(trainerStats1.getListOfMonsters()
                                        .get(0).getHealth() - 6);
                                trainerStats1.getListOfMonsters().get(0).setPoints(trainerStats1.getListOfMonsters()
                                        .get(0).getPoints() - 2);
                            } else if (attackType == 2) {
                                // Double Damage type Attack on Water mon
                                TimeUnit.MILLISECONDS.sleep(500);
                                Attack waterMonAttack = new DoubleDamageTypeAttack(new WaterMonAttack());
                                waterMonAttack.attack();

                                trainerStats2.getListOfMonsters().get(2).setPoints(trainerStats2.getListOfMonsters()
                                        .get(2).getPoints() + 8);

                                trainerStats1.getListOfMonsters().get(0).setHealth(trainerStats1.getListOfMonsters()
                                        .get(0).getHealth() - 8);
                                trainerStats1.getListOfMonsters().get(0).setPoints(trainerStats1.getListOfMonsters()
                                        .get(0).getPoints() - 3);
                            } else {
                                // Simple Damage type attack
                                TimeUnit.MILLISECONDS.sleep(500);
                                System.out.println("Simple Attack by Fire on Water MON");

                                trainerStats2.getListOfMonsters().get(2).setPoints(trainerStats2.getListOfMonsters()
                                        .get(2).getPoints() + 3);

                                trainerStats1.getListOfMonsters().get(0).setHealth(trainerStats1.getListOfMonsters()
                                        .get(0).getHealth() - 3);
                                trainerStats1.getListOfMonsters().get(0).setPoints(trainerStats1.getListOfMonsters()
                                        .get(0).getPoints() - 1);
                            }
                        }
                    }
                    if (trainerStats1.getListOfMonsters().get(0).getPoints() < 0) {
                        trainerStats1.getListOfMonsters().get(0).setPoints(0);
                    }
                    if (trainerStats2.getListOfMonsters().get(2).getPoints() < 0) {
                        trainerStats2.getListOfMonsters().get(2).setPoints(0);
                    }
                    System.out.println("\n\nTotal points of Fire: " + trainerStats1.getListOfMonsters()
                            .get(0).getPoints());
                    System.out.println("Total points of Water: " + trainerStats2.getListOfMonsters()
                            .get(2).getPoints());
                    if (trainerStats1.getListOfMonsters().get(0).getPoints() > trainerStats2.getListOfMonsters()
                            .get(2).getPoints()) {
                        System.out.println("Winner is Fire Mon");
                    } else {
                        System.out.println("Winner is Water Mon");
                    }
                } else if (fightDecide == 2) {
                    System.out.println("\n\n\n\n\nFight Between Fire_Mon and Grass_Mon");
                    System.out.println("Game Loading...");
                    TimeUnit.MILLISECONDS.sleep(2000);

                    System.out.println("\nFight Starts");
                    TimeUnit.MILLISECONDS.sleep(500);
                    while (trainerStats1.getListOfMonsters().get(0).getHealth() >= 0 || trainerStats2.getListOfMonsters().get(2).getHealth() >= 0) {
                        // Randomly decide either fire attack first or grass
                        int decideAttack = rand.nextInt(100);
                        if (decideAttack % 2 != 0) {
                            System.out.println("\n\nFire Attack on Water");
                            TimeUnit.MILLISECONDS.sleep(500);

                            int attackType = rand.nextInt(3) + 1;
                            if (attackType == 1) {
                                // Speed type Attack on Water mon
                                TimeUnit.MILLISECONDS.sleep(500);
                                Attack fireMonAttack = new SpeedTypeAttack(new FireMonAttack());
                                fireMonAttack.attack();

                                trainerStats1.getListOfMonsters().get(0).setPoints(trainerStats1.getListOfMonsters()
                                        .get(0).getPoints() + 5);

                                trainerStats2.getListOfMonsters().get(2).setHealth(trainerStats2.getListOfMonsters()
                                        .get(2).getHealth() - 5);
                                trainerStats2.getListOfMonsters().get(2).setPoints(trainerStats2.getListOfMonsters()
                                        .get(2).getPoints() - 2);
                            } else if (attackType == 2) {
                                // Double Damage type Attack on Water mon
                                TimeUnit.MILLISECONDS.sleep(500);
                                Attack fireMonAttack = new DoubleDamageTypeAttack(new FireMonAttack());
                                fireMonAttack.attack();

                                trainerStats1.getListOfMonsters().get(0).setPoints(trainerStats1.getListOfMonsters()
                                        .get(0).getPoints() + 8);

                                trainerStats2.getListOfMonsters().get(2).setHealth(trainerStats2.getListOfMonsters()
                                        .get(2).getHealth() - 8);
                                trainerStats2.getListOfMonsters().get(2).setPoints(trainerStats2.getListOfMonsters()
                                        .get(2).getPoints() - 3);
                            } else {
                                // Simple Damage type attack
                                TimeUnit.MILLISECONDS.sleep(500);
                                System.out.println("Simple Attack by Fire on Water MON");

                                trainerStats1.getListOfMonsters().get(0).setPoints(trainerStats2.getListOfMonsters()
                                        .get(0).getPoints() + 3);

                                trainerStats2.getListOfMonsters().get(2).setHealth(trainerStats2.getListOfMonsters()
                                        .get(2).getHealth() - 3);
                                trainerStats2.getListOfMonsters().get(2).setPoints(trainerStats2.getListOfMonsters()
                                        .get(2).getPoints() - 1);
                            }
                        } else {
                            System.out.println("\n\nGrass Attack on Fire Mon");
                            TimeUnit.MILLISECONDS.sleep(500);
                            int attackType = rand.nextInt(3) + 1;
                            if (attackType == 1) {
                                // Speed type Attack on Water mon
                                TimeUnit.MILLISECONDS.sleep(500);
                                Attack grassMonAttack = new SpeedTypeAttack(new GrassMonAttack());
                                grassMonAttack.attack();

                                trainerStats2.getListOfMonsters().get(2).setPoints(trainerStats2.getListOfMonsters()
                                        .get(2).getPoints() + 6);

                                trainerStats1.getListOfMonsters().get(0).setHealth(trainerStats1.getListOfMonsters()
                                        .get(0).getHealth() - 6);
                                trainerStats1.getListOfMonsters().get(0).setPoints(trainerStats1.getListOfMonsters()
                                        .get(0).getPoints() - 2);
                            } else if (attackType == 2) {
                                // Double Damage type Attack on Water mon
                                TimeUnit.MILLISECONDS.sleep(500);
                                Attack grassMonAttack = new DoubleDamageTypeAttack(new GrassMonAttack());
                                grassMonAttack.attack();

                                trainerStats2.getListOfMonsters().get(2).setPoints(trainerStats2.getListOfMonsters()
                                        .get(2).getPoints() + 8);

                                trainerStats1.getListOfMonsters().get(0).setHealth(trainerStats1.getListOfMonsters()
                                        .get(0).getHealth() - 8);
                                trainerStats1.getListOfMonsters().get(0).setPoints(trainerStats1.getListOfMonsters()
                                        .get(0).getPoints() - 3);
                            } else {
                                // Simple Damage type attack
                                TimeUnit.MILLISECONDS.sleep(500);
                                System.out.println("Simple Attack by Grass on Fire MON");

                                trainerStats2.getListOfMonsters().get(2).setPoints(trainerStats2.getListOfMonsters()
                                        .get(2).getPoints() + 3);

                                trainerStats1.getListOfMonsters().get(2).setHealth(trainerStats1.getListOfMonsters()
                                        .get(2).getHealth() - 3);
                                trainerStats1.getListOfMonsters().get(2).setPoints(trainerStats1.getListOfMonsters()
                                        .get(2).getPoints() - 1);
                            }
                        }
                    }
                    if (trainerStats1.getListOfMonsters().get(0).getPoints() < 0) {
                        trainerStats1.getListOfMonsters().get(0).setPoints(0);
                    }
                    if (trainerStats2.getListOfMonsters().get(2).getPoints() < 0) {
                        trainerStats2.getListOfMonsters().get(2).setPoints(0);
                    }
                    System.out.println("\n\nTotal points of Fire: " + trainerStats1.getListOfMonsters()
                            .get(0).getPoints());
                    System.out.println("Total points of Grass: " + trainerStats2.getListOfMonsters().get(2).getPoints());
                    if (trainerStats1.getListOfMonsters().get(0).getPoints() > trainerStats2.getListOfMonsters().get(2).getPoints()) {
                        System.out.println("Winner is Fire Mon");
                    } else {
                        System.out.println("Winner is Grass Mon");
                    }
                } else if (fightDecide == 3) {
                    System.out.println("\n\n\n\n\nFight Between Grass_Mon and Water_Mon");
                    System.out.println("Game Loading...");
                    TimeUnit.MILLISECONDS.sleep(2000);

                    System.out.println("\nFight Starts");
                    TimeUnit.MILLISECONDS.sleep(500);
                    while (trainerStats1.getListOfMonsters().get(2).getHealth() >= 0 || trainerStats2.getListOfMonsters().get(1).getHealth() >= 0) {
                        // Randomly decide either grass attack first or water
                        int decideAttack = rand.nextInt(100);
                        if (decideAttack % 2 != 0) {
                            System.out.println("\n\nGrass Attack on Water");
                            TimeUnit.MILLISECONDS.sleep(500);

                            int attackType = rand.nextInt(3) + 1;
                            if (attackType == 1) {
                                // Speed type Attack on Water mon
                                TimeUnit.MILLISECONDS.sleep(500);
                                Attack grassMonAttack = new SpeedTypeAttack(new GrassMonAttack());
                                grassMonAttack.attack();

                                trainerStats1.getListOfMonsters().get(2).setPoints(trainerStats1.getListOfMonsters()
                                        .get(2).getPoints() + 5);

                                trainerStats2.getListOfMonsters().get(1).setHealth(trainerStats2.getListOfMonsters()
                                        .get(1).getHealth() - 5);
                                trainerStats2.getListOfMonsters().get(1).setPoints(trainerStats2.getListOfMonsters()
                                        .get(1).getPoints() - 2);
                                
                            } else if(attackType == 2) {
                                // Double Damage type Attack on Water mon
                                TimeUnit.MILLISECONDS.sleep(500);
                                Attack grassMonAttack = new SpeedTypeAttack(new GrassMonAttack());
                                grassMonAttack.attack();

                                trainerStats1.getListOfMonsters().get(2).setPoints(trainerStats1.getListOfMonsters()
                                        .get(2).getPoints() + 8);

                                trainerStats2.getListOfMonsters().get(1).setHealth(trainerStats2.getListOfMonsters()
                                        .get(1).getHealth() - 8);
                                trainerStats2.getListOfMonsters().get(1).setPoints(trainerStats2.getListOfMonsters()
                                        .get(1).getPoints() - 3);
                            } else {
                                // Simple Damage type attack
                                TimeUnit.MILLISECONDS.sleep(500);
                                System.out.println("Simple Attack by Grass on Water MON");

                                trainerStats1.getListOfMonsters().get(2).setPoints(trainerStats1.getListOfMonsters()
                                        .get(2).getPoints() + 3);

                                trainerStats2.getListOfMonsters().get(1).setHealth(trainerStats2.getListOfMonsters()
                                        .get(1).getHealth() - 3);
                                trainerStats2.getListOfMonsters().get(1).setPoints(trainerStats2.getListOfMonsters()
                                        .get(1).getPoints() - 1);
                            }
                        } else {
                            System.out.println("\n\nWater Attack on Fire Mon");
                            TimeUnit.MILLISECONDS.sleep(500);
                            int attackType = rand.nextInt(3) + 1;
                            if (attackType == 1) {
                                // Speed type Attack on Water mon
                                TimeUnit.MILLISECONDS.sleep(500);
                                Attack waterMonAttack = new SpeedTypeAttack(new WaterMonAttack());
                                waterMonAttack.attack();

                                trainerStats1.getListOfMonsters().get(2).setPoints(trainerStats1.getListOfMonsters()
                                        .get(2).getPoints() + 6);

                                trainerStats2.getListOfMonsters().get(1).setHealth(trainerStats2.getListOfMonsters().get(1).getHealth() - 6);
                                trainerStats2.getListOfMonsters().get(1).setPoints(trainerStats2.getListOfMonsters().get(1).getPoints() - 2);
                            } else if (attackType == 2) {
                                // Double Damage type Attack on Water mon
                                TimeUnit.MILLISECONDS.sleep(500);
                                Attack waterMonAttack = new SpeedTypeAttack(new WaterMonAttack());
                                waterMonAttack.attack();

                                trainerStats1.getListOfMonsters().get(2).setPoints(trainerStats1.getListOfMonsters()
                                        .get(2).getPoints() + 8);

                                trainerStats2.getListOfMonsters().get(1).setHealth(trainerStats2.getListOfMonsters().get(1).getHealth() - 8);
                                trainerStats2.getListOfMonsters().get(1).setPoints(trainerStats2.getListOfMonsters().get(1).getPoints() - 3);
                            } else {
                                // Simple Damage type attack
                                TimeUnit.MILLISECONDS.sleep(500);
                                System.out.println("Simple Attack by Grass on Fire MON");

                                trainerStats1.getListOfMonsters().get(2).setPoints(trainerStats1.getListOfMonsters()
                                        .get(2).getPoints() + 3);

                                trainerStats2.getListOfMonsters().get(1).setHealth(trainerStats2.getListOfMonsters()
                                        .get(1).getHealth() - 3);
                                trainerStats2.getListOfMonsters().get(1).setPoints(trainerStats2.getListOfMonsters()
                                        .get(1).getPoints() - 1);
                            }
                        }
                    }
                    if (trainerStats1.getListOfMonsters().get(2).getPoints() < 0) {
                        trainerStats1.getListOfMonsters().get(2).setPoints(0);
                    }
                    if (trainerStats2.getListOfMonsters().get(1).getPoints() < 0) {
                        trainerStats2.getListOfMonsters().get(1).setPoints(0);
                    }
                    System.out.println("\n\nTotal points of Grass: " + trainerStats1.getListOfMonsters()
                            .get(2).getPoints());
                    System.out.println("Total points of Water: " + trainerStats2.getListOfMonsters()
                            .get(1).getPoints());
                    if (trainerStats1.getListOfMonsters().get(2).getPoints() > trainerStats2.getListOfMonsters()
                            .get(1).getPoints()) {
                        System.out.println("Winner is Grass Mon");
                    } else {
                        System.out.println("Winner is Water Mon");
                    }
                }
        } else if (cycle == 2) {
                System.out.println("<===================  Night time starts  ===================>");
                TimeUnit.MILLISECONDS.sleep(500);
                int decideMon = rand.nextInt(4) + 1;
                // State Design Pattern
                System.out.println("Practice and Healing Process start");
                if (decideMon == 1) {
                    TimeUnit.MILLISECONDS.sleep(500);

                    System.out.println("Water mon start healing");
                    System.out.println("1st Trainer starts: " + trainerStats1.getListOfMonsters()
                            .get(2).getType() + "Practice to heal");

                    System.out.println("1st Trainer starts: " + trainerStats2.getListOfMonsters()
                            .get(2).getType() + "Practice to heal");
                    TimeUnit.MILLISECONDS.sleep(1000);
                    trainerStats2.getListOfMonsters().get(2).setHealth(trainerStats2.getListOfMonsters()
                            .get(2).getHealth() + 10);
                    trainerStats1.getListOfMonsters().get(2).setHealth(trainerStats1.getListOfMonsters()
                            .get(2).getHealth() + 10);
                    if (trainerStats2.getListOfMonsters().get(2).getHealth() <= 100) {
                        System.out.println("1st Water mon healing process Complete");
                    }

                    if (trainerStats1.getListOfMonsters().get(2).getHealth() <= 100) {
                        System.out.println("2nd Water mon healing process Complete");
                    }

                    if (trainerStats1.getListOfMonsters().get(2).getHealth() >= 100) {
                        trainerStats1.getListOfMonsters().get(2).setHealth(100);
                        System.out.println("1st Water mon healing process Complete");
                    }

                    if (trainerStats2.getListOfMonsters().get(2).getHealth() >= 100) {
                        trainerStats2.getListOfMonsters().get(2).setHealth(100);
                        System.out.println("2nd Water mon healing process Complete");
                    }
                } else if (decideMon == 2) {
                    TimeUnit.MILLISECONDS.sleep(500);

                    System.out.println("Grass mon start healing");
                    System.out.println("1st Trainer starts: " + trainerStats1.getListOfMonsters()
                            .get(1).getType() + "Practice to heal");

                    System.out.println("1st Trainer starts: " + trainerStats2.getListOfMonsters()
                            .get(1).getType() + "Practice to heal");
                    TimeUnit.MILLISECONDS.sleep(1000);
                    trainerStats2.getListOfMonsters().get(1).setHealth(trainerStats2.getListOfMonsters()
                            .get(1).getHealth() + 10);
                    trainerStats1.getListOfMonsters().get(1).setHealth(trainerStats1.getListOfMonsters()
                            .get(1).getHealth() + 10);
                    if (trainerStats2.getListOfMonsters().get(1).getHealth() <= 100) {
                        System.out.println("1st Grass mon healing process Complete");
                    }

                    if (trainerStats1.getListOfMonsters().get(1).getHealth() <= 100) {
                        System.out.println("2nd Grass mon healing process Complete");
                    }

                    if (trainerStats1.getListOfMonsters().get(1).getHealth() >= 100) {
                        trainerStats1.getListOfMonsters().get(1).setHealth(100);
                        System.out.println("1st Grass mon healing process Complete");
                    }

                    if (trainerStats2.getListOfMonsters().get(1).getHealth() >= 100) {
                        trainerStats2.getListOfMonsters().get(1).setHealth(100);
                        System.out.println("2nd Grass mon healing process Complete");
                    }
                } else if (decideMon == 3) {
                    TimeUnit.MILLISECONDS.sleep(500);

                    System.out.println("Fire mon start healing");
                    System.out.println("1st Trainer starts: " + trainerStats1.getListOfMonsters()
                            .get(0).getType() + "Practice to heal");

                    System.out.println("1st Trainer starts: " + trainerStats2.getListOfMonsters()
                            .get(0).getType() + "Practice to heal");
                    TimeUnit.MILLISECONDS.sleep(1000);
                    trainerStats2.getListOfMonsters().get(0).setHealth(trainerStats2.getListOfMonsters()
                            .get(0).getHealth() + 10);
                    trainerStats1.getListOfMonsters().get(0).setHealth(trainerStats1.getListOfMonsters()
                            .get(0).getHealth() + 10);
                    if (trainerStats2.getListOfMonsters().get(0).getHealth() <= 100) {
                        System.out.println("1st Fire mon healing process Complete");
                    }

                    if (trainerStats1.getListOfMonsters().get(0).getHealth() <= 100) {
                        System.out.println("2nd Fire mon healing process Complete");
                    }

                    if (trainerStats1.getListOfMonsters().get(0).getHealth() >= 100) {
                        trainerStats1.getListOfMonsters().get(0).setHealth(100);
                        System.out.println("1st Fire mon healing process Complete");
                    }

                    if (trainerStats2.getListOfMonsters().get(0).getHealth() >= 100) {
                        trainerStats2.getListOfMonsters().get(0).setHealth(100);
                        System.out.println("2nd Fire mon healing process Complete");
                    }
                }
            }
        }
    }
}
