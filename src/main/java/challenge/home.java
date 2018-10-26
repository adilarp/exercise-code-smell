package challenge;

public class home {
    public void build() {
        try{

            String wall = null;

            if (wall.equals("blue")) {
                System.out.println("We are using blue colour wall");
            }

            if (wall == null) {
                System.out.println("We are not using any colour wall");
            }

            Person person = lookForWorker(0);

            if (person.name.equals("Budi")) {
                System.out.println("Budi has assign to work!");
            }

            String window = null;
            if(window != null){
                if(window.equals("Red")){
                    System.out.println("We are using Red Color window");

                } else{
                    if(window.equals("Green")) {
                        System.out.println("We are using "+window+" Color window");
                    }
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private Person lookForWorker(int number){
        if (number == 0){
            return null;
        } else {
            Person p =  new Person();
            p.name = "Budi";
            return p;
        }
    }
}
