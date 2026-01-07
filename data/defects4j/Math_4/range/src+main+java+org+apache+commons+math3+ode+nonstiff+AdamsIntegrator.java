{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/ode/nonstiff/AdamsIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AdamsIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.MultistepIntegrator"
      ],
      "begin_line": 34,
      "end_line": 137,
      "comment": " Base class for {@link AdamsBashforthIntegrator Adams-Bashforth} and\n * {@link AdamsMoultonIntegrator Adams-Moulton} integrators.\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "transformer"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Transformer. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.nonstiff.AdamsIntegrator.AdamsIntegrator(java.lang.String, int, int, double, double, double, double)",
      "begin_line": 54,
      "end_line": 62,
      "comment": "\n     * Build an Adams integrator with the given order and step control parameters.\n     * @param name name of the method\n     * @param nSteps number of steps of the method excluding the one being computed\n     * @param order order of the method\n     * @param minStep minimal step (sign is irrelevant, regardless of\n     * integration direction, forward or backward), the last step can\n     * be smaller than this\n     * @param maxStep maximal step (sign is irrelevant, regardless of\n     * integration direction, forward or backward), the last step can\n     * be smaller than this\n     * @param scalAbsoluteTolerance allowed absolute error\n     * @param scalRelativeTolerance allowed relative error\n     * @exception NumberIsTooSmallException if order is 1 or less\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 60,col 60)",
        "(line 61,col 9)-(line 61,col 68)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.nonstiff.AdamsIntegrator.AdamsIntegrator(java.lang.String, int, int, double, double, double[], double[])",
      "begin_line": 79,
      "end_line": 87,
      "comment": "\n     * Build an Adams integrator with the given order and step control parameters.\n     * @param name name of the method\n     * @param nSteps number of steps of the method excluding the one being computed\n     * @param order order of the method\n     * @param minStep minimal step (sign is irrelevant, regardless of\n     * integration direction, forward or backward), the last step can\n     * be smaller than this\n     * @param maxStep maximal step (sign is irrelevant, regardless of\n     * integration direction, forward or backward), the last step can\n     * be smaller than this\n     * @param vecAbsoluteTolerance allowed absolute error\n     * @param vecRelativeTolerance allowed relative error\n     * @exception IllegalArgumentException if order is 1 or less\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 85,col 58)",
        "(line 86,col 9)-(line 86,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.AdamsIntegrator.integrate(org.apache.commons.math3.ode.ExpandableStatefulODE, double)",
      "begin_line": 90,
      "end_line": 93,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.AdamsIntegrator.initializeHighOrderDerivatives(double, double[], double[][], double[][])",
      "begin_line": 96,
      "end_line": 101,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.AdamsIntegrator.updateHighOrderDerivativesPhase1(org.apache.commons.math3.linear.Array2DRowRealMatrix)",
      "begin_line": 114,
      "end_line": 116,
      "comment": " Update the high order scaled derivatives for Adams integrators (phase 1).\n     * \u003cp\u003eThe complete update of high order derivatives has a form similar to:\n     * \u003cpre\u003e\n     * r\u003csub\u003en+1\u003c/sub\u003e \u003d (s\u003csub\u003e1\u003c/sub\u003e(n) - s\u003csub\u003e1\u003c/sub\u003e(n+1)) P\u003csup\u003e-1\u003c/sup\u003e u + P\u003csup\u003e-1\u003c/sup\u003e A P r\u003csub\u003en\u003c/sub\u003e\n     * \u003c/pre\u003e\n     * this method computes the P\u003csup\u003e-1\u003c/sup\u003e A P r\u003csub\u003en\u003c/sub\u003e part.\u003c/p\u003e\n     * @param highOrder high order scaled derivatives\n     * (h\u003csup\u003e2\u003c/sup\u003e/2 y\u0027\u0027, ... h\u003csup\u003ek\u003c/sup\u003e/k! y(k))\n     * @return updated high order derivatives\n     * @see #updateHighOrderDerivativesPhase2(double[], double[], Array2DRowRealMatrix)\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.AdamsIntegrator.updateHighOrderDerivativesPhase2(double[], double[], org.apache.commons.math3.linear.Array2DRowRealMatrix)",
      "begin_line": 131,
      "end_line": 135,
      "comment": " Update the high order scaled derivatives Adams integrators (phase 2).\n     * \u003cp\u003eThe complete update of high order derivatives has a form similar to:\n     * \u003cpre\u003e\n     * r\u003csub\u003en+1\u003c/sub\u003e \u003d (s\u003csub\u003e1\u003c/sub\u003e(n) - s\u003csub\u003e1\u003c/sub\u003e(n+1)) P\u003csup\u003e-1\u003c/sup\u003e u + P\u003csup\u003e-1\u003c/sup\u003e A P r\u003csub\u003en\u003c/sub\u003e\n     * \u003c/pre\u003e\n     * this method computes the (s\u003csub\u003e1\u003c/sub\u003e(n) - s\u003csub\u003e1\u003c/sub\u003e(n+1)) P\u003csup\u003e-1\u003c/sup\u003e u part.\u003c/p\u003e\n     * \u003cp\u003ePhase 1 of the update must already have been performed.\u003c/p\u003e\n     * @param start first order scaled derivatives at step start\n     * @param end first order scaled derivatives at step end\n     * @param highOrder high order scaled derivatives, will be modified\n     * (h\u003csup\u003e2\u003c/sup\u003e/2 y\u0027\u0027, ... h\u003csup\u003ek\u003c/sup\u003e/k! y(k))\n     * @see #updateHighOrderDerivativesPhase1(Array2DRowRealMatrix)\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 76)"
      ]
    }
  ]
}