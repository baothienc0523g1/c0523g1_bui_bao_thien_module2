package ss22_structural_design_pattern.practice.practice2;

public class Twitter implements SocialShare {
    private String message;

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void share() {
        System.out.println("Sharing to Twitter: " + this.message);
    }
}

    class Facebook implements SocialShare {
        private String message;

        @Override
        public void setMessage(String message) {
            this.message = message;
        }

        @Override
        public void share() {
            System.out.println("Sharing to Facebook: " + this.message);
        }
    }

    class LinkedIn implements SocialShare {
        private String message;

        @Override
        public void setMessage(String message) {
            this.message = message;
        }

        @Override
        public void share() {
            System.out.println("Sharing to LinkedIn: " + this.message);
        }
    }
