    public class Teacher extends User {
        private Long teacherId;

        public Teacher(String firstName, String lastName, String middleName) {
            super(firstName, lastName, middleName);
        }

        public Long getTeacherId() {
            return teacherId;
        }

        public void setTeacherId(Long teacherId) {
            this.teacherId = teacherId;
        }
    }

