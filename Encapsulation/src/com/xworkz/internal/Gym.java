package com.xworkz.internal;

public class Gym {
        private String trainer;
        private String equipment;
        private String floorType;
        private String openingHours;
        private String membershipType;


        void setTrainer(String trainer){
            this.trainer = trainer;
        }
        void setEquipment(String equipment){
            this.equipment = equipment;
        }
        void setFloorType(String floorType){
            this.floorType = floorType;
        }
        void setOpeningHours(String openingHours){
            this.openingHours = openingHours;
        }
        void setMembershipType(String membershipType){
            this.membershipType = membershipType;
        }


        public String getTrainer(){
            return this.trainer;
        }
        public String getEquipment(){
            return this.equipment;
        }
        public String getFloorType(){
            return this.floorType;
        }
        public String getOpeningHours(){
            return this.openingHours;
        }
        public String getMembershipType(){
            return this.membershipType;
        }

}
