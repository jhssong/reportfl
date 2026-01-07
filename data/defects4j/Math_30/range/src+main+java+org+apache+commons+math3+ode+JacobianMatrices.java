{
  "filepath": "/tmp/Math-30b/src/main/java/org/apache/commons/math3/ode/JacobianMatrices.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JacobianMatrices",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 55,
      "end_line": 468,
      "comment": "\n * This class defines a set of {@link SecondaryEquations secondary equations} to\n * compute the Jacobian matrices with respect to the initial state vector and, if\n * any, to some parameters of the primary ODE set.\n * \u003cp\u003e\n * It is intended to be packed into an {@link ExpandableStatefulODE}\n * in conjunction with a primary set of ODE, which may be:\n * \u003cul\u003e\n * \u003cli\u003ea {@link FirstOrderDifferentialEquations}\u003c/li\u003e\n * \u003cli\u003ea {@link MainStateJacobianProvider}\u003c/li\u003e\n * \u003c/ul\u003e\n * In order to compute Jacobian matrices with respect to some parameters of the\n * primary ODE set, the following parameter Jacobian providers may be set:\n * \u003cul\u003e\n * \u003cli\u003ea {@link ParameterJacobianProvider}\u003c/li\u003e\n * \u003cli\u003ea {@link ParameterizedODE}\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n *\n * @see ExpandableStatefulODE\n * @see FirstOrderDifferentialEquations\n * @see MainStateJacobianProvider\n * @see ParameterJacobianProvider\n * @see ParameterizedODE\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "efode"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Expandable first order differential equation. "
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Index of the instance in the expandable set. "
    },
    {
      "type": "field",
      "varNames": [
        "jode"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " FODE with exact primary Jacobian computation skill. "
    },
    {
      "type": "field",
      "varNames": [
        "pode"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " FODE without exact parameter Jacobian computation skill. "
    },
    {
      "type": "field",
      "varNames": [
        "stateDim"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Main state vector dimension. "
    },
    {
      "type": "field",
      "varNames": [
        "selectedParameters"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Selected parameters for parameter Jacobian computation. "
    },
    {
      "type": "field",
      "varNames": [
        "jacobianProviders"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " FODE with exact parameter Jacobian computation skill. "
    },
    {
      "type": "field",
      "varNames": [
        "paramDim"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Parameters dimension. "
    },
    {
      "type": "field",
      "varNames": [
        "dirtyParameter"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Boolean for selected parameters consistency. "
    },
    {
      "type": "field",
      "varNames": [
        "matricesData"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " State and parameters Jacobian matrices in a row. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.JacobianMatrices.JacobianMatrices(org.apache.commons.math3.ode.FirstOrderDifferentialEquations, double[], java.lang.String...)",
      "begin_line": 102,
      "end_line": 106,
      "comment": " Simple constructor for a secondary equations set computing Jacobian matrices.\n     * \u003cp\u003e\n     * Parameters must belong to the supported ones given by {@link\n     * Parameterizable#getParametersNames()}, so the primary set of differential\n     * equations must be {@link Parameterizable}.\n     * \u003c/p\u003e\n     * \u003cp\u003eNote that each selection clears the previous selected parameters.\u003c/p\u003e\n     *\n     * @param fode the primary first order differential equations set to extend\n     * @param hY step used for finite difference computation with respect to state vector\n     * @param parameters parameters to consider for Jacobian matrices processing\n     * (may be null if parameters Jacobians is not desired)\n     * @exception MathIllegalArgumentException if one parameter is not supported\n     * or there is a dimension mismatch with {@code hY}\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 65)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.JacobianMatrices.JacobianMatrices(org.apache.commons.math3.ode.MainStateJacobianProvider, java.lang.String...)",
      "begin_line": 121,
      "end_line": 154,
      "comment": " Simple constructor for a secondary equations set computing Jacobian matrices.\n     * \u003cp\u003e\n     * Parameters must belong to the supported ones given by {@link\n     * Parameterizable#getParametersNames()}, so the primary set of differential\n     * equations must be {@link Parameterizable}.\n     * \u003c/p\u003e\n     * \u003cp\u003eNote that each selection clears the previous selected parameters.\u003c/p\u003e\n     *\n     * @param jode the primary first order differential equations set to extend\n     * @param parameters parameters to consider for Jacobian matrices processing\n     * (may be null if parameters Jacobians is not desired)\n     * @exception MathIllegalArgumentException if one parameter is not supported\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 26)",
        "(line 126,col 9)-(line 126,col 24)",
        "(line 128,col 9)-(line 128,col 25)",
        "(line 129,col 9)-(line 129,col 25)",
        "(line 131,col 9)-(line 131,col 44)",
        "(line 133,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 143,col 36)",
        "(line 145,col 9)-(line 145,col 76)",
        "(line 149,col 9)-(line 149,col 68)",
        "(line 150,col 9)-(line 152,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.JacobianMatrices.registerVariationalEquations(org.apache.commons.math3.ode.ExpandableStatefulODE)",
      "begin_line": 162,
      "end_line": 177,
      "comment": " Register the variational equations for the Jacobians matrices to the expandable set.\n     * @param expandable expandable set into which variational equations should be registered\n     * @exception MathIllegalArgumentException if the primary set of the expandable set does\n     * not match the one used to build the instance\n     * @see ExpandableStatefulODE#addSecondaryEquations(SecondaryEquations)\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 168,col 57)",
        "(line 169,col 9)-(line 171,col 9)",
        "(line 173,col 9)-(line 173,col 27)",
        "(line 174,col 9)-(line 174,col 79)",
        "(line 175,col 9)-(line 175,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.JacobianMatrices.addParameterJacobianProvider(org.apache.commons.math3.ode.ParameterJacobianProvider)",
      "begin_line": 182,
      "end_line": 184,
      "comment": " Add a parameter Jacobian provider.\n     * @param provider the parameter Jacobian provider to compute exactly the parameter Jacobian matrix\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.JacobianMatrices.setParameterizedODE(org.apache.commons.math3.ode.ParameterizedODE)",
      "begin_line": 189,
      "end_line": 192,
      "comment": " Add a parameter Jacobian provider.\n     * @param parameterizedOde the parameterized ODE to compute the parameter Jacobian matrix using finite differences\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 37)",
        "(line 191,col 9)-(line 191,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.JacobianMatrices.setParameterStep(java.lang.String, double)",
      "begin_line": 211,
      "end_line": 223,
      "comment": " Set the step associated to a parameter in order to compute by finite\n     *  difference the Jacobian matrix.\n     * \u003cp\u003e\n     * Needed if and only if the primary ODE set is a {@link ParameterizedODE}.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Given a non zero parameter value pval for the parameter, a reasonable value\n     * for such a step is {@code pval * FastMath.sqrt(Precision.EPSILON)}.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * A zero value for such a step doesn\u0027t enable to compute the parameter Jacobian matrix.\n     * \u003c/p\u003e\n     * @param parameter parameter to consider for Jacobian processing\n     * @param hP step for Jacobian finite difference computation w.r.t. the specified parameter\n     * @see ParameterizedODE\n     * @exception IllegalArgumentException if the parameter is not supported\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 219,col 9)",
        "(line 221,col 9)-(line 221,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.JacobianMatrices.setInitialMainStateJacobian(double[][])",
      "begin_line": 233,
      "end_line": 251,
      "comment": " Set the initial value of the Jacobian matrix with respect to state.\n     * \u003cp\u003e\n     * If this method is not called, the initial value of the Jacobian\n     * matrix with respect to state is set to identity.\n     * \u003c/p\u003e\n     * @param dYdY0 initial Jacobian matrix w.r.t. state\n     * @exception DimensionMismatchException if matrix dimensions are incorrect\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 40)",
        "(line 238,col 9)-(line 238,col 43)",
        "(line 241,col 9)-(line 241,col 18)",
        "(line 242,col 9)-(line 245,col 9)",
        "(line 247,col 9)-(line 249,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.JacobianMatrices.setInitialParameterJacobian(java.lang.String, double[])",
      "begin_line": 262,
      "end_line": 283,
      "comment": " Set the initial value of a column of the Jacobian matrix with respect to one parameter.\n     * \u003cp\u003e\n     * If this method is not called for some parameter, the initial value of\n     * the column of the Jacobian matrix with respect to this parameter is set to zero.\n     * \u003c/p\u003e\n     * @param pName parameter name\n     * @param dYdP initial Jacobian column vector with respect to the parameter\n     * @exception MathIllegalArgumentException if a parameter is not supported\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 39)",
        "(line 269,col 9)-(line 269,col 36)",
        "(line 270,col 9)-(line 279,col 9)",
        "(line 281,col 9)-(line 281,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.JacobianMatrices.getCurrentMainSetJacobian(double[][])",
      "begin_line": 288,
      "end_line": 299,
      "comment": " Get the current value of the Jacobian matrix with respect to state.\n     * @param dYdY0 current Jacobian matrix with respect to state.\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 52)",
        "(line 293,col 9)-(line 293,col 18)",
        "(line 294,col 9)-(line 297,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.JacobianMatrices.getCurrentParameterJacobian(java.lang.String, double[])",
      "begin_line": 305,
      "end_line": 319,
      "comment": " Get the current value of the Jacobian matrix with respect to one parameter.\n     * @param pName name of the parameter for the computed Jacobian matrix\n     * @param dYdP current Jacobian matrix with respect to the named parameter\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 52)",
        "(line 310,col 9)-(line 310,col 36)",
        "(line 311,col 9)-(line 317,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.JacobianMatrices.checkDimension(int, java.lang.Object)",
      "begin_line": 326,
      "end_line": 332,
      "comment": " Check array dimensions.\n     * @param expected expected dimension\n     * @param array (may be null if expected is 0)\n     * @throws DimensionMismatchException if the array dimension does not match the expected one\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 74)",
        "(line 329,col 9)-(line 331,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "JacobiansSecondaryEquations",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.SecondaryEquations"
      ],
      "begin_line": 340,
      "end_line": 414,
      "comment": " Local implementation of secondary equations.\n     * \u003cp\u003e\n     * This class is an inner class to ensure proper scheduling of calls\n     * by forcing the use of {@link JacobianMatrices#registerVariationalEquations(ExpandableStatefulODE)}.\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.JacobianMatrices.JacobiansSecondaryEquations.getDimension()",
      "begin_line": 343,
      "end_line": 345,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 344,col 13)-(line 344,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.JacobianMatrices.JacobiansSecondaryEquations.computeDerivatives(double, double[], double[], double[], double[])",
      "begin_line": 348,
      "end_line": 413,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 352,col 13)-(line 355,col 13)",
        "(line 361,col 13)-(line 361,col 61)",
        "(line 362,col 13)-(line 362,col 60)",
        "(line 365,col 13)-(line 377,col 13)",
        "(line 379,col 13)-(line 411,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MainStateJacobianWrapper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.MainStateJacobianProvider"
      ],
      "begin_line": 419,
      "end_line": 466,
      "comment": " Wrapper class to compute jacobian matrices by finite differences for ODE\n     *  which do not compute them by themselves.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ode"
      ],
      "begin_line": 422,
      "end_line": 422,
      "comment": " Raw ODE without jacobians computation skill to be wrapped into a MainStateJacobianProvider. "
    },
    {
      "type": "field",
      "varNames": [
        "hY"
      ],
      "begin_line": 425,
      "end_line": 425,
      "comment": " Steps for finite difference computation of the jacobian df/dy w.r.t. state. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.JacobianMatrices.MainStateJacobianWrapper.MainStateJacobianWrapper(org.apache.commons.math3.ode.FirstOrderDifferentialEquations, double[])",
      "begin_line": 432,
      "end_line": 436,
      "comment": " Wrap a {@link FirstOrderDifferentialEquations} into a {@link MainStateJacobianProvider}.\n         * @param ode original ODE problem, without jacobians computation skill\n         * @param hY step sizes to compute the jacobian df/dy\n         * @see JacobianMatrices#setMainStateSteps(double[])\n         ",
      "child_ranges": [
        "(line 434,col 13)-(line 434,col 27)",
        "(line 435,col 13)-(line 435,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.JacobianMatrices.MainStateJacobianWrapper.getDimension()",
      "begin_line": 439,
      "end_line": 441,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 440,col 13)-(line 440,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.JacobianMatrices.MainStateJacobianWrapper.computeDerivatives(double, double[], double[])",
      "begin_line": 444,
      "end_line": 446,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 445,col 13)-(line 445,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.JacobianMatrices.MainStateJacobianWrapper.computeMainStateJacobian(double, double[], double[], double[][])",
      "begin_line": 449,
      "end_line": 464,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 452,col 13)-(line 452,col 45)",
        "(line 453,col 13)-(line 453,col 50)",
        "(line 455,col 13)-(line 463,col 13)"
      ]
    }
  ]
}