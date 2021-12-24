package com.dawson.model;


public class bigMonster implements Runnable{

    Role chaoren = new Role();
    Role sishen = new Role();
    Role xiake = new Role();
    public Thread chaorenT;
    public Thread sishenT;
    public Thread xiakeT;

        public bigMonster() {
            chaoren.setName("超人");
            sishen.setName("死神");
            xiake.setName("侠客");
            chaorenT = new Thread(this);
            sishenT = new Thread(this);
            xiakeT = new Thread(this);
        }

        int life = 200;
        int m = 0;

        public void run() {

               while (life > 0 && (xiake.getLifevalue() > 0 || sishen.getLifevalue() > 0 || chaoren.getLifevalue() > 0)) {
                      attackGuishou();
               }
        }


        public Role getTarget() {

            Role temp = chaoren;
            if (sishen.attaTrend() > temp.attaTrend() && sishen.getLive() != -1) {
                temp = sishen;
            }

            if (xiake.attaTrend() > temp.attaTrend() && xiake.getLive() != -1) {
                temp = xiake;
            }
            return temp;

        }

        public synchronized void attackGuishou() {

            if (Thread.currentThread() == chaorenT) {
                if (chaoren.getLive() == -1) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    int i = 0;
                    while(chaoren.getLive() != -1 && life > 0) {
                        System.out.println("怪兽还有" + life);
                        if (i == 0) {
                            System.out.println("超人使用雷霆攻击伤害了怪兽30滴血");
                            life -= 30;
                            chaoren.plusAttackTimes();
                            chaoren.plusDistence();
                            guaishouAttack();
                        } else if (i == 1) {
                            System.out.println("超人使用龟派气功攻击伤害了怪兽20滴血");
                            life -= 20;
                            chaoren.plusAttackTimes();
                            chaoren.subtractDistence();
                            guaishouAttack();
                        }

                        if (life < 0) {
                            System.out.println("怪兽已死");
                        }
                        i = (i + 1)%2;
                    }
                }
            }

            if (Thread.currentThread() == sishenT) {
                if (sishen.getLive() == -1) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    int i = 0;
                    while(sishen.getLive() != -1 && life > 0) {
                        System.out.println("怪兽还有" + life);
                        if (i == 0) {
                            System.out.println("死神使用扣心攻击伤害了怪兽30滴血");
                            life -= 30;
                            sishen.plusAttackTimes();
                            sishen.plusDistence();
                            guaishouAttack();
                        } else if (i == 1) {
                            System.out.println("死神使用干扰伤害了怪兽20滴血");
                            life -= 20;
                            sishen.plusAttackTimes();
                            sishen.plusDistence();
                            guaishouAttack();
                        }
                        i = (i + 1)%2;
                        if (life < 0) {
                            System.out.println("怪兽已死");
                        }
                    }
                }
            }

            if (Thread.currentThread() == xiakeT) {
                if (xiake.getLive() == -1) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    int i = 0;
                    while(xiake.getLive() != -1 && life > 0) {
                        if (i == 0) {
                            System.out.println("侠客使用飞镖攻击伤害了怪兽30滴血");
                            life -= 30;
                            xiake.plusAttackTimes();
                            xiake.plusDistence();
                            System.out.println("侠客还有" + xiake.getLifevalue());
                            guaishouAttack();
                        } else if (i == 1) {
                            System.out.println("侠客使用雷霆攻击伤害了怪兽20滴血");
                            life -= 20;
                            xiake.plusAttackTimes();
                            xiake.plusDistence();
                            guaishouAttack();

                        }
                        i = (i + 1)%2;
                        if (life < 0) {
                            System.out.println("怪兽已死");
                        }
                    }
                }
            }
        }



        public synchronized void guaishouAttack() {

            if (life > 0) {

                    Role target = getTarget();

                    if (m == 0) {
                        System.out.println("怪兽使用致盲攻击伤害了" + target.getName() + "30滴血");
                        if (target.getName() == "侠客") {
                            xiake.subLife(30);
                        } else if (target.getName() == "死神"){
                            sishen.subLife(30);
                        } else if (target.getName() == "超人"){
                            chaoren.subLife(30);
                        }
                    } else if (m == 1) {
                        System.out.println("怪兽使用遁地术伤害了" + target.getName() + "50滴血");
                        if (target.getName() == "侠客") {
                            xiake.subLife(50);
                        } else if (target.getName() == "死神"){
                            sishen.subLife(50);
                        } else if (target.getName() == "超人"){
                            chaoren.subLife(50);
                        }
                    }

                    if (target.getLifevalue() <= 0) {
                        target.setLive(-1);
                        System.out.println(target.getName() + "已经死亡");
                        if (target.getName() == "侠客") {
                            xiake.setLive(-1);
                        } else if (target.getName() == "死神"){
                            sishen.setLive(-1);
                        } else if (target.getName() == "超人"){
                            chaoren.setLive(-1);
                        }
                    }

                    m = (m + 1)%2;
                }

        }


}
