public class Compound {
    public int getWeight(String comp, String atomics) {
        atomics = "H:1,B:11,C:12,N:14,O:16,F:19,P:31,S:32,K:39,I:127";
        String[] atoms = atomics.split(",");
        int weight = 0;
        char c = "H".charAt(0);
        while (comp.length() > 1) {
            for (String atom : atoms) {
                if (comp.startsWith(atom.substring(0, 1))) {
                    c = comp.charAt(1);
                    if (Character.isDigit(c)){
                        weight += Integer.parseInt(String.valueOf(c))*Integer.parseInt(atom.substring(2));
                    }
                    else{
                        weight += Integer.parseInt(atom.substring(2));
                    }
                }
            }
            if (Character.isDigit(c)){
                comp = comp.substring(2);
            }
            else{
                comp = comp.substring(1);
            }

        }
        if (comp.length() == 1){
            for (String atom : atoms) {
                if (comp.startsWith(atom.substring(0, 1))) {
                    weight += Integer.parseInt(atom.substring(2));
                }
            }
        }

        return weight;
    }
    public static void main(String[] args){
        Compound c = new Compound();
        System.out.println(c.getWeight("C2CI2F4", "H:1,B:11,C:12,N:14,O:16,F:19,P:31,S:32,K:39,I:127"));
    }
}