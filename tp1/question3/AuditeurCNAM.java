
package question3;

import java.util.ArrayList;
/**
 * NFP121 TpIntroduction, usage de BlueJ et du "Submitter".
 * 
 * @version septembre 2009
 * @author � compl�ter
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
     * "Cr�ation", le constructeur d'un auditeur avec son nom, son pr�nom et son
     * matricule.
     * 
     * @param nom
     *            le nom de l'auditeur
     * @param prenom
     *            son pr�nom
     * @param matricule
     *            sur la carte d'inscription, pr�s de la photo
     */
    public AuditeurCNAM(String nom, String prenom, String matricule) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
    }

    /**
     * le login au Cnam : 6 premi�res lettres du nom suivies de la premi�re
     * lettre du pr�nom s�par�es de '_' . le login retourn� est en minuscules,
     * le trait d'union, ou sp�ciaux <i>(pour unix)</i> sont remplac�s par des
     * '_' pas de caract�res accentu�s pour le login voir les classes
     * pr�d�fines, java.lang.String : les m�thodes replaceAll, toLowerCase et
     * substring java.lang.Math : la m�thode min<br>
     * <b>BlueJ : Menu Aide</b>
     * 
     * @return le login du Cnam simplifi�, sans les adaptations dues aux
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

               //replace � by e
               if(array[i].equals("�")) {
                   
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

        return login;// � compl�ter
    }

    /**
     * Lecture du nom de l'auditeur.
     * 
     * @return son nom
     */
    public String nom() {
        return this.nom;// � compl�ter
    }

    /**
     * Lecture du pr�nom de l'auditeur.
     * 
     * @return son pr�nom
     */
    public String prenom() {
        return this.prenom;// � compl�ter
    }

    /**
     * Lecture du matricule de l'auditeur.
     * 
     * @return son matricule
     */
    public String matricule() {
        return this.matricule;// � compl�ter
    }

    /**
     * m�thode toString ( m�thode red�finie de la classe Object).
     * 
     * @return la concat�nation du nom, du pr�nom et du login, selon cette
     *         syntaxe
     *         <code>nom() + " " + prenom() +  " login : " + login()</code>
     */
    @Override
    public String toString() {
        return this.nom() + " " + this.prenom() + " login : " + login();
    }

}
