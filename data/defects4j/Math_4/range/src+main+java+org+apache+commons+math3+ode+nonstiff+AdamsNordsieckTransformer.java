{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/ode/nonstiff/AdamsNordsieckTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AdamsNordsieckTransformer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 135,
      "end_line": 340,
      "comment": " Transformer to Nordsieck vectors for Adams integrators.\n * \u003cp\u003eThis class is used by {@link AdamsBashforthIntegrator Adams-Bashforth} and\n * {@link AdamsMoultonIntegrator Adams-Moulton} integrators to convert between\n * classical representation with several previous first derivatives and Nordsieck\n * representation with higher order scaled derivatives.\u003c/p\u003e\n *\n * \u003cp\u003eWe define scaled derivatives s\u003csub\u003ei\u003c/sub\u003e(n) at step n as:\n * \u003cpre\u003e\n * s\u003csub\u003e1\u003c/sub\u003e(n) \u003d h y\u0027\u003csub\u003en\u003c/sub\u003e for first derivative\n * s\u003csub\u003e2\u003c/sub\u003e(n) \u003d h\u003csup\u003e2\u003c/sup\u003e/2 y\u0027\u0027\u003csub\u003en\u003c/sub\u003e for second derivative\n * s\u003csub\u003e3\u003c/sub\u003e(n) \u003d h\u003csup\u003e3\u003c/sup\u003e/6 y\u0027\u0027\u0027\u003csub\u003en\u003c/sub\u003e for third derivative\n * ...\n * s\u003csub\u003ek\u003c/sub\u003e(n) \u003d h\u003csup\u003ek\u003c/sup\u003e/k! y\u003csup\u003e(k)\u003c/sup\u003e\u003csub\u003en\u003c/sub\u003e for k\u003csup\u003eth\u003c/sup\u003e derivative\n * \u003c/pre\u003e\u003c/p\u003e\n *\n * \u003cp\u003eWith the previous definition, the classical representation of multistep methods\n * uses first derivatives only, i.e. it handles y\u003csub\u003en\u003c/sub\u003e, s\u003csub\u003e1\u003c/sub\u003e(n) and\n * q\u003csub\u003en\u003c/sub\u003e where q\u003csub\u003en\u003c/sub\u003e is defined as:\n * \u003cpre\u003e\n *   q\u003csub\u003en\u003c/sub\u003e \u003d [ s\u003csub\u003e1\u003c/sub\u003e(n-1) s\u003csub\u003e1\u003c/sub\u003e(n-2) ... s\u003csub\u003e1\u003c/sub\u003e(n-(k-1)) ]\u003csup\u003eT\u003c/sup\u003e\n * \u003c/pre\u003e\n * (we omit the k index in the notation for clarity).\u003c/p\u003e\n *\n * \u003cp\u003eAnother possible representation uses the Nordsieck vector with\n * higher degrees scaled derivatives all taken at the same step, i.e it handles y\u003csub\u003en\u003c/sub\u003e,\n * s\u003csub\u003e1\u003c/sub\u003e(n) and r\u003csub\u003en\u003c/sub\u003e) where r\u003csub\u003en\u003c/sub\u003e is defined as:\n * \u003cpre\u003e\n * r\u003csub\u003en\u003c/sub\u003e \u003d [ s\u003csub\u003e2\u003c/sub\u003e(n), s\u003csub\u003e3\u003c/sub\u003e(n) ... s\u003csub\u003ek\u003c/sub\u003e(n) ]\u003csup\u003eT\u003c/sup\u003e\n * \u003c/pre\u003e\n * (here again we omit the k index in the notation for clarity)\n * \u003c/p\u003e\n *\n * \u003cp\u003eTaylor series formulas show that for any index offset i, s\u003csub\u003e1\u003c/sub\u003e(n-i) can be\n * computed from s\u003csub\u003e1\u003c/sub\u003e(n), s\u003csub\u003e2\u003c/sub\u003e(n) ... s\u003csub\u003ek\u003c/sub\u003e(n), the formula being exact\n * for degree k polynomials.\n * \u003cpre\u003e\n * s\u003csub\u003e1\u003c/sub\u003e(n-i) \u003d s\u003csub\u003e1\u003c/sub\u003e(n) + \u0026sum;\u003csub\u003ej\u0026gt;1\u003c/sub\u003e j (-i)\u003csup\u003ej-1\u003c/sup\u003e s\u003csub\u003ej\u003c/sub\u003e(n)\n * \u003c/pre\u003e\n * The previous formula can be used with several values for i to compute the transform between\n * classical representation and Nordsieck vector at step end. The transform between r\u003csub\u003en\u003c/sub\u003e\n * and q\u003csub\u003en\u003c/sub\u003e resulting from the Taylor series formulas above is:\n * \u003cpre\u003e\n * q\u003csub\u003en\u003c/sub\u003e \u003d s\u003csub\u003e1\u003c/sub\u003e(n) u + P r\u003csub\u003en\u003c/sub\u003e\n * \u003c/pre\u003e\n * where u is the [ 1 1 ... 1 ]\u003csup\u003eT\u003c/sup\u003e vector and P is the (k-1)\u0026times;(k-1) matrix built\n * with the j (-i)\u003csup\u003ej-1\u003c/sup\u003e terms:\n * \u003cpre\u003e\n *        [  -2   3   -4    5  ... ]\n *        [  -4  12  -32   80  ... ]\n *   P \u003d  [  -6  27 -108  405  ... ]\n *        [  -8  48 -256 1280  ... ]\n *        [          ...           ]\n * \u003c/pre\u003e\u003c/p\u003e\n *\n * \u003cp\u003eChanging -i into +i in the formula above can be used to compute a similar transform between\n * classical representation and Nordsieck vector at step start. The resulting matrix is simply\n * the absolute value of matrix P.\u003c/p\u003e\n *\n * \u003cp\u003eFor {@link AdamsBashforthIntegrator Adams-Bashforth} method, the Nordsieck vector\n * at step n+1 is computed from the Nordsieck vector at step n as follows:\n * \u003cul\u003e\n *   \u003cli\u003ey\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + s\u003csub\u003e1\u003c/sub\u003e(n) + u\u003csup\u003eT\u003c/sup\u003e r\u003csub\u003en\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003es\u003csub\u003e1\u003c/sub\u003e(n+1) \u003d h f(t\u003csub\u003en+1\u003c/sub\u003e, y\u003csub\u003en+1\u003c/sub\u003e)\u003c/li\u003e\n *   \u003cli\u003er\u003csub\u003en+1\u003c/sub\u003e \u003d (s\u003csub\u003e1\u003c/sub\u003e(n) - s\u003csub\u003e1\u003c/sub\u003e(n+1)) P\u003csup\u003e-1\u003c/sup\u003e u + P\u003csup\u003e-1\u003c/sup\u003e A P r\u003csub\u003en\u003c/sub\u003e\u003c/li\u003e\n * \u003c/ul\u003e\n * where A is a rows shifting matrix (the lower left part is an identity matrix):\n * \u003cpre\u003e\n *        [ 0 0   ...  0 0 | 0 ]\n *        [ ---------------+---]\n *        [ 1 0   ...  0 0 | 0 ]\n *    A \u003d [ 0 1   ...  0 0 | 0 ]\n *        [       ...      | 0 ]\n *        [ 0 0   ...  1 0 | 0 ]\n *        [ 0 0   ...  0 1 | 0 ]\n * \u003c/pre\u003e\u003c/p\u003e\n *\n * \u003cp\u003eFor {@link AdamsMoultonIntegrator Adams-Moulton} method, the predicted Nordsieck vector\n * at step n+1 is computed from the Nordsieck vector at step n as follows:\n * \u003cul\u003e\n *   \u003cli\u003eY\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + s\u003csub\u003e1\u003c/sub\u003e(n) + u\u003csup\u003eT\u003c/sup\u003e r\u003csub\u003en\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003eS\u003csub\u003e1\u003c/sub\u003e(n+1) \u003d h f(t\u003csub\u003en+1\u003c/sub\u003e, Y\u003csub\u003en+1\u003c/sub\u003e)\u003c/li\u003e\n *   \u003cli\u003eR\u003csub\u003en+1\u003c/sub\u003e \u003d (s\u003csub\u003e1\u003c/sub\u003e(n) - s\u003csub\u003e1\u003c/sub\u003e(n+1)) P\u003csup\u003e-1\u003c/sup\u003e u + P\u003csup\u003e-1\u003c/sup\u003e A P r\u003csub\u003en\u003c/sub\u003e\u003c/li\u003e\n * \u003c/ul\u003e\n * From this predicted vector, the corrected vector is computed as follows:\n * \u003cul\u003e\n *   \u003cli\u003ey\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + S\u003csub\u003e1\u003c/sub\u003e(n+1) + [ -1 +1 -1 +1 ... \u0026plusmn;1 ] r\u003csub\u003en+1\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003es\u003csub\u003e1\u003c/sub\u003e(n+1) \u003d h f(t\u003csub\u003en+1\u003c/sub\u003e, y\u003csub\u003en+1\u003c/sub\u003e)\u003c/li\u003e\n *   \u003cli\u003er\u003csub\u003en+1\u003c/sub\u003e \u003d R\u003csub\u003en+1\u003c/sub\u003e + (s\u003csub\u003e1\u003c/sub\u003e(n+1) - S\u003csub\u003e1\u003c/sub\u003e(n+1)) P\u003csup\u003e-1\u003c/sup\u003e u\u003c/li\u003e\n * \u003c/ul\u003e\n * where the upper case Y\u003csub\u003en+1\u003c/sub\u003e, S\u003csub\u003e1\u003c/sub\u003e(n+1) and R\u003csub\u003en+1\u003c/sub\u003e represent the\n * predicted states whereas the lower case y\u003csub\u003en+1\u003c/sub\u003e, s\u003csub\u003en+1\u003c/sub\u003e and r\u003csub\u003en+1\u003c/sub\u003e\n * represent the corrected states.\u003c/p\u003e\n *\n * \u003cp\u003eWe observe that both methods use similar update formulas. In both cases a P\u003csup\u003e-1\u003c/sup\u003eu\n * vector and a P\u003csup\u003e-1\u003c/sup\u003e A P matrix are used that do not depend on the state,\n * they only depend on k. This class handles these transformations.\u003c/p\u003e\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "CACHE"
      ],
      "begin_line": 138,
      "end_line": 139,
      "comment": " Cache for already computed coefficients. "
    },
    {
      "type": "field",
      "varNames": [
        "update"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": " Update matrix for the higher order derivatives h\u003csup\u003e2\u003c/sup\u003e/2y\u0027\u0027, h\u003csup\u003e3\u003c/sup\u003e/6 y\u0027\u0027\u0027 ... "
    },
    {
      "type": "field",
      "varNames": [
        "c1"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": " Update coefficients of the higher order derivatives wrt y\u0027. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.nonstiff.AdamsNordsieckTransformer.AdamsNordsieckTransformer(int)",
      "begin_line": 151,
      "end_line": 183,
      "comment": " Simple constructor.\n     * @param nSteps number of steps of the multistep method\n     * (excluding the one being computed)\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 55)",
        "(line 155,col 9)-(line 156,col 68)",
        "(line 158,col 9)-(line 158,col 50)",
        "(line 159,col 9)-(line 159,col 40)",
        "(line 160,col 9)-(line 161,col 74)",
        "(line 166,col 9)-(line 166,col 50)",
        "(line 167,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 171,col 46)",
        "(line 172,col 9)-(line 172,col 51)",
        "(line 173,col 9)-(line 174,col 83)",
        "(line 177,col 9)-(line 177,col 80)",
        "(line 178,col 9)-(line 178,col 44)",
        "(line 179,col 9)-(line 181,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.AdamsNordsieckTransformer.getInstance(int)",
      "begin_line": 190,
      "end_line": 199,
      "comment": " Get the Nordsieck transformer for a given number of steps.\n     * @param nSteps number of steps of the multistep method\n     * (excluding the one being computed)\n     * @return Nordsieck transformer for the specified number of steps\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 198,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.AdamsNordsieckTransformer.getNSteps()",
      "begin_line": 206,
      "end_line": 208,
      "comment": " Get the number of steps of the method\n     * (excluding the one being computed).\n     * @return number of steps of the method\n     * (excluding the one being computed)\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.AdamsNordsieckTransformer.buildP(int)",
      "begin_line": 223,
      "end_line": 240,
      "comment": " Build the P matrix.\n     * \u003cp\u003eThe P matrix general terms are shifted j (-i)\u003csup\u003ej-1\u003c/sup\u003e terms:\n     * \u003cpre\u003e\n     *        [  -2   3   -4    5  ... ]\n     *        [  -4  12  -32   80  ... ]\n     *   P \u003d  [  -6  27 -108  405  ... ]\n     *        [  -8  48 -256 1280  ... ]\n     *        [          ...           ]\n     * \u003c/pre\u003e\u003c/p\u003e\n     * @param nSteps number of steps of the multistep method\n     * (excluding the one being computed)\n     * @return P matrix\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 70)",
        "(line 227,col 9)-(line 236,col 9)",
        "(line 238,col 9)-(line 238,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.AdamsNordsieckTransformer.initializeHighOrderDerivatives(double, double[], double[][], double[][])",
      "begin_line": 250,
      "end_line": 297,
      "comment": " Initialize the high order scaled derivatives at step start.\n     * @param h step size to use for scaling\n     * @param t first steps times\n     * @param y first steps states\n     * @param yDot first steps derivatives\n     * @return Nordieck vector at first step (h\u003csup\u003e2\u003c/sup\u003e/2 y\u0027\u0027\u003csub\u003en\u003c/sub\u003e,\n     * h\u003csup\u003e3\u003c/sup\u003e/6 y\u0027\u0027\u0027\u003csub\u003en\u003c/sub\u003e ... h\u003csup\u003ek\u003c/sup\u003e/k! y\u003csup\u003e(k)\u003c/sup\u003e\u003csub\u003en\u003c/sub\u003e)\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 75)",
        "(line 260,col 9)-(line 260,col 77)",
        "(line 261,col 9)-(line 261,col 38)",
        "(line 262,col 9)-(line 262,col 41)",
        "(line 263,col 9)-(line 289,col 9)",
        "(line 293,col 9)-(line 293,col 38)",
        "(line 294,col 9)-(line 294,col 80)",
        "(line 295,col 9)-(line 295,col 91)",
        "(line 296,col 9)-(line 296,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.AdamsNordsieckTransformer.updateHighOrderDerivativesPhase1(org.apache.commons.math3.linear.Array2DRowRealMatrix)",
      "begin_line": 310,
      "end_line": 312,
      "comment": " Update the high order scaled derivatives for Adams integrators (phase 1).\n     * \u003cp\u003eThe complete update of high order derivatives has a form similar to:\n     * \u003cpre\u003e\n     * r\u003csub\u003en+1\u003c/sub\u003e \u003d (s\u003csub\u003e1\u003c/sub\u003e(n) - s\u003csub\u003e1\u003c/sub\u003e(n+1)) P\u003csup\u003e-1\u003c/sup\u003e u + P\u003csup\u003e-1\u003c/sup\u003e A P r\u003csub\u003en\u003c/sub\u003e\n     * \u003c/pre\u003e\n     * this method computes the P\u003csup\u003e-1\u003c/sup\u003e A P r\u003csub\u003en\u003c/sub\u003e part.\u003c/p\u003e\n     * @param highOrder high order scaled derivatives\n     * (h\u003csup\u003e2\u003c/sup\u003e/2 y\u0027\u0027, ... h\u003csup\u003ek\u003c/sup\u003e/k! y(k))\n     * @return updated high order derivatives\n     * @see #updateHighOrderDerivativesPhase2(double[], double[], Array2DRowRealMatrix)\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.AdamsNordsieckTransformer.updateHighOrderDerivativesPhase2(double[], double[], org.apache.commons.math3.linear.Array2DRowRealMatrix)",
      "begin_line": 327,
      "end_line": 338,
      "comment": " Update the high order scaled derivatives Adams integrators (phase 2).\n     * \u003cp\u003eThe complete update of high order derivatives has a form similar to:\n     * \u003cpre\u003e\n     * r\u003csub\u003en+1\u003c/sub\u003e \u003d (s\u003csub\u003e1\u003c/sub\u003e(n) - s\u003csub\u003e1\u003c/sub\u003e(n+1)) P\u003csup\u003e-1\u003c/sup\u003e u + P\u003csup\u003e-1\u003c/sup\u003e A P r\u003csub\u003en\u003c/sub\u003e\n     * \u003c/pre\u003e\n     * this method computes the (s\u003csub\u003e1\u003c/sub\u003e(n) - s\u003csub\u003e1\u003c/sub\u003e(n+1)) P\u003csup\u003e-1\u003c/sup\u003e u part.\u003c/p\u003e\n     * \u003cp\u003ePhase 1 of the update must already have been performed.\u003c/p\u003e\n     * @param start first order scaled derivatives at step start\n     * @param end first order scaled derivatives at step end\n     * @param highOrder high order scaled derivatives, will be modified\n     * (h\u003csup\u003e2\u003c/sup\u003e/2 y\u0027\u0027, ... h\u003csup\u003ek\u003c/sup\u003e/k! y(k))\n     * @see #updateHighOrderDerivativesPhase1(Array2DRowRealMatrix)\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 55)",
        "(line 331,col 9)-(line 337,col 9)"
      ]
    }
  ]
}