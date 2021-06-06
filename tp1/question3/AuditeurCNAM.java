
package question3;

import java.util.ArrayList;
/**
 * NFP121 TpIntroduction, usage de BlueJ et du "Submitter".
 * 
 * @version septembre 2009
 * @author à compléter
 * @see java.lang.String, java.lang.Math
 */
public class AuditeurCNAM {
    /** l'attribut nom de chaque auditeur. */
    private String nom;
    /** l'attribut prenom de chaque auditeur. */
    private String prenom;
    /** l'attribut matricule de chaque auditeur. */
    private String matricule;

    /**
     * "Création", le constructeur d'un auditeur avec son nom, son prénom et son
     * matricule.
     * 
     * @param nom
     *            le nom de l'auditeur
     * @param prenom
     *            son prénom
     * @param matricule
     *            sur la carte d'inscription, près de la photo
     */
    public AuditeurCNAM(String nom, String prenom, String matricule) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
    }

    /**
     * le login au Cnam : 6 premières lettres du nom suivies de la première
     * lettre du prénom séparées de '_' . le login retourné est en minuscules,
     * le trait d'union, ou spéciaux <i>(pour unix)</i> sont remplacés par des
     * '_' pas de caractères accentués pour le login voir les classes
     * prédéfines, java.lang.String : les méthodes replaceAll, toLowerCase et
     * substring java.lang.Math : la méthode min<br>
     * <b>BlueJ : Menu Aide</b>
     * 
     * @return le login du Cnam simplifié, sans les adaptations dues aux
     *         homonymes...
     */
    public String login() {
        //ArrayList<String> array = new ArrayList<String>();
        String login = "";
        String[] array =  this.nom.split("");
        String[] array2 =  this.prenom.split("");
        for (int j=0; j<array2.length; j++){
            //capital to small
            array2[j] = array2[j].toLowerCase();
                }
        for (int i=0; i<array.length; i++){
            //capital to small
            array[i] = array[i].toLowerCase();

             //replace - and space  by _
            String shi = array[i];   
            if(array[i].equals("-") || array[i].equals(" ") || array[i].equals("?")) {
                   
                   array[i] = "_";
               }

               //replace é by e
               if(array[i].equals("é")) {
                   
                   array[i] = "e";
               }
           }
           
        if(array.length < 6) {
            //bacause of error out of bounds
           for (int i=0; i<array.length; i++){
               login += array[i] + "";
           }
           login += "_" + array2[0];
        }
        else{
            for (int i=0; i<6; i++){
               login += array[i] + "";
           }
           login += "_" + array2[0];
        }

        return login;// à compléter
    }

    /**
     * Lecture du nom de l'auditeur.
     * 
     * @return son nom
     */
    public String nom() {
        return this.nom;// à compléter
    }

    /**
     * Lecture du prénom de l'auditeur.
     * 
     * @return son prénom
     */
    public String prenom() {
        return this.prenom;// à compléter
    }

    /**
     * Lecture du matricule de l'auditeur.
     * 
     * @return son matricule
     */
    public String matricule() {
        return this.matricule;// à compléter
    }

    /**
     * méthode toString ( méthode redéfinie de la classe Object).
     * 
     * @return la concaténation du nom, du prénom et du login, selon cette
     *         syntaxe
     *         <code>nom() + " " + prenom() +  " login : " + login()</code>
     */
    @Override
    public String toString() {
        return this.nom() + " " + this.prenom() + " login : " + login();
    }

}
