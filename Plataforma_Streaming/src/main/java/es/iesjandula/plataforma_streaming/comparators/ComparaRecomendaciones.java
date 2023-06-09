package es.iesjandula.plataforma_streaming.comparators;

import java.util.Comparator;

import es.iesjandula.plataforma_streaming.clases.Audiovisual;
import es.iesjandula.plataforma_streaming.clases.Recommendations;

/**
 *
 * @author Silvia Mesa this class is a comparator to sort an Arrays. The first
 * Audiovisual to be the best Ratings
 *
 */

public class ComparaRecomendaciones implements Comparator<Audiovisual> 
{

    @Override
    /**
     * Returns a positive number if the left Audiovisual is more bigger that
     * Audiovisual to right. So returns a negative number is order is reverse.
     *
     * @param Audiovisual o1 is a Audivisual type Object. .@param Audiovisual o1
     * is a Audivisual type Object.
     * @return int is a indicator to order
		 *
     */
    public int compare(Audiovisual o1, Audiovisual o2) 
    {

        Recommendations[] A = o1.getRecommendations();
        Recommendations[] B = o2.getRecommendations();
        int acumA = 0;
        int acumB = 0;

        for (int i = 0; i < A.length; i++) 
        {
            acumA += A[i].getRatings();
        }

        for (int i = 0; i < B.length; i++) 
        {
            acumB += B[i].getRatings();
        }
        
        return acumA-acumB ;
    }

    
}

