package com.pattern;

public class Soldier {
    private String name;
    private String lastName;
    private String rank;
    private int badgeNumber;
    private String bloodType;
    private String typeOfTroops;
    private String sex;

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getRank() {
        return rank;
    }

    public int getBadgeNumber() {
        return badgeNumber;
    }

    public String getBloodType() {
        return bloodType;
    }

    public String getTypeOfTroops() {
        return typeOfTroops;
    }

    public String getSex() {
        return sex;
    }
//
//    public static Builder newSoldier(){
//        return  new Soldier().new Builder();
//    }

    public static class Builder {
        private String name;
        private String lastName;
        private String rank;
        private int badgeNumber;
        private String bloodType;
        private String typeOfTroops;
        private String sex;

        public Builder () {}


        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setRank(String rank) {
            this.rank = rank;
            return this;
        }

        public Builder setBadgeNumber(int badgeNumber) {
            this.badgeNumber = badgeNumber;
            return this;
        }

        public Builder setBloodType(String bloodType) {
            this.bloodType = bloodType;
            return this;
        }

        public Builder setTypeOfTroops(String typeOfTroops) {
            this.typeOfTroops = typeOfTroops;
            return this;
        }

        public Builder setSex(String sex) {
            this.sex = sex;
            return this;
        }

        public Soldier build (){
            Soldier s = new Soldier();
            s.typeOfTroops = this.typeOfTroops;
            s.badgeNumber = this.badgeNumber;
            s.bloodType = this.bloodType;
            s.name = this.name;
            s.sex = this.sex;
            s.rank = this.rank;
            s.lastName = this.lastName;

            return s;
        }
    }
}
