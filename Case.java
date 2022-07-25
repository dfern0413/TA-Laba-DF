import java.util.Objects;

public class Case {

    int case_num;
    String start_date;
    String end_date;

    Case(int case_num, String start_date, String end_date) {
        this.case_num = case_num;
        this.start_date = start_date;
        this.end_date = end_date;
    }

    public String toString() {
        return "Case Number: " + case_num + " Check in: " + start_date + " Check out: " + end_date;
    }

    @Override
    public int hashCode() {
        return Objects.hash(case_num, start_date, end_date);
    }

    class Patient {
        String name;
        char sex;
        int age;
        int weight;

        Patient(char sex, int age, int weight) {
            this.sex = sex;
            this.age = age;
            this.weight = weight;
        }

        public String toString() {
            return "Sex: " + sex + " Age: " + age + " Weight: " + weight;
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, sex, age, weight);
        }
    }

    class Diagnose {
        String symptoms;
        String remedy;

        Diagnose(String symptoms, String remedy) {
            this.symptoms = symptoms;
            this.remedy = remedy;
        }

        public String toString() {
            return "S: " + symptoms + " R: " + remedy;
        }

    }

    class workers {
        int amount;


        public workers(int amount) {
            this.amount = amount;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            workers workers = (workers) o;
            return amount == workers.amount;
        }

    }

    class doctor {
        String doctor_name;
        String doctor_specialty;

        public doctor(String doctor_name, String doctor_specialty) {
            this.doctor_name = doctor_name;
            this.doctor_specialty = doctor_specialty;
        }

        @Override
        public int hashCode() {
            return Objects.hash(doctor_name, doctor_specialty);
        }
    }

    class nurse {
        int nurse_amount;

        public nurse(int nurse_amount) {
            this.nurse_amount = nurse_amount;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            nurse nurse = (nurse) o;
            return nurse_amount == nurse.nurse_amount;
        }


    }

    class visitors {
        int visitor_amount;

        public visitors(int visitor_amount) {
            this.visitor_amount = visitor_amount;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            visitors visitors = (visitors) o;
            return visitor_amount == visitors.visitor_amount;
        }

    }

    class room {
        String location;
        int supplies;

        public room(String location, int supplies) {
            this.location = location;
            this.supplies = supplies;

        }

        class bed {
            String bed_type;

            public bed(String bed_type) {
                this.bed_type = bed_type;
            }
        }

        class syringes {
            int syringe_label;

            public syringes(int syringe_label) {
                this.syringe_label = syringe_label;
            }
        }
    }

}
